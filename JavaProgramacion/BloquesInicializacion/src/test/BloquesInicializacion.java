package test;

import domain.Persona;

/**
 *
 * @author Hugo
 */
public class BloquesInicializacion {
    public static void main(String[] args) {
        Persona persona = new Persona();
        
        
        System.out.println("personaid " + persona.getIdPersona());
    }
}
