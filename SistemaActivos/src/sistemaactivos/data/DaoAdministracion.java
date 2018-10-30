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
import sistemaactivos.logic.Labor;
import sistemaactivos.logic.Puesto;
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

    //  <editor-fold desc="Usuarios" defaultstate="collapsed">
    public Usuario usuarioGet(String id) throws Exception {
        String sql = "SELECT usuario.id id_user,"
                + " pass clave,"
                + " funcionarioUsuario id_func "
                + "FROM usuario WHERE usuario.id = '%s'";
        sql = String.format(sql, id);
        ResultSet rs = dbb.executeQuery(sql);
        if (rs.next()) {
            return usuario(rs);
        } else {
            throw new Exception("Usuario no Existe");
        }
    }

    private Usuario usuario(ResultSet rs) {
        try {
            Usuario u = new Usuario();
            u.setId(rs.getString("id_user"));
            u.setPass(rs.getString("clave"));
            Funcionario f = getFuncionario(rs.getString("id_func"));
            //u.setFuncionario(f);
            return u;
        } catch (SQLException ex) {
            return null;
        } catch (Exception ex) {
            return null;
        }
    }
    //</editor-fold>

    //  <editor-fold desc="Funcionarios" defaultstate="collapsed">
    public Funcionario getFuncionario(String id) throws Exception {
        String sql = "SELECT * FROM funcionario WHERE id='%s';";
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
            ec.setNombre(rs.getString("nombre"));
            Labor l = laborGetbyFuncionario(rs.getString("id"));
            
            return ec;
        } catch (SQLException ex) {
            return null;
        } catch (Exception ex) {
            return null;
        }
    }

    public List<Funcionario> FuncionarioSearch(Funcionario filtro) {
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
        } catch (SQLException ex) {
        }

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

    public Funcionario FuncionarioGet(String id) throws Exception {
        return new Funcionario();
    }

    public void FuncionarioDelete(Funcionario a) throws Exception {

    }

    public void FuncionarioAdd(Funcionario a) throws Exception {

    }

    public void FuncionarioUpdate(Funcionario a) throws Exception {

    }
    //</editor-fold>

    //  <editor-fold desc="Dependencias" defaultstate="collapsed">
    public Dependencia dependenciaGet(String codigo) throws Exception {
        String sql = "SELECT * FROM dependencia WHERE codigo='%s'";
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
            Dependencia d = new Dependencia();
            d.setCodigo(rs.getString("codigo"));
            d.setNombre(rs.getString("nombre"));
            return d;
        } catch (SQLException ex) {
            return null;
        }
    }

    public List<Dependencia> DependenciaSearch(Dependencia filtro) {
        List<Dependencia> resultado = new ArrayList<>();
        try {
            String sql = "SELECT * FROM dependencia "
                    + "WHERE nombre LIKE '%%%s%%'"
                    + "AND codigo = %s";
            sql = String.format(sql, filtro.getNombre(),filtro.getCodigo());
            ResultSet rs = dbb.executeQuery(sql);
            while (rs.next()) {
                resultado.add(dependencia(rs));
            }
        } catch (SQLException ex) {
        }
        return resultado;
    }

    public List<Dependencia> DependenciaGetAll() {
        List<Dependencia> estados = new ArrayList<>();
        try {
            String sql = "select * from dependencia";
            ResultSet rs = dbb.executeQuery(sql);
            while (rs.next()) {
                estados.add(dependencia(rs));
            }
        } catch (SQLException ex) {
        }
        return estados;
    }

    public void DependenciaDelete(Dependencia a) throws Exception {
        
    }

    public void DependenciaAdd(Dependencia a) throws Exception {

    }

    public void DependenciaUpdate(Dependencia a) throws Exception {

    }

    //</editor-fold>
    
    //<editor-fold desc="Puesto" defaultstate="collapsed">
    public Puesto puestoGet(int codigo) throws Exception {
        String sql = "SELECT * FROM puesto WHERE codigo = '%s'";
        sql = String.format(sql, codigo);
        ResultSet rs = dbb.executeQuery(sql);
        if (rs.next()) {
            return puesto(rs);
        } else {
            throw new Exception("Puesto no Existe");
        }
    }

    private Puesto puesto(ResultSet rs) {
        try {
            Puesto p = new Puesto();
            p.setCodgo(rs.getString("codigo"));
            p.setPuesto(rs.getString("puesto"));
            return p;
        } catch (SQLException ex) {
            return null;
        }
    }

    public List<Puesto> puestoGetAll() {
        List<Puesto> puestos = new ArrayList<>();
        try {
            String sql = "SELECT * FROM puesto";
            ResultSet rs = dbb.executeQuery(sql);
            while (rs.next()) {
                puestos.add(puesto(rs));
            }
        } catch (SQLException ex) {

        }
        return puestos;
    }

    //</editor-fold>
    
    //  <editor-fold desc="Labores" defaultstate="collapsed">
    public Labor laborGetbyFuncionario(String id) throws Exception {
        String sql = "SELECT * FROM labor WHERE FuncionarioLabor = '%s'";
        sql = String.format(sql, id);
        ResultSet rs = dbb.executeQuery(sql);
        if (rs.next()) {
            return labor(rs);
        } else {
            throw new Exception("Labor no Existe");
        }
    }

    public List<Labor> laborGetbyDependencia(int codigo) throws Exception {
        List<Labor> labores = new ArrayList<>();
        try {
            String sql = "SELECT * FROM dependencia WHERE dependenciaLabor = '%s'";
            sql = String.format(sql, codigo);
            ResultSet rs = dbb.executeQuery(sql);
            while (rs.next()) {
                labores.add(labor(rs));
            }
        } catch (SQLException ex) {

        }
        return labores;
    }

    public Labor laborGetbyEspecific(String id, int codigo1, int codigo2) throws Exception {
        String sql = "SELECT * FROM labor "
                + "WHERE FuncionarioLabor = '%s'"
                + "AND dependenciaLabor = '%s'"
                + "AND PuestoLabor = '%s'";
        sql = String.format(sql, id, codigo1, codigo2);
        ResultSet rs = dbb.executeQuery(sql);
        if (rs.next()) {
            return labor(rs);
        } else {
            throw new Exception("Labor no Existe");
        }
    }

    private Labor labor(ResultSet rs) {
        try {
            Labor p = new Labor();
            p.setDependencia(dependenciaGet(rs.getString("dependenciaLabor")));
            p.setPuesto(puestoGet(Integer.getInteger(rs.getString("PuestoLabor"))));
            p.setFuncionario(FuncionarioGet(rs.getString("FuncionarioLabor")));
            return p;
        } catch (SQLException ex) {
            return null;
        } catch (Exception ex) {
            return null;
        }
    }

    public List<Labor> laborGetAll() {
        List<Labor> labores = new ArrayList<>();
        try {
            String sql = "SELECT * FROM labor";
            ResultSet rs = dbb.executeQuery(sql);
            while (rs.next()) {
                labores.add(labor(rs));
            }
        } catch (SQLException ex) {

        }
        return labores;
    }

    //</editor-fold>
    public void close() {
    }

}
