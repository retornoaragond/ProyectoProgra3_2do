/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaactivos;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import sistemaactivos.logic.ModelLogic;
import sistemaactivos.presentation.activos.edicion.ControllerActivosEdicion;
import sistemaactivos.presentation.activos.edicion.ModelActivosEdicion;
import sistemaactivos.presentation.activos.edicion.ViewActivosEdicion;
import sistemaactivos.presentation.activos.listado.ControllerActivosListado;
import sistemaactivos.presentation.activos.listado.ModelActivosListado;
import sistemaactivos.presentation.activos.listado.ViewActivosListado;
import sistemaactivos.presentation.aplication.ControllerAplication;
import sistemaactivos.presentation.aplication.ModelAplication;
import sistemaactivos.presentation.aplication.ViewAplication;
import sistemaactivos.presentation.dependencias.edicion.ControllerDependenciasEdicion;
import sistemaactivos.presentation.dependencias.edicion.ModelDependenciasEdicion;
import sistemaactivos.presentation.dependencias.edicion.ViewDependenciasEdicion;
import sistemaactivos.presentation.dependencias.listado.ControllerDependenciasListado;
import sistemaactivos.presentation.dependencias.listado.ModelDependenciasListado;
import sistemaactivos.presentation.dependencias.listado.ViewDependenciasListado;
import sistemaactivos.presentation.funcionarios.edicion.ControllerFuncionariosEdicion;
import sistemaactivos.presentation.funcionarios.edicion.ModelFuncionariosEdicion;
import sistemaactivos.presentation.funcionarios.edicion.ViewFuncionariosEdicion;
import sistemaactivos.presentation.funcionarios.listado.ControllerFuncionariosListado;
import sistemaactivos.presentation.funcionarios.listado.ModelFuncionariosListado;
import sistemaactivos.presentation.funcionarios.listado.ViewFuncionariosListado;
import sistemaactivos.presentation.login.ControllerLogin;
import sistemaactivos.presentation.login.ModelLogin;
import sistemaactivos.presentation.login.ViewLogin;
import sistemaactivos.presentation.solicitud.edicion.ControllerSolicitudEdicion;
import sistemaactivos.presentation.solicitud.edicion.ModelSolicitudEdicion;
import sistemaactivos.presentation.solicitud.edicion.ViewSolicitudEdicion;
import sistemaactivos.presentation.solicitud.listado.ControllerSolicitudListado;
import sistemaactivos.presentation.solicitud.listado.ModelSolicitudListado;
import sistemaactivos.presentation.solicitud.listado.ViewSolicitudListado;

/**
 *
 * @author ExtremeTech
 */
public class SistemaActivos {

    public static void main(String[] args) {
        ModelLogic domainModel = ModelLogic.instance();
        Session session = new Session();

        ModelAplication aplicationModel = new ModelAplication();
        ViewAplication aplicationView = new ViewAplication();
        APLICATION_CONTROLLER = new ControllerAplication(aplicationView, aplicationModel, domainModel, session);

        ModelActivosEdicion activosedicionModel = new ModelActivosEdicion();
        ViewActivosEdicion activosedicionView = new ViewActivosEdicion(aplicationView,true);
        ACTIVOS_EDICION_CONTROLLER = new ControllerActivosEdicion(activosedicionView,activosedicionModel,domainModel,session);

        ModelActivosListado activoslistadoModel = new ModelActivosListado();
        ViewActivosListado activoslistadoView = new ViewActivosListado();
        aplicationView.addInternalFrame(activoslistadoView);
        ACTIVOS_LISTADO_CONTROLLER = new ControllerActivosListado(activoslistadoView, activoslistadoModel, domainModel, session);

        ModelDependenciasEdicion dependenciasedicionModel = new ModelDependenciasEdicion();
        //ViewDependenciasEdicion dependenciasedicionView = new ViewDependenciasEdicion(aplicationView,true);
        //DEPENDENCIA_EDICION_CONTROLLER = new ControllerDependenciasEdicion(dependenciasedicionView,dependenciasedicionModel, domainModel, session);

        ModelDependenciasListado dependenciaslistadoModel = new ModelDependenciasListado();
        ViewDependenciasListado dependenciaslistadoView = new ViewDependenciasListado();
        aplicationView.addInternalFrame(dependenciaslistadoView);
        DEPENDENCIA_LISTADO_CONTROLLER = new ControllerDependenciasListado(dependenciaslistadoView,dependenciaslistadoModel, domainModel, session);

        ModelFuncionariosEdicion funcionariosedicionModel = new ModelFuncionariosEdicion();
        //ViewFuncionariosEdicion funcionariosedicionView = new ViewFuncionariosEdicion(aplicationView,true);
        //FUNCIONARIO_EDICION_CONTROLLER = new ControllerFuncionariosEdicion(funcionariosedicionView, funcionariosedicionModel, domainModel, session);

        ModelFuncionariosListado funcionarioslistadoModel = new ModelFuncionariosListado();
        ViewFuncionariosListado funcionarioslistadoView = new ViewFuncionariosListado();
        aplicationView.addInternalFrame(funcionarioslistadoView);
        FUNCIONARIO_LISTADO_CONTROLLER = new ControllerFuncionariosListado(funcionarioslistadoView, funcionarioslistadoModel, domainModel, session);

        ModelSolicitudEdicion solicitudedicionModel = new ModelSolicitudEdicion();
        ViewSolicitudEdicion solicitudedicionView = new ViewSolicitudEdicion(aplicationView, true);
        SOLICITUD_EDICION_CONTROLLLER = new ControllerSolicitudEdicion(solicitudedicionView, solicitudedicionModel, domainModel, session);

        ModelSolicitudListado solicitudlistadoModel = new ModelSolicitudListado();
        ViewSolicitudListado solicitudlistadoView = new ViewSolicitudListado();
        aplicationView.addInternalFrame(solicitudlistadoView);
        SOLICITUD_LISTADO_CONTROLLLER = new ControllerSolicitudListado(solicitudlistadoView, solicitudlistadoModel, domainModel, session);

        ModelLogin loginModel = new ModelLogin();
        ViewLogin loginView = new ViewLogin();
        ControllerLogin logincontroller = new ControllerLogin(loginView, loginModel, domainModel, session);
        LOGIN_CONTROLLER = logincontroller;
        loginView.setVisible(true);
    }

    public static Border BORDER_ERROR = BorderFactory.createLineBorder(Color.red);
    public static Border BORDER_NOBORDER = BorderFactory.createLineBorder(Color.red);

    public static ControllerActivosEdicion ACTIVOS_EDICION_CONTROLLER;
    public static ControllerActivosListado ACTIVOS_LISTADO_CONTROLLER;
    public static ControllerAplication APLICATION_CONTROLLER;
    public static ControllerDependenciasEdicion DEPENDENCIA_EDICION_CONTROLLER;
    public static ControllerDependenciasListado DEPENDENCIA_LISTADO_CONTROLLER;
    public static ControllerFuncionariosEdicion FUNCIONARIO_EDICION_CONTROLLER;
    public static ControllerFuncionariosListado FUNCIONARIO_LISTADO_CONTROLLER;
    public static ControllerLogin LOGIN_CONTROLLER;
    public static ControllerSolicitudEdicion SOLICITUD_EDICION_CONTROLLLER;
    public static ControllerSolicitudListado SOLICITUD_LISTADO_CONTROLLLER;

    public static final String USER_ATTRIBUTE = "User";

    public static final int MODO_AGREGAR = 0;
    public static final int MODO_EDITAR = 1;
    public static final int MODO_CONSULTAR = 2;

    public static final Color COLOR_ERROR = Color.red;
    public static final Color COLOR_OK = Color.black;
}
