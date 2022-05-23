package Main;

import Modelo.*;


public class TestHerencia1 {
    public static void main(String[] args) {
        Persona profesor1 = new Profesor("Ismael", "Ortiz", "Prof 32-723-102");
        System.out.print(profesor1.info());
        System.out.println(profesor1);
    }
}
