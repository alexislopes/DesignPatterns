package venda;

import boleto.Boleto;
import nfe.NFE;

public interface VendaFactory {
    NFE criarNFE();
    Boleto criarBoleto();
}
