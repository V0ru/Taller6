package Modelo;

public class EmpComision extends EmpHoras {

    private double pocentaje_venta;
    private int Valor_articulo;
    private int Ventas_Hechas;

    public EmpComision(int Horas_trabajadas, int valor_Horas, int Semanas, double Salario_fijo, int Horas_extra, int Ventas_Hechas, int Valor_articulo, double pocentaje_venta) {
        super(Horas_trabajadas, valor_Horas, Semanas, Salario_fijo, Horas_extra);
        this.Ventas_Hechas = Ventas_Hechas;
        this.Valor_articulo = Valor_articulo;
        this.pocentaje_venta = pocentaje_venta;
    }

    public int getVentas_Hechas() {
        return Ventas_Hechas;
    }

    public void setVentas_Hechas(int Ventas_Hechas) {
        this.Ventas_Hechas = Ventas_Hechas;
    }

    public double getValor_articulo() {
        return Valor_articulo;
    }

    public void setValor_articulo(int Valor_articulo) {
        this.Valor_articulo = Valor_articulo;
    }

    public double getPocentaje_venta() {
        return pocentaje_venta;
    }

    public void setPocentaje_venta(double pocentaje_venta) {
        this.pocentaje_venta = pocentaje_venta;
    }

    public void calcular_salario_comision() {
        double porcent = getPocentaje_venta() / 100;
        int operacion2 = (int) ((getHoras_trabajadas() * getValor_Horas()) + ((getVentas_Hechas() * getValor_articulo()) * (porcent)));
        System.out.println("Este empleado por comision ha hecho " + getVentas_Hechas() + " ventas, y estos articulos tienen un valor de " + getValor_articulo() + " el cual posee este porcentaje " + porcent + " tendra un salario de : " + operacion2);
    }

}
