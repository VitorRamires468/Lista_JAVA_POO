package questao8.principal;

import questao8.model.Empresa;
import questao8.model.Funcionario;
import questao8.model.Gerente;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura  = new Scanner(System.in);
        Empresa empresa = new Empresa();

        int opcao = -1;

        while (opcao!=0){
            System.out.println("\t1 - Contratar\n\t2 - Demitir\n\t3 - Promover\n\t4 - Listar funcionários\n\t5 - Sair");
            opcao = leitura.nextInt();
            leitura.nextLine();
            switch (opcao){
                case 1:
                    System.out.println("Informe o nome do contratado: ");
                    var nomeContratado = leitura.nextLine();
                    System.out.println("Informe o cargo: ");
                    var cargo = leitura.nextLine();
                    empresa.contratar(nomeContratado,cargo);
                    break;
                case 2:
                    System.out.println("Informe o nome: ");
                    var nomeDemitido = leitura.nextLine();
                    empresa.demitir(nomeDemitido);
                    break;
                case 3:
                    System.out.println("Informe o nome do funcionário: ");
                    var nomePromovido = leitura.nextLine();
                    System.out.println("Informe o cargo da promoção: ");
                    var cargoPromocao = leitura.nextLine();
                    Funcionario funcionario = empresa.buscarFuncionario(nomePromovido);
                    if(funcionario!=null){
                        empresa.promoverFuncionario(funcionario,cargoPromocao);
                    }
                    break;
                case 4:
                    empresa.listarFuncionarios();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}
