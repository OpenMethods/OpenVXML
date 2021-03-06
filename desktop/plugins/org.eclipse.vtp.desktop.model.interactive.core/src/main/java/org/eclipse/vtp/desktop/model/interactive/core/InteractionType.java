/*--------------------------------------------------------------------------
 * Copyright (c) 2004, 2006-2007 OpenMethods, LLC
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Trip Gilman (OpenMethods), Lonnie G. Pryor (OpenMethods)
 *    - initial API and implementation
 -------------------------------------------------------------------------*/
package org.eclipse.vtp.desktop.model.interactive.core;

import org.eclipse.vtp.framework.interactions.core.IInteractionType;

public class InteractionType implements IInteractionType
{
	private String id;
	private String name;
	
	public InteractionType(String id, String name)
	{
		super();
		this.id = id;
		this.name = name;
	}

	public String getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
}
