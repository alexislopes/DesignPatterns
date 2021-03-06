package controller;

import model.Modelo;
import view.Visao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador {
    private Visao visao;
    private Modelo modelo;

    public Controlador(Visao visao, Modelo modelo) {
        this.visao = visao;
        this.modelo = modelo;
        this.visao.adicionaListener(new Listener());
    }

    class Listener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            int numero1, numero2 = 0;

            try{
                numero1 = visao.getPrimeiroNumero();
                numero2 = visao.getSegundoNumero();

                modelo.somaNumeros(numero1, numero2);

                visao.setResultado(modelo.getValor());
            } catch (Exception e){
                visao.mensagemErro("insira dois numeros inteiros");
            }
        }
    }
}


