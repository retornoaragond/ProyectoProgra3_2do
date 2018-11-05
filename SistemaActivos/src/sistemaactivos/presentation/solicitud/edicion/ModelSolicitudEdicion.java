/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaactivos.presentation.solicitud.edicion;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import sistemaactivos.SistemaActivos;
import sistemaactivos.logic.Bien;
import sistemaactivos.logic.Funcionario;
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
    ComboBoxModel<Funcionario> combo;
    
    public ComboBoxModel<Funcionario> getFuncioCom(){
        return this.combo;
    }
    
    public void setCombo(List<Funcionario> Tipo){
        this.combo=new DefaultComboBoxModel(Tipo.toArray());
        this.commit();
    }
    
    public void resetCombo(List<Funcionario> TA){
    this.setCombo(TA);
    this.setCurrent(new Solicitud());
    }

    public void addBien(Bien bien){
        this.current.getBiens().add(bien);
    }
    
    public ModelSolicitudEdicion() {
        this.reset();
    }

    public void reset(int modo, Solicitud current) {
        this.setModo(modo);
        this.setCurrent(current);
        List<Bien> rows;
        if(current.equals(new Solicitud())){
             rows = new ArrayList<>();
        }else{
             rows = new ArrayList<>(current.getBiens());
        }
        this.bienselecionado = null;
        this.setBientable(rows);
        this.commit();
    }

    public void reset() {
        this.reset(SistemaActivos.MODO_AGREGAR, new Solicitud());
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
