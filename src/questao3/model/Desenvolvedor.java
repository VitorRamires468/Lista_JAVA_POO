package questao3.model;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, Double salario) {
        super(nome, salario);
    }

    public double calcularBonus(){
        return 0.10*salario;
    }

}
