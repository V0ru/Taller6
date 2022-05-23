package Modelo;

import Modelo.Empleado;

public class EmpAsalariado extends Empleado {

    private double Salario_fijo;

    public EmpAsalariado(int Horas_trabajadas, int valor_Horas, int Semanas, double Salario_fijo) {
        super(Horas_trabajadas, valor_Horas, Semanas);
        this.Salario_fijo = Salario_fijo;
    }

    public double getSalario_fijo() {
        return Salario_fijo;
    }

    public void setSalario_fijo(double Salario_fijo) {
        this.Salario_fijo = Salario_fijo;
    }

    public void Salario() {
        System.out.printf("El querido empleado asalariado trabajo " + getHoras_trabajadas() + " horas en " + getSemanas() + " semanas y obtuvo un salario de %f", getSalario_fijo());
        System.out.printf("\n");
    }

}
