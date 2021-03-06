/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaactivos.presentation.funcionarios.edicion;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import sistemaactivos.logic.Solicitud;

/**
 *
 * @author diego
 */
public class SolicitudesTableModel extends AbstractTableModel {

    List<Solicitud> rows;
    int[] cols;

    public SolicitudesTableModel(int[] cols, List<Solicitud> rows) {
        this.cols = cols;
        this.rows = rows;
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

    public String getColumnName(int col) {
        return colNames[cols[col]];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Solicitud soli = rows.get(rowIndex);
        switch (cols[columnIndex]) {
            case NUMSOLICITUD:
                return soli.getNumsol();
            case DEPENDENCIA:
                return soli.getDependencia();
            default:
                return "";
        }
    }

    public static final int NUMSOLICITUD = 0;
    public static final int DEPENDENCIA = 1;

    String[] colNames = new String[2];

    private void initColNames() {
        colNames[NUMSOLICITUD] = "Numero de Solicitud";
        colNames[DEPENDENCIA] = "Dependencia";
    }

}
