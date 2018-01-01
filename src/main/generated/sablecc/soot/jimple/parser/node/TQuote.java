/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.parser.node;

import soot.jimple.parser.analysis.*;

@SuppressWarnings("nls")
public final class TQuote extends Token {
  public TQuote() {
    super.setText("\'");
  }

  public TQuote(int line, int pos) {
    super.setText("\'");
    setLine(line);
    setPos(pos);
  }

  @Override
  public Object clone() {
    return new TQuote(getLine(), getPos());
  }

  @Override
  public void apply(Switch sw) {
    ((Analysis) sw).caseTQuote(this);
  }

  @Override
  public void setText(@SuppressWarnings("unused") String text) {
    throw new RuntimeException("Cannot change TQuote text.");
  }
}
