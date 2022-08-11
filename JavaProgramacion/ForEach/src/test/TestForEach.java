package test;

import persona.Persona;

/**
 *
 * @author Hugo
 */
public class TestForEach {

    public static void main(String[] args) {
        int numeros[] = {2, 9, 8, 8};
        for (int numero : numeros) {
            System.out.println("numero :" + numero);
        }

        Persona personas[] = {new Persona("Hugo"), new Persona("Michel"), new Persona("Eduardo")};
        
        for (Persona persona : personas) {
            System.out.println("Persona " + persona.getName());
        }
    }
}
