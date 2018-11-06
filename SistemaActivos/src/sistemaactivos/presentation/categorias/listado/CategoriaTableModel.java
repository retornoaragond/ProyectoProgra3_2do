/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaactivos.presentation.categorias.listado;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import sistemaactivos.logic.Categoria;

/**
 *
 * @author diego
 */
public class CategoriaTableModel extends AbstractTableModel {

     List<Categoria> rows;
    int[] cols;

    public CategoriaTableModel(int[] cols, List<Categoria> rows) {
        this.cols = cols;
        this.rows = rows;
        initColNames();
    }

    @Override
    public Object getValueAt(int row, int col) {
        Categoria cat = rows.get(row);
        switch (cols[col]) {
            case ID:
                return cat.getId();
            case DESCRIPCION:
               return cat.getDescripcion();
            default:
                return "";
        }
    }

    @Override
    public int getColumnCount() {
        return colNames.length;
    }

    @Override
    public String getColumnName(int col) {
        return colNames[cols[col]];
    }
    
     public Categoria getRowAt(int row) {
        return rows.get(row);
    }

    public static final int ID = 0;
    public static final int DESCRIPCION = 1;
//    public static final int LABORS = 2;
//    public static final int SOLICITUDS = 3;

    String[] colNames = new String[2];

    private void initColNames() {
        colNames[ID] = "ID";
        colNames[DESCRIPCION] = "Descripcion";
//        colNames[LABORS] = "Labors";
//        colNames[SOLICITUDS] = "Solicituds";
    }

    @Override
    public int getRowCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
 
    
}
