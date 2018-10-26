/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaactivos.presentation.activos.edicion;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;
import sistemaactivos.SistemaActivos;
import sistemaactivos.logic.Activo;
import sistemaactivos.logic.Bien;
import sistemaactivos.logic.Solicitud;
import sistemaactivos.presentation.activos.listado.ActivoTableModel;

/**
 *
 * @author ExtremeTech
 */
public class ModelActivosEdicion extends java.util.Observable {
    Activo current;
    Activo activoSeleccionado;
    ActivoTableModel activotable;
    int modo;
            
    
    public ModelActivosEdicion(){
    this.reset();
     }
  
   /* 
    public void reset(List<Activo> activos){      
        setActivos(estadosCiviles);
        setCurrent(new Activo());
    }
    */
    
    
    
    
   public void reset(int modo,Activo current){      
        this.setModo(modo);
        this.setCurrent(current);
        List<Activo>rows = new ArrayList<>();
        this.activoSeleccionado=null;
        this.setActivos(rows);
        this.commit();
        }
    
     public void reset(){
        this.reset(SistemaActivos.MODO_AGREGAR,new Activo());
    }

        public void setBientable(List<Activo> activos) {
      //  int[] cols = {ActivoTableModel.SERIAL, BienTableModel.DESCRIPCION, BienTableModel.MARCA, BienTableModel.MODELO, BienTableModel.PRECIOUNITARIO};
        //this.activoTable = new activoTableModel(activos, cols);
        
    }

    public Activo getActivoselecionado() {
        return this.activoSeleccionado;
    }

    public void setActivoselecionado(Activo activoselecionado) {
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
    
   
    // creo que no se ocupa
    /*  
     public ComboBoxModel<EstadoCivil> getEstadosCiviles() {
        return estadosCiviles;
    }
    */
    
    // creo que no se ocupa
      public void setActivos(List<Activo> bienes) {
        List<Bien> es;
      //  this.bienes = new DefaultComboBoxModel(estadosCiviles.toArray());
        this.commit();    
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
