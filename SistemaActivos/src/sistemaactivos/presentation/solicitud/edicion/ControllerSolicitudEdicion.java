/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaactivos.presentation.solicitud.edicion;

import java.awt.Point;
import sistemaactivos.Session;
import sistemaactivos.SistemaActivos;
import sistemaactivos.logic.Bien;
import sistemaactivos.logic.ModelLogic;
import sistemaactivos.logic.Solicitud;

/**
 *
 * @author ExtremeTech
 */
public class ControllerSolicitudEdicion {

    ModelLogic domainModel;
    Session session;
    ViewSolicitudEdicion view;
    ModelSolicitudEdicion model;

    public ControllerSolicitudEdicion(ViewSolicitudEdicion view, ModelSolicitudEdicion model, ModelLogic domainModel, Session session) {
        //model.reset(domainModel.getBien());
        this.domainModel = domainModel;
        this.session = session;

        this.view = view;
        this.model = model;
        view.setController(this);
        view.setModel(model);
    }

    public void guardar(Solicitud solicitud) throws Exception {
        switch (model.getModo()) {
            case SistemaActivos.MODO_AGREGAR:
                domainModel.addSolicitud(solicitud);
//                SistemaActivos.SOLICITUD_CONTROLLER.refrescarBusqueda();                   
                model.setCurrent(new Solicitud());
                model.commit();
                break;
            case SistemaActivos.MODO_EDITAR:
                domainModel.updateSolicitud(solicitud);
//               SistemaActivos.SOLICITUD_CONTROLLER.refrescarBusqueda();               
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

    public void reset(int modo, Solicitud current) {
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
