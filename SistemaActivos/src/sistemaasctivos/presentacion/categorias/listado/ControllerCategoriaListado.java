/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaasctivos.presentacion.categorias.listado;

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
//        SistemaActivos.CATEGORIA_EDICION_CONTROLLER.show();
    }

    public void buscar(Categoria filter) {
        model.setFilter(filter);
        this.refrescarBusqueda();
    }
    
    public void refrescarBusqueda() {
//        List<Categoria> rows = domainModel.searchCategoria(model.getFilter());
//        model.setDependencia(rows);
        model.commit();

    }

    public void preAgregar(Point at) throws Exception {
       
//        SistemaActivos.CATEGORIA_EDICION_CONTROLLER.reset(SistemaActivos.MODO_AGREGAR, new Categoria());
///        SistemaActivos.CATEGORIA_EDICION_CONTROLLER.show();
    }

    public void editar(int row, Point at) {
//        model.setSeleccionado(model.categoriaTable.getRowAt(row));
        int modo;
        modo = SistemaActivos.MODO_EDITAR;
//        SistemaActivos.DEPENDENCIA_EDICION_CONTROLLER.reset(modo, model.seleccionado);
        SistemaActivos.DEPENDENCIA_EDICION_CONTROLLER.show(at);
    }
    
    public void borrar(int row) {
//        Categoria seleccionada = model.categoriaTable.getRowAt(row);
        try {
//            domainModel.deleteDependencia(seleccionada);
        } catch (Exception ex) {
        }
//        List<Categoria> rowsMod = domainModel.searchDependencia(model.getFilter());
//        model.setDependencia(rowsMod);
        model.commit();
    }

    public void changeDependencia(Categoria nuevaCategoria) {
        if (model.getSeleccionado() != null) {
            model.getSeleccionado().setId(nuevaCategoria.getId());
            model.getSeleccionado().setDescripcion(nuevaCategoria.getDescripcion());
            try {
                //domainModel.uupdateDependencia(model.getSeleccionado());
                this.refrescarBusqueda();
            } catch (Exception ex) {
            }
        }
    }
    
     public void searchDependencia(int row, Point position) {
//        model.setSeleccionado(model.categoriaTable.getRowAt(row));
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
