
import java.text.DecimalFormat;
import java.util.Scanner;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Hugo Machacon
 */
public class tiendaDeLibros {

    public static void main(String[] args) {
        Scanner date = new Scanner(System.in);
        System.out.println("Proporciona el nombre: ");
        var nombre = date.nextLine();
        System.out.println("Proporciona el id: ");
        var id = Integer.parseInt(date.nextLine());
        System.out.println("Proporciona el precio: ");
        var precio = Double.parseDouble(date.nextLine());
        System.out.println("Proporciona el envio gratuito: ");
        var envioGratuito = Boolean.parseBoolean(date.nextLine());

        System.out.println(nombre + " #" + id);
        System.out.println("Precio: $" + precio);
        System.out.println("Envio Gratuito: " + envioGratuito);
    }
}
