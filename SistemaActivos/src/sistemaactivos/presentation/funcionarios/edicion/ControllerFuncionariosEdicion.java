/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaactivos.presentation.funcionarios.edicion;

import java.awt.Point;
import sistemaactivos.Session;
import sistemaactivos.SistemaActivos;
import sistemaactivos.logic.Funcionario;
import sistemaactivos.logic.ModelLogic;

/**
 *
 * @author ExtremeTech
 */
public class ControllerFuncionariosEdicion {

    ModelLogic domainModel;
    Session session;
    ViewFuncionariosEdicion view;
    ModelFuncionariosEdicion model;

    public ControllerFuncionariosEdicion(ViewFuncionariosEdicion view, ModelFuncionariosEdicion model, ModelLogic domainModel, Session session) {
        //model.reset(domainModel.getEstadosCiviles());
        this.domainModel = domainModel;
        this.session = session;

        this.view = view;
        this.model = model;
        view.setController(this);
        view.setModel(model);
    }

    public void guardar(Funcionario Funcionario) throws Exception {
        switch (model.getModo()) {
            case SistemaActivos.MODO_AGREGAR:
                //domainModel.addPersona(persona);
                //SistemaActivos.PERSONAS_CONTROLLER.refrescarBusqueda();                   
                model.setCurrent(new Funcionario());
                model.commit();
                break;
            case SistemaActivos.MODO_EDITAR:
                //    domainModel.updatePersona(persona);
                //  SistemaActivos.PERSONAS_CONTROLLER.refrescarBusqueda();               
                break;
        }
    }

    public void reset() {
        model.reset();
    }

    /*
    public void reset(int modo, Persona current){
        model.reset(modo, current);
    }    
     */
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
