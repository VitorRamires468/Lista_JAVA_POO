package questao7.principal;

import questao7.model.Boleto;
import questao7.model.CartaoCredito;
import questao7.model.Pix;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int opcao = -1;
        while(opcao!=0){
            System.out.println("\t1 - Cartão\n\t2 - Boleto\n\t3 - PIX\n\t0 - Sair");
            opcao = leitura.nextInt();
            leitura.nextLine();
            System.out.println("Informe o valor: ");
            var valor = leitura.nextDouble();
            leitura.nextLine();
            switch (opcao){
                case 1:
                    System.out.println("Informe o numero do cartão: ");
                    var numeroCartao = leitura.nextLine();
                    System.out.println("Informe o proprietário: ");
                    var proprietario = leitura.nextLine();
                    CartaoCredito cartaoCredito = new CartaoCredito(numeroCartao,proprietario);
                    cartaoCredito.processarPagamento(valor);
                    break;
                case 2:
                    System.out.println("Informe o boleto: ");
                    var boleto = leitura.nextLine();
                    Boleto boleto1 = new Boleto(boleto);
                    boleto1.processarPagamento(valor);
                    break;
                case 3:
                    System.out.println("Informe a chave: ");
                    var chave = leitura.nextLine();
                    Pix pix = new Pix(chave);
                    pix.processarPagamento(valor);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Informe uma opção válida!");
                    break;
            }
        }
    }
}
