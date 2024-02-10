package Employment.KindEmploy;

import Employment.Empregado;

/*
    Class that inherits from Empregado
*/

public class EmployHourly extends Empregado{ // Using extends to inheritance

    private double salarioHora; // Using encapsulation and poliorfis in this variable, as each type of Employee has a different salary
    public EmployHourly(String name, String endereco, double salarioHora) { // Constructor of EmployHourly
        super(name, endereco);
        setSalario(salarioHora);
    }

    public double getSalario() {
        return salarioHora;
    }

    public String getTipo() {
        return "horista";
    }

    public void setSalario(double salario) {
        this.salarioHora = salarioHora;
    }
}
