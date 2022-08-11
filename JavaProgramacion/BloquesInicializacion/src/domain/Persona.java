package domain;

/**
 *
 * @author Hugo
 */
public class Persona {

    private final int idPersona;
    private static int contadorPersona;
    
    static {
        System.out.println("Ejecucion estatica");
        ++Persona.contadorPersona;
    }
    
    {
        System.out.println("Ejecucion No estatica");
        this.idPersona = Persona.contadorPersona++;
    }

    public Persona() {
    }

    public int getIdPersona() {
        return idPersona;
    }
    
    
}
