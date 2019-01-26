import adapter.CotacaoAdapter;

public class Principal {
    public static void main(String[] args) {
        CotacaoAdapter cotacaoAdapter = new CotacaoAdapter();
        cotacaoAdapter.setValor(1.00);

        System.out.println("R$" + cotacaoAdapter.getValor());
        System.out.println("U$" + cotacaoAdapter.getValorDolar());
    }
}
