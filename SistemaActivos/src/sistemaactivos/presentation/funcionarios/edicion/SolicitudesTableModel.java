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

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
      public String getColumnName(int col) {
        return colNames[cols[col]];
    }
      
      public Solicitud getRowAt(int row) {
        return rows.get(row);
    }
      
       public static final int CANTIDADBIENES = 0;
       public static final int NUMSOLICITUD = 1;
       
       String[] colNames = new String[2];
       
        private void initColNames() {
        colNames[NUMSOLICITUD] = "numSolicitud";
        colNames[CANTIDADBIENES] = "cantidadBienes";
        
    }
}
