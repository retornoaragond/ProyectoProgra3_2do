/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaactivos.logic;

import java.util.List;
import sistemaactivos.data.DaoActivos;
import sistemaactivos.data.DaoAdministracion;
import sistemaactivos.data.DaoSolicitudes;

/**
 *
 * @author ExtremeTech
 */
public class ModelLogic {
    private DaoSolicitudes dao;
    private DaoActivos daoActivos;
    private DaoAdministracion daoAdministracion;
    
    
   
    private static ModelLogic uniqueInstance;
    
    public static ModelLogic instance(){
        if (uniqueInstance == null){
            uniqueInstance = new ModelLogic();
        }
        return uniqueInstance; 
    }
    
    private ModelLogic(){
        dao = new DaoSolicitudes();
    }
    
    public  Usuario getUsuario(String id, String clave) throws Exception{
        Usuario u= dao.usuarioGet(id);
        if (u.getPass().equals(clave)){
            return u;
        }
        else{
            throw new Exception ("Clave incorrecta");
        }
    }
    
    
    
    /////////parte de solicitudes//////////
   
    
    /*
    public List<Bien> getBienes(){
      return dao.BienesGetAll()  
    
    }
    */
    
    /*
    public Bien getBien(String serial) throws Exception{
    return dao.BienGet(serial);
     }
    */
    
    
    
    /*
    public List<Bien> searchEstados(Bien filtro){
        return dao.BienSearch(filtro);
    }
    */
    
    
    
    /*
     public Solicitud getSolicitud(String id) throws Exception{
        return dao.SolicitudGet(id);
    }
    
    public void deleteSolicitud(Solicitud p) throws Exception{
        dao.SolicitudDelete(p);
    }

    public void addSolicitud(Solicitud solicitud) throws Exception{
        dao.SolicitudAdd(solicitud);
    }

    public void updatePersona(Solicitud solicitud) throws Exception{
        dao.SolicitudUpdate(solicitud);
    }
    
    public List<Solicitud> searchPersonas(Solicitud filtro){
        return dao.SolicitudSearch(filtro);
    }

//    */
    
    ///fin de la seccion de solicitudes
    
    
    
    
    
    
public void close(){
        dao.close();
    }
}
