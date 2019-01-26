package modelo;

import boleto.Boleto;

import java.math.BigDecimal;

public class BoletoBB implements Boleto {
    @Override
    public void emitir(Produto produto, double imposto) {
        System.out.println("BB");
        System.out.println("=======================================================");
        System.out.println("Descrição: " + produto.getNome());
        System.out.println("Quantidade: " + produto.getQuantidade());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto: " + imposto);
        System.out.println("Valor Total: " + produto.getValor().add(new BigDecimal(imposto)));


    }
}
