/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaactivos.presentation.activos.listado;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;
import sistemaactivos.logic.Activo;

/**
 *
 * @author ExtremeTech
 */
public class ModelActivosListado extends java.util.Observable {

    String filter;
    ActivoTableModel activosTable;
    Activo activoSeleccionado;
    int rbselect;

    public ModelActivosListado() {
        this.reset();
    }

    public void reset() {
        filter = new String();
        List<Activo> rows = new ArrayList<>();
        activoSeleccionado = null;
        rbselect = -1;
        this.setActivos(rows);
        this.commit();
    }

    public void setActivos(List<Activo> activos) {
        int[] cols = {
            ActivoTableModel.CODIGO,
            ActivoTableModel.DESCRIPCION,
            ActivoTableModel.CATEGORIA,
            ActivoTableModel.DEPENDENCIA,
            ActivoTableModel.RESPONSABLE
        };
        this.activosTable = new ActivoTableModel(cols, activos);
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public ActivoTableModel getActivos() {
        return activosTable;
    }

    public Activo getSeleccionado() {
        return activoSeleccionado;
    }

    public void setSeleccionado(Activo seleccionado) {
        this.activoSeleccionado = seleccionado;
    }

    public int getRbselect() {
        return rbselect;
    }

    public void setRbselect(int rbselect) {
        this.rbselect = rbselect;
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
