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
package org.infinitest.intellij.plugin.swingui;

import static javax.swing.SwingUtilities.*;

import java.lang.reflect.InvocationTargetException;

import org.infinitest.EventQueue;
import org.infinitest.NamedRunnable;

public class SwingEventQueue implements EventQueue
{
    public void push(Runnable runnable)
    {
        invokeLater(runnable);
    }

    public void pushAndWait(Runnable runnable)
    {
        try
        {
            if (!isEventDispatchThread())
            {
                invokeAndWait(runnable);
            }
            else
            {
                runnable.run();
            }
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
        catch (InvocationTargetException e)
        {
            throw new RuntimeException(e);
        }
    }

    public void pushNamed(NamedRunnable runnable)
    {
        push(runnable);
    }
}
