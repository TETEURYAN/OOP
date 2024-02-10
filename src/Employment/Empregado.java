package Employment;


/*
    Classe referente ao Empregado

 */
public abstract class Empregado{ //Abstraction used is Empregado, as there are no employees but types of employee.
    private String nome, endereco;

    public Empregado(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public abstract double getSalario();//Abstraction used here with polymorphism, cause any type of Empregado has a different type os salary

    public abstract String getTipo();

    public abstract void setSalario(double salario);

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}