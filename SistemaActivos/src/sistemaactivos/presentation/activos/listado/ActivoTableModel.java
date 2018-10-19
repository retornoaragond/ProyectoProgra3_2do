/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaactivos.presentation.activos.listado;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import sistemaactivos.logic.Activo;

/**
 *
 * @author CarlosAndrés
 */
public class ActivoTableModel extends AbstractTableModel {
    List<Activo>rows;
    int[] cols;
   
   public ActivoTableModel(int[] cols, List<Activo> rows) {
        this.cols = cols;
        this.rows = rows;
        initColNames();
    }

    public int getColumnCount() {
        return cols.length;
    } 
    
     public String getColumnName(int col) {
        return colNames[cols[col]];
    }

    /*
    public Class<?> getColumnClass(int col){
        switch (cols[col]){
           // case SEXO: return Icon.class;
           // case PASATIEMPO_CINE: return Boolean.class;
           // case ESTADO_CIVIL: return Icon.class;
            default: return super.getColumnClass(col);
        }    
    }    
     */
   
     public int getRowCount() {
        return rows.size();
    }

      public Object getValueAt(int row, int col) {
        Activo activo = rows.get(row);
        switch (cols[col]) {
            case CODIGOID: return activo.getCodigoId();
            case BIEN: return activo.getBien();
            case LABORACTIVO: return activo.getLaborActivo();
            default:
                return "";
        }
    }

    public Activo getRowAt(int row) {
        return rows.get(row);
    } 
     
   
    
    public static final int CODIGOID = 0;
    public static final int BIEN = 1;
    public static final int LABORACTIVO = 2;
    
       

     String[] colNames = new String[10];

    private void initColNames() {
        colNames[CODIGOID] = "codigoId";
        colNames[BIEN] = "bien";
        colNames[LABORACTIVO] = "laborActivo";
         }
     
     
     
     
     
    
}
