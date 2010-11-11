/*
 * This file is part of Infinitest.
 *
 * Copyright (C) 2010
 * "Ben Rady" <benrady@gmail.com>,
 * "Rod Coffin" <rfciii@gmail.com>,
 * "Ryan Breidenbach" <ryan.breidenbach@gmail.com>, et al.
 *
 * Infinitest is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Infinitest is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Infinitest.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.fakeco.fakeproduct;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

@Ignore
@ClassAnnotation
@InvisibleClassAnnotation
public class AnnotatedClass
{
    @SuppressWarnings("all")
    @MethodAnnotation
    @Test
    private void aMethod(@ParameterAnnotation(value = 1, otherValue = 2) String aVariable,
                    @InvisibleParameterAnnotation String anotherVariable)
    {
    }

    @Ignore
    @Test
    public void shouldaction()
    {
        fail();
    }
}
