/*******************************************************************************
 * Copyright (c) 2024 IBM Corporation and others.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.swt.internal.win32;

public class SCRIPT_DIGITSUBSTITUTE {
	public int NationalDigitLanguage;
	public int TraditionalDigitLanguage;
	public byte DigitSubstitute;
	public int dwReserved;
	public static final int sizeof = OS.SCRIPT_DIGITSUBSTITUTE_sizeof ();
}
