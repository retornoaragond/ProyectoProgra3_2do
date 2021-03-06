/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaactivos.presentation.solicitud.edicion;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import sistemaactivos.logic.Bien;

/**
 *
 * @author ExtremeTech
 */
public class BienTableModel extends AbstractTableModel {

    List<Bien> rows;
    int[] cols;
    String[] colNames = new String[6];

    public static final int SERIAL = 0;
    public static final int DESCRIPCION = 1;
    public static final int MARCA = 2;
    public static final int MODELO = 3;
    public static final int PRECIOUNITARIO = 4;
    public static final int CANTIDAD = 5;

    public BienTableModel(List<Bien> rows, int[] cols) {
        this.rows = rows;
        this.cols = cols;
        initColNames();
    }

    @Override
    public int getRowCount() {
        return rows.size();
    }

    @Override
    public int getColumnCount() {
        return cols.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Bien bien = rows.get(rowIndex);
        switch (cols[columnIndex]) {
            case SERIAL:
                return bien.getSerial();
            case DESCRIPCION:
                return bien.getDescripcion();
            case MARCA:
                return bien.getMarca();
            case MODELO:
                return bien.getModelo();
            case PRECIOUNITARIO:
                return bien.getPrecioU();
            case CANTIDAD:
                return bien.getCantidad();
            default:
                return "";
        }
    }

    @Override
    public String getColumnName(int col) {
        return colNames[cols[col]];
    }

    public Bien getRowAt(int row) {
        return rows.get(row);
    }

    private void initColNames() {
        colNames[SERIAL] = "Serial";
        colNames[DESCRIPCION] = "Descripcion";
        colNames[MARCA] = "Marca";
        colNames[MODELO] = "Modelo";
        colNames[PRECIOUNITARIO] = "Precio Unitario";
        colNames[CANTIDAD]="Cantidad";
    }

    public List<Bien> getRows() {
        return rows;
    }

    public void setRows(List<Bien> rows) {
        this.rows = rows;
    }
    
}
