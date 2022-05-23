package Main;

import Modelo.*;

public class Vista {

    public static void main(String[] args) {
        EmpAsalariado empleado1 = new EmpAsalariado(3, 0, 1, 4.200000);
        empleado1.Salario();
        EmpHoras empleado2 = new EmpHoras(10, 3200, 2, 7, 3);
        empleado2.Calcular_salario();
        EmpHoras empleado5 = new EmpHoras(6, 8000, 3, 0, 1);
        empleado5.Calcular_salario();
        EmpComision empleado3 = new EmpComision(8, 2000, 4, 1, 0, 3, 100000, 15);
        empleado3.calcular_salario_comision();
        EmpAsalariadoComision empleado4 = new EmpAsalariadoComision(9, 4000, 2, 6.000000, 0, 0, 0, 0, 6);
        empleado4.Calcular_salario_10();
    }
}
