/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.parser.node;

import soot.jimple.parser.analysis.*;

@SuppressWarnings("nls")
public final class TShl extends Token {
  public TShl() {
    super.setText("<<");
  }

  public TShl(int line, int pos) {
    super.setText("<<");
    setLine(line);
    setPos(pos);
  }

  @Override
  public Object clone() {
    return new TShl(getLine(), getPos());
  }

  @Override
  public void apply(Switch sw) {
    ((Analysis) sw).caseTShl(this);
  }

  @Override
  public void setText(@SuppressWarnings("unused") String text) {
    throw new RuntimeException("Cannot change TShl text.");
  }
}
