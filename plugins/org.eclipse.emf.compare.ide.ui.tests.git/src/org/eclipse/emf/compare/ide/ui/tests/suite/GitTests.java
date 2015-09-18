/*******************************************************************************
 * Copyright (c) 2012, 2015 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *     Philip Langer - adds further test cases
 *******************************************************************************/
package org.eclipse.emf.compare.ide.ui.tests.suite;

import junit.framework.JUnit4TestAdapter;
import junit.framework.Test;
import junit.textui.TestRunner;

import org.eclipse.emf.compare.ComparePackage;
import org.eclipse.emf.compare.ide.ui.tests.merge.DirCacheResourceVariantTreeProviderTest;
import org.eclipse.emf.compare.ide.ui.tests.merge.GitResourceVariantTreeSubscriberTest;
import org.eclipse.emf.compare.ide.ui.tests.merge.ResourceVariantTest;
import org.eclipse.emf.compare.ide.ui.tests.merge.TreeWalkResourceVariantTreeProviderTest;
import org.eclipse.emf.compare.ide.ui.tests.unit.GitLogicalModelTest;
import org.eclipse.emf.compare.ide.ui.tests.unit.ResourceUtilPathTest;
import org.eclipse.emf.compare.ide.ui.tests.unit.RevisionedURIConverterTest;
import org.eclipse.emf.compare.ide.ui.tests.unit.ThreadedModelResolverResolutionTest;
import org.eclipse.emf.compare.tests.nodes.NodesPackage;
import org.eclipse.emf.compare.tests.nodes.util.NodesResourceFactoryImpl;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({GitLogicalModelTest.class, DirCacheResourceVariantTreeProviderTest.class,
		GitResourceVariantTreeSubscriberTest.class, ResourceVariantTest.class,
		TreeWalkResourceVariantTreeProviderTest.class, ResourceUtilPathTest.class,
		RevisionedURIConverterTest.class, ThreadedModelResolverResolutionTest.class,
// ModelResolverLocalTest.class,
// ModelResolverRemoteTest.class,
// RenamedControlledResourceTests.class,
// GitLogicalMergeTest.class,
// StrategyRecursiveModelTest.class,
// StrategyRecursiveModelWithDeepProjectTest.class,
// GitLogicalMergeWithCustomDependenciesTest.class,
// GitMergeTest.class,
// MovedImplicitResourceAmongChangedResourcesTest.class
})
public class GitTests {
	/**
	 * Launches the test with the given arguments.
	 * 
	 * @param args
	 *            Arguments of the testCase.
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * Creates the {@link junit.framework.TestSuite TestSuite} for all the test.
	 * 
	 * @return The test suite containing all the tests
	 */
	public static Test suite() {
		return new JUnit4TestAdapter(GitTests.class);
	}

	@BeforeClass
	public static void fillEMFRegistries() {
		EPackage.Registry.INSTANCE.put(ComparePackage.eNS_URI, ComparePackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(NodesPackage.eNS_URI, NodesPackage.eINSTANCE);

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("nodes", //$NON-NLS-1$
				new NodesResourceFactoryImpl());
	}
}
