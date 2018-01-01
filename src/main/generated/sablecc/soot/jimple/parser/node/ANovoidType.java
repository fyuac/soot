/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.parser.node;

import soot.jimple.parser.analysis.*;

@SuppressWarnings("nls")
public final class ANovoidType extends PType {
  private PNonvoidType _nonvoidType_;

  public ANovoidType() {
    // Constructor
  }

  public ANovoidType(@SuppressWarnings("hiding") PNonvoidType _nonvoidType_) {
    // Constructor
    setNonvoidType(_nonvoidType_);
  }

  @Override
  public Object clone() {
    return new ANovoidType(cloneNode(this._nonvoidType_));
  }

  @Override
  public void apply(Switch sw) {
    ((Analysis) sw).caseANovoidType(this);
  }

  public PNonvoidType getNonvoidType() {
    return this._nonvoidType_;
  }

  public void setNonvoidType(PNonvoidType node) {
    if (this._nonvoidType_ != null) {
      this._nonvoidType_.parent(null);
    }

    if (node != null) {
      if (node.parent() != null) {
        node.parent().removeChild(node);
      }

      node.parent(this);
    }

    this._nonvoidType_ = node;
  }

  @Override
  public String toString() {
    return "" + toString(this._nonvoidType_);
  }

  @Override
  void removeChild(@SuppressWarnings("unused") Node child) {
    // Remove child
    if (this._nonvoidType_ == child) {
      this._nonvoidType_ = null;
      return;
    }

    throw new RuntimeException("Not a child.");
  }

  @Override
  void replaceChild(
      @SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild) {
    // Replace child
    if (this._nonvoidType_ == oldChild) {
      setNonvoidType((PNonvoidType) newChild);
      return;
    }

    throw new RuntimeException("Not a child.");
  }
}
