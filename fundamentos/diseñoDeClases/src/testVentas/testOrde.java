package testVentas;

import ventas.Orden;
import ventas.Producto;

/**
 *
 * @author Hugo
 */
public class testOrde {

    public static void main(String[] args) {
        Orden orden1 = new Orden();
        orden1.mostrarOrden();
        orden1.calcularTotal();
        System.out.println(orden1.toString());
        orden1.agregarPruducto(new Producto("Milanesa", 75.25));
        orden1.agregarPruducto(new Producto("Jugo", 2.5));
        orden1.agregarPruducto(new Producto("miel", 33.5));
        orden1.mostrarOrden();
        orden1.calcularTotal();
        orden1.agregarPruducto(new Producto("mora", 3.5));

//        Orden orden2 = new Orden();
//        System.out.println(orden2.toString());
//        orden2.agregarPruducto(new Producto("Cloro", 5.25));
//        orden2.agregarPruducto(new Producto("Desinfectante", 12.5));
//        orden2.mostrarOrden();
//        orden2.calcularTotal();
//
//        Orden orden3 = new Orden();
//        System.out.println(orden3.toString());
//        orden3.agregarPruducto(new Producto("Cloro", 5.25));
//        orden3.agregarPruducto(new Producto("Desinfectante", 12.5));
//        orden3.mostrarOrden();
//        orden3.calcularTotal();
//
//        Orden orden4Orden = new Orden();
//        System.out.println(orden4Orden.toString());
//        orden4Orden.agregarPruducto(new Producto("Cloro", 5.25));
//        orden4Orden.agregarPruducto(new Producto("Desinfectante", 12.5));
//        orden4Orden.mostrarOrden();
//        orden4Orden.calcularTotal();
    }
}
