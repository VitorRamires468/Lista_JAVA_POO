package questao8.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Empresa {
    private List<Funcionario> funcionarios;
    private Scanner leitura = new Scanner(System.in);

    public Empresa(){
        funcionarios = new ArrayList<>();
    }

    public void listarFuncionarios() {
        if(funcionarios.size()==0){
            System.out.println("Vazia!");
        }else{
            funcionarios.forEach(f -> System.out.println("Nome: "+f.getNome() + " Cargo: "+f.getCargo() + " Salário: "+f.getSalario()));
        }
    }

    public void contratar(String nome, String cargo){
        Funcionario novoFuncionario;
        switch (cargo.toLowerCase()) {
            case "gerente":
                novoFuncionario = new Gerente(nome);
                break;
            case "desenvolvedor":
                novoFuncionario = new Desenvolvedor(nome);
                break;
            case "estagiario":
                novoFuncionario = new Estagiario(nome);
                break;
            default:
                System.out.println("Cargo inesistente!");
                return;
        }
        funcionarios.add(novoFuncionario);

    }

    public void demitir(String nome){
        funcionarios.remove(buscarFuncionario(nome));
    }

    public void promoverFuncionario(Funcionario funcionario, String novoCargo) {
        Funcionario novoFuncionario;
        switch (novoCargo.toLowerCase()) {
            case "gerente":
                novoFuncionario = new Gerente(funcionario.getNome());
                break;
            case "desenvolvedor":
                novoFuncionario = new Desenvolvedor(funcionario.getNome());
                break;
            case "estagiario":
                novoFuncionario = new Estagiario(funcionario.getNome());
                break;
            default:
                System.out.println("Cargo inesistente!");
                return;
        }
        funcionarios.remove(funcionario);
        funcionarios.add(novoFuncionario);
        System.out.println(funcionario.getNome() + " promovido para " + novoCargo + " com novo salário base de R$ " + novoFuncionario.getSalario());
    }

    public void calcularFolhaPagamento(){
        Double salarioTotal = 0.0;
        Double bonusTotal = 0.0;
        for (Funcionario func : funcionarios){
            salarioTotal += func.getSalario();
            bonusTotal += func.calcularBonus();
        }
        System.out.println("------------FOLHA DE PAGAMENTO------------");
        System.out.println("Salário Total: "+salarioTotal);
        System.out.println("Bônus Total: "+bonusTotal);
    }

    public Funcionario buscarFuncionario(String nome){
        Optional<Funcionario> funcionarioPresente = funcionarios.stream()
                .filter(f -> f.getNome().equalsIgnoreCase(nome))
                .findFirst();
        if(funcionarioPresente.isPresent()){
            Funcionario funcionario = funcionarioPresente.get();
            return funcionario;
        }else{
            System.out.println("Funcionário não encontrado no sistema.");
            return null;
        }
    }
}
