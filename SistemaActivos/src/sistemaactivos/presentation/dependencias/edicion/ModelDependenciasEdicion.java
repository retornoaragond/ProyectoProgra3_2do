/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaactivos.presentation.dependencias.edicion;

import sistemaactivos.logic.Dependencia;

/**
 *
 * @author ExtremeTech
 */
public class ModelDependenciasEdicion extends java.util.Observable  {

    Dependencia current;
    
    int modo;    

    public ModelDependenciasEdicion() {
        this.reset();
    }

    public void reset(){      
       
    }
    
    public void reset(int modo, Dependencia current){
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

    public Dependencia getCurrent() {
        return current;
    }

    public void setCurrent(Dependencia current) {
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
