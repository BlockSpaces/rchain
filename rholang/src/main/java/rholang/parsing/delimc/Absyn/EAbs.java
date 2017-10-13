package rholang.parsing.delimc.Absyn; // Java Package generated by the BNF Converter.

public class EAbs extends Expr {
  public final String var_;
  public final Type type_;
  public final TypedExpr typedexpr_;
  public EAbs(String p1, Type p2, TypedExpr p3) { var_ = p1; type_ = p2; typedexpr_ = p3; }

  public <R,A> R accept(rholang.parsing.delimc.Absyn.Expr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof rholang.parsing.delimc.Absyn.EAbs) {
      rholang.parsing.delimc.Absyn.EAbs x = (rholang.parsing.delimc.Absyn.EAbs)o;
      return this.var_.equals(x.var_) && this.type_.equals(x.type_) && this.typedexpr_.equals(x.typedexpr_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(37*(this.var_.hashCode())+this.type_.hashCode())+this.typedexpr_.hashCode();
  }


}