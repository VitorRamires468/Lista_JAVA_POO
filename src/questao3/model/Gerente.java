package questao3.model;

public class Gerente extends Funcionario{
    public Gerente(String nome, Double salario) {
        super(nome, salario);
    }

    public double calcularBonus(){
        return 0.20*salario;
    }

}
