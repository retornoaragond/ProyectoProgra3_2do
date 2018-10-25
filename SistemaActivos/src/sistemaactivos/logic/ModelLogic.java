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
    private DaoSolicitudes daoSolicitud;
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
        daoSolicitud = new DaoSolicitudes();
        daoActivos = new DaoActivos();
        daoAdministracion= new DaoAdministracion(); 
    }
    
    public  Usuario getUsuario(String id, String clave) throws Exception{
        Usuario u= daoAdministracion.usuarioGet(id);
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
      return daoSolicitudes.BienesGetAll()  
    
    }
    */
    
    /*
    public Bien getBien(String serial) throws Exception{
    return daoSolicitudes.BienGet(serial);
     }
    */
    
    
    
    /*
    public List<Bien> searchBienes(Bien filtro){
        return daoSolicitudes.BienSearch(filtro);
    }
    */
    
    
    
    /*
     public Solicitud getSolicitud(String id) throws Exception{
        return daoSolicitudes.SolicitudGet(id);
    }
    
    public void deleteSolicitud(Solicitud p) throws Exception{
        daoSolicitudes.SolicitudDelete(p);
    }

    public void addSolicitud(Solicitud solicitud) throws Exception{
        daoSolicitudes.SolicitudAdd(solicitud);
    }

    public void updateSolicitud(Solicitud solicitud) throws Exception{
        daoSolicitudes.SolicitudUpdate(solicitud);
    }
    
    public List<Solicitud> searchSolicitud(Solicitud filtro){
        return daoSolicitudes.SolicitudSearch(filtro);
    }

//    */
    
    ///fin de la seccion de solicitudes
    
    
    /// area de Funcionario
    /*
    public List<Funcionario> getFuncionarios(){
        return daoAdministracion.FuncionariosGetAll();
    }
    
    public  Funcionario getFuncionario(Integer codigo) throws Exception{
        return daoAdministracion.FuncionarioGet(codigo);
    }
    
    public List<Funcionario> searchFuncionario(Funcionario filtro){
        return daoAdministracion.FuncionarioSearch(filtro);
    }

    
    public void deleteFuncionario(Funcionario p) throws Exception{
        daoAdministracion.FuncionarioDelete(p);
    }

    public void addFuncionario(Funcionario funcionario) throws Exception{
        daoAdministracion.FuncionarioAdd(funcionario);
    }

    public void updateFuncionario(Funcionario funcionario) throws Exception{
        daoAdministracion.FuncionarioUpdate(funcionario);
    }
    */
    //fin de area de funcionarios
    
    


/// area de dependencias
    
    /*
    public List<Dependencia> getDependencias(){
        return daoAdministracion.DependenciasGetAll();
    }
    
    public  Dependencia getDependencia(Integer codigo) throws Exception{
        return daoAdministracion.DependenciaGet(codigo);
    }
    
    public List<Dependencia> searchDependencia(Dependencia filtro){
        return daoAdministracion.DependenciaSearch(filtro);
    }

    
    public void deleteDependencia(Dependencia p) throws Exception{
        daoAdministracion.DependenciaDelete(p);
    }

    public void addDependencia(Dependencia dependencia) throws Exception{
        daoAdministracion.DependenciaAdd(dependencia);
    }

    public void updateDependencia(Dependencia dependencia) throws Exception{
        daoAdministracion.DependenciaUpdate(dependencia);
    }
    
  */
    //fin de area de dependencias
    
   
    
    
    
    
    
    
     /// area de activos
    
    /*
    public List<Activo> getActivos(){
      return daoActivos.ActivosGetAll()  
    
    }
    */
    
     /*
     public Activo getActivo(String codigoId) throws Exception{
        return daoActivos.ActivoGet(codigoId);
    }
    
    public void deleteActivo(Activo a) throws Exception{
        daoActivos.ActivoDelete(a);
    }

    public void addActivo(Activo activo) throws Exception{
        daoActivos.ActivoAdd(activo);
    }

    public void updateActivo(Activo activo) throws Exception{
        daoActivos.ActivoUpdate(solicitud);
    }
    
    public List<Activo> searchActivo(Activo filtro){
        return daoActivos.ActivoSearch(filtro);
    }
    */
    
    
    
    
    
    //fin de area de activos
       
    
public void close(){
    daoSolicitud.close();
    daoActivos.close();
    daoAdministracion.close();
    
    }
}
