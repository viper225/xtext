/*******************************************************************************
 * Copyright (c) 2013 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtend.lib.macro;

import java.util.List;

import org.eclipse.xtend.lib.macro.declaration.MutableNamedElement;

import com.google.common.annotations.Beta;

/**
 * 
 * @param <T> the type which this processor processes. FeatureCall in case of a regualar macro, or any subtype of AnnotationTarget for active annotations.
 * 
 * @author Sven Efftinge
 */
@Beta
public interface TransformationParticipant<T extends MutableNamedElement> {
	
	/**
	 * Invoked by the compiler 
	 * 
	 * @param annotatedTargetElements - the mutable java representation of the annotated elements
	 * @param context - a {@link TransformationContext} providing useful services.
	 */
	void doTransform(List<? extends T> annotatedTargetElements, TransformationContext context);
}