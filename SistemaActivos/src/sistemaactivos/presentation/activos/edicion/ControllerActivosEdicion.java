/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaactivos.presentation.activos.edicion;

import java.awt.Point;
import java.util.List;
import sistemaactivos.Session;
import sistemaactivos.SistemaActivos;
import sistemaactivos.logic.Activo;
import sistemaactivos.logic.Dependencia;
import sistemaactivos.logic.Funcionario;
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
         initCombosB(domainModel,model);
        model.reset(domainModel.getActivos());
        this.domainModel= domainModel;
        this.session=session;
        this.view = view;
        this.model = model;
        view.setController(this);
        view.setModel(model);
    }

public void initCombosB(ModelLogic domainModel,ModelActivosEdicion model){
        List<Dependencia> dep = domainModel.getDependencias();
        dep.add(0, new Dependencia());
        List<Funcionario> fun = domainModel.getFuncionarios();
        fun.add(0, new Funcionario());
        model.resetD(dep);
        model.resetF(fun);
    }
    
    public void guardar(Activo activo) throws Exception{  
        switch(model.getModo()){
            case SistemaActivos.MODO_AGREGAR:
            domainModel.addActivo(activo);
               SistemaActivos.ACTIVOS_LISTADO_CONTROLLER.refrescarBusqueda();                   
                 model.setCurrent(new Activo());
                  model.commit();
                 view.setVisible(false);
                  
                break;
            case SistemaActivos.MODO_EDITAR:
                domainModel.updateActivo(activo);
                SistemaActivos.ACTIVOS_LISTADO_CONTROLLER.refrescarBusqueda();               
                break;
        }   
    } 
 
    public List<Dependencia> getdependencias() {
        return this.domainModel.getDependencias();
    }
    
    public List<Funcionario> getfuncionarios() {
        return this.domainModel.getFuncionarios();
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
