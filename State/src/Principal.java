import mariostates.Mario;
import state.State;

public class Principal {
    public static void main(String[] args) {
        State mario = new Mario();

        mario = mario.pegarCogumelo();
        System.out.println("Estado: " + mario.retornarTipo());
        mario = mario.pegarFlorDeFogo();
        System.out.println("Estado: " + mario.retornarTipo());
        mario = mario.pegarCogumelo();
        System.out.println("Estado: " + mario.retornarTipo());

        mario = mario.colidirComInimigo();
        System.out.println("Estado: " + mario.retornarTipo());
        mario = mario.colidirComInimigo();
        System.out.println("Estado: " + mario.retornarTipo());
        mario = mario.colidirComInimigo();

        System.out.println();
        System.out.println("Estado Final: " + mario.retornarTipo());

    }


}
