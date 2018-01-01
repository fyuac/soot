/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.parser.node;

import soot.jimple.parser.analysis.*;

@SuppressWarnings("nls")
public final class ALengthofUnop extends PUnop {
  private TLengthof _lengthof_;

  public ALengthofUnop() {
    // Constructor
  }

  public ALengthofUnop(@SuppressWarnings("hiding") TLengthof _lengthof_) {
    // Constructor
    setLengthof(_lengthof_);
  }

  @Override
  public Object clone() {
    return new ALengthofUnop(cloneNode(this._lengthof_));
  }

  @Override
  public void apply(Switch sw) {
    ((Analysis) sw).caseALengthofUnop(this);
  }

  public TLengthof getLengthof() {
    return this._lengthof_;
  }

  public void setLengthof(TLengthof node) {
    if (this._lengthof_ != null) {
      this._lengthof_.parent(null);
    }

    if (node != null) {
      if (node.parent() != null) {
        node.parent().removeChild(node);
      }

      node.parent(this);
    }

    this._lengthof_ = node;
  }

  @Override
  public String toString() {
    return "" + toString(this._lengthof_);
  }

  @Override
  void removeChild(@SuppressWarnings("unused") Node child) {
    // Remove child
    if (this._lengthof_ == child) {
      this._lengthof_ = null;
      return;
    }

    throw new RuntimeException("Not a child.");
  }

  @Override
  void replaceChild(
      @SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild) {
    // Replace child
    if (this._lengthof_ == oldChild) {
      setLengthof((TLengthof) newChild);
      return;
    }

    throw new RuntimeException("Not a child.");
  }
}
