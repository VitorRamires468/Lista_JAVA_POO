package questao2.model;

import questao1.model.Produto;

public class ProdutoComDesconto extends Produto {

    public ProdutoComDesconto(String nome, Double preco, Integer quantidade) {
        super(nome, preco, quantidade);
    }

    public void aplicarDesconto(Double porcentagem){
        if(porcentagem<0 || porcentagem>50){
            System.out.println("Procentagem inválida");
        }else{
            this.setPreco(this.getPreco()-this.getPreco()*porcentagem);
        }
    }
}
