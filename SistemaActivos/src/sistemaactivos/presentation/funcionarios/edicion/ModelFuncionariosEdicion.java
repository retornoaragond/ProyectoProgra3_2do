/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaactivos.presentation.funcionarios.edicion;

import sistemaactivos.logic.Funcionario;

/**
 *
 * @author ExtremeTech
 */
public class ModelFuncionariosEdicion extends java.util.Observable {
    Funcionario current;
    
    int modo;    

    public ModelFuncionariosEdicion() {
        this.reset();
    }

    public void reset(){      
       
    }
    
    public void reset(int modo, Funcionario current){
        this.setModo(modo);
        this.setCurrent(current);
        this.commit();
    }
    /*
    public void reset(){
        //this.reset(Application.MODO_AGREGAR,new Persona());     
    }    
*/
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
}