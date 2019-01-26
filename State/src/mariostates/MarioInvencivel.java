package mariostates;

import state.State;

public class MarioInvencivel implements State {
    @Override
    public State pegarCogumelo() {
        System.out.println("Pegou um cogumelo: Ainda invencível");
        return this;
    }

    @Override
    public State pegarEstrela() {
        System.out.println("Pegou uma estrela: Mario está invencivel");
        return this;
    }

    @Override
    public State pegarFlorDeFogo() {
        System.out.println("Pegou uma flor: Mario está atirando fogo e continua invencível");
        return this;
    }

    @Override
    public State colidirComInimigo() {
        System.out.println("Colidiu com um inimigo: o inimigo morreu");
        return this;
    }

    @Override
    public String retornarTipo() {
        return "Mário Invencível";
    }
}
