
package test;

import domain.Cliente;
import domain.Persona;
import java.util.Date;

/**
 *
 * @author Hugo
 */
public class TestPersona {
    public static void main(String[] args) {
//        Cliente cliente1 = new Cliente(true, "Hugo");
//        System.out.println("cliente1 = " + cliente1);
//   
        Cliente cliente2 = new Cliente(new Date(), false, "eduardo", 'm', 50, "venezuela");
        System.out.println("cliente2 = " + cliente2);
        
    }
}
