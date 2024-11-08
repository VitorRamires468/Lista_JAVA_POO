package questao1.model;

public class Produto {
    private String nome;
    private Double preco;
    private Integer quantidade;

    public Produto(String nome, Double preco, Integer quantidade) {
        this.nome = nome;
        setPreco(preco);
        setQuantidade(quantidade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        if(preco<0){
            System.out.println("Valor negativo");
        }else{
            this.preco = preco;
        }

    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        if(preco<0){
            System.out.println("Valor negativo");
        }else{
            this.quantidade = quantidade;
        }
    }


    @Override
    public String toString() {
        return "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade;
    }
}
