/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.parser.node;

import soot.jimple.parser.analysis.*;

@SuppressWarnings("nls")
public final class TEquals extends Token {
  public TEquals() {
    super.setText("=");
  }

  public TEquals(int line, int pos) {
    super.setText("=");
    setLine(line);
    setPos(pos);
  }

  @Override
  public Object clone() {
    return new TEquals(getLine(), getPos());
  }

  @Override
  public void apply(Switch sw) {
    ((Analysis) sw).caseTEquals(this);
  }

  @Override
  public void setText(@SuppressWarnings("unused") String text) {
    throw new RuntimeException("Cannot change TEquals text.");
  }
}
