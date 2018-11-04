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

    List<Activo> rows;
    int[] cols;

    public ActivoTableModel(int[] cols, List<Activo> rows) {
        this.cols = cols;
        this.rows = rows;
        initColNames();
    }

    @Override
    public int getColumnCount() {
        return cols.length;
    }

    @Override
    public String getColumnName(int col) {
        return colNames[cols[col]];
    }

    /*
    public Class<?> getColumnClass(int col){
        switch (cols[col]){
            case CODIGOID: return ;
            case BIEN: return Boolean.class;
            case ESTADO_CIVIL: return Icon.class;
            default: return super.getColumnClass(col);
        }    
    }    
     */
    @Override
    public int getRowCount() {
        return rows.size();
    }

    @Override
    public Object getValueAt(int row, int col) {
        Activo activo = rows.get(row);
        switch (cols[col]) {
            case CODIGO:
                return activo.getCodigoId();
            case DESCRIPCION:
                return activo.getBien().getDescripcion();
            case CATEGORIA:
                return activo.getBien().getCategoria().getDescripcion();
            case DEPENDENCIA:
                return activo.getLabor().getDependencia().getNombre();
            case RESPONSABLE:
                return activo.getLabor().getFuncionario().getNombre();
            default:
                return "";
        }
    }

    public Activo getRowAt(int row) {
        return rows.get(row);
    }

    public static final int CODIGO = 0;
    public static final int DESCRIPCION = 1;
    public static final int CATEGORIA = 2;
    public static final int DEPENDENCIA = 3;
    public static final int RESPONSABLE = 4;

    String[] colNames = new String[5];

    private void initColNames() {
        colNames[CODIGO] = "Codigo";
        colNames[DESCRIPCION] = "Descripcion";
        colNames[CATEGORIA] = "Categoria";
        colNames[DEPENDENCIA] = "Dependencia";
        colNames[RESPONSABLE] = "Responsable";
    }

}
