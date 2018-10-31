/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaactivos.presentation.aplication;

import java.awt.Point;
import sistemaactivos.Session;
import sistemaactivos.SistemaActivos;
import sistemaactivos.logic.ModelLogic;
import sistemaactivos.logic.Usuario;

/**
 *
 * @author ExtremeTech
 */
public class ControllerAplication {

    ModelLogic domainModel;
    Session session;
    ViewAplication view;
    ModelAplication model;

    public ControllerAplication(ViewAplication view, ModelAplication model, ModelLogic domainModel, Session session) {
        this.domainModel = domainModel;
        this.session = session;
        this.view = view;
        this.model = model;
        view.setController(this);
        view.setModel(model);
    }

    public void activosShow() {
        SistemaActivos.ACTIVOS_LISTADO_CONTROLLER.show();
    }

    public void dependenciasShow() {
        SistemaActivos.DEPENDENCIA_LISTADO_CONTROLLER.show();
    }

    public void funcionariosShow() {
        SistemaActivos.FUNCIONARIO_LISTADO_CONTROLLER.show();
    }

    public void solicitudesShow() {
        SistemaActivos.SOLICITUD_LISTADO_CONTROLLLER.show();
    }
    
 
    

    public void enter() {
        this.reset();
        this.show();
    }

    public void exit() {
       this.hide();
        SistemaActivos.LOGIN_CONTROLLER.logout();
        
    }

    public void reset() {
        SistemaActivos.ACTIVOS_LISTADO_CONTROLLER.reset();
//        SistemaActivos.DEPENDENCIA_LISTADO_CONTROLLER.reset();
        SistemaActivos.FUNCIONARIO_LISTADO_CONTROLLER.reset();
        SistemaActivos.SOLICITUD_LISTADO_CONTROLLLER.reset();

        model.reset((Usuario) session.getAttribute(SistemaActivos.USER_ATTRIBUTE));
    }

    public void show() {
        view.setVisible(true);
    }

    public void show(Point position) {
        view.setLocation(position);
        this.show();
    }

    public void hide() {
        SistemaActivos.ACTIVOS_LISTADO_CONTROLLER.hide();
//        SistemaActivos.DEPENDENCIA_LISTADO_CONTROLLER.hide();
        SistemaActivos.FUNCIONARIO_LISTADO_CONTROLLER.hide();
        SistemaActivos.SOLICITUD_LISTADO_CONTROLLLER.hide();
        view.setVisible(false);
    }

}
