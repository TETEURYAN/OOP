package Employment.KindEmploy;

import Employment.Empregado;

/*
    Class that inherits from Empregado
 */

public class EmploySalaried extends Empregado{// Using extends to inheritance

    private double salarioMes;
    public EmploySalaried(String name, String endereco, double salarioMes) {
        super(name, endereco);
        setSalario(salarioMes);
    }

    @Override
    public double getSalario() {
        return this.salarioMes;
    }

    @Override
    public String getTipo() {
        return "assalariado";
    }

    @Override
    public void setSalario(double salario) {
        this.salarioMes = salario;
    }
}
