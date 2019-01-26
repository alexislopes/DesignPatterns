package mariostates;

import state.State;

public class FireMario implements State {
    @Override
    public State pegarCogumelo() {
        System.out.println("Pegou um cogumelo: Mais 1000 pontos");
        return this;
    }

    @Override
    public State pegarEstrela() {
        System.out.println("Pegou uma estrela: Mario está invencivel");
        return new MarioInvencivel();
    }

    @Override
    public State pegarFlorDeFogo() {
        System.out.println("Pegou uma flor: Mario continua atirando fogo");
        return this;
    }

    @Override
    public State colidirComInimigo() {
        System.out.println("Colidiu com um inimigo: volta a ser SuperMario");
        return new SuperMario();
    }

    @Override
    public String retornarTipo() {
        return "Mario de Fogo";
    }
}
