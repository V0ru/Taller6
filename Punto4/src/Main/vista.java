package Main;

import Modelo.*;

public class vista {

    public static void main(String[] args) {
        Cuadrilatero Trap = new Trapecio(10, 2, -1, 4, 8, -6, 5, 1);
        System.out.println(Trap.Area() + "\n*************************");
        Cuadrilatero Rect = new Rectangulo(-7, 1, 1, 6, 10, -3, 6, 2);
        System.out.println(Rect.Area() + "\n*************************");
        Cuadrilatero Cuad = new Cuadrado(2, -5, 3, 1, 2, -9, -1, -4);
        System.out.println(Rect.Area() + "\n*************************");
    }

}
