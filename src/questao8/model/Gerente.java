package questao8.model;


public class Gerente extends Funcionario {
    private Double valorHora = 100.0;

    public Gerente(String nome) {
        super(nome, "gerente");
        calcularSalario();
    }

    @Override
    public void calcularSalario() {
         setSalario(valorHora*220+calcularBonus()-calcularImposto());
    }


    @Override
    public double calcularBonus() {
        return 0.20*valorHora;
    }

    @Override
    public void trabalhar() {
        System.out.println("Eu coordeno e lidero equipes de desenvolvimento, garantindo a entrega de projetos, promovendo boas práticas de programação e facilitando a comunicação entre times e stakeholders.");
    }

}
