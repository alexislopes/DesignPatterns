package state;

public interface State {

    State pegarCogumelo();

    State pegarEstrela();

    State pegarFlorDeFogo();

    State colidirComInimigo();

    String retornarTipo();
}
