package servico;

import modelo.Produto;

import java.math.BigDecimal;

public interface CalculoPreco {
    BigDecimal valorFinal(Produto produto);
}
