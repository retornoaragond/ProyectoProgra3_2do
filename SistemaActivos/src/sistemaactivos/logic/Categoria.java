package sistemaactivos.logic;
// Generated 30/10/2018 04:12:49 AM by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;

/**
 * Categoria generated by hbm2java
 */
public class Categoria implements java.io.Serializable {

    private String id;
    private int incremento;
    private String descripcion;
    private Set biens = new HashSet(0);

    public Categoria() {
        id = "";
        incremento = 0;
        descripcion = "";

    }

    public Categoria(String id, int incremento, String descripcion) {
        this.id = id;
        this.incremento = incremento;
        this.descripcion = descripcion;
    }

    public Categoria(String id, int incremento, String descripcion, Set biens) {
        this.id = id;
        this.incremento = incremento;
        this.descripcion = descripcion;
        this.biens = biens;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
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
