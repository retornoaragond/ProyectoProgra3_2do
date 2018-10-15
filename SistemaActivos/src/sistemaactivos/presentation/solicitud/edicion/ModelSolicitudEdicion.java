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

/**
 *
 * @author ExtremeTech
 */
public class ModelSolicitudEdicion extends java.util.Observable {

    Bien bien;
    BienTableModel bientable;
    Bien bienselecionado;

    public ModelSolicitudEdicion() {
        this.reset();
    }

    public void reset() {
        bien = new Bien();
        List<Bien> rows = new ArrayList<>();
        bienselecionado = null;
        this.setBientable(rows);
        this.commit();
    }

    public Bien getBien() {
        return bien;
    }

    public void setBien(Bien bien) {
        this.bien = bien;
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
