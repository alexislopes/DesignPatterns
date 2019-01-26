package boleto;

import modelo.Produto;

public interface Boleto {
    void emitir(Produto produto, double imposto);
}
