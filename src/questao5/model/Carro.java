package questao5.model;

public class Carro implements IMeioTransporte{

    private String marca;
    private Integer velocidade;
    private Integer velocidadeMaxima;

    public Carro(String marca, Integer velocidadeMaxima) {
        this.marca = marca;
        this.velocidade = 0;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public Integer getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Integer velocidade) {
        this.velocidade += velocidade;

    }

    @Override
    public int acelerar() {
        if(this.velocidade >= this.velocidadeMaxima){
            System.out.println("Velocidade máxima atingida!");
            return this.velocidadeMaxima;
        }
        setVelocidade(10);
        return this.velocidade;
    }

    @Override
    public int frear() {
        if(this.velocidade <= 0){
            System.out.println("Veiculo parado!");
            return 0;
        }
        setVelocidade(-10);
        return this.velocidade;
    }
}
