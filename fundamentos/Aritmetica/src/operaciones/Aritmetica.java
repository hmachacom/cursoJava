package operaciones;

/**
 *
 * @author Hugo
 */
public class Aritmetica {
    int a, b;
    
    public Aritmetica(){
        
    }
    
    public Aritmetica(int a, int b){
        this.a = a;
        this.b = b;
    }
    
    public void sumar(){
        int resultado = a + b;
        System.out.println("resultado: " + resultado);
    }
    
    public int sumarConRetorno(){
        return a + b;
    }
    
    public int sumarConArgumentos(int a, int b){
        this.a = a;
        this.b = b;
        return this.sumarConRetorno();
    }
}
