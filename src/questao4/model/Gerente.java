package questao4.model;

public class Gerente extends Funcionario{
    public Gerente(String nome, Double salario) {
        super(nome, salario);
    }

    public double calcularBonus(){
        return 0.20*salario;
    }

    @Override
    public void trabalhar() {
        System.out.println("Eu coordeno e lidero equipes de desenvolvimento, garantindo a entrega de projetos, promovendo boas práticas de programação e facilitando a comunicação entre times e stakeholders.");
    }
}
