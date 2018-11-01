/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaactivos.presentation.funcionarios.listado;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import sistemaactivos.logic.Funcionario;

/**
 *
 * @author diego
 */
public class FuncionarioTableModel extends AbstractTableModel {

    List<Funcionario> rows;
    int[] cols;
    
    public FuncionarioTableModel(int[] cols, List<Funcionario> rows) {
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
   
    @Override
    public int getRowCount() {
       return rows.size();   
    }
    
    public Object getValueAt(int row, int col) {
        Funcionario funcionario = rows.get(row);
        switch (cols[col]) {
            case ID:
                return funcionario.getId();
            case NOMBRE:
                return funcionario.getNombre();
            case SOLICITUDES:
                return funcionario.getSolicituds();
            default:
                return "";
        }
    }
     public Funcionario getRowAt(int row) {
        return rows.get(row);
    }
    
    public static final int ID = 0;
    public static final int NOMBRE = 1;
    public static final int SOLICITUDES = 2;
   // public static final int LABORS = 3;
    

    String[] colNames = new String[3];
    
    private void initColNames() {
        colNames[ID] = "numSolicitud";
        colNames[NOMBRE] = "dependencia";
        colNames[SOLICITUDES] = "funcionario";
     //   colNames[LABORS] = "fecha";
        
    }
    
    
    

   
    
    
    
}
