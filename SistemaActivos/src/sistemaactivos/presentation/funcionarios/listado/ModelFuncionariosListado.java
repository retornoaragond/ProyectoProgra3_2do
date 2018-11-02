/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaactivos.presentation.funcionarios.listado;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;
import sistemaactivos.logic.Funcionario;

/**
 *
 * @author ExtremeTech
 */
public class ModelFuncionariosListado extends java.util.Observable{
    
    Funcionario filter;
    FuncionarioTableModel funcionarioTable;
    Funcionario funcionarioSeleccionada;
    
     public ModelFuncionariosListado() {
        this.reset();
    }

    public void reset() {
        filter = new Funcionario();
        List<Funcionario> rows = new ArrayList<>();
        funcionarioSeleccionada = null;
        this.setFuncionario(rows);
        this.commit();
    }
    
    public void setFuncionario(List<Funcionario> funcionarios) {
        int[] cols = {FuncionarioTableModel.ID, 
            FuncionarioTableModel.NOMBRE, FuncionarioTableModel.SOLICITUDES};
            this.funcionarioTable=new FuncionarioTableModel(cols, funcionarios);
    }
    

    public Funcionario getFilter() {
        return filter;
    }

    public void setFilter(Funcionario funcionario) {
        this.filter = funcionario;
    }

    public FuncionarioTableModel getFuncionariosTablemodel() {
        return funcionarioTable;
    }
    
     public Funcionario getSeleccionado() {
        return funcionarioSeleccionada;
    }

    public void setSeleccionado(Funcionario seleccionado) {
        this.funcionarioSeleccionada = seleccionado;
    }

   
    public void addObserver(Observer o) {
        super.addObserver(o);
        this.commit();
    }

    public void commit() {
        setChanged();
        notifyObservers();
    }
    
}
