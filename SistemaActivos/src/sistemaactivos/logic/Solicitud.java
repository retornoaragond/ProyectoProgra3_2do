package sistemaactivos.logic;
// Generated 17/10/2018 12:42:31 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Solicitud generated by hbm2java
 */
public class Solicitud  implements java.io.Serializable {


     private Integer numSolicitud;
     private Dependencia dependencia;
     private Funcionario funcionario;
     private int numComprobante;
     private Date fecha;
     private String tipoAdquisicion;
     private int cantidadBienes;
     private double montoTotal;
     private String razonRechazo;
     private String estado;
     private Set biens = new HashSet(0);

    public Solicitud() {
    }

	
    public Solicitud(Dependencia dependencia, Funcionario funcionario, int numComprobante, Date fecha, String tipoAdquisicion, int cantidadBienes, double montoTotal, String razonRechazo, String estado) {
        this.dependencia = dependencia;
        this.funcionario = funcionario;
        this.numComprobante = numComprobante;
        this.fecha = fecha;
        this.tipoAdquisicion = tipoAdquisicion;
        this.cantidadBienes = cantidadBienes;
        this.montoTotal = montoTotal;
        this.razonRechazo = razonRechazo;
        this.estado = estado;
    }
    public Solicitud(Dependencia dependencia, Funcionario funcionario, int numComprobante, Date fecha, String tipoAdquisicion, int cantidadBienes, double montoTotal, String razonRechazo, String estado, Set biens) {
       this.dependencia = dependencia;
       this.funcionario = funcionario;
       this.numComprobante = numComprobante;
       this.fecha = fecha;
       this.tipoAdquisicion = tipoAdquisicion;
       this.cantidadBienes = cantidadBienes;
       this.montoTotal = montoTotal;
       this.razonRechazo = razonRechazo;
       this.estado = estado;
       this.biens = biens;
    }
   
    public Integer getNumSolicitud() {
        return this.numSolicitud;
    }
    
    public void setNumSolicitud(Integer numSolicitud) {
        this.numSolicitud = numSolicitud;
    }
    public Dependencia getDependencia() {
        return this.dependencia;
    }
    
    public void setDependencia(Dependencia dependencia) {
        this.dependencia = dependencia;
    }
    public Funcionario getFuncionario() {
        return this.funcionario;
    }
    
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    public int getNumComprobante() {
        return this.numComprobante;
    }
    
    public void setNumComprobante(int numComprobante) {
        this.numComprobante = numComprobante;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public String getTipoAdquisicion() {
        return this.tipoAdquisicion;
    }
    
    public void setTipoAdquisicion(String tipoAdquisicion) {
        this.tipoAdquisicion = tipoAdquisicion;
    }
    public int getCantidadBienes() {
        return this.cantidadBienes;
    }
    
    public void setCantidadBienes(int cantidadBienes) {
        this.cantidadBienes = cantidadBienes;
    }
    public double getMontoTotal() {
        return this.montoTotal;
    }
    
    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }
    public String getRazonRechazo() {
        return this.razonRechazo;
    }
    
    public void setRazonRechazo(String razonRechazo) {
        this.razonRechazo = razonRechazo;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public Set getBiens() {
        return this.biens;
    }
    
    public void setBiens(Set biens) {
        this.biens = biens;
    }




}


