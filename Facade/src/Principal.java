import fabrica.*;
import facade.ComputerFacade;

public class Principal {

    public static void main(String[] args) {
        ComputerFacade facade = new ComputerFacade();
        facade.montarPC();
    }



}
