/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaactivos.presentation.activos.edicion;

import java.awt.Point;
import sistemaactivos.Session;
import sistemaactivos.SistemaActivos;
import sistemaactivos.logic.Activo;
import sistemaactivos.logic.ModelLogic;

/**
 *
 * @author ExtremeTech
 */
public class ControllerActivosEdicion {
    ModelLogic domainModel;
    Session session;
    ViewActivosEdicion view;
    ModelActivosEdicion model;
    
    
    public ControllerActivosEdicion(ViewActivosEdicion view, ModelActivosEdicion model, ModelLogic domainModel, Session session) {
//        //model.reset(domainModel.getEstadosCiviles());
       this.domainModel= domainModel;
        this.session=session;
        
        this.view = view;
        this.model = model;
      //  view.setController(this);
       // view.setModel(model);
    }


    
    public void guardar(Activo activo) throws Exception{  
        switch(model.getModo()){
            case SistemaActivos.MODO_AGREGAR:
//               domainModel.addActivo(activo);
//                SistemaActivos.ACTIVO_CONTROLLER.refrescarBusqueda();                   
//                model.setCurrent(new Activo());
//                model.commit();   
//                break;
//            case SistemaActivos.MODO_EDITAR:
//                domainModel.updateActivo(activo);
//                SistemaActivos.ACTIVO_CONTROLLER.refrescarBusqueda();               
//                break;
        }   
    } 
 
    
    
    public void reset(){
        model.reset();
    }
    
    public void reset(int modo, Activo current){
        model.reset(modo, current);
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
