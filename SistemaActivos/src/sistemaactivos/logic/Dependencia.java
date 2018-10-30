package sistemaactivos.logic;
// Generated 30/10/2018 04:12:49 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Dependencia generated by hbm2java
 */
public class Dependencia  implements java.io.Serializable {


     private String codigo;
     private String nombre;
     private Set solicituds = new HashSet(0);
     private Set labors = new HashSet(0);

    public Dependencia() {
        codigo="";
        nombre="";
        
                
    }

	
    public Dependencia(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
    public Dependencia(String codigo, String nombre, Set solicituds, Set labors) {
       this.codigo = codigo;
       this.nombre = nombre;
       this.solicituds = solicituds;
       this.labors = labors;
    }
   
    public String getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set getSolicituds() {
        return this.solicituds;
    }
    
    public void setSolicituds(Set solicituds) {
        this.solicituds = solicituds;
    }
    public Set getLabors() {
        return this.labors;
    }
    
    public void setLabors(Set labors) {
        this.labors = labors;
    }




}


