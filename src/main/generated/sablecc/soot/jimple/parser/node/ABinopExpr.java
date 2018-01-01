/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.parser.node;

import soot.jimple.parser.analysis.*;

@SuppressWarnings("nls")
public final class ABinopExpr extends PBinopExpr {
  private PImmediate _left_;
  private PBinop _binop_;
  private PImmediate _right_;

  public ABinopExpr() {
    // Constructor
  }

  public ABinopExpr(
      @SuppressWarnings("hiding") PImmediate _left_,
      @SuppressWarnings("hiding") PBinop _binop_,
      @SuppressWarnings("hiding") PImmediate _right_) {
    // Constructor
    setLeft(_left_);

    setBinop(_binop_);

    setRight(_right_);
  }

  @Override
  public Object clone() {
    return new ABinopExpr(cloneNode(this._left_), cloneNode(this._binop_), cloneNode(this._right_));
  }

  @Override
  public void apply(Switch sw) {
    ((Analysis) sw).caseABinopExpr(this);
  }

  public PImmediate getLeft() {
    return this._left_;
  }

  public void setLeft(PImmediate node) {
    if (this._left_ != null) {
      this._left_.parent(null);
    }

    if (node != null) {
      if (node.parent() != null) {
        node.parent().removeChild(node);
      }

      node.parent(this);
    }

    this._left_ = node;
  }

  public PBinop getBinop() {
    return this._binop_;
  }

  public void setBinop(PBinop node) {
    if (this._binop_ != null) {
      this._binop_.parent(null);
    }

    if (node != null) {
      if (node.parent() != null) {
        node.parent().removeChild(node);
      }

      node.parent(this);
    }

    this._binop_ = node;
  }

  public PImmediate getRight() {
    return this._right_;
  }

  public void setRight(PImmediate node) {
    if (this._right_ != null) {
      this._right_.parent(null);
    }

    if (node != null) {
      if (node.parent() != null) {
        node.parent().removeChild(node);
      }

      node.parent(this);
    }

    this._right_ = node;
  }

  @Override
  public String toString() {
    return "" + toString(this._left_) + toString(this._binop_) + toString(this._right_);
  }

  @Override
  void removeChild(@SuppressWarnings("unused") Node child) {
    // Remove child
    if (this._left_ == child) {
      this._left_ = null;
      return;
    }

    if (this._binop_ == child) {
      this._binop_ = null;
      return;
    }

    if (this._right_ == child) {
      this._right_ = null;
      return;
    }

    throw new RuntimeException("Not a child.");
  }

  @Override
  void replaceChild(
      @SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild) {
    // Replace child
    if (this._left_ == oldChild) {
      setLeft((PImmediate) newChild);
      return;
    }

    if (this._binop_ == oldChild) {
      setBinop((PBinop) newChild);
      return;
    }

    if (this._right_ == oldChild) {
      setRight((PImmediate) newChild);
      return;
    }

    throw new RuntimeException("Not a child.");
  }
}
