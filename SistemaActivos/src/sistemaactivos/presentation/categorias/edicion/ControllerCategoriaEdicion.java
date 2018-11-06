/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaactivos.presentation.categorias.edicion;

import sistemaactivos.Session;
import sistemaactivos.SistemaActivos;
import sistemaactivos.logic.Categoria;
import sistemaactivos.logic.ModelLogic;
import java.awt.Point;

/**
 *
 * @author CarlosAndrés
 */
public class ControllerCategoriaEdicion {
    ModelLogic domainModel;
    Session session;
    ViewCategoriaEdicion view;
    ModelCategoriaEdicion model;

    public ControllerCategoriaEdicion(ViewCategoriaEdicion view, ModelCategoriaEdicion model,
            ModelLogic domainModel, Session session) {

        this.domainModel = domainModel;
        this.session = session;

        this.view = view;
        this.model = model;
         view.setController(this);
         view.setModel(model);
    }

    public void guardar(Categoria categoria) throws Exception {
        switch (model.getModo()) {
            case SistemaActivos.MODO_AGREGAR:
                domainModel.addcategoria(categoria);
                SistemaActivos.DEPENDENCIA_LISTADO_CONTROLLER.refrescarBusqueda();
                model.setCurrent(new Categoria());
                model.commit();
                break;
            case SistemaActivos.MODO_EDITAR:
                domainModel.updatecategoria(categoria);
                SistemaActivos.DEPENDENCIA_LISTADO_CONTROLLER.refrescarBusqueda();
                break;
        }
    }

    public void reset() {
        model.reset();
    }

    public void reset(int modo, Categoria current) {
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
