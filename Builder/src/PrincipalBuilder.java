import modelo.Pedido;

import java.math.BigDecimal;

public class PrincipalBuilder {
    public static void main(String[] args) {
        Pedido pedido = new PedidoBuilder()
                .setPedido("643131")
                .setCliente(5, "Paulo", "125846857")
                .setVendedor(8, "Vanessa")
                .setProduto("Ração", 3, new BigDecimal(10.00))
                .setProduto("Água", 7, new BigDecimal(2.00))
                .setProduto("Picolé", 5, new BigDecimal(5.00))
                .build();

        pedido.informacoes();
    }
}
