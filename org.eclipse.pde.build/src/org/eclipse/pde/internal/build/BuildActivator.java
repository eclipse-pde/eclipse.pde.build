/**********************************************************************
 * Copyright (c) 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors: 
 * IBM - Initial API and implementation
 **********************************************************************/
package org.eclipse.pde.internal.build;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.pde.internal.build.site.PDEState;
import org.osgi.framework.BundleContext;

public class BuildActivator extends Plugin {
	public void start(BundleContext ctx) throws Exception {
		super.start(ctx);
		PDEState.setCtx(ctx);
	}
	public void stop(BundleContext ctx) throws Exception {
		super.stop(ctx);
		PDEState.setCtx(null);
	}
}
