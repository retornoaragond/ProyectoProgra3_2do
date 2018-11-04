/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaactivos.presentation.activos.listado;

import java.awt.Point;
import java.util.List;
import sistemaactivos.Session;
import sistemaactivos.SistemaActivos;
import sistemaactivos.logic.Activo;
import sistemaactivos.logic.ModelLogic;

/**
 *
 * @author ExtremeTech
 */
public class ControllerActivosListado {

    ModelLogic domainModel;
    Session session;
    ViewActivosListado view;
    ModelActivosListado model;

    public void controllerEdicionShow() {
        SistemaActivos.ACTIVOS_EDICION_CONTROLLER.show();
    }

    public ControllerActivosListado(ViewActivosListado view, ModelActivosListado model, ModelLogic domainModel, Session session) {
        this.domainModel = domainModel;
        this.session = session;
        this.view = view;
        this.model = model;
        view.setController(this);
        view.setModel(model);
    }

    public void buscar(String filter,int rbselect) throws Exception {
        model.setRbselect(rbselect);
        model.setFilter(filter);
        this.refrescarBusqueda();
    }
    
    
    public void buscarActivo(){
     SistemaActivos.ACTIVOS_EDICION_CONTROLLER.show();
    }
    
    
    public void refrescarBusqueda() throws Exception {
        List<Activo> rows = domainModel.searchActivo(model.getFilter(),model.rbselect);//hacer en el modelLogic delete activo
        model.setActivos(rows);
        model.commit();
        if (rows.isEmpty()) {
            throw new Exception("Ningún dato coincide");
        }
    }

    
   public void editar(int row, Point at){       
       model.setSeleccionado(model.activosTable.getRowAt(row));
       int modo;
       modo=SistemaActivos.MODO_EDITAR;            
       SistemaActivos.ACTIVOS_EDICION_CONTROLLER.reset(modo, model.activoSeleccionado);
       SistemaActivos.ACTIVOS_EDICION_CONTROLLER.show(at);
    }
     
    public void borrar(int row) {
        Activo seleccionada = model.getActivos().getRowAt(row);
        try {
            domainModel.deleteActivo(seleccionada);
        } catch (Exception ex) {
        }
        List<Activo> rowsMod = domainModel.searchActivo(model.getFilter(),model.rbselect);
        model.setActivos(rowsMod);
        model.commit();
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
