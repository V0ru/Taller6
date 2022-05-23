package Main;

import Modelo.*;


public class TestHerencia2 {
    public static void main(String[] args) {
        Profesor profesorInterino = new ProfesorInterino("Jose", "Peña ", "222-333-342", "Domingo May 22 10:30:02 cet 2022");
        System.out.print(profesorInterino.info());
        System.out.println(profesorInterino);
        
    }
}
