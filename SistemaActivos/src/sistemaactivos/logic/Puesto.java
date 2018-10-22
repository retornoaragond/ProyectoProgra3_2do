package sistemaactivos.logic;
// Generated 22/10/2018 02:31:39 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Puesto generated by hbm2java
 */
public class Puesto  implements java.io.Serializable {


     private int codigo;
     private String puesto;
     private Set labors = new HashSet(0);

    public Puesto() {
    }

	
    public Puesto(int codigo, String puesto) {
        this.codigo = codigo;
        this.puesto = puesto;
    }
    public Puesto(int codigo, String puesto, Set labors) {
       this.codigo = codigo;
       this.puesto = puesto;
       this.labors = labors;
    }
   
    public int getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getPuesto() {
        return this.puesto;
    }
    
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    public Set getLabors() {
        return this.labors;
    }
    
    public void setLabors(Set labors) {
        this.labors = labors;
    }




}


