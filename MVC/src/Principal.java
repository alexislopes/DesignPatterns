import controller.Controlador;
import model.Modelo;
import view.Visao;

public class Principal {
    public static void main(String[] args) {
        Visao visao = new Visao();
        Modelo modelo = new Modelo();
        Controlador controlador = new Controlador(visao, modelo);

        visao.setVisible(true);
    }
}
