package questao7.model;

public class Boleto extends FormaPagamento{
    private String codigoDeBarras;


    public Boleto(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }


    @Override
    public void processarPagamento(double valor) {
        if(this.validarPagamento()){
            System.out.println("Boleto pago: "+valor);
        }else{
            System.out.println("Verifique o boleto informado!");
        }
    }

    @Override
    public boolean validarPagamento() {
        return codigoDeBarras != null && !codigoDeBarras.isEmpty();
    }
}
