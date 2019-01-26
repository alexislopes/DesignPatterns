import loja.LojaDosPerifericos;
import modelo.Produto;
import venda.Venda;
import venda.VendaFactory;

import java.math.BigDecimal;

public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.setNome("notebook");
        produto.setQuantidade(1);
        produto.setValor(new BigDecimal(1500));

        VendaFactory factory = new LojaDosPerifericos();
        Venda venda = new Venda(factory);
        venda.realizarVenda(produto);

    }
}
