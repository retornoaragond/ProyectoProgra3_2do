/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaactivos.presentation.solicitud.listado;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;
import sistemaactivos.logic.Solicitud;

/**
 *
 * @author ExtremeTech
 */
public class ModelSolicitudListado extends java.util.Observable {

    Solicitud solicitud;
    SolicitudTableModel solicitudTable;
    Solicitud solicitudSeleccionada;

    public ModelSolicitudListado() {
        this.reset();
    }

    public void reset() {
        solicitud = new Solicitud();
        List<Solicitud> rows = new ArrayList<>();
        solicitudSeleccionada = null;
        this.setSolicitud(rows);
        this.commit();
    }

    public void setSolicitud(List<Solicitud> solicitudes) {
        int[] cols = {SolicitudTableModel.NUMSOLICITUD, SolicitudTableModel.DEPENDENCIA, SolicitudTableModel.FUNCIONARIO, SolicitudTableModel.NUMCOMPROBANTE, SolicitudTableModel.FECHA, SolicitudTableModel.TIPOADQUISICION, SolicitudTableModel.CANTIDADBIENES, SolicitudTableModel.MONTOTOTAL, SolicitudTableModel.RAZONRECHAZO, SolicitudTableModel.ESTADO};
        this.solicitudTable = new SolicitudTableModel(cols, solicitudes);
    }

    public Solicitud getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(Solicitud solicitud) {
        this.solicitud = solicitud;
    }

    public SolicitudTableModel getPersonas() {
        return solicitudTable;
    }

    public Solicitud getSeleccionado() {
        return solicitudSeleccionada;
    }

    public void setSeleccionado(Solicitud seleccionado) {
        this.solicitudSeleccionada = seleccionado;
    }

    @Override
    public void addObserver(Observer o) {
        super.addObserver(o);
        this.commit();
    }

    public void commit() {
        setChanged();
        notifyObservers();
    }

}
