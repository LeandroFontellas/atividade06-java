package composite_exercise;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ExpressaoAritmetica expressao1 = new NumericOperand(0);
        System.out.println("Resultado: " + expressao1.getResultado());

        ExpressaoAritmetica expressao2 = new Operacao(new NumericOperand(1),new NumericOperand(2),'+');
        System.out.println("Resultado: "+ expressao2.getResultado());

        ExpressaoAritmetica expressao3 = new Operacao(
            new Operacao(
                new NumericOperand(2),
                new NumericOperand(3),
                '+'
            ), 
            new NumericOperand(1), 
            '*'
        );
        System.out.println("Resultado: " + expressao3.getResultado());

        ExpressaoAritmetica expressao4 = new Operacao(
            new Operacao(
                new NumericOperand(2),
                new NumericOperand(3),
                '*'
            ),
            new Operacao(
                new NumericOperand(4),
                new Operacao(
                    new NumericOperand(5), 
                    new NumericOperand(3), 
                    '-'
                ),
                '/'
            ), 
            '+'
        );
        System.out.println("Resultado: " + expressao4.getResultado());
    }
}
