package sistemaactivos.logic;
// Generated 19/10/2018 08:41:42 PM by Hibernate Tools 4.3.1



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


