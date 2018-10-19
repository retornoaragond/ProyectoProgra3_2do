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
 * @author ExtremeTech
 */
public class Dao {

    RelDatabase db;

    public Dao() {
        db = new RelDatabase();
    }

    public Activo getActivo(String codigoId) throws Exception {
        String sql = "select * from `sistemaactivos`.`activo`inner where codigoId='%s'";
        sql = String.format(sql, codigoId);
        ResultSet rs = db.executeQuery(sql);
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
            //ec.setDescripcion(rs.getString("descripcion"));
            return ec;
        } catch (SQLException ex) {
            return null;
        }
    }

    public List<Activo> ActivoSearch(Activo filtro) throws Exception{
        List<Activo> resultado = new ArrayList<>();
        try {
            String sql = "select * from "
                    + "EstadoCivil "
                    + "where descripcion like '%%%s%%'";
            sql = String.format(sql, filtro.getBien());
            ResultSet rs = db.executeQuery(sql);
            while (rs.next()) {
                resultado.add(activo(rs));
            }
        } catch (SQLException ex) {
            throw new Exception ("Estado Civil no Existe");
        }
        return resultado;
    }

    public List<Activo> ActivoGetAll() {
        List<Activo> estados = new ArrayList<>();
        try {
            String sql = "select * from EstadoCivil";
            ResultSet rs = db.executeQuery(sql);
            while (rs.next()) {
                estados.add(activo(rs));
            }
        } catch (SQLException ex) {
        }
        return estados;
    }
    
    public  void close(){
    }
}
