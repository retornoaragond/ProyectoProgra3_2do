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
    
    public void refrescarBusqueda() throws Exception {
        List<Activo> rows = domainModel.searchActivo(model.getFilter(),model.rbselect);//hacer en el modelLogic delete activo
        model.setActivos(rows);
        model.commit();
        if (rows.isEmpty()) {
            throw new Exception("Ningún dato coincide");
        }
    }

    /*
   public void editar(int row, Point at){       
        Activo seleccionada = model.getActivos().getRowAt(row); 
        Usuario principal = (Usuario) session.getAttribute(SistemaActivos.USER_ATTRIBUTE);
        int modo;
        
        //preguntar por el puesto que seria obtener el funcionario luego la labor y luego el nombre de la labor
        if ( Arrays.asList(SistemaActivos.ROL_REGISTRADOR_DE_BIENES).contains(principal.getFuncionario().getLabors())){
           modo=SistemaActivos.MODO_EDITAR;
        }
        else{
            modo=SistemaActivos.MODO_CONSULTAR;            
        }
        SistemaActivos.ACTIVOS_EDICION_CONTROLLER.reset(modo, seleccionada);
        SistemaActivos.ACTIVOS_LISTADO_CONTROLLER.show(at);
    }
     */
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
