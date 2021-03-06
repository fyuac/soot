/* Soot - a J*va Optimization Framework
 * Copyright (C) 2004 Jennifer Lhotak
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

package soot.javaToJimple.jj.ast;

import java.util.List;

import polyglot.ast.Expr;
import polyglot.ast.Term;
import polyglot.ext.jl.ast.Expr_c;
import polyglot.util.Position;
import polyglot.visit.CFGBuilder;

public class JjComma_c extends Expr_c implements Expr {

  private Expr first;
  private Expr second;

  public JjComma_c(Position pos, Expr first, Expr second) {
    super(pos);
    this.first = first;
    this.second = second;
  }

  public Expr first() {
    return first;
  }

  public Expr second() {
    return second;
  }

  public List acceptCFG(CFGBuilder v, List succs) {
    return succs;
  }

  public Term entry() {
    return first.entry();
  }
}
