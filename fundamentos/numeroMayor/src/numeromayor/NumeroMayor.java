package numeromayor;

import java.util.Scanner;

/**
 *
 * @author Hugo Machacon
 */
public class NumeroMayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here8
        Scanner dateScanner = new Scanner(System.in);
        System.out.println("Proporciona el numero1:");
        int numero1 = Integer.parseInt(dateScanner.nextLine());
        System.out.println("Proporciona el numero2:");
        int numero2 = Integer.parseInt(dateScanner.nextLine());
        System.out.println("El numero mayor es: \n" + (numero1 > numero2 ? numero1 : numero2));
    }
}
