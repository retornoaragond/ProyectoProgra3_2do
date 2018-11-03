/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaactivos.presentation.funcionarios.edicion;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import sistemaactivos.SistemaActivos;
import sistemaactivos.logic.Dependencia;
import sistemaactivos.logic.Funcionario;
import sistemaactivos.logic.Labor;
import sistemaactivos.logic.Puesto;
import sistemaactivos.logic.Solicitud;

/**
 *
 * @author ExtremeTech
 */
public class ModelFuncionariosEdicion extends java.util.Observable {

    Funcionario current;
    Funcionario funcionario;
    ComboBoxModel<Puesto> puestos;
    int modo;
    ComboBoxModel<Dependencia> dependencia;
    SolicitudesTableModel solitablemodel;
    LaborTableModel laborModel;

    public SolicitudesTableModel getSoliTable() {
        return this.solitablemodel;
    }

    public ComboBoxModel<Dependencia> getDependencia() {
        return dependencia;
    }

    public void setDependencias(List<Dependencia> dependencia) {
        this.dependencia = new DefaultComboBoxModel(dependencia.toArray());
        this.commit();
    }

    public ComboBoxModel<Puesto> getPuestos() {
        return puestos;
    }

    public void setPuesto(List<Puesto> puesto) {
        this.puestos = new DefaultComboBoxModel(puesto.toArray());
        this.commit();
    }

    public ModelFuncionariosEdicion() {
        this.reset();
    }

    public void reset(int modo, Funcionario current) {
        this.setModo(modo);
        this.setCurrent(current);
        this.commit();
    }

    public void resetD(List<Dependencia> depe) {
        this.setDependencias(depe);
        this.setCurrent(new Funcionario());
    }

    public void resetP(List<Puesto> pue) {
        this.setPuesto(pue);
        this.setCurrent(new Funcionario());
    }

    public void reset() {
        this.reset(SistemaActivos.MODO_AGREGAR, new Funcionario());
        funcionario = new Funcionario();
        List<Labor> rows = new ArrayList<>();
        List<Solicitud> arows = new ArrayList<>();
        current = new Funcionario();
        this.setLabores(rows);
        this.setSolicitudes(arows);
        this.commit();
    }

    public int getModo() {
        return modo;
    }

    public void setModo(int modo) {
        this.modo = modo;
    }

    public Funcionario getCurrent() {
        return current;
    }

    public void setCurrent(Funcionario current) {
        this.current = current;
    }

    @Override
    public void addObserver(java.util.Observer o) {
        super.addObserver(o);
        this.commit();
    }

    public void commit() {
        setChanged();
        notifyObservers();
    }

    public void setLabores(List<Labor> labores) {
        int[] cols = {LaborTableModel.DEPENDENCIA, LaborTableModel.PUESTO};
        this.laborModel = new LaborTableModel(cols, labores);
    }

    public LaborTableModel getLabores() {
        return laborModel;
    }

    public void setSolicitudes(List<Solicitud> soli) {
        int[] cols = {SolicitudesTableModel.NUMSOLICITUD, SolicitudesTableModel.DEPENDENCIA};
        this.solitablemodel = new SolicitudesTableModel(cols, soli);
    }

}
