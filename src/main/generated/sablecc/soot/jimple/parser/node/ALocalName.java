/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.parser.node;

import soot.jimple.parser.analysis.*;

@SuppressWarnings("nls")
public final class ALocalName extends PLocalName {
  private PName _name_;

  public ALocalName() {
    // Constructor
  }

  public ALocalName(@SuppressWarnings("hiding") PName _name_) {
    // Constructor
    setName(_name_);
  }

  @Override
  public Object clone() {
    return new ALocalName(cloneNode(this._name_));
  }

  @Override
  public void apply(Switch sw) {
    ((Analysis) sw).caseALocalName(this);
  }

  public PName getName() {
    return this._name_;
  }

  public void setName(PName node) {
    if (this._name_ != null) {
      this._name_.parent(null);
    }

    if (node != null) {
      if (node.parent() != null) {
        node.parent().removeChild(node);
      }

      node.parent(this);
    }

    this._name_ = node;
  }

  @Override
  public String toString() {
    return "" + toString(this._name_);
  }

  @Override
  void removeChild(@SuppressWarnings("unused") Node child) {
    // Remove child
    if (this._name_ == child) {
      this._name_ = null;
      return;
    }

    throw new RuntimeException("Not a child.");
  }

  @Override
  void replaceChild(
      @SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild) {
    // Replace child
    if (this._name_ == oldChild) {
      setName((PName) newChild);
      return;
    }

    throw new RuntimeException("Not a child.");
  }
}
