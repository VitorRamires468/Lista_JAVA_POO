package questao7.model;

public abstract class FormaPagamento {

    public abstract void processarPagamento(double valor);
    public abstract boolean validarPagamento();
}
