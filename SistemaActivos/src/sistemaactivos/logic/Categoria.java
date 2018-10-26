package sistemaactivos.logic;
// Generated 22/10/2018 09:28:18 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Categoria generated by hbm2java
 */
public class Categoria  implements java.io.Serializable {


     private Integer id;
     private int incremento;
     private String descripcion;
     private Set biens = new HashSet(0);

    public Categoria() {
    id=0;
    incremento=0;
    descripcion="";
    
    }

	
    public Categoria(int incremento, String descripcion) {
        this.incremento = incremento;
        this.descripcion = descripcion;
    }
    public Categoria(int incremento, String descripcion, Set biens) {
       this.incremento = incremento;
       this.descripcion = descripcion;
       this.biens = biens;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public int getIncremento() {
        return this.incremento;
    }
    
    public void setIncremento(int incremento) {
        this.incremento = incremento;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Set getBiens() {
        return this.biens;
    }
    
    public void setBiens(Set biens) {
        this.biens = biens;
    }




}


