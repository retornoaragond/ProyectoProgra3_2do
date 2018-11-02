/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaactivos.presentation.dependencias.listado;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;
import sistemaactivos.logic.Dependencia;


/**
 *
 * @author ExtremeTech
 */
public class ModelDependenciasListado  extends java.util.Observable {
    Dependencia filter; 
    DependenciaTableModel dependenciasTable;
    Dependencia seleccionado;

    
    
    
  public ModelDependenciasListado(){
     this.reset();
   }

  public void reset(){ 
        filter = new Dependencia();
        List<Dependencia> rows = new ArrayList<>();        
        seleccionado=null;  
        this.setDependencia(rows);
        this.commit();  
    }
   
  
  public void setDependencia(List<Dependencia> dependencias){
        int[] cols={DependenciaTableModel.CODIGO,DependenciaTableModel.NOMBRE,DependenciaTableModel.LABORS,DependenciaTableModel.SOLICITUDS};
        this.dependenciasTable =new DependenciaTableModel(cols,dependencias);    
    }
    
  
      
  
    public Dependencia getFilter() {
        return filter;
    }
    
    public void setFilter(Dependencia filter) {
        this.filter = filter;
    }
    
     public DependenciaTableModel getDependenciaTablemodel() {
        return dependenciasTable;
    }

    public Dependencia getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Dependencia seleccionado) {
        this.seleccionado = seleccionado;
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

