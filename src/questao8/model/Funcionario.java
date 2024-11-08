package questao8.model;

public abstract class Funcionario {
    protected String nome;
    protected Double salario;
    protected String cargo;

    public Funcionario(String nome,String cargo) {
        this.nome = nome;
        this.salario = 0.0;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public Double getSalario() {
        return salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public double calcularImposto(){
        return this.salario*0.15;
    }

    public abstract void calcularSalario();

    public abstract void trabalhar();

    public abstract double calcularBonus();

}

