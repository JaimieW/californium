/*******************************************************************************
 * Copyright (c) 2020 Arm and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * and Eclipse Distribution License v1.0 which accompany this distribution.
 * 
 * The Eclipse Public License is available at
 *    http://www.eclipse.org/legal/epl-v20.html
 * and the Eclipse Distribution License is available at
 *    http://www.eclipse.org/org/documents/edl-v10.html.
 * 
 * Contributors:
 *    Jaimie Whiteside (Arm) - initial creation
 ******************************************************************************/
package org.eclipse.californium.scandium.dtls;

import javax.crypto.SecretKey;

public interface MasterSecretDeriver {

	SecretKey derive(byte[] randomSeed, SecretKey premasterSecret, DTLSSession session);
}
