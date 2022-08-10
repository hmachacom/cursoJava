package rectangulo;

import java.util.Scanner;

/**
 *
 * @author Hugo
 */
public class Rectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner dateScanner = new Scanner(System.in);
        System.out.println("Proporciona el alto: ");
        int alto = Integer.parseInt(dateScanner.nextLine());
        System.out.println("Proporciona el ancho: ");
        int ancho = Integer.parseInt(dateScanner.nextLine());
        System.out.println("Area: " + (alto * ancho));
        System.out.println("Perimetro: " + ((alto * ancho) * 2));
        
        
    }
    
}
