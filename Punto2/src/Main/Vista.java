package Main;

import Modelos.*;

public class Vista {

    public static void main(String[] args) {
        Empleado E1 = new Empleado("Rafa");
        Directivo D1 = new Directivo("Mario");
        Operario OP = new Operario("Alonso");
        Oficial OF1 = new Oficial("Luis");
        Tecnico T1 = new Tecnico("Pablo");
        System.out.println(E1);
        System.out.println(D1);
        System.out.println(OP);
        System.out.println(OF1);
        System.out.println(T1);
    }
}
