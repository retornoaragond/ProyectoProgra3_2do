/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaactivos.presentation.dependencias.edicion;

import java.awt.Point;
import sistemaactivos.Session;
import sistemaactivos.SistemaActivos;
import static sistemaactivos.SistemaActivos.DEPENDENCIA_LISTADO_CONTROLLER;
import sistemaactivos.logic.Dependencia;
import sistemaactivos.logic.ModelLogic;

/**
 *
 * @author ExtremeTech
 */
public class ControllerDependenciasEdicion {
    
    ModelLogic domainModel;
    Session session;
    ViewDependenciasEdicion view;
    ModelDependenciasEdicion model;

    public ControllerDependenciasEdicion(ViewDependenciasEdicion view, ModelDependenciasEdicion model, 
            ModelLogic domainModel, Session session) {
           // model.reset(domainModel.getDependencias());
        
        this.domainModel = domainModel;
        this.session = session;

        this.view = view;
        this.model = model;
        view.setController(this);
        view.setModel(model);
    }

    public void guardar(Dependencia dependencia) throws Exception {
        switch (model.getModo()) {
            case SistemaActivos.MODO_AGREGAR:
                domainModel.addDependencia(dependencia);
                SistemaActivos.DEPENDENCIA_LISTADO_CONTROLLER.refrescarBusqueda();                   
                model.setCurrent(new Dependencia());
                model.commit();
                break;
            case SistemaActivos.MODO_EDITAR:
                 domainModel.updateDependencia(dependencia);
                  SistemaActivos.DEPENDENCIA_LISTADO_CONTROLLER.refrescarBusqueda();               
                break;
        }
    }
    
    public void reset() {
        model.reset();
    }
    
    public void reset(int modo, Dependencia current){
        model.reset(modo, current);
    }  
    
    public void show() {
        view.setVisible(true);
    }

    public void show(Point position) {
        view.setLocation(position);
        this.show();
    }

    public void hide() {
        view.setVisible(false);
    }
    
    
}
