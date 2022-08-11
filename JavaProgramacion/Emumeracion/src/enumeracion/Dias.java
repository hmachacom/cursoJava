package enumeracion;

/**
 *
 * @author Hugo
 */
public enum Dias {
    LUNES(1),
    MARTES(3);

    private final int num;
    
    private Dias(int num) {
        this.num = num;
    }

    public int getNumDias() {
        return this.num;
    }

    
    
    
}
