/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaactivos.presentation.solicitud.listado;

import java.awt.Point;
import java.util.Arrays;
import java.util.List;
import sistemaactivos.logic.Dependencia;
import sistemaactivos.logic.Funcionario;
import sistemaactivos.logic.Solicitud;
import sistemaactivos.logic.Usuario;

/**
 *
 * @author ExtremeTech
 */
public class ControllerSolicitudListado {
    
    //Model domainModel;
    //Session session
    ViewSolicitudListado view;
    ModelSolicitudListado model;
    
   /*
    public  ControllerSolicitudListado(ViewSolicitudListado view, ModelSolicitudListado model, Model domainModel, Session session){
        //this.domainModel= domainModel;
        //this.session=session;
        
        this.view = view;
        this.model = model;
        view.setController(this);
        view.setModel(model);
    
   
   }
    */
    
   public void buscar(Solicitud filter) throws Exception{       
         model.setSolicitud(filter);
      //  this.refrescarBusqueda();
    }
     
    
   /*
   public void refrescarBusqueda() throws Exception{
        List<Solicitud> rows = domainModel.searchPersonas(model.getSolicitud());
        model.setSolicitud(rows);
        model.commit();
        if (rows.isEmpty()) throw new Exception("Ningún dato coincide");
    }
    */
   
   /*
    public void preAgregar(Point at)throws Exception{      
        //Usuario principal = (Usuario) session.getAttribute(Application.USER_ATTRIBUTE);
        if ( !Arrays.asList(Application.ROL_MANAGER).contains(principal.getRol())){
           throw new Exception(Application.ROL_NOTAUTHORIZED);
        }
        Application.PERSONA_CONTROLLER.reset(Application.MODO_AGREGAR, new Solicitud());
        Application.PERSONA_CONTROLLER.show(at);
    }
   */
   
   
   /*
   public void editar(int row, Point at){       
        Solicitud seleccionada = model.getSolicitudes().getRowAt(row); 
        Usuario principal = (Usuario) session.getAttribute(Application.USER_ATTRIBUTE);
        int modo;
        if ( Arrays.asList(Application.ROL_MANAGER, Application.ROL_SUPERVISOR).contains(principal.getRol())){
           modo=Application.MODO_EDITAR;
        }
        else{
            modo=Application.MODO_CONSULTAR;            
        }
        Application.Solicitud_CONTROLLER.reset(modo, seleccionada);
        Application.Solicitud_CONTROLLER.show(at);
    }
                       
   */
   public void borrar(int row){  
        Solicitud seleccionada = model.getSolicitudes().getRowAt(row); 
        try {
          //  domainModel.deletePersona(seleccionada);
        } catch (Exception ex) { }
       // List<Solicitud> rowsMod = domainModel.searchPersonas(model.getSolicitud());
        //model.setSolicitudes(rowsMod);
        model.commit();
    }

   public void searchEstado(int row, Point position){
        model.setSeleccionado(model.getSolicitudes().getRowAt(row));
       // Application.ESTADOS_SEARCH_CONTROLLER.show(position);
    }
    
   public void changeFuncionario(Funcionario nuevoFuncionario){
        if (model.getSeleccionado()!=null){
            model.getSeleccionado().setFuncionario(nuevoFuncionario);
                   
            try {
               // domainModel.updateSolicitud(model.getSeleccionado());
              //  this.refrescarBusqueda();                
            } catch (Exception ex) { }
        }
    }
   
   public void changeDependencia(Dependencia nuevaDependencia){
        if (model.getSeleccionado()!=null){
            model.getSeleccionado().setDependencia(nuevaDependencia);
                   
            try {
               // domainModel.updateSolicitud(model.getSeleccionado());
              //  this.refrescarBusqueda();                
            } catch (Exception ex) { }
        }
    }
   
   
    public void reset(){
        model.reset();
    }
    
    public void show(){
        view.setVisible(true);
    }

    public void show(Point position){
        view.setLocation(position);
        this.show();
    }   
    
    public void hide(){
        view.setVisible(false);
    }       

   
    
}
