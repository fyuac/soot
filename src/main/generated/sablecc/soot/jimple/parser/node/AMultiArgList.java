/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.parser.node;

import soot.jimple.parser.analysis.*;

@SuppressWarnings("nls")
public final class AMultiArgList extends PArgList {
  private PImmediate _immediate_;
  private TComma _comma_;
  private PArgList _argList_;

  public AMultiArgList() {
    // Constructor
  }

  public AMultiArgList(
      @SuppressWarnings("hiding") PImmediate _immediate_,
      @SuppressWarnings("hiding") TComma _comma_,
      @SuppressWarnings("hiding") PArgList _argList_) {
    // Constructor
    setImmediate(_immediate_);

    setComma(_comma_);

    setArgList(_argList_);
  }

  @Override
  public Object clone() {
    return new AMultiArgList(
        cloneNode(this._immediate_), cloneNode(this._comma_), cloneNode(this._argList_));
  }

  @Override
  public void apply(Switch sw) {
    ((Analysis) sw).caseAMultiArgList(this);
  }

  public PImmediate getImmediate() {
    return this._immediate_;
  }

  public void setImmediate(PImmediate node) {
    if (this._immediate_ != null) {
      this._immediate_.parent(null);
    }

    if (node != null) {
      if (node.parent() != null) {
        node.parent().removeChild(node);
      }

      node.parent(this);
    }

    this._immediate_ = node;
  }

  public TComma getComma() {
    return this._comma_;
  }

  public void setComma(TComma node) {
    if (this._comma_ != null) {
      this._comma_.parent(null);
    }

    if (node != null) {
      if (node.parent() != null) {
        node.parent().removeChild(node);
      }

      node.parent(this);
    }

    this._comma_ = node;
  }

  public PArgList getArgList() {
    return this._argList_;
  }

  public void setArgList(PArgList node) {
    if (this._argList_ != null) {
      this._argList_.parent(null);
    }

    if (node != null) {
      if (node.parent() != null) {
        node.parent().removeChild(node);
      }

      node.parent(this);
    }

    this._argList_ = node;
  }

  @Override
  public String toString() {
    return "" + toString(this._immediate_) + toString(this._comma_) + toString(this._argList_);
  }

  @Override
  void removeChild(@SuppressWarnings("unused") Node child) {
    // Remove child
    if (this._immediate_ == child) {
      this._immediate_ = null;
      return;
    }

    if (this._comma_ == child) {
      this._comma_ = null;
      return;
    }

    if (this._argList_ == child) {
      this._argList_ = null;
      return;
    }

    throw new RuntimeException("Not a child.");
  }

  @Override
  void replaceChild(
      @SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild) {
    // Replace child
    if (this._immediate_ == oldChild) {
      setImmediate((PImmediate) newChild);
      return;
    }

    if (this._comma_ == oldChild) {
      setComma((TComma) newChild);
      return;
    }

    if (this._argList_ == oldChild) {
      setArgList((PArgList) newChild);
      return;
    }

    throw new RuntimeException("Not a child.");
  }
}
