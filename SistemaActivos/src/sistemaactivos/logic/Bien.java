package sistemaactivos.logic;
// Generated 14/10/2018 01:50:32 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Bien generated by hbm2java
 */
public class Bien  implements java.io.Serializable {


     private int serial;
     private Solicitud solicitud;
     private String decripcion;
     private String marca;
     private String modelo;
     private double precioUnitario;
     private Set activos = new HashSet(0);

    public Bien() {
    }

	
    public Bien(int serial, Solicitud solicitud, String decripcion, String marca, String modelo, double precioUnitario) {
        this.serial = serial;
        this.solicitud = solicitud;
        this.decripcion = decripcion;
        this.marca = marca;
        this.modelo = modelo;
        this.precioUnitario = precioUnitario;
    }
    public Bien(int serial, Solicitud solicitud, String decripcion, String marca, String modelo, double precioUnitario, Set activos) {
       this.serial = serial;
       this.solicitud = solicitud;
       this.decripcion = decripcion;
       this.marca = marca;
       this.modelo = modelo;
       this.precioUnitario = precioUnitario;
       this.activos = activos;
    }
   
    public int getSerial() {
        return this.serial;
    }
    
    public void setSerial(int serial) {
        this.serial = serial;
    }
    public Solicitud getSolicitud() {
        return this.solicitud;
    }
    
    public void setSolicitud(Solicitud solicitud) {
        this.solicitud = solicitud;
    }
    public String getDecripcion() {
        return this.decripcion;
    }
    
    public void setDecripcion(String decripcion) {
        this.decripcion = decripcion;
    }
    public String getMarca() {
        return this.marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return this.modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public double getPrecioUnitario() {
        return this.precioUnitario;
    }
    
    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    public Set getActivos() {
        return this.activos;
    }
    
    public void setActivos(Set activos) {
        this.activos = activos;
    }




}


