/* Soot - a J*va Optimization Framework
 * Copyright (C) 2003 Jerome Miecznikowski
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the
 * Free Software Foundation, Inc., 59 Temple Place - Suite 330,
 * Boston, MA 02111-1307, USA.
 */

package soot.dava.internal.SET;

import soot.G;

public class SETNodeLabel {
  private String name;

  public SETNodeLabel() {
    name = null;
  }

  public void set_Name() {
    if (name == null) {
      name = "label_" + Integer.toString(G.v().SETNodeLabel_uniqueId++);
    }
  }

  public void set_Name(String name) {
    this.name = name;
  }

  public String toString() {
    return name;
  }

  public void clear_Name() {
    name = null;
  }
}
