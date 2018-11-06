/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaactivos.presentacion.categorias.listado;

import java.awt.Point;
import java.util.List;
import sistemaactivos.Session;
import sistemaactivos.SistemaActivos;
import sistemaactivos.logic.Categoria;
import sistemaactivos.logic.ModelLogic;

/**
 *
 * @author diego
 */
public class ControllerCategoriaListado {
    ModelLogic domainModel;
    Session session;
    ViewCategoriaListado view;
    ModelCategoriaListado model;
    
    public ControllerCategoriaListado(ViewCategoriaListado view, ModelCategoriaListado model, ModelLogic domainModel, Session session) {
        this.domainModel = domainModel;
        this.session = session;

        this.view = view;
        this.model = model;
        view.setController(this);
        view.setModel(model);
    }

    public void CategoriasEdicionShow() {
        SistemaActivos.CATEGORIA_LISTADO_CONTROLLER.show();
    }

    public void buscar(Categoria filter) {
        model.setFilter(filter);
        this.refrescarBusqueda();
    }
    
    public void refrescarBusqueda() {
        List<Categoria> rows = domainModel.getCategoria();
        model.setDependencia(rows);
        model.commit();

    }

    public void preAgregar(Point at) throws Exception {
       
        SistemaActivos.CATEGORIA_LISTADO_CONTROLLER.reset();
        SistemaActivos.CATEGORIA_LISTADO_CONTROLLER.show();
    }

    public void editar(int row, Point at) {
        model.setSeleccionado(model.CategoriaTable.getRowAt(row));
        int modo;
        modo = SistemaActivos.MODO_EDITAR;
        SistemaActivos.CATEGORIA_LISTADO_CONTROLLER.reset();
        SistemaActivos.DEPENDENCIA_EDICION_CONTROLLER.show(at);
    }
    
    public void borrar(int row) {
        Categoria seleccionada = model.CategoriaTable.getRowAt(row);
        try {
            //domainModel.deleteDependencia(seleccionada);
        } catch (Exception ex) {
        }
        //List<Categoria> rowsMod = domainModel.searchDependencia(model.getFilter());
        //model.setDependencia(rowsMod);
        model.commit();
    }

    public void changeDependencia(Categoria nuevaCategoria) {
        if (model.getSeleccionado() != null) {
            model.getSeleccionado().setId(nuevaCategoria.getId());
            model.getSeleccionado().setDescripcion(nuevaCategoria.getDescripcion());
            try {
                //domainModel.uupdateCategoria(model.getSeleccionado());
                this.refrescarBusqueda();
            } catch (Exception ex) {
            }
        }
    }
    
     public void searchCategoria(int row, Point position) {
        model.setSeleccionado(model.CategoriaTable.getRowAt(row));
        SistemaActivos.DEPENDENCIA_LISTADO_CONTROLLER.show(position);// aqui hice algo 
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
