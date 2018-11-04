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
import java.util.logging.Level;
import java.util.logging.Logger;
import sistemaactivos.logic.Categoria;
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

    //PRUEBA ESTEBAN
    //  <editor-fold desc="Usuarios" defaultstate="collapsed">
    public Usuario usuarioGet(String id) throws Exception {
        String sql = "SELECT * FROM usuario WHERE usuario.id = '%s'";
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
            u.setId(rs.getString("id"));
            u.setPass(rs.getString("pass"));
            Labor l = laborGet(Integer.parseInt(rs.getString("labUsu")));
            u.setLabor(l);
            return u;
        } catch (SQLException ex) {
            return null;
        } catch (Exception ex) {
            return null;
        }
    }

    public void addUsuario(Usuario user) throws Exception {
        String sql = "INSERT INTO usuario (id, pass, labUsu)"
                + " VALUES ('%s', '%s', '%d');";
        sql = String.format(sql, user.getId(), user.getPass(), user.getLabor().getId());
        int count = dbb.executeUpdate(sql);
        if (count == 0) {
            throw new Exception("usuario ya existe ya existe");
        }
    }
    
    public List<Usuario> usuariosGetAll(){
        List<Usuario> users = new ArrayList<>();
        try {
            String sql = "select * from usuario";
            ResultSet rs = dbb.executeQuery(sql);
            while (rs.next()) {
                users.add(usuario(rs));
            }
        } catch (SQLException ex) {
            
        }
        return users;
    }

    //</editor-fold>
    //  <editor-fold desc="Funcionarios" defaultstate="collapsed">
    public Funcionario getFuncionario(String id) throws Exception {
        String sql = "SELECT * FROM funcionario WHERE funcionario.id = '%s'";
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
            String sql = "SELECT * FROM funcionario WHERE id = '%s%'"
                    + " AND nombre LIKE '%%%s%%' ";
            sql = String.format(sql, filtro.getId(), filtro.getNombre());
            ResultSet rs = dbb.executeQuery(sql);
            while (rs.next()) {
                resultado.add(funcionario(rs));
            }
        } catch (SQLException ex) {
        }

        return resultado;
    }

    public List<Funcionario> FuncionaroSearchNombre(Funcionario filtro) {
        List<Funcionario> resultado = new ArrayList<>();
        try {
            String sql = "SELECT * FROM funcionario WHERE nombre LIKE '%%%s%%' ";
            sql = String.format(sql, filtro.getNombre());
            ResultSet rs = dbb.executeQuery(sql);
            while (rs.next()) {
                resultado.add(funcionario(rs));
            }
        } catch (SQLException ex) {
        }

        return resultado;
    }

    public List<Funcionario> FuncionarioSearchCodigo(Funcionario filtro) {
        List<Funcionario> resultado = new ArrayList<>();
        try {
            String sql = "SELECT * FROM funcionario WHERE id = '%s'";
            sql = String.format(sql, filtro.getId(), filtro.getNombre());
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
            String sql = "select * from funcionario";
            ResultSet rs = dbb.executeQuery(sql);
            while (rs.next()) {
                estados.add(funcionario(rs));
            }
        } catch (SQLException ex) {
        }
        return estados;
    }

    public Funcionario FuncionarioGet(String id) throws Exception {
        String sql = "SELECT * FROM funcionario WHERE id='%s'";
        sql = String.format(sql, id);
        ResultSet rs = dbb.executeQuery(sql);
        if (rs.next()) {
            return funcionario(rs);
        } else {
            throw new Exception("Funcionario no Existe");
        }
    }

    public void FuncionarioDelete(Funcionario a) throws Exception {
        String sql = "delete from funcionario where id='%s'";
        sql = String.format(sql, a.getId());
        int count = dbb.executeUpdate(sql);
        if (count == 0) {
            throw new Exception("Funcionario no existe");
        }
    }

    public void FuncionarioAdd(Funcionario a) throws Exception {
        String sql = "INSERT INTO funcionario (id, nombre)"
                + " VALUES ('%s', '%s');";
        sql = String.format(sql, a.getId(), a.getNombre());
        int count = dbb.executeUpdate(sql);
        if (count == 0) {
            throw new Exception("Funcionario ya existe");
        }
    }

    public void FuncionarioUpdate(Funcionario a) throws Exception {
        String sql = "update funcionario set nombre='%s'"
                + "where id='%s'";
        sql = String.format(sql, a.getNombre(), a.getId());
        int count = dbb.executeUpdate(sql);
        if (count == 0) {
            throw new Exception("Funcionario no existe");
        }
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
            throw new Exception("Dependencia no Existe");
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
            sql = String.format(sql, filtro.getNombre(), filtro.getCodigo());
            ResultSet rs = dbb.executeQuery(sql);
            while (rs.next()) {
                resultado.add(dependencia(rs));
            }
        } catch (SQLException ex) {
        }
        return resultado;
    }

    public List<Dependencia> DependenciaSearchNombre(Dependencia filtro) {
        List<Dependencia> resultado = new ArrayList<>();
        try {
            String sql = "SELECT * FROM dependencia "
                    + "WHERE nombre LIKE '%%%s%%'";
            sql = String.format(sql, filtro.getNombre());
            ResultSet rs = dbb.executeQuery(sql);
            while (rs.next()) {
                resultado.add(dependencia(rs));
            }
        } catch (SQLException ex) {
        }
        return resultado;
    }

    public List<Dependencia> DependenciaSearchCodigo(Dependencia filtro) {
        List<Dependencia> resultado = new ArrayList<>();
        try {
            String sql = "SELECT * FROM dependencia "
                    + "WHERE codigo ='%s'";
            sql = String.format(sql, filtro.getCodigo());
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

    public void DependenciaDelete(Dependencia d) throws Exception {
        String sql = "delete from dependencia where codigo='%s'";
        sql = String.format(sql, d.getCodigo());
        int count = dbb.executeUpdate(sql);
        if (count == 0) {
            throw new Exception("Dependendencia no existe");
        }
    }

    public void DependenciaAdd(Dependencia a) throws Exception {
        String sql = "insert into Dependencia (codigo, nombre) "
                + "values('%s','%s')";
        sql = String.format(sql, a.getCodigo(), a.getNombre());
        int count = dbb.executeUpdate(sql);
        if (count == 0) {
            throw new Exception("Dependencia ya existe");
        }
    }

    public void DependenciaUpdate(Dependencia a) throws Exception {
        String sql = "update dependencia set nombre='%s'"
                + "where codigo='%s'";
        sql = String.format(sql, a.getNombre(), a.getCodigo());
        int count = dbb.executeUpdate(sql);
        if (count == 0) {
            throw new Exception("Dependencia no existe");
        }
    }

    //</editor-fold>
    
    //<editor-fold desc="Puesto" defaultstate="collapsed">
    public Puesto puestoGet(String codigo) throws Exception {
        String sql = "SELECT * FROM puesto WHERE codgo = '%s'";
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
            p.setCodgo(rs.getString("codgo"));
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
    public Labor laborGet(Integer id) throws Exception {
        String sql = "SELECT * FROM labor WHERE id = '%d'";
        sql = String.format(sql, id);
        ResultSet rs = dbb.executeQuery(sql);
        if (rs.next()) {
            return labor(rs);
        } else {
            throw new Exception("Labor no Existe");
        }
    }

    public List<Labor> laborGetbyFuncionario(String id) throws Exception {
        List<Labor> labores = new ArrayList<>();
        try {
            String sql = "SELECT * FROM labor WHERE funcLab = '%s'";
            sql = String.format(sql, id);
            ResultSet rs = dbb.executeQuery(sql);
            while (rs.next()) {
                labores.add(labor(rs));
            }
        } catch (SQLException ex) {

        }
        return labores;
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
            p.setId(Integer.parseInt(rs.getString("id")));
            p.setDependencia(dependenciaGet(rs.getString("depLab")));
            p.setPuesto(puestoGet(rs.getString("pueLab")));
            p.setFuncionario(getFuncionario(rs.getString("funcLab")));
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

    public void LaborAdd(Labor a) throws Exception {
        String sql = "INSERT INTO labor (funcLab, depLab, pueLab) "
                + "VALUES ('%s', '%s', '%s')";
        sql = String.format(sql, a.getFuncionario().getId(),
                a.getDependencia().getCodigo(), a.getPuesto().getCodgo());
        int count = dbb.executeUpdate(sql);
        if (count == 0) {
            throw new Exception("Funcionario ya existe");
        }
    }

    //</editor-fold>
    
    public int getAutoIncremento() throws Exception {
        try {
            String sql = "SELECT LAST_INSERT_ID()";
            ResultSet rs = dbb.executeQuery(sql);
            if (rs.next()) {
                return rs.getInt("LAST_INSERT_ID()");
            } else {
                throw new Exception("Labor no Existe");
            }
        } catch (SQLException ex) {
            return -1;
        }
    }

    public void close() {
    }

    
    public List<Categoria> CategoriaALL() {
        List<Categoria> cat = new ArrayList<>();
        try {
            String sql = "SELECT * FROM categoria";
            ResultSet rs = dbb.executeQuery(sql);
            while (rs.next()) {
                cat.add(categoria(rs));
            }
        } catch (SQLException ex) {

        }
        return cat;
    }
    
    private Categoria categoria(ResultSet rs) {
        try {
            Categoria c = new Categoria();
            c.setDescripcion(rs.getString("descripcion"));
            c.setIncremento(Integer.parseInt(rs.getString("incremento")));
            c.setId(rs.getString("id"));
            return c;
        } catch (SQLException ex) {
            return null;
        } catch (Exception ex) {
            return null;
        }
    }
    
}
