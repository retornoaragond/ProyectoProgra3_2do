/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaactivos.presentation.funcionarios.edicion;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import sistemaactivos.SistemaActivos;
import sistemaactivos.logic.Dependencia;
import sistemaactivos.logic.Funcionario;
import sistemaactivos.logic.Labor;
import sistemaactivos.logic.Puesto;

/**
 *
 * @author ExtremeTech
 */
public class ModelFuncionariosEdicion extends java.util.Observable {
    Funcionario current;
    Funcionario funcionario;
    ComboBoxModel<Puesto> puestos;
    int modo;    
    ComboBoxModel<Dependencia> dependencia;
    
    LaborTableModel laborModel;
    
    public ComboBoxModel<Dependencia> getDependencia(){
    return dependencia;
    }
    
    public void setDependencias(List<Dependencia> dependencia){
        List<String> depe;
        
        this.dependencia = new DefaultComboBoxModel(dependencia.toArray());
        this.commit();
    }

    public ComboBoxModel<Puesto> getPuestos(){
    return puestos;
    }
    
    public ModelFuncionariosEdicion() {
        this.reset();
    }
    
    public void reset(int modo, Funcionario current){
        this.setModo(modo);
        this.setCurrent(current);
        this.commit();
    }
    
    public void reset(List<Dependencia> depe){
    this.setDependencias(depe);
    this.setCurrent(new Funcionario());
    }

    
    public void reset(){
        this.reset(SistemaActivos.MODO_AGREGAR,new Funcionario());  
        funcionario=new Funcionario();
        List<Labor> rows = new ArrayList<>();
        current=new Funcionario();
        this.setLabores(rows);
        this.commit();
        
    }    

    public int getModo() {
        return modo;
    }

    public void setModo(int modo) {
        this.modo = modo;
    }

    public Funcionario getCurrent() {
        return current;
    }

    public void setCurrent(Funcionario current) {
        this.current = current;   
    }

    @Override
    public void addObserver(java.util.Observer o) {
        super.addObserver(o);
        this.commit();
    }

    public void commit(){
        setChanged();
        notifyObservers();       
    }    
    
     public void setLabores(List<Labor> labores) {
        int[] cols = {LaborTableModel.ID, LaborTableModel.DEPENDENCIA, LaborTableModel.FUNCIONARIO, LaborTableModel.PUESTO, LaborTableModel.ACTIVOS};
        this.laborModel = new LaborTableModel(cols, labores);
    }
     
     public LaborTableModel getLabores(){
     return laborModel;
     }
    
}