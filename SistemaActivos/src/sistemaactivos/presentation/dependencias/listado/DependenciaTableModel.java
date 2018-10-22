/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaactivos.presentation.dependencias.listado;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import sistemaactivos.logic.Dependencia;

/**
 *
 * @author CarlosAndrés
 */
public class DependenciaTableModel extends AbstractTableModel {

    List<Dependencia> rows;
    int[] cols;

     public  DependenciaTableModel(int[] cols, List<Dependencia> rows){
        this.cols=cols;
        this.rows=rows;
        initColNames();
    }


    
    
    
    @Override
    public int getRowCount() {
       return rows.size();
    }

    public Object getValueAt(int row, int col) {
        Dependencia dependencia = rows.get(row);
        switch (cols[col]){
            case CODIGO: return dependencia.getCodigo();
            case NOMBRE: return dependencia.getNombre();
            case LABORS: return dependencia.getLabors();
            case SOLICITUDS: return dependencia.getSolicituds();
            default: return "";
        }
    }    

    @Override
    public int getColumnCount() {
           return colNames.length;
     }

    public String getColumnName(int col){
        return colNames[cols[col]];
    }
    
    
    public Class<?> getColumnClass(int col){
        switch (cols[col]){
            //case SEXO: return Icon.class;
             default: return super.getColumnClass(col);
        }    
    }    
    
    
    
    
    public Dependencia getRowAt(int row) {
        return rows.get(row);
    }
    
    public static final int CODIGO=0;
    public static final int NOMBRE=1;
    public static final int LABORS=2;
    public static final int SOLICITUDS=3;
    
    String[] colNames = new String[11];
    private void initColNames(){
        colNames[CODIGO]= "codigo";
        colNames[NOMBRE]= "nombre";
        colNames[LABORS]= "labors";
        colNames[SOLICITUDS]= "solicituds";
        }
    
    
    
    
    
    
    
    
    
}
