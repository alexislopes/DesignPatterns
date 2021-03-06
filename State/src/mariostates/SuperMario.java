package mariostates;

import state.State;

public class SuperMario implements State {
    @Override
    public State pegarCogumelo() {
        System.out.println("Pegou um cogumelo: mais 1000 pontos");
        return this;
    }

    @Override
    public State pegarEstrela() {
        System.out.println("Pegou uma estrela: Mario está invencivel");
        return new MarioInvencivel();
    }

    @Override
    public State pegarFlorDeFogo() {
        System.out.println("Pegou uma flor: Mario atira fogo");
        return new FireMario();
    }

    @Override
    public State colidirComInimigo() {
        System.out.println("Colidiu com um inimigo: Volta a ser o Mario baixinho");
        return new Mario();
    }

    @Override
    public String retornarTipo() {
        return "Mario Grandão";
    }
}
