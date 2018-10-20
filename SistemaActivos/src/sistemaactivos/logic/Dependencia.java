package sistemaactivos.logic;
// Generated 19/10/2018 08:41:42 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Dependencia generated by hbm2java
 */
public class Dependencia  implements java.io.Serializable {


     private Integer codigo;
     private String nombre;
     private Set labors = new HashSet(0);
     private Set solicituds = new HashSet(0);

    public Dependencia() {
    }

	
    public Dependencia(String nombre) {
        this.nombre = nombre;
    }
    public Dependencia(String nombre, Set labors, Set solicituds) {
       this.nombre = nombre;
       this.labors = labors;
       this.solicituds = solicituds;
    }
   
    public Integer getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set getLabors() {
        return this.labors;
    }
    
    public void setLabors(Set labors) {
        this.labors = labors;
    }
    public Set getSolicituds() {
        return this.solicituds;
    }
    
    public void setSolicituds(Set solicituds) {
        this.solicituds = solicituds;
    }




}


