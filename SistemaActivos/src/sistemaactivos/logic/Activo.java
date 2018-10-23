package sistemaactivos.logic;
// Generated 22/10/2018 09:28:18 PM by Hibernate Tools 4.3.1



/**
 * Activo generated by hbm2java
 */
public class Activo  implements java.io.Serializable {


     private String codigoId;
     private Bien bien;
     private Labor labor;

    public Activo() {
    }

	
    public Activo(String codigoId, Bien bien) {
        this.codigoId = codigoId;
        this.bien = bien;
    }
    public Activo(String codigoId, Bien bien, Labor labor) {
       this.codigoId = codigoId;
       this.bien = bien;
       this.labor = labor;
    }
   
    public String getCodigoId() {
        return this.codigoId;
    }
    
    public void setCodigoId(String codigoId) {
        this.codigoId = codigoId;
    }
    public Bien getBien() {
        return this.bien;
    }
    
    public void setBien(Bien bien) {
        this.bien = bien;
    }
    public Labor getLabor() {
        return this.labor;
    }
    
    public void setLabor(Labor labor) {
        this.labor = labor;
    }




}


