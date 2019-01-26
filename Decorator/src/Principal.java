import modelo.Produto;
import servico.CalculoPreco;
import servico.CalculoPrecoComBrinde;
import servico.CalculoPrecoComFrete;
import servico.CalculoPrecoComum;

import java.math.BigDecimal;

public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.setNome("Action figure do Falcon");
        produto.setQuantidade(1);
        produto.setValor(new BigDecimal("40.00"));

        CalculoPreco calculo = new CalculoPrecoComBrinde(new CalculoPrecoComFrete(new CalculoPrecoComum()));

        BigDecimal preco = calculo.valorFinal(produto);

        System.out.println("R$ " + preco.doubleValue());
    }
}
