/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaactivos.presentation.funcionarios.listado;

import java.awt.Point;
import java.util.Arrays;
import java.util.List;
import sistemaactivos.Session;
import sistemaactivos.SistemaActivos;
import sistemaactivos.logic.Funcionario;
import sistemaactivos.logic.ModelLogic;
import sistemaactivos.logic.Usuario;

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
    
    public void FuncionariosEdicionShow(){
    
        SistemaActivos.FUNCIONARIO_EDICION_CONTROLLER.show();
    
    }

    public void buscar(Funcionario filter) throws Exception {
        model.setFuncionario(filter);
        //  this.refrescarBusqueda();
    }

    /*
   public void refrescarBusqueda() throws Exception{
        List<Solicitud> rows = domainModel.searchPersonas(model.getSolicitud());
        model.setSolicitud(rows);
        model.commit();
        if (rows.isEmpty()) throw new Exception("Ningún dato coincide");
    }
   */
     
 /*
    public void preAgregar(Point at)throws Exception{      
        Usuario principal = (Usuario) session.getAttribute(SistemaActivos.USER_ATTRIBUTE);
        if ( !Arrays.asList(SistemaActivos.ROL_MANAGER).contains(principal.getRol())){
           throw new Exception(SistemaActivos.ROL_NOTAUTHORIZED);
        }
        SistemaActivos.PERSONA_CONTROLLER.reset(Application.MODO_AGREGAR, new Solicitud());
        SistemaActivos.PERSONA_CONTROLLER.show(at);
    }
   */  
 /*
   public void editar(int row, Point at){       
        Funcionario seleccionada = model.getFuncionarios().getRowAt(row); 
        Usuario principal = (Usuario) session.getAttribute(SistemaActivos.USER_ATTRIBUTE);
        int modo;
        if ( Arrays.asList(SistemaActivos.ROL_MANAGER, SistemaActivos.ROL_SUPERVISOR).contains(principal.getRol())){
           modo=SistemaActivos.MODO_EDITAR;
        }
        else{
            modo=SistemaActivos.MODO_CONSULTAR;            
        }
        SistemaActivos.Solicitud_CONTROLLER.reset(modo, seleccionada);
        SistemaActivos.FUNCIONARIO_LISTADO_CONTROLLER.show(at);
    }
   */                    
     
    public void borrar(int row) {
        Funcionario seleccionada = model.getFuncionarios().getRowAt(row);
        try {
              //domainModel.(seleccionada);
        } catch (Exception ex) {
        }
        //List<Funcionario> rowsMod = domainModel.searchPersonas(model.getFuncionario());
        //model.setSolicitudes(rowsMod);
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
