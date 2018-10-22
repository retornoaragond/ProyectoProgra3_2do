/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaactivos.presentation.dependencias.listado;

import java.awt.Point;
import java.util.Arrays;
import java.util.List;
import sistemaactivos.Session;
import sistemaactivos.SistemaActivos;
import sistemaactivos.logic.Dependencia;
import sistemaactivos.logic.ModelLogic;
import sistemaactivos.logic.Usuario;
import sistemaactivos.presentation.dependencias.edicion.*;

/**
 *
 * @author ExtremeTech
 */
public class ControllerDependenciasListado {
    ModelLogic domainModel;
    Session session;
    ViewDependenciasListado view;
    ModelDependenciasListado model;
    
     public ControllerDependenciasListado(ViewDependenciasListado view, ModelDependenciasListado model, ModelLogic domainModel, Session session) {
        this.domainModel= domainModel;
        this.session=session;
        
        this.view = view;
        this.model = model;
        //view.setController(this);
        //view.setModel(model);
    }
    
    public void buscar(Dependencia filter) throws Exception{       
         model.setFilter(filter);
        this.refrescarBusqueda();
    }
    
    public void refrescarBusqueda() throws Exception{
       // List<Dependencia> rows = domainModel.searchDependencias(model.getFilter());
        //model.setDependencia(rows);
        model.commit();
      //  if (rows.isEmpty()) throw new Exception("Ningún dato coincide");
    }    

    
    /*
     public void preAgregar(Point at)throws Exception{      
      //  Usuario principal = (Usuario) session.getAttribute(SistemaActivos.USER_ATTRIBUTE);
        if ( !Arrays.asList(SistemaActivos.ROL_MANAGER).contains(principal.getRol())){
           throw new Exception(SistemaActivos.ROL_NOTAUTHORIZED);
        }
        SistemaActivos.DEPENDENCIA_CONTROLLER.reset(SistemaActivos.MODO_AGREGAR, new Dependencia());
        SistemaActivos.DEPENDENCIA_CONTROLLER.show(at);
    }
    
     */
     /*
    public void editar(int row, Point at){       
       // Dependencia seleccionada = model.getDependencias().getRowAt(row); 
       // Usuario principal = (Usuario) session.getAttribute(Application.USER_ATTRIBUTE);
        int modo;
     //   if ( Arrays.asList(SistemaActivos.ROL_MANAGER, SistemaActivos.ROL_SUPERVISOR).contains(principal.getRol())){
       //     modo=SistemaActivos.MODO_EDITAR;
        }
        else{
            modo=SistemaActivos.MODO_CONSULTAR;            
        }
        SistemaActivos.DEPENDENCIA_CONTROLLER.reset(modo, seleccionada);
        SistemaActivos.DEPENDENCIA_CONTROLLER.show(at);
    }

    */

    
    /*
    public void borrar(int row){  
        Dependencia seleccionada = model.getDependencias().getRowAt(row); 
        try {
            domainModel.deleteDependencia(seleccionada);
        } catch (Exception ex) { }
        List<Dependencia> rowsMod = domainModel.searchDependencias(model.getFilter());
        model.setDependencia(rowsMod);
        model.commit();
    }

    */

    
    
    /*
    public void searchEstado(int row, Point position){
        model.setSeleccionado(model.getPersonas().getRowAt(row));
        Application.ESTADOS_SEARCH_CONTROLLER.show(position);
    }
    
    public void changeEstado(EstadoCivil nuevoEstado){
        if (model.getSeleccionado()!=null){
            model.getSeleccionado().setEstadoCivil(nuevoEstado);
            try {
                domainModel.updatePersona(model.getSeleccionado());
                this.refrescarBusqueda();                
            } catch (Exception ex) { }
        }
    }

 */



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
