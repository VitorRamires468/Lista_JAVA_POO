package questao7.model;

public class Pix extends FormaPagamento{
    private String chave;

    public Pix(String chave) {
        this.chave = chave;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    @Override
    public void processarPagamento(double valor) {
        if(validarPagamento()){
            System.out.println("Valor transferido via PIX: "+valor);
        }else{
            System.out.println("Por favor, verifique a chave informada!");
        }
    }

    @Override
    public boolean validarPagamento() {
        return !chave.isEmpty() && chave!=null;
    }
}
