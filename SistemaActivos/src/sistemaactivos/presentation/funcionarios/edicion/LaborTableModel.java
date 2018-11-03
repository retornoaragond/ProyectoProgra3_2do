/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaactivos.presentation.funcionarios.edicion;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import sistemaactivos.logic.Labor;

/**
 *
 * @author diego
 */
public class LaborTableModel extends AbstractTableModel {

    List<Labor> rows;
    int cols[];

    public LaborTableModel(int[] cols, List<Labor> rows) {
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

    @Override
    public String getColumnName(int col) {
        return colNames[cols[col]];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Labor labor = rows.get(rowIndex);
        switch (cols[columnIndex]) {
            case DEPENDENCIA:
                return labor.getDependencia();
            case PUESTO:
                return labor.getPuesto();
            default:
                return "";
        }
    }

    public static final int DEPENDENCIA = 0;
    public static final int PUESTO = 1;


    String[] colNames = new String[2];

    private void initColNames() {
        colNames[DEPENDENCIA] = "Dependencia";
        colNames[PUESTO] = "Puesto";
    }

}
