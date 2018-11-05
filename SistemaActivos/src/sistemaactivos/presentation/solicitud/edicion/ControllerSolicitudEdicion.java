/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaactivos.presentation.solicitud.edicion;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import sistemaactivos.Session;
import sistemaactivos.SistemaActivos;
import sistemaactivos.logic.Bien;
import sistemaactivos.logic.Funcionario;
import sistemaactivos.logic.ModelLogic;
import sistemaactivos.logic.Solicitud;
import sistemaactivos.logic.Usuario;

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
        initComboB(domainModel, model);
        this.domainModel = domainModel;
        this.session = session;
        this.view = view;
        this.model = model;
        view.setController(this);
        view.setModel(model);
    }

    public void initComboB(ModelLogic domainModel, ModelSolicitudEdicion model)  {
        try {
            List<Funcionario> funcio = domainModel.getFuncionarios();
            funcio.add(0, new Funcionario());
            model.resetCombo(funcio);
        } catch (Exception ex) {
            Logger.getLogger(ControllerSolicitudEdicion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void guardar(Solicitud solicitud) throws Exception {
        Usuario user = (Usuario)session.getAttribute(SistemaActivos.USER_ATTRIBUTE);
        switch (model.getModo()) {
            case SistemaActivos.MODO_AGREGAR:
                domainModel.addSolicitud(solicitud);
                SistemaActivos.SOLICITUD_LISTADO_CONTROLLLER.refrescarBusqueda();
                model.setCurrent(new Solicitud());
                model.commit();
                break;
            case SistemaActivos.MODO_EDITAR:
                domainModel.updateSolicitud(solicitud);
                SistemaActivos.SOLICITUD_LISTADO_CONTROLLLER.refrescarBusqueda();
                break;
        }
    }

    public void agregar(Bien bien) throws Exception {
        model.addBien(bien);
        model.setBientable(new ArrayList<>(model.current.getBiens()));
        model.commit();
    }

    
     public void preservarBien(Bien b) throws Exception{
       domainModel.addBienPreservar(b);
     }
    
    
    public void eliminar(Bien bien) throws Exception {
        //eliminar un bien de la solicitud
    }

    public void reset() {
        model.reset();
    }

    public int getAutoIncremento() throws Exception{
        return domainModel.getAutoIncrementoSolicitud();
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
