package test;

import dominio.Persona;
/**
 *
 * @author Hugo
 */
public class Pruebapersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Hugo", 50000.00, false);
        System.out.println(persona1);
        System.out.println("persona1 = " + persona1.getNombre());
        persona1.setNombre("miguel");
        System.out.println("persona1 = " + persona1.getNombre());
        System.out.println("persona1 eliminado = " + persona1.isEliminado());
        System.out.println(persona1.toString());
     
    }
}
