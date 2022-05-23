package Modelo;

public abstract class Cuadrilatero {

    private int coordenadax_A;
    private int cooordenaday_A;
    private int coordenadax_B;
    private int coordenaday_B;
    private int coordenadax_C;
    private int coordenaday_C;
    private int coordenadax_D;
    private int coordenaday_D;

    public Cuadrilatero(int coordenadax_A, int cooordenaday_A, int coordenadax_B, int coordenaday_B, int coordenadax_C, int coordenaday_C, int coordenadax_D, int coordenaday_D) {
        this.coordenadax_A = coordenadax_A;
        this.cooordenaday_A = cooordenaday_A;
        this.coordenadax_B = coordenadax_B;
        this.coordenaday_B = coordenaday_B;
        this.coordenadax_C = coordenadax_C;
        this.coordenaday_C = coordenaday_C;
        this.coordenadax_D = coordenadax_D;
        this.coordenaday_D = coordenaday_D;
    }

    public int getCoordenadax_A() {
        return coordenadax_A;
    }

    public void setCoordenadax_A(int coordenadax_A) {
        this.coordenadax_A = coordenadax_A;
    }

    public int getCooordenaday_A() {
        return cooordenaday_A;
    }

    public void setCooordenaday_A(int cooordenaday_A) {
        this.cooordenaday_A = cooordenaday_A;
    }

    public int getCoordenadax_B() {
        return coordenadax_B;
    }

    public void setCoordenadax_B(int coordenadax_B) {
        this.coordenadax_B = coordenadax_B;
    }

    public int getCoordenaday_B() {
        return coordenaday_B;
    }

    public void setCoordenaday_B(int coordenaday_B) {
        this.coordenaday_B = coordenaday_B;
    }

    public int getCoordenadax_C() {
        return coordenadax_C;
    }

    public void setCoordenadax_C(int coordenadax_C) {
        this.coordenadax_C = coordenadax_C;
    }

    public int getCoordenaday_C() {
        return coordenaday_C;
    }

    public void setCoordenaday_C(int coordenaday_C) {
        this.coordenaday_C = coordenaday_C;
    }

    public int getCoordenadax_D() {
        return coordenadax_D;
    }

    public void setCoordenadax_D(int coordenadax_D) {
        this.coordenadax_D = coordenadax_D;
    }

    public int getCoordenaday_D() {
        return coordenaday_D;
    }

    public void setCoordenaday_D(int coordenaday_D) {
        this.coordenaday_D = coordenaday_D;
    }

    public String calcularArea() {
        System.out.println("Esta es el area de la figura:");
        float a;
        a = (this.coordenadax_A * this.coordenaday_D) + (this.coordenadax_D * this.coordenaday_C) + (this.coordenadax_C * this.coordenaday_B) + (this.coordenadax_B * this.cooordenaday_A)
                - (this.coordenadax_A * this.coordenaday_B) - (this.coordenadax_B * this.coordenaday_C) - (this.coordenadax_C * this.coordenaday_D) - (this.coordenadax_D * this.cooordenaday_A);
        if (a < 0) {
            return a / 2 * (-1) + " -UNIDADES CUADRADAS-";
        } else if (a > 0) {
            return a / 2 + " -UNIDADES CUADRADAS-";
        }
        return null;
    }

    public abstract String Area();
}
