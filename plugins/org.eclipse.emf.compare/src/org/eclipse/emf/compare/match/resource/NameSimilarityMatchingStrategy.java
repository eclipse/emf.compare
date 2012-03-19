/*******************************************************************************
 * Copyright (c) 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.compare.match.resource;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.compare.utils.SimilarityUtil;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * This implementation of a matching strategy will try and determine the resource mappings through the
 * similarity of their names.
 * <p>
 * Specifically, this will determine the cartesian product of the resource sets, compute a similarity for
 * every single couple of Resource, then consider that every similarity that is above 80% constitutes a
 * mapping.
 * </p>
 * 
 * @author <a href="mailto:laurent.goubet@obeo.fr">Laurent Goubet</a>
 */
public class NameSimilarityMatchingStrategy implements IResourceMatchingStrategy {
	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.compare.match.resource.IResourceMatchingStrategy#matchResources(java.lang.Iterable,
	 *      java.lang.Iterable, java.lang.Iterable)
	 */
	public List<ResourceMapping> matchResources(Iterable<Resource> left, Iterable<Resource> right,
			Iterable<Resource> origin) {
		final List<ResourceMapping> mappings = Lists.newArrayList();

		final Set<List<Resource>> productLR = cartesianProductOf(left, right);
		final Set<List<Resource>> productLO = cartesianProductOf(left, origin);

		final List<ResourceSimilarity> similaritiesLR = Lists.newArrayList();
		final List<ResourceSimilarity> similaritiesLO = Lists.newArrayList();
		for (List<Resource> couple : productLR) {
			similaritiesLR.add(new ResourceSimilarity(couple.get(0), couple.get(1)));
		}
		for (List<Resource> couple : productLO) {
			similaritiesLO.add(new ResourceSimilarity(couple.get(0), couple.get(1)));
		}
		Collections.sort(similaritiesLR);
		Collections.sort(similaritiesLO);

		final double matchThreshold = 0.8d;
		double currentSimilarity = 1d;
		Iterator<ResourceSimilarity> similaritiesLRIterator = similaritiesLR.iterator();
		while (similaritiesLRIterator.hasNext() && currentSimilarity >= matchThreshold) {
			final ResourceSimilarity sortedCoupleLR = similaritiesLRIterator.next();

			final Resource leftRes = sortedCoupleLR.getFirst();
			final Resource rightRes = sortedCoupleLR.getSecond();
			Resource originRes = null;
			Iterator<ResourceSimilarity> loIterator = similaritiesLO.iterator();
			while (loIterator.hasNext() && originRes == null) {
				final ResourceSimilarity sortedCoupleLO = loIterator.next();
				if (sortedCoupleLO.getFirst() == leftRes) {
					originRes = sortedCoupleLO.getSecond();
				}
			}
			mappings.add(new ResourceMapping(leftRes, rightRes, originRes));
		}

		/*
		 * FIXME This was a work in progress that has been left alone for now as it is assumed to be too
		 * costly. Either finish the implementation (in its current state, it would not check for matches
		 * between the right and origin if they have no "left" counterpart) or remove the class altogether.
		 */

		return mappings;
	}

	/**
	 * Computes the cartesian product of the two given iterables by converting them to {@link Set}s and
	 * feeding them to {@link Sets#cartesianProduct(List)}.
	 * 
	 * @param iterable1
	 *            First of the two iterables of which we need the cartesian product.
	 * @param iterable2
	 *            Second of the two iterables of which we need the cartesian product.
	 * @return The cartesian product of the two given iterables.
	 * @see Sets#cartesianProduct(List)
	 */
	private static Set<List<Resource>> cartesianProductOf(Iterable<Resource> iterable1,
			Iterable<Resource> iterable2) {
		Set<Resource> set1 = Sets.newLinkedHashSet(iterable1);
		Set<Resource> set2 = Sets.newLinkedHashSet(iterable2);
		List<Set<Resource>> input = ImmutableList.of(set1, set2);
		return Sets.cartesianProduct(input);
	}

	/**
	 * This simple structure will only be used internally in order to compute the similarities between the
	 * names of a resource couple.
	 * 
	 * @author <a href="mailto:laurent.goubet@obeo.fr">Laurent Goubet</a>
	 */
	protected class ResourceSimilarity implements Comparable<ResourceSimilarity> {
		/** First resource of the couple for which we computed a similarity. */
		private Resource first;

		/** Second resource of the couple for which we computed a similarity. */
		private Resource second;

		/**
		 * Instantiates a ResourceSimilarity structure given the two resources for which we need a similarity.
		 * 
		 * @param first
		 *            First resource of the couple for which we need a similarity.
		 * @param second
		 *            Second resource of the couple for which we need a similarity.
		 */
		public ResourceSimilarity(Resource first, Resource second) {
			this.first = first;
			this.second = second;
		}

		/**
		 * Returns the first resource of this couple.
		 * 
		 * @return The first resource of this couple.
		 */
		public Resource getFirst() {
			return first;
		}

		/**
		 * Returns the second resource of this couple.
		 * 
		 * @return The second resource of this couple.
		 */
		public Resource getSecond() {
			return second;
		}

		/**
		 * Compute and return the similarity between the two resources of this couple. The Similarity with
		 * this default implementation will be the dice coefficient of the two resources' name.
		 * 
		 * @return The similarity between these two resources.
		 */
		public double getSimilarity() {
			String firstName = first.getURI().lastSegment();
			String secondName = second.getURI().lastSegment();

			return SimilarityUtil.diceCoefficient(firstName, secondName);
		}

		/**
		 * {@inheritDoc}
		 * 
		 * @see java.lang.Comparable#compareTo(java.lang.Object)
		 */
		public int compareTo(ResourceSimilarity other) {
			return Double.compare(getSimilarity(), other.getSimilarity());
		}
	}
}
