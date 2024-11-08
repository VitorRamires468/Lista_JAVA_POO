package questao7.model;

public class CartaoCredito extends FormaPagamento {
    private String numeroCartao;
    private String proprietario;

    public CartaoCredito(String numeroCartao, String proprietario) {
        this.numeroCartao = numeroCartao;
        this.proprietario = proprietario;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public String getProprietario() {
        return proprietario;
    }

    @Override
    public void processarPagamento(double valor) {
        if(validarPagamento()){
            System.out.println("Valor pago: "+valor);
        }else{
            System.out.println("Verifique os dados informados, por favor!");
        }
    }

    @Override
    public boolean validarPagamento() {
        return numeroCartao!=null && !numeroCartao.isEmpty() && !proprietario.isEmpty() && proprietario != null;
    }
}
