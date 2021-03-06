/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaactivos.presentation.solicitud.listado;

import sistemaactivos.SistemaActivos;
import java.awt.Point;
import java.util.HashSet;
import java.util.List;
import sistemaactivos.Session;
import sistemaactivos.logic.Bien;
import sistemaactivos.logic.Dependencia;
import sistemaactivos.logic.Funcionario;
import sistemaactivos.logic.ModelLogic;
import sistemaactivos.logic.Solicitud;
import sistemaactivos.logic.Usuario;

/**
 *
 * @author ExtremeTech
 */
public class ControllerSolicitudListado {

    ModelLogic domainModel;
    Session session;
    ViewSolicitudListado view;
    ModelSolicitudListado model;

    public ControllerSolicitudListado(ViewSolicitudListado view, ModelSolicitudListado model, ModelLogic domainModel, Session session) {
        this.domainModel = domainModel;
        this.session = session;
        this.view = view;
        this.model = model;
        view.setController(this);
        view.setModel(model);
    }

    public void buscar(Solicitud filter, List<String> l) throws Exception {
        model.setSolicitud(filter);
        this.refrescarBusqueda(l);
    }

    public void refrescarBusqueda() throws Exception {
        refrescarBusqueda(view.filtrosSeleccionados());
    }

    public void refrescarBusqueda(List<String> l) throws Exception {
        Usuario user = (Usuario) session.getAttribute(SistemaActivos.USER_ATTRIBUTE);
        List<Solicitud> rows;
        switch (user.getLabor().getPuesto().getPuesto()) {
            case "Administrador":
                rows = domainModel.searchSolicitudAdministrador(model.getFilter(), l, user.getLabor().getDependencia().getNombre());
                break;
            case "Registrador":
                rows = domainModel.searchSolicitudFuncionario(model.getFilter(), l, user.getLabor().getFuncionario());
                break;
            default:
                rows = domainModel.searchSolicitud(model.getFilter(), l);
                break;
        }
        model.setSolicitudes(rows);
        model.commit();
        if (rows.isEmpty()) {
            throw new Exception("Ningún dato coincide");
        }
    }

    public void editar(int row, Point at) {
        Solicitud seleccionada = model.getSolicitudes().getRowAt(row);
        List<Bien> bienesS = domainModel.getBienes(seleccionada);
        seleccionada.setBiens(new HashSet<>(bienesS));
        int modo;
        modo = SistemaActivos.MODO_EDITAR;
        SistemaActivos.SOLICITUD_EDICION_CONTROLLLER.reset(modo, seleccionada);
        SistemaActivos.SOLICITUD_EDICION_CONTROLLLER.show(at);
    }

    public void borrar(int row, List<String> l) {
        Usuario user = (Usuario) session.getAttribute(SistemaActivos.USER_ATTRIBUTE);
        Solicitud seleccionada = model.getSolicitudes().getRowAt(row);
        try {
            //  domainModel.deleteSolicitud(seleccionada);
        } catch (Exception ex) {
        }
        List<Solicitud> rowsMod = domainModel.searchSolicitud(model.getFilter(), l);
        model.setSolicitudes(rowsMod);
        model.commit();
    }

    public void changeFuncionario(Funcionario nuevoFuncionario) {
        if (model.getSeleccionado() != null) {
            model.getSeleccionado().setFuncionario(nuevoFuncionario);

            try {
                // domainModel.updateFuncionario(model.getSeleccionado());
                //  this.refrescarBusqueda();                
            } catch (Exception ex) {
            }
        }
    }

    public void changeDependencia(Dependencia nuevaDependencia) {
        if (model.getSeleccionado() != null) {
            model.getSeleccionado().setDependencia(nuevaDependencia);

            try {
                // domainModel.updateDependencia(model.getSeleccionado());
                //  this.refrescarBusqueda();                
            } catch (Exception ex) {
            }
        }
    }

    public void reset() {
        model.reset();
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

    public void SolicitudEdicionShow() {
        SistemaActivos.SOLICITUD_EDICION_CONTROLLLER.show();
    }

}
