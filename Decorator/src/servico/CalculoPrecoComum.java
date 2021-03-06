package servico;

import modelo.Produto;

import java.math.BigDecimal;

public class CalculoPrecoComum implements CalculoPreco{
    @Override
    public BigDecimal valorFinal(Produto produto) {
        BigDecimal imposto = new BigDecimal(0.10);
        BigDecimal valorFinal = produto.getValor().add(produto.getValor().multiply(imposto));

        return valorFinal;
    }
}
