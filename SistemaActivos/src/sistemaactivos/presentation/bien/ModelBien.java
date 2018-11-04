/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaactivos.presentation.bien;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import sistemaactivos.SistemaActivos;
import sistemaactivos.logic.Bien;
import sistemaactivos.logic.Categoria;

/**
 *
 * @author CarlosAndrés
 */
public class ModelBien extends java.util.Observable {
    Bien current = new Bien();
    Bien bienselecionado;
    int modo;
    ComboBoxModel<Categoria> categorias;



      public ModelBien() {
        this.reset();
    }

    public void reset(int modo, Bien current) {
        this.setModo(modo);
        this.setCurrent(current);
        List<Bien> rows = new ArrayList<>();
        this.bienselecionado = null;
        this.commit();
    }
    
    public void reset(){
        this.reset(SistemaActivos.MODO_AGREGAR,new Bien());
    }

   

    public Bien getBienselecionado() {
        return bienselecionado;
    }

    public void setBienselecionado(Bien bienselecionado) {
        this.bienselecionado = bienselecionado;
    }

    public Bien getCurrent() {
        return current;
    }

    public void setCurrent(Bien current) {
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
    
    public ComboBoxModel<Categoria> getCategoria(){
        return categorias;
    }
    
    public void setCategorias(List<Categoria> cat ){
    this.categorias= new DefaultComboBoxModel(cat.toArray());
    this.commit();
    }
    
    void resetC(List<Categoria> cat){
    this.setCategorias(cat);
    this.setCurrent(new Bien());
    }


    

}