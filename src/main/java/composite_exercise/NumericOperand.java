package composite_exercise;

public class NumericOperand extends ExpressaoAritmetica{
  private int valor;

  public NumericOperand(int valor) {
    this.valor = valor;
  }

  @Override
  public int getResultado() {
    return valor;
  }
}
