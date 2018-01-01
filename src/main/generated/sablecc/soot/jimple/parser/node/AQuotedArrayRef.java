/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.parser.node;

import soot.jimple.parser.analysis.*;

@SuppressWarnings("nls")
public final class AQuotedArrayRef extends PArrayRef {
  private TQuotedName _quotedName_;
  private PFixedArrayDescriptor _fixedArrayDescriptor_;

  public AQuotedArrayRef() {
    // Constructor
  }

  public AQuotedArrayRef(
      @SuppressWarnings("hiding") TQuotedName _quotedName_,
      @SuppressWarnings("hiding") PFixedArrayDescriptor _fixedArrayDescriptor_) {
    // Constructor
    setQuotedName(_quotedName_);

    setFixedArrayDescriptor(_fixedArrayDescriptor_);
  }

  @Override
  public Object clone() {
    return new AQuotedArrayRef(
        cloneNode(this._quotedName_), cloneNode(this._fixedArrayDescriptor_));
  }

  @Override
  public void apply(Switch sw) {
    ((Analysis) sw).caseAQuotedArrayRef(this);
  }

  public TQuotedName getQuotedName() {
    return this._quotedName_;
  }

  public void setQuotedName(TQuotedName node) {
    if (this._quotedName_ != null) {
      this._quotedName_.parent(null);
    }

    if (node != null) {
      if (node.parent() != null) {
        node.parent().removeChild(node);
      }

      node.parent(this);
    }

    this._quotedName_ = node;
  }

  public PFixedArrayDescriptor getFixedArrayDescriptor() {
    return this._fixedArrayDescriptor_;
  }

  public void setFixedArrayDescriptor(PFixedArrayDescriptor node) {
    if (this._fixedArrayDescriptor_ != null) {
      this._fixedArrayDescriptor_.parent(null);
    }

    if (node != null) {
      if (node.parent() != null) {
        node.parent().removeChild(node);
      }

      node.parent(this);
    }

    this._fixedArrayDescriptor_ = node;
  }

  @Override
  public String toString() {
    return "" + toString(this._quotedName_) + toString(this._fixedArrayDescriptor_);
  }

  @Override
  void removeChild(@SuppressWarnings("unused") Node child) {
    // Remove child
    if (this._quotedName_ == child) {
      this._quotedName_ = null;
      return;
    }

    if (this._fixedArrayDescriptor_ == child) {
      this._fixedArrayDescriptor_ = null;
      return;
    }

    throw new RuntimeException("Not a child.");
  }

  @Override
  void replaceChild(
      @SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild) {
    // Replace child
    if (this._quotedName_ == oldChild) {
      setQuotedName((TQuotedName) newChild);
      return;
    }

    if (this._fixedArrayDescriptor_ == oldChild) {
      setFixedArrayDescriptor((PFixedArrayDescriptor) newChild);
      return;
    }

    throw new RuntimeException("Not a child.");
  }
}
