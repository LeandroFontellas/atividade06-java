package composite_exercise;

public class Operacao extends ExpressaoAritmetica {
  private ExpressaoAritmetica op1;
  private ExpressaoAritmetica op2;
  private final char operacao; 

  public Operacao(ExpressaoAritmetica op1, ExpressaoAritmetica op2, char operacao){
    this.op1=op1;
    this.op2=op2;
    this.operacao=operacao;
  }
  
  @Override
  public int getResultado() {
    int resultado = 0;

    switch (operacao){
      case '+':
        resultado = op1.getResultado() + op2.getResultado();
        break;
      case '-':
        resultado = op1.getResultado() - op2.getResultado();
        break;
      case '*':
        resultado = op1.getResultado() * op2.getResultado();
        break;
      case '/':
        resultado = op1.getResultado() / op2.getResultado();
        break;
    }
    return resultado;
  }
}
