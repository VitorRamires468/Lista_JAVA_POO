package questao4.model;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, Double salario) {
        super(nome, salario);
    }

    public double calcularBonus(){
        return 0.10*salario;
    }

    @Override
    public void trabalhar() {
        System.out.println("Eu desenvolvo e mantenho software, escrevendo e testando código para implementar funcionalidades, corrigir erros e melhorar a performance, sempre colaborando com a equipe para garantir a qualidade e a entrega dos projetos.");
    }
}
