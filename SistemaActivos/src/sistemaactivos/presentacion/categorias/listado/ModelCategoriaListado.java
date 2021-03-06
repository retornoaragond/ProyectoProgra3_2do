/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaactivos.presentacion.categorias.listado;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;
import sistemaactivos.logic.Categoria;
import sistemaactivos.presentation.dependencias.listado.DependenciaTableModel;

/**
 *
 * @author diego
 */
public class ModelCategoriaListado extends java.util.Observable{
    
    Categoria filter; 
    CategoriaTableModel CategoriaTable;
    Categoria seleccionado;
    
    public ModelCategoriaListado(){
     this.reset();
   }

  public void reset(){ 
        filter = new Categoria();
        List<Categoria> rows = new ArrayList<>();        
        seleccionado=null;  
        
        this.setDependencia(rows);
        this.commit();  
    }
   
  
  public void setDependencia(List<Categoria> catego){
        int[] cols={CategoriaTableModel.ID,DependenciaTableModel.CODIGO};
        this.CategoriaTable =new CategoriaTableModel(cols,catego);    
         this.commit();
  
}
  
  public Categoria getFilter() {
        return filter;
    }
    
    public void setFilter(Categoria filter) {
        this.filter = filter;
    }
    
     public CategoriaTableModel getCategoriaTablemodel() {
        return CategoriaTable;
    }
 
    public Categoria getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Categoria seleccionado) {
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
