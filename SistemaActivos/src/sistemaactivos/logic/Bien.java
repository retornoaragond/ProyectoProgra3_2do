package sistemaactivos.logic;
// Generated 19/10/2018 08:41:42 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Bien generated by hbm2java
 */
public class Bien  implements java.io.Serializable {


     private int serial;
     private Categoria categoria;
     private Solicitud solicitud;
     private String decripcion;
     private String marca;
     private String modelo;
     private double precioUnitario;
     private int cantidad;
     private Set activos = new HashSet(0);

    public Bien() {
    }

	
    public Bien(int serial, Solicitud solicitud, String decripcion, String marca, String modelo, double precioUnitario, int cantidad) {
        this.serial = serial;
        this.solicitud = solicitud;
        this.decripcion = decripcion;
        this.marca = marca;
        this.modelo = modelo;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
    }
    public Bien(int serial, Categoria categoria, Solicitud solicitud, String decripcion, String marca, String modelo, double precioUnitario, int cantidad, Set activos) {
       this.serial = serial;
       this.categoria = categoria;
       this.solicitud = solicitud;
       this.decripcion = decripcion;
       this.marca = marca;
       this.modelo = modelo;
       this.precioUnitario = precioUnitario;
       this.cantidad = cantidad;
       this.activos = activos;
    }
   
    public int getSerial() {
        return this.serial;
    }
    
    public void setSerial(int serial) {
        this.serial = serial;
    }
    public Categoria getCategoria() {
        return this.categoria;
    }
    
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
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
    public int getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public Set getActivos() {
        return this.activos;
    }
    
    public void setActivos(Set activos) {
        this.activos = activos;
    }




}


