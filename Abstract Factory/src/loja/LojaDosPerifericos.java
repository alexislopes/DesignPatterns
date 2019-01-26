package loja;

import boleto.Boleto;
import modelo.BoletoBB;
import nfe.NFE;
import nfe.NFESaoPaulo;
import venda.VendaFactory;

public class LojaDosPerifericos implements VendaFactory {
    @Override
    public NFE criarNFE() {
        NFE notaFiscal = new NFESaoPaulo();
        return notaFiscal;
    }

    @Override
    public Boleto criarBoleto() {
        Boleto boleto = new BoletoBB();
        return boleto;
    }
}
