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
import sistemaactivos.logic.Bien;

import sistemaactivos.logic.Funcionario;
import sistemaactivos.logic.Solicitud;
import sistemaactivos.logic.Usuario;

/**
 *
 * @author ExtremeTech
 */
public class DaoSolicitudes {

    RelDatabase db;

    public DaoSolicitudes() {
        db = new RelDatabase();
    }
    
    
    
    
    
    //  <editor-fold desc="Solicitud" defaultstate="collapsed">

    
    public Solicitud getSolicitud(Integer numSolicitud) throws Exception {
        String sql = "select * from solicitud inner where codigoId='%s'";
        sql = String.format(sql, numSolicitud);
        ResultSet rs = db.executeQuery(sql);
        if (rs.next()) {
          return solicitud(rs);
        } else {
            throw new Exception("Solicitud no Existe");
        }
    }
    
    
    
    private Solicitud solicitud(ResultSet rs) {
        try {
            Solicitud ec = new Solicitud();
            ec.setNumSolicitud(Integer.getInteger(rs.getString("numSolicitud")));
            return ec;
        } catch (SQLException ex) {
            return null;
        }
    }

  
       
       public List<Solicitud> SolicitudSearch(Solicitud filtro){
        List<Solicitud> resultado = new ArrayList<>();
        try {
            String sql = "select * from "
                    + "EstadoCivil "
                    + "where descripcion like '%%%s%%'";
            sql = String.format(sql, filtro.getEstado());
            ResultSet rs = db.executeQuery(sql);
            while (rs.next()) {
                resultado.add(solicitud(rs));
            }
        } catch (SQLException ex) {}
          
        return resultado;
    }

    public List<Solicitud> SolicitudGetAll() {
        List<Solicitud> estados = new ArrayList<>();
        try {
            String sql = "select * from EstadoCivil";
            ResultSet rs = db.executeQuery(sql);
            while (rs.next()) {
                estados.add(solicitud(rs));
            }
        } catch (SQLException ex) {
        }
        return estados;
    }
   
     
    public Solicitud SolicitudGet(Integer numSolicitud) throws Exception{
       return new Solicitud();    
    }
    
    public void SolicitudDelete(Solicitud a) throws Exception{
        
    }

    public void SolicitudAdd(Solicitud a) throws Exception{
        
    }

    public void SolicitudUpdate(Solicitud a) throws Exception{
       
    }
    
    
    
  
     //</editor-fold>

    
    
      //  <editor-fold desc="Bien" defaultstate="collapsed">

      public Bien getBien(String serial) throws Exception {
        String sql = "select * from solicitud inner where serial='%s'";
        sql = String.format(sql, serial);
        ResultSet rs = db.executeQuery(sql);
        if (rs.next()) {
          return bien(rs);
        } else {
            throw new Exception("Solicitud no Existe");
        }
    }
    
    
    
    private Bien bien(ResultSet rs) {
        try {
            Bien ec = new Bien();
            ec.setSerial(rs.getString("serial"));
            return ec;
        } catch (SQLException ex) {
            return null;
        }
    }

  
       
       public List<Bien> BienSearch(Bien filtro){
        List<Bien> resultado = new ArrayList<>();
        try {
            String sql = "select * from "
                    + "Bien "
                    + "where descripcion like '%%%s%%'";
            sql = String.format(sql, filtro.getDecripcion());
            ResultSet rs = db.executeQuery(sql);
            while (rs.next()) {
                resultado.add(bien(rs));
            }
        } catch (SQLException ex) {}
          
        return resultado;
    }

    public List<Bien> BienGetAll() {
        List<Bien> bienes = new ArrayList<>();
        try {
            String sql = "select * from Bien";
            ResultSet rs = db.executeQuery(sql);
            while (rs.next()) {
                bienes.add(bien(rs));
            }
        } catch (SQLException ex) {
        }
        return bienes;
    }
   
     
    public Bien BienGet(String serial) throws Exception{
       return new Bien();    
    }
    
    public void BienDelete(Bien a) throws Exception{
        
    }

    public void BienAdd(Bien a) throws Exception{
        
    }

    public void BienUpdate(Bien a) throws Exception{
       
    }
    
    

    //</editor-fold>

     









    
    
    public  void close(){
    }
}
