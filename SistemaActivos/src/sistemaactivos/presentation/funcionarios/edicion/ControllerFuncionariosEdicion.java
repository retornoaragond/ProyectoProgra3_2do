/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaactivos.presentation.funcionarios.edicion;

import java.awt.Point;
import java.util.List;
import sistemaactivos.Session;
import sistemaactivos.SistemaActivos;
import sistemaactivos.logic.Dependencia;
import sistemaactivos.logic.Funcionario;
import sistemaactivos.logic.Labor;
import sistemaactivos.logic.ModelLogic;
import sistemaactivos.logic.Puesto;
import sistemaactivos.logic.Solicitud;
import sistemaactivos.logic.Usuario;

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
        initCombosB(domainModel,model);
        this.domainModel = domainModel;
        this.session = session;
        this.view = view;
        this.model = model;
        view.setController(this);
        view.setModel(model);
    }
    
    public void initCombosB(ModelLogic domainModel,ModelFuncionariosEdicion model){
        List<Dependencia> dep = domainModel.getDependencias();
        dep.add(0, new Dependencia());
        List<Puesto> pue = domainModel.getPuestos();
        pue.add(0, new Puesto());
        model.resetD(dep);
        model.resetP(pue);
    }
    
    public void guardar(Funcionario funcionario) throws Exception {
        switch (model.getModo()) {
            case SistemaActivos.MODO_AGREGAR:
                domainModel.addFuncionario(funcionario);
                SistemaActivos.FUNCIONARIO_LISTADO_CONTROLLER.refrescarBusqueda();
                model.setCurrent(new Funcionario());
                model.commit();
                view.hide();
                break;
            case SistemaActivos.MODO_EDITAR:
                domainModel.updateFuncionario(funcionario);
                SistemaActivos.FUNCIONARIO_LISTADO_CONTROLLER.refrescarBusqueda();
                break;
        }
    }
    
    public List<Puesto> getpuestos() {
        return this.domainModel.getPuestos();
    }
    
    public void reset() {
        model.reset();
    }
    
    public void reset(int modo, Funcionario current) throws Exception {
        List<Labor> l;
        List<Solicitud> s;
        if (!(l = domainModel.getLaboresbyFuncionario(current.getId())).isEmpty()) {
            model.setLabores(l);
        }
        if (!(s = domainModel.searchSolicitudbyFuncionario(current)).isEmpty()) {
            model.setSolicitudes(s);
        }
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
    
    public void agregarLabor(Labor lab) throws Exception {
        domainModel.addLabor(lab);
    }
    
    public Labor getLabor(int cod) throws Exception{
        return domainModel.getLabor(cod);
    }
    
    public void agregarUsuario(Usuario user) throws Exception{
        domainModel.agregarUsuario(user);
    }
    
    public List<Usuario> getUsuarios() throws Exception{
       return domainModel.getUsuarios();
    }
    
    public int getAutoIncremento() throws Exception{
        return domainModel.getAutoIncremento();
    }

    //hacer en modelLogic un borrar labor con la id
    void borrar(int row) {
        //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
