package ventas;

/**
 *
 * @author Hugo
 */
public class Orden {

    private int idOrden;
    private static final int MAX_PRODUCTOS = 3;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos;

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    public static int getContadorOrden() {
        return contadorOrdenes;
    }

    public static void setContadorOrden(int aContadorOrden) {
        contadorOrdenes = aContadorOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void agregarPruducto(Producto productoAgregar) {
        if (this.contadorProductos < Orden.MAX_PRODUCTOS) {
            this.productos[this.contadorProductos++] = productoAgregar;
        } else {
            System.out.println("No se pueden Agregar mas productos");
        }

    }

    public void calcularTotal() {
        double total = 0;
        for (int i = 0; i < this.contadorProductos; i++) {
            total += productos[i].getPrecio();
        }
        System.out.println("total = " + total);
    }

    public void mostrarOrden() {
        System.out.println("Productos en la Orden:");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println(productos[i].toString());
        }

    }

    @Override
    public String toString() {
        return "Orden{" + "idOrden=" + idOrden + '}';
    }

}
