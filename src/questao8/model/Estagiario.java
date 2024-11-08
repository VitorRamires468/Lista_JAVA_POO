package questao8.model;

public class Estagiario extends Funcionario{

    public Estagiario(String nome) {
        super(nome, "estagiario");
        calcularSalario();
    }

    @Override
    public void calcularSalario() {
        setSalario(1200.00);
    }

    @Override
    public double calcularBonus() {
        return 0;
    }

    @Override
    public void trabalhar() {
        System.out.println("Eu auxilio na criação e manutenção de sites e aplicações web, escrevendo código básico, corrigindo erros e apoiando a equipe em tarefas de desenvolvimento.");
    }


}
