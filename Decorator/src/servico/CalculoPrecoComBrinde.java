package servico;

import modelo.Produto;

import java.math.BigDecimal;

public class CalculoPrecoComBrinde implements CalculoPreco {

    private CalculoPreco calculo;

    public CalculoPrecoComBrinde(CalculoPreco calculo) {
        this.calculo = calculo;
    }

    @Override
    public BigDecimal valorFinal(Produto produto) {
        BigDecimal valorFinal = calculo.valorFinal(produto);

        BigDecimal brinde = new BigDecimal("100.00");
        valorFinal = valorFinal.add(brinde);


        return valorFinal;
    }
}
