package sistemaactivos.logic;
// Generated 22/10/2018 09:28:18 PM by Hibernate Tools 4.3.1



/**
 * LaborId generated by hbm2java
 */
public class LaborId  implements java.io.Serializable {


     private int dependenciaLabor;
     private String funcionarioLabor;
     private int puestoLabor;

    public LaborId() {
    }

    public LaborId(int dependenciaLabor, String funcionarioLabor, int puestoLabor) {
       this.dependenciaLabor = dependenciaLabor;
       this.funcionarioLabor = funcionarioLabor;
       this.puestoLabor = puestoLabor;
    }
   
    public int getDependenciaLabor() {
        return this.dependenciaLabor;
    }
    
    public void setDependenciaLabor(int dependenciaLabor) {
        this.dependenciaLabor = dependenciaLabor;
    }
    public String getFuncionarioLabor() {
        return this.funcionarioLabor;
    }
    
    public void setFuncionarioLabor(String funcionarioLabor) {
        this.funcionarioLabor = funcionarioLabor;
    }
    public int getPuestoLabor() {
        return this.puestoLabor;
    }
    
    public void setPuestoLabor(int puestoLabor) {
        this.puestoLabor = puestoLabor;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof LaborId) ) return false;
		 LaborId castOther = ( LaborId ) other; 
         
		 return (this.getDependenciaLabor()==castOther.getDependenciaLabor())
 && ( (this.getFuncionarioLabor()==castOther.getFuncionarioLabor()) || ( this.getFuncionarioLabor()!=null && castOther.getFuncionarioLabor()!=null && this.getFuncionarioLabor().equals(castOther.getFuncionarioLabor()) ) )
 && (this.getPuestoLabor()==castOther.getPuestoLabor());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getDependenciaLabor();
         result = 37 * result + ( getFuncionarioLabor() == null ? 0 : this.getFuncionarioLabor().hashCode() );
         result = 37 * result + this.getPuestoLabor();
         return result;
   }   


}


