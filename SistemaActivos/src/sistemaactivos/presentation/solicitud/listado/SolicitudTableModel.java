/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaactivos.presentation.solicitud.listado;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import sistemaactivos.logic.Solicitud;

/**
 *
 * @author CarlosAndrés
 */
public class SolicitudTableModel extends AbstractTableModel {

    List<Solicitud> rows;
    int[] cols;

    public SolicitudTableModel(int[] cols, List<Solicitud> rows) {
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

    @Override
    public int getRowCount() {
        return rows.size();
    }

    @Override
    public Object getValueAt(int row, int col) {
        Solicitud solicitud = rows.get(row);
        switch (cols[col]) {
            case NUMSOLICITUD:
                return solicitud.getNumsol();
            case DEPENDENCIA:
                return solicitud.getDependencia();
            case FUNCIONARIO:
                return solicitud.getFuncionario();
            case NUMCOMPROBANTE:
                return solicitud.getNumcomp();
            case FECHA:
                return solicitud.getFecha();
            case TIPOADQUISICION:
                return solicitud.getTipoadq();
            case CANTIDADBIENES:
                return solicitud.getCantbien();
            case MONTOTOTAL:
                return solicitud.getMontotal();
            case ESTADO:
                return solicitud.getEstado();
            default:
                return "";
        }
    }

    public Solicitud getRowAt(int row) {
        return rows.get(row);
    }

    public static final int NUMSOLICITUD = 0;
    public static final int DEPENDENCIA = 1;
    public static final int FUNCIONARIO = 2;
    public static final int NUMCOMPROBANTE = 3;
    public static final int FECHA = 4;
    public static final int TIPOADQUISICION = 5;
    public static final int CANTIDADBIENES = 6;
    public static final int MONTOTOTAL = 7;
    public static final int ESTADO = 8;

    String[] colNames = new String[9];

    private void initColNames() {
        colNames[NUMSOLICITUD] = "Numero de Solicitud";
        colNames[DEPENDENCIA] = "Dependencia";
        colNames[FUNCIONARIO] = "Registrador";
        colNames[NUMCOMPROBANTE] = "Numero de Comprobante";
        colNames[FECHA] = "Fecha";
        colNames[TIPOADQUISICION] = "Tipo de Adquisicion";
        colNames[CANTIDADBIENES] = "Cantidad de Bienes";
        colNames[MONTOTOTAL] = "Monto Total";
        colNames[ESTADO] = "Estado";
    }

}
