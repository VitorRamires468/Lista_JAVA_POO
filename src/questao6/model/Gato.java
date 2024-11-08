package questao6.model;

public class Gato extends Animal{
    private String nome;
    private Integer idade;

    public Gato(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau miau!");
    }
}
