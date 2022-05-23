package Modelo;

public class EmpAsalariadoComision extends EmpComision {

    private double Pocenta_agregado;

    public EmpAsalariadoComision(int Horas_trabajadas, int valor_Horas, int Semanas, double Salario_fijo, int Horas_extra, int Ventas_Hechas, int Valor_articulo, double pocentaje_venta, double Pocenta_agregado) {
        super(Horas_trabajadas, valor_Horas, Semanas, Salario_fijo, Horas_extra, Ventas_Hechas, Valor_articulo, pocentaje_venta);
        this.Pocenta_agregado = Pocenta_agregado;
    }

    public double getPocenta_agregado() {
        return Pocenta_agregado;
    }

    public void setPocenta_agregado(double Pocenta_agregado) {
        this.Pocenta_agregado = Pocenta_agregado;
    }

    public void Calcular_salario_10() {
        double porcent = getPocenta_agregado() / 100;
        int operacion_semana = getSemanas() * 6;
        int operacion_t = getHoras_trabajadas() * operacion_semana;
        double sueldo = ((getSalario_fijo() * porcent) + getSalario_fijo());
        System.out.printf("EL EMPLEADO ASALARIADO POR COMISION TENDRA UN SUELDO FIJO : %f", getSalario_fijo());
        System.out.println(" TRABAJO " + operacion_t);
        System.out.printf("HORAS BTUVO UN 10% DE AGREGACION A SU SALARIO BASO, ENTONCES ESTE ES SU NUEVO SUELDO : %f", sueldo);
        System.out.printf("\n");
    }
}
