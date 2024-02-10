package Employment.KindEmploy;

import Employment.Empregado;

/*
    Class that inherits from Empregado
 */

public class EmployComissioned extends Empregado{// Using extends to inheritance

    private double salarioComissionado;
    public EmployComissioned(String name, String endereco, double salarioComissionado) {
        super(name, endereco);
        setSalario(salarioComissionado);
    }

    public double getSalario() {
        return this.salarioComissionado;
    }

    public String getTipo() {
        return "Comissionado";
    }

    public void setSalario(double salario) { //Polymorphism in setSalario, cause any type of Employee has a different salary
        this.salarioComissionado = salario;
    }

}
