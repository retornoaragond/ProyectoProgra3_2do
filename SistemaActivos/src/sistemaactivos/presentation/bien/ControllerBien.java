/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaactivos.presentation.bien;

import java.awt.Point;
import sistemaactivos.Session;
import sistemaactivos.SistemaActivos;
import sistemaactivos.logic.Bien;
import sistemaactivos.logic.ModelLogic;

/**
 *
 * @author CarlosAndrés
 */
public class ControllerBien {
    ModelLogic domainModel;
    Session session;
    ViewBien view;
    ModelBien model;
    
    
   public ControllerBien(ViewBien view, ModelBien model, ModelLogic domainModel, Session session) {
        this.domainModel = domainModel;
        this.session = session;
        this.view = view;
        this.model = model;
        view.setController(this);
        view.setModel(model);
    } 
    
    public void guardar(Bien bien) throws Exception {
        switch (model.getModo()) {
            case SistemaActivos.MODO_AGREGAR:
                domainModel.addBien(bien);
         //       SistemaActivos.BIEN_CONTROLLER.refrescarBusqueda();                   
                model.setCurrent(new Bien());
                model.commit();
                break;
            case SistemaActivos.MODO_EDITAR:
                domainModel.updateBien(bien);
//                SistemaActivos.SOLICITUD_CONTROLLER.refrescarBusqueda();               
                break;
        }
    }

    public void agregar(Bien bien) throws Exception {
        //agregar un bien a la solicitud
    }

    public void eliminar(Bien bien) throws Exception {
        //eliminar un bien de la solicitud
    }

    public void reset() {
        model.reset();
    }

    public void reset(int modo, Bien current) {
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
