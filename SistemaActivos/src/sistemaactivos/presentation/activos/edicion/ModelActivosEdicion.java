/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaactivos.presentation.activos.edicion;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;
import sistemaactivos.logic.Activo;
import sistemaactivos.logic.Bien;
import sistemaactivos.logic.Solicitud;

/**
 *
 * @author ExtremeTech
 */
public class ModelActivosEdicion extends java.util.Observable {
    Activo current;
    //ActivoTableModel activoTable;
    Activo activoSeleccionado;
    int modo;
            
    
    public ModelActivosEdicion(){
    this.reset();
     }
   
    public void reset(int modo, Activo current) {
        this.setModo(modo);
        this.setCurrent(current);
        List<Activo> rows = new ArrayList<>();
        this.activoSeleccionado = null;
        //this.setActivoTable(rows);
        this.commit();
    }
   
     public void reset(){
        //this.reset(Application.MODO_AGREGAR,new Activo());
    }

    
    
    //public activoTableModel getActivotable() {
     //   return activotable;
   // }

    public void setBientable(List<Activo> activos) {
      //  int[] cols = {ActivoTableModel.SERIAL, BienTableModel.DESCRIPCION, BienTableModel.MARCA, BienTableModel.MODELO, BienTableModel.PRECIOUNITARIO};
        //this.activoTable = new activoTableModel(activos, cols);
        
    }

    public Activo getActivoselecionado() {
        return this.activoSeleccionado;
    }

    public void setBienselecionado(Activo activoselecionado) {
         this.activoSeleccionado= activoselecionado;
    }

    
    public Activo getCurrent() {
        return current;
    }

    public void setCurrent(Activo current) {
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
