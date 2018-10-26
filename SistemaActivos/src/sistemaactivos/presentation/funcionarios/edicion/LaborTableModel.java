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
public class LaborTableModel extends AbstractTableModel{
    List<Labor> rows;
    int cols[];
    
    public LaborTableModel(int[] cols, List<Labor> rows) {
        this.cols = cols;
        this.rows = rows;
        initColNames();
    }
       
    
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
        Labor labor= rows.get(rowIndex);
             switch (cols[columnIndex]) {
                 case ID:
                     return labor.getId();
                 case DEPENDENCIA:
                     return labor.getDependencia();
                 case FUNCIONARIO:
                     return labor.getFuncionario();
                 case PUESTO:
                     return labor.getPuesto();
                 case ACTIVOS:
                     return labor.getActivos();
                 default:
                     return "";
             }
    
    
    }
    
    public static final int ID=0;
    public static final int DEPENDENCIA=1;
    public static final int FUNCIONARIO=2;
    public static final int PUESTO=3;
    public static final int ACTIVOS=4;
    
    String[] colNames = new String[5];
    
    private void initColNames(){
    colNames[ID]="ID";
    colNames[DEPENDENCIA]="Dependencia";
    colNames[FUNCIONARIO]="Funcionario";
    colNames[PUESTO]="Puesto";
    colNames[ACTIVOS]="Activos";
    }
            



    
    
}
