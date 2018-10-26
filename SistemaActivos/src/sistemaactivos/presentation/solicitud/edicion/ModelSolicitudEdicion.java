/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaactivos.presentation.solicitud.edicion;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;
import sistemaactivos.logic.Bien;
import sistemaactivos.logic.Solicitud;

/**
 *
 * @author ExtremeTech
 */
public class ModelSolicitudEdicion extends java.util.Observable {
    Solicitud current = new Solicitud();
    BienTableModel bientable;
    Bien bienselecionado;
    int modo;

    public ModelSolicitudEdicion() {
        this.reset();
    }

    public void reset(int modo, Solicitud current) {
        this.setModo(modo);
        this.setCurrent(current);
        List<Bien> rows = new ArrayList<>();
        this.bienselecionado = null;
        this.setBientable(rows);
        this.commit();
    }
    
    public void reset(){
        //this.reset(Application.MODO_AGREGAR,new Solicitud());
    }

    public BienTableModel getBientable() {
        return bientable;
    }

    public void setBientable(List<Bien> bienes) {
        int[] cols = {BienTableModel.SERIAL, BienTableModel.DESCRIPCION, BienTableModel.MARCA, BienTableModel.MODELO, BienTableModel.PRECIOUNITARIO};
        this.bientable = new BienTableModel(bienes, cols);
    }

    public Bien getBienselecionado() {
        return bienselecionado;
    }

    public void setBienselecionado(Bien bienselecionado) {
        this.bienselecionado = bienselecionado;
    }

    public Solicitud getCurrent() {
        return current;
    }

    public void setCurrent(Solicitud current) {
        this.current = current;
    }

    public int getModo() {
        return modo;
    }

    public void setModo(int modo) {
        this.modo = modo;
    }
    
    

    @Override
    public void addObserver(Observer o) {
        super.addObserver(o);
        this.commit();
    }

    public void commit() {
        setChanged();
        notifyObservers();
    }

}
