package domain;

import java.util.Date;

/**
 *
 * @author Hugo
 */
public class Cliente extends Persona {

    private int idCliente;
    private static int contadorCliente;
    private Date fechaRegistro = new Date();
    private boolean vip;

//    public Cliente(boolean vip, String nombre) {
//        super(nombre);
//        this.idCliente = ++Cliente.contadorCliente;
//        this.vip = vip;
//    }

    public Cliente(Date fecharegistro,
            boolean vip, String nombre, char genero, int edad, String direccion) {
        super(nombre, genero, edad, direccion);
        this.fechaRegistro = fecharegistro;
        this.vip = vip;
        this.idCliente = ++Cliente.contadorCliente;
    }
 
    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("id =").append(idCliente);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", vip=").append(vip);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

}
