/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaactivos.presentation.login;

import sistemaactivos.Session;
import sistemaactivos.SistemaActivos;
import sistemaactivos.logic.ModelLogic;
import sistemaactivos.logic.Usuario;

/**
 *
 * @author ExtremeTech
 */
public class ControllerLogin {

    ModelLogic domainModel;
    Session session;
    ViewLogin view;
    ModelLogin model;

    public ControllerLogin(ViewLogin view, ModelLogin model, ModelLogic domainModel, Session session) {
        this.domainModel = domainModel;
        this.session = session;
        this.view = view;
        this.model = model;
        view.setController(this);
        view.setModel(model);
    }

    public void login(Usuario typed) throws Exception {
        model.setCurrent(typed);
        Usuario real = domainModel.getUsuario(typed.getId(), typed.getPass());
        session.setAttibute(SistemaActivos.USER_ATTRIBUTE, real);
        view.setVisible(false);
        SistemaActivos.APLICATION_CONTROLLER.enter();
    }

    public void logout() {
        session.removeAttribute(SistemaActivos.USER_ATTRIBUTE);
        model.setCurrent(new Usuario());
        view.setVisible(true);
    }

    public void exit() {
        System.exit(0);
    }
}
