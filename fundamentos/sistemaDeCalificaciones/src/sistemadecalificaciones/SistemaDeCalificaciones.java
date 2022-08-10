
package sistemadecalificaciones;

import java.util.Scanner;

/**
 *
 * @author Hugo Machacon
 */
public class SistemaDeCalificaciones {

    /**
     * @param args the command line arguments
     */ 
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner dateScanner = new Scanner(System.in);
        System.out.println("Proporciona un valor entre 0 y 10: ");
        var nota = dateScanner.nextFloat();
        var notaLetra = "";
        if (nota >= 9 && nota <= 10){
            notaLetra = "A";
        }else if (nota >= 8 && nota < 9){
            notaLetra = "B";
        }else if (nota >= 7 && nota < 8){
            notaLetra = "C";
        }else if (nota >= 6 && nota < 7){
            notaLetra = "D";
        }else if (nota >= 0 && nota < 6){
            notaLetra = "F";
        }
        System.out.println(notaLetra);
    }
    
}
