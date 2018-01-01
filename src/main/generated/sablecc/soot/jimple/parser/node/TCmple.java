/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.parser.node;

import soot.jimple.parser.analysis.*;

@SuppressWarnings("nls")
public final class TCmple extends Token {
  public TCmple() {
    super.setText("<=");
  }

  public TCmple(int line, int pos) {
    super.setText("<=");
    setLine(line);
    setPos(pos);
  }

  @Override
  public Object clone() {
    return new TCmple(getLine(), getPos());
  }

  @Override
  public void apply(Switch sw) {
    ((Analysis) sw).caseTCmple(this);
  }

  @Override
  public void setText(@SuppressWarnings("unused") String text) {
    throw new RuntimeException("Cannot change TCmple text.");
  }
}
