package sistemaactivos.logic;
// Generated 30/10/2018 04:12:49 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Funcionario generated by hbm2java
 */
public class Funcionario  implements java.io.Serializable {


     private String id;
     private String nombre;
     private Set solicituds = new HashSet(0);
     private Set labors = new HashSet(0);

    public Funcionario() {
        id="";
        nombre="";
        
    }

	
    public Funcionario(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    public Funcionario(String id, String nombre, Set solicituds, Set labors) {
       this.id = id;
       this.nombre = nombre;
       this.solicituds = solicituds;
       this.labors = labors;
    }
   
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
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

   
  @Override
    public String toString() {
        return this.nombre;
    }

}


