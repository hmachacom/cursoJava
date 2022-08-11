package com.hm.mundopc.testMundoPc;

import com.hm.mundopc.Computadora;
import com.hm.mundopc.Monitor;
import com.hm.mundopc.Orden;
import com.hm.mundopc.Raton;
import com.hm.mundopc.Teclado;

/**
 *
 * @author Hugo
 */
public class testPc {

    public static void main(String[] args) {
        Monitor monitor = new Monitor("Samsung", 16.0);
        Raton raton = new Raton("usb", "logi");
        Teclado teclado = new Teclado("usb", "logi");
        Computadora pc1 = new Computadora("Gamer", monitor, teclado, raton);
        Orden orden1 = new Orden();
        orden1.agregarComputadora(pc1);
        orden1.agregarComputadora(new Computadora("hugo", new Monitor("Lenovo", 21.0), new Teclado("usb c", "miyaqui"), new Raton("portserial", "lizus")));
        orden1.agregarComputadora(new Computadora("222", new Monitor("ISUS", 24.0), new Teclado("usb c", "sou"), new Raton("usbc", "zeus")));
        orden1.agregarComputadora(new Computadora("333", new Monitor("ISUS", 24.0), new Teclado("usb c", "sou"), new Raton("usbc", "ksjss")));
        orden1.mostrarOrden();
    }

}
