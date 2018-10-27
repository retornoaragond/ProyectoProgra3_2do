/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaactivos.data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import sistemaactivos.logic.Dependencia;
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
        String sql="SELECT * FROM Usuario WHERE id='%s'";
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
   
    
    
    
    //  <editor-fold desc="Funcionarios" defaultstate="collapsed">
    
     public Funcionario getFuncionario(String id) throws Exception {
        String sql = "select * from funcionario inner where codigoId='%s'";
        sql = String.format(sql, id);
        ResultSet rs = dbb.executeQuery(sql);
        if (rs.next()) {
            return funcionario(rs);
        } else {
            throw new Exception("Funcionario no Existe");
        }
    }
    
    
    
    
    
    private Funcionario funcionario(ResultSet rs) {
        try {
            Funcionario ec = new Funcionario();
            ec.setId(rs.getString("id"));
            return ec;
        } catch (SQLException ex) {
            return null;
        }
    }

    public List<Funcionario> FuncionarioSearch(Funcionario filtro){
        List<Funcionario> resultado = new ArrayList<>();
        try {
            String sql = "select * from "
                    + "Funcionario "
                    + "where descripcion like '%%%s%%'";
            sql = String.format(sql, filtro.getId());
            ResultSet rs = dbb.executeQuery(sql);
            while (rs.next()) {
                resultado.add(funcionario(rs));
            }
        } catch (SQLException ex) {}
          
        return resultado;
    }

    public List<Funcionario> FuncionarioGetAll() {
        List<Funcionario> estados = new ArrayList<>();
        try {
            String sql = "select * from EstadoCivil";
            ResultSet rs = dbb.executeQuery(sql);
            while (rs.next()) {
                estados.add(funcionario(rs));
            }
        } catch (SQLException ex) {
        }
        return estados;
    }
   
     
    public Funcionario FuncionarioGet(String id) throws Exception{
       return new Funcionario();    
    }
    
    public void FuncionarioDelete(Funcionario a) throws Exception{
        
    }

    public void FuncionarioAdd(Funcionario a) throws Exception{
        
    }

    public void FuncionarioUpdate(Funcionario a) throws Exception{
       
    }
     //</editor-fold>

    
   
    //  <editor-fold desc="Dependencias" defaultstate="collapsed">
    public Dependencia getDependencia(Integer codigo) throws Exception {
        String sql = "select * from dependencia inner where codigo='%s'";
        sql = String.format(sql, codigo);
        ResultSet rs = dbb.executeQuery(sql);
        if (rs.next()) {
            return dependencia(rs);
        } else {
            throw new Exception("Funcionario no Existe");
        }
    }
    
    private Dependencia dependencia(ResultSet rs) {
        try {
            Dependencia ec = new Dependencia();
            ec.setCodigo(Integer.getInteger(rs.getString("numSolicitud")));
            return ec;
        } catch (SQLException ex) {
            return null;
        }
    }

    public List<Dependencia> DependenciaSearch(Dependencia filtro){
        List<Dependencia> resultado = new ArrayList<>();
        try {
            String sql = "select * from "
                    + "Dependencia "
                    + "where descripcion like '%%%s%%'";
            sql = String.format(sql, filtro.getCodigo());
            ResultSet rs = dbb.executeQuery(sql);
            while (rs.next()) {
                resultado.add(dependencia(rs));
            }
        } catch (SQLException ex) {}
          
        return resultado;
    }

    public List<Dependencia> DependenciaGetAll() {
        List<Dependencia> estados = new ArrayList<>();
        try {
            String sql = "select * from Dependencia";
            ResultSet rs = dbb.executeQuery(sql);
            while (rs.next()) {
                estados.add(dependencia(rs));
            }
        } catch (SQLException ex) {
        }
        return estados;
    }
   
     
    public Dependencia DependenciaGet(Integer codigo) throws Exception{
       return new Dependencia();    
    }
    
    public void DependenciaDelete(Dependencia a) throws Exception{
        
    }

    public void DependenciaAdd(Dependencia a) throws Exception{
        
    }

    public void DependenciaUpdate(Dependencia a) throws Exception{
       
    }
    
    
     //</editor-fold>

    
    
     public  void close(){
    }
    
}
