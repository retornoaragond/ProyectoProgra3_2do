package sistemaactivos.logic;
// Generated 17/10/2018 12:42:31 AM by Hibernate Tools 4.3.1



/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private int id;
     private Funcionario funcionario;
     private String pass;

    public Usuario() {
    }

    public Usuario(int id, Funcionario funcionario, String pass) {
       this.id = id;
       this.funcionario = funcionario;
       this.pass = pass;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Funcionario getFuncionario() {
        return this.funcionario;
    }
    
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    public String getPass() {
        return this.pass;
    }
    
    public void setPass(String pass) {
        this.pass = pass;
    }




}


