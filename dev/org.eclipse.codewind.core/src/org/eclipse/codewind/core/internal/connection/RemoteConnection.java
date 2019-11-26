/*******************************************************************************
 * Copyright (c) 2019 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package org.eclipse.codewind.core.internal.connection;

import java.net.URI;

import org.eclipse.codewind.core.internal.cli.AuthToken;

public class RemoteConnection extends CodewindConnection {
	
	public RemoteConnection(String name, URI uri, String conid, String username, AuthToken authToken) {
		super(name, uri, conid, username, authToken);
	}

}
