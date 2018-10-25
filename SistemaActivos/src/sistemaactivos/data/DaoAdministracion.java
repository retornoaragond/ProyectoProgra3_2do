/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaactivos.data;

import java.sql.ResultSet;
import java.sql.SQLException;
import sistemaactivos.logic.Funcionario;
import sistemaactivos.logic.Usuario;

/**
 *
 * @author Estudiante
 */
public class DaoAdministracion {
    
    RelDatabase dbb;

    public DaoAdministracion() {
        dbb = new RelDatabase();
    }
    
    
    public Usuario usuarioGet(String id) throws Exception{
        String sql="select * from Usuario where id='%s'";
        sql = String.format(sql,id);
        ResultSet rs =  dbb.executeQuery(sql);
        if (rs.next()) {
            return usuario(rs);
        }
        else{
            throw new Exception ("Usuario no Existe");
        }
    }
    
    private Usuario usuario(ResultSet rs){
        try {
            Usuario u= new Usuario();
            u.setId(rs.getString("id"));
            u.setPass(rs.getString("clave"));
            Funcionario f = new Funcionario();
            f.setId(rs.getString("id"));
            f.setNombre(rs.getString("nombre"));
            u.setFuncionario(f);
            return u;
        } catch (SQLException ex) {
            return null;
        }
    }
    
    
    public  void close(){
    }
    
}
