/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;

/**
 *
 * @author Hugo
 */
public class PruebaCaja {
    
    public static void main(String[] args) {
        Caja caja1 = new Caja();
        caja1.ancho = 3;
        caja1.alto = 2;
        caja1.profundo = 6;
        int volumenCaja1 = caja1.calcularVolumen();
        System.out.println("volumenCaja1 = " + volumenCaja1);
        
        Caja caja2 = new Caja(3, 2, 6);
        int volumenCaja2 = caja2.calcularVolumen();
        System.out.println("volumenCaja2 = " + volumenCaja2);
    }
    
}
