import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog(null);

        Mensagem mensagemsms =  MensagemFactory.getMensagem(1);
        Mensagem mensagememail =  MensagemFactory.getMensagem(2);
        mensagemsms.enviar(texto);
        mensagememail.enviar(texto);
    }
}
