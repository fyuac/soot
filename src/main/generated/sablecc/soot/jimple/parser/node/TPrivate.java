/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.parser.node;

import soot.jimple.parser.analysis.*;

@SuppressWarnings("nls")
public final class TPrivate extends Token {
  public TPrivate() {
    super.setText("private");
  }

  public TPrivate(int line, int pos) {
    super.setText("private");
    setLine(line);
    setPos(pos);
  }

  @Override
  public Object clone() {
    return new TPrivate(getLine(), getPos());
  }

  @Override
  public void apply(Switch sw) {
    ((Analysis) sw).caseTPrivate(this);
  }

  @Override
  public void setText(@SuppressWarnings("unused") String text) {
    throw new RuntimeException("Cannot change TPrivate text.");
  }
}
