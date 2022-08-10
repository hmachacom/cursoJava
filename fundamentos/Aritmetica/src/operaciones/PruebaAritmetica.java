package operaciones;

/**
 *
 * @author Hugo
 */
public class PruebaAritmetica {
    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 5;
        aritmetica1.b = 16;
        aritmetica1.sumar();
        var p = aritmetica1.sumarConRetorno();
        System.out.println(p);
        p = aritmetica1.sumarConArgumentos(8, 9);
        System.out.println("p = " + p);
    }
}
