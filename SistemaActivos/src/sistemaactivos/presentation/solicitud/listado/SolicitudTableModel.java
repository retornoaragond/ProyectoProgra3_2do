/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaactivos.presentation.solicitud.listado;

import java.util.List;
import sistemaactivos.logic.Solicitud;

/**
 *
 * @author CarlosAndrés
 */
public class SolicitudTableModel {
 
    List<Solicitud> rows;
    int[] cols;
    
    
    public SolicitudTableModel(int[] cols, List<Solicitud> rows){
        this.cols=cols;
        this.rows=rows;
        initColNames();
    }
    
    
    
    public int getColumnCount() {
         return cols.length;
    }

     public String getColumnName(int col){
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
        Solicitud solicitud= rows.get(row);
        switch(cols[col]){
           case NUMSOLICITUD: return solicitud.getNumSolicitud();
           case DEPENDENCIA: return solicitud.getDependencia();
           case FUNCIONARIO: return solicitud.getFuncionario();
           case NUMCOMPROBANTE: return solicitud.getNumComprobante();
           case FECHA: return solicitud.getFecha();
           case TIPOADQUISICION: return solicitud.getTipoAdquisicion();
           case CANTIDADBIENES: return solicitud.getCantidadBienes();
           case MONTOTOTAL: return solicitud.getMontoTotal();
           case RAZONRECHAZO: return solicitud.getRazonRechazo();
           case ESTADO: return solicitud.getEstado();
           default: return "";
          }
    }   
    
    public Solicitud getRowAt(int row) {
        return rows.get(row);
    }
    
    public static final int NUMSOLICITUD=0;
    public static final int DEPENDENCIA=1;
    public static final int FUNCIONARIO=2;
    public static final int NUMCOMPROBANTE=3;
    public static final int FECHA=4;              
    public static final int TIPOADQUISICION=5;
    public static final int CANTIDADBIENES=6;
    public static final int MONTOTOTAL=7;
    public static final int RAZONRECHAZO=8;
    public static final int ESTADO=9;
     
    
    String[] colNames = new String[10];
    private void initColNames(){
        colNames[NUMSOLICITUD]= "numSolicitud";
        colNames[DEPENDENCIA]= "dependencia";
        colNames[FUNCIONARIO]= "funcionario";
        colNames[NUMCOMPROBANTE]= "numComprobante";
        colNames[FECHA]= "fecha";
        colNames[TIPOADQUISICION]= "tipoAdquisicion";
        colNames[CANTIDADBIENES]= "cantidadBienes";
        colNames[MONTOTOTAL]= "montoTotal";
        colNames[RAZONRECHAZO]= "razonRechazo";
        colNames[ESTADO]= "estado";
      }
   
    
}

