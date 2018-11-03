/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaactivos.presentation.funcionarios.listado;

import java.awt.Point;
import java.util.List;
import sistemaactivos.Session;
import sistemaactivos.SistemaActivos;
import sistemaactivos.logic.Funcionario;
import sistemaactivos.logic.ModelLogic;

/**
 *
 * @author ExtremeTech
 */
public class ControllerFuncionariosListado {

    ModelLogic domainModel;
    Session session;
    ViewFuncionariosListado view;
    ModelFuncionariosListado model;

    public ControllerFuncionariosListado(ViewFuncionariosListado view, ModelFuncionariosListado model, ModelLogic domainModel, Session session) {
        this.domainModel = domainModel;
        this.session = session;
        this.view = view;
        this.model = model;
        view.setController(this);
        view.setModel(model);
    }

    public void FuncionariosEdicionShow() {

        SistemaActivos.FUNCIONARIO_EDICION_CONTROLLER.show();

    }

    public void buscar(Funcionario filter) throws Exception {
        model.setFilter(filter);
        this.refrescarBusqueda();
    }

    public void refrescarBusqueda() throws Exception {
        List<Funcionario> rows = domainModel.searchFuncionario(model.getFilter());
        model.setFuncionario(rows);
        model.commit();
        if (rows.isEmpty()) {
            throw new Exception("Ningún dato coincide");
        }
    }

    public void editar(int row, Point at) throws Exception {
        model.setSeleccionado(model.funcionarioTable.getRowAt(row));
        int modo;
        modo = SistemaActivos.MODO_EDITAR;
        SistemaActivos.FUNCIONARIO_EDICION_CONTROLLER.reset(modo, model.funcionarioSeleccionada);
        SistemaActivos.FUNCIONARIO_EDICION_CONTROLLER.show(at);
    }

    public void borrar(int row) {
        Funcionario seleccionada = model.getFuncionariosTablemodel().getRowAt(row);
        try {
            domainModel.deleteFuncionario(seleccionada);
        } catch (Exception ex) {
        }
        List<Funcionario> rowsMod = domainModel.searchFuncionario(model.getFilter());
        model.setFuncionario(rowsMod);
        model.commit();
    }

    public void searchFuncionario(int row, Point position) {
        model.setSeleccionado(model.funcionarioTable.getRowAt(row));
        SistemaActivos.FUNCIONARIO_LISTADO_CONTROLLER.show(position);
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

}
