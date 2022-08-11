package com.hm.mundopc;

/**
 *
 * @author Hugo
 */
public class Orden {

    private final int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private static int contadorComputadoras;
    private static final int maxComputadoras = 3;

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[Orden.maxComputadoras];

    }

    public void agregarComputadora(Computadora computadora) {
        if (Orden.contadorComputadoras < Orden.maxComputadoras) {
            computadoras[Orden.contadorComputadoras++] = computadora;
        }else{
            System.out.println("Numero maximo de computadoras alcanzado");
        }
        
    }

    public void mostrarOrden(){
        System.out.println("Orden #" + this.idOrden);
        for (int i = 0; i < Orden.contadorComputadoras; i++) {
            System.out.println(computadoras[i]);
        }
    }
}
