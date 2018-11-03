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
import sistemaactivos.logic.Activo;

/**
 *
 * @author Estudiante
 */
public class DaoActivos {

    RelDatabase dbbb;

    public DaoActivos() {
        dbbb = new RelDatabase();
    }

    public Activo getActivo(String codigoId) throws Exception {
        String sql = "select * from activo inner where codigoId='%s'";
        sql = String.format(sql, codigoId);
        ResultSet rs = dbbb.executeQuery(sql);
        if (rs.next()) {
            return activo(rs);
        } else {
            throw new Exception("Activo no Existe");
        }
    }

    private Activo activo(ResultSet rs) {
        try {
            Activo ec = new Activo();
            ec.setCodigoId(rs.getString("codigoId"));
            return ec;
        } catch (SQLException ex) {
            return null;
        }
    }

    public List<Activo> ActivoSearch(Activo filtro) {
        List<Activo> resultado = new ArrayList<>();
        try {
            String sql = "SELECT * from activo "
                   + "where codigoId like '%s%'";
            sql = String.format(sql, filtro.getBien());
            ResultSet rs = dbbb.executeQuery(sql);
            while (rs.next()) {
                resultado.add(activo(rs));
            }
        } catch (SQLException ex) {
        }

        return resultado;
    }

    public List<Activo> ActivosGetAll() {
        List<Activo> estados = new ArrayList<>();
        try {
            String sql = "select * from activo";
            ResultSet rs = dbbb.executeQuery(sql);
            while (rs.next()) {
                estados.add(activo(rs));
            }
        } catch (SQLException ex) {
        }
        return estados;
    }

    public Activo ActivoGet(String codigoId) throws Exception {
        String sql = "SELECT * FROM dependencia WHERE codigoId='%s'";
        sql = String.format(sql, codigoId);
        ResultSet rs = dbbb.executeQuery(sql);
        if (rs.next()) {
            return activo(rs);
        } else {
            throw new Exception("Activo no Existe");
        }
    }

    public void ActivoDelete(Activo a) throws Exception {
       String sql = "delete from activo where codigoId='%s'";
        sql = String.format(sql, a.getCodigoId());
        int count = dbbb.executeUpdate(sql);
        if (count == 0) {
            throw new Exception("Activo no existe");
        }
    }

    public void ActivoAdd(Activo a) throws Exception {
       String sql = "insert into Activo (codigoId) "
                + "values('%s')";
        sql = String.format(sql, a.getCodigoId());
        int count = dbbb.executeUpdate(sql);
        if (count == 0) {
            throw new Exception("Activo ya existe");
        }
    }

    public void ActivoUpdate(Activo a) throws Exception {
              String sql = "update activo set labAct='%d',"
                + "where codigoId='%s'";
        sql = String.format(sql, a.getCodigoId());
        int count = dbbb.executeUpdate(sql);
        if (count == 0) {
            throw new Exception("Activo no existe");
        }  
    }

    public void close() {
    }

}
