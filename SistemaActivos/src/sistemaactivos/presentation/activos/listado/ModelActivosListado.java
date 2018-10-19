/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaactivos.presentation.activos.listado;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;
import sistemaactivos.logic.Activo;
import sistemaactivos.presentation.activos.edicion.*;

/**
 *
 * @author ExtremeTech
 */
public class ModelActivosListado extends java.util.Observable {
  Activo filter;
  ActivoTableModel activosTable;
  Activo activoSeleccionado;
    
   
  public ModelActivosListado() {
        this.reset();
    }

    public void reset(){ 
        filter = new Activo();
        List<Activo> rows = new ArrayList<>();        
        activoSeleccionado=null;  
        this.setActivos(rows);
        this.commit();  
    }
    
    
    public void setActivos(List<Activo> activos){
       int[] cols={ActivoTableModel.CODIGOID,ActivoTableModel.BIEN,ActivoTableModel.LABORACTIVO};
      this.activosTable =new ActivoTableModel(cols,activos);    
    }
    
    public Activo getFilter() {
        return filter;
    }
    
    public void setFilter(Activo filter) {
        this.filter = filter;
    }
    
    
    public ActivoTableModel getActivos() {
        return activosTable;
    }
  
    public Activo getSeleccionado() {
        return activoSeleccionado;
    }

    public void setSeleccionado(Activo seleccionado) {
        this.activoSeleccionado = seleccionado;
    }
  
    @Override
    public void addObserver(Observer o) {
        super.addObserver(o);
        this.commit();   
    }

    public void commit(){
        setChanged();
        notifyObservers();       
    }

  
  
}
