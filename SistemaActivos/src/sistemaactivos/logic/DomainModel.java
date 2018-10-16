/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaactivos.logic;

import java.util.List;
import sistemaactivos.data.Dao;

/**
 *
 * @author CarlosAndrés
 */
public class DomainModel {
 private Dao dao;
 private static DomainModel uniqueInstance;
 
   public static DomainModel instance(){
        if (uniqueInstance == null){
            uniqueInstance = new DomainModel();
        }
        return uniqueInstance; 
    }
    private DomainModel(){
        dao = new Dao();
    }
  
    /*
 public List<Funcionario> getFuncionario(){
       // return dao.EstadoCivilGetAll();
    }
    
  */
    /*
    public  Funcionario getFuncionario(String codigo) throws Exception{
        return dao.EstadoCivilGet(codigo);
    }
    */
   /*
    public List<Funcionario> searchFuncionarios(Funcionario filtro){
        return dao.FuncionarioSearch(filtro);
    }
   */
   
    /*
    public Solicitud getSolicitud(int numSolicitud) throws Exception{
       // return dao.SolicitudGet(numSolicitud);
    }
    */
    public void deleteS(Solicitud s) throws Exception{
       // dao.SolicitudDelete(s);
    }

    public void addPersona(Solicitud solicitud) throws Exception{
       // dao.SolicitudAdd(solicitud);
    }

      
    
    
    
    
    
}
