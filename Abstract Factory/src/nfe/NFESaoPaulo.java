package nfe;

import modelo.Produto;

import java.math.BigDecimal;

public class NFESaoPaulo implements NFE{
    @Override
    public double calcularImposto(Produto produto) {
        BigDecimal imposto = new BigDecimal(0.18);
        imposto = imposto.multiply(produto.getValor());

        return imposto.doubleValue();
    }
}
