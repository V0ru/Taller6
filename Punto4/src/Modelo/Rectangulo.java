package Modelo;

public class Rectangulo extends Cuadrilatero {

    public Rectangulo(int coordenadax_A, int cooordenaday_A, int coordenadax_B, int coordenaday_B, int coordenadax_C, int coordenaday_C, int coordenadax_D, int coordenaday_D) {
        super(coordenadax_A, cooordenaday_A, coordenadax_B, coordenaday_B, coordenadax_C, coordenaday_C, coordenadax_D, coordenaday_D);
    }

    @Override
    public String Area() {
        return super.calcularArea()+"-RECTANGULO--";
    }

}
