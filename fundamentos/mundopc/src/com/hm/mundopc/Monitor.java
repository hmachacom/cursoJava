package com.hm.mundopc;
/**
 *
 * @author Hugo
 */
public class Monitor {
    private final int idMonitor;
    private String marca;
    private double tamanno;
    private static int contadorMonitores;

    private Monitor() {
        this.idMonitor = ++Monitor.contadorMonitores;
    }

    public Monitor(String marca, double tamanno) {
        this();
        this.marca = marca;
        this.tamanno = tamanno;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Monitor{");
        sb.append("idMonitor=").append(idMonitor);
        sb.append(", marca=").append(marca);
        sb.append(", tamanno=").append(tamanno);
        sb.append('}');
        return sb.toString();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanno() {
        return tamanno;
    }

    public void setTamanno(double tamanno) {
        this.tamanno = tamanno;
    }

    public static int getContadorMonitores() {
        return contadorMonitores;
    }

    public int getIdMonitor() {
        return idMonitor;
    }
    
    
}
