package questao8.model;

import questao8.model.Funcionario;

public class Desenvolvedor extends Funcionario {
    private Double valorHora = 17.50;

    public Desenvolvedor(String nome) {
        super(nome, "desenvolvedor");
        calcularSalario();
    }

    @Override
    public void calcularSalario() {
        setSalario(valorHora*220+calcularBonus()-calcularImposto());
    }

    @Override
    public double calcularBonus(){
        return 0.10*valorHora;
    }

    @Override
    public void trabalhar() {
        System.out.println("Eu desenvolvo e mantenho software, escrevendo e testando código para implementar funcionalidades, corrigir erros e melhorar a performance, sempre colaborando com a equipe para garantir a qualidade e a entrega dos projetos.");
    }
}
