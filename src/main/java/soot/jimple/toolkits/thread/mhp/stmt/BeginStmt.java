
package soot.jimple.toolkits.thread.mhp.stmt;

import soot.SootMethod;
import soot.toolkits.graph.UnitGraph;

// *** USE AT YOUR OWN RISK ***
// May Happen in Parallel (MHP) analysis by Lin Li.
// This code should be treated as beta-quality code.
// It was written in 2003, but not incorporated into Soot until 2006.
// As such, it may contain incorrect assumptions about the usage
// of certain Soot classes.
// Some portions of this MHP analysis have been quality-checked, and are
// now used by the Transactions toolkit.
//
// -Richard L. Halpert, 2006-11-30

public class BeginStmt extends JPegStmt {

  public BeginStmt(String obj, String ca, UnitGraph ug, SootMethod sm) {
    this.object = obj;
    this.name = "begin";
    this.caller = ca;
    this.unitGraph = ug;
    this.sootMethod = sm;
  }

}
