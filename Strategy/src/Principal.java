import contextos.ContextMath;
import operacoes.Somar;
import operacoes.Subtrair;

public class Principal {
    public static void main(String[] args) {
        
        ContextMath math = new ContextMath(new Somar());
        System.out.println(math.calcular(5,3));

        math = new ContextMath(new Subtrair());
        System.out.println(math.calcular(5,3));
    }
}
