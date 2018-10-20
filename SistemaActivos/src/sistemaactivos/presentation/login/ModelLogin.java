/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaactivos.presentation.login;

import sistemaactivos.logic.Usuario;

/**
 *
 * @author ExtremeTech
 */
public class ModelLogin extends java.util.Observable{
    Usuario current;

    public ModelLogin() {
        this.reset();
    }
    
    public void reset(){
        setCurrent(new Usuario());        
    }
    
    public Usuario getCurrent() {
        return current;
    }

    public void setCurrent(Usuario current) {
        this.current = current;
        this.commit();
    }

    @Override
    public void addObserver(java.util.Observer o) {
        super.addObserver(o);
        setChanged();
        notifyObservers();
    }

    public void commit(){
        setChanged();
        notifyObservers();       
    }     
    
}
