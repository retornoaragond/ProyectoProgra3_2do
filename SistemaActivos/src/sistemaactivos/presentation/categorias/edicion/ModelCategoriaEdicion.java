/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaactivos.presentation.categorias.edicion;

import sistemaactivos.SistemaActivos;
import sistemaactivos.logic.Categoria;

/**
 *
 * @author CarlosAndrés
 */
public class ModelCategoriaEdicion extends java.util.Observable {
     Categoria current;
    int modo;

    public ModelCategoriaEdicion() {
        this.reset();
    }

    public void reset(int modo, Categoria current) {
        this.setModo(modo);
        this.setCurrent(current);
        this.commit();
    }

    public void reset() {
        this.reset(SistemaActivos.MODO_AGREGAR, new Categoria());
    }

    public int getModo() {
        return modo;
    }

    public void setModo(int modo) {
        this.modo = modo;
    }

    public Categoria getCurrent() {
        return current;
    }

    public void setCurrent(Categoria current) {
        this.current = current;
    }

    @Override
    public void addObserver(java.util.Observer o) {
        super.addObserver(o);
        this.commit();
    }

    public void commit() {
        setChanged();
        notifyObservers();
    }
}
