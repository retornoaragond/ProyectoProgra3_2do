/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaactivos.presentation.activos.listado;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.Barcode128;
import com.itextpdf.text.pdf.Barcode39;
import com.itextpdf.text.pdf.PdfWriter;
 import java.awt.Point;
 import java.util.List;
 import sistemaactivos.Session;
 import sistemaactivos.SistemaActivos;
 import sistemaactivos.logic.Activo;
 import sistemaactivos.logic.ModelLogic;
 

   import java.io.File;
import java.io.FileNotFoundException;
   import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
  import net.sourceforge.barbecue.Barcode;
import net.sourceforge.barbecue.BarcodeException;
import net.sourceforge.barbecue.BarcodeFactory;
import net.sourceforge.barbecue.BarcodeImageHandler;


/**
 *
 * @author ExtremeTech
 */
public class ControllerActivosListado {

    ModelLogic domainModel;
    Session session;
    ViewActivosListado view;
    ModelActivosListado model;

    public void controllerEdicionShow() {
        SistemaActivos.ACTIVOS_EDICION_CONTROLLER.show();
    }

    public ControllerActivosListado(ViewActivosListado view, ModelActivosListado model, ModelLogic domainModel, Session session) {
        this.domainModel = domainModel;
        this.session = session;
        this.view = view;
        this.model = model;
        view.setController(this);
        view.setModel(model);
    }

    public void buscar(String filter,int rbselect) throws Exception {
        model.setRbselect(rbselect);
        model.setFilter(filter);
        this.refrescarBusqueda();
    }
    
    
    public void buscarActivo(){
     SistemaActivos.ACTIVOS_EDICION_CONTROLLER.show();
    }
    
    
    public void refrescarBusqueda() throws Exception {
        List<Activo> rows = domainModel.searchActivo(model.getFilter(),model.rbselect);//hacer en el modelLogic delete activo
        model.setActivos(rows);
        model.commit();
        if (rows.isEmpty()) {
            throw new Exception("Ningún dato coincide");
        }
    }

    
   public void editar(int row, Point at){       
       model.setSeleccionado(model.activosTable.getRowAt(row));
       int modo;
       modo=SistemaActivos.MODO_EDITAR;            
       SistemaActivos.ACTIVOS_EDICION_CONTROLLER.reset(modo, model.activoSeleccionado);
       SistemaActivos.ACTIVOS_EDICION_CONTROLLER.show(at);
    }
     
    public void borrar(int row) {
        Activo seleccionada = model.getActivos().getRowAt(row);
        try {
            domainModel.deleteActivo(seleccionada);
        } catch (Exception ex) {
        }
        List<Activo> rowsMod = domainModel.searchActivo(model.getFilter(),model.rbselect);
        model.setActivos(rowsMod);
        model.commit();
    }

    public void reset() {
        model.reset();
    }

    public void show() {
        view.setVisible(true);
    }

    public void show(Point position) {
        view.setLocation(position);
        this.show();
    }

    public void hide() {
        view.setVisible(false);
    }

// public void CodigoB() {
//
//        List<Activo> listaAct = new ArrayList<>();
//        listaAct = model.activosTable.getRows();
//
//        for (Activo activo : listaAct) {
//
//            try {
//               Document doc=new Document();
//               PdfWriter pdf=PdfWriter.getInstance(doc, new FileOutputStream("codigo.pdf"));
//               doc.open();
//               
//               Barcode128 code= new Barcode128();
//               String strCode = activo.getCodigoId().toString();///   se toma el valor del bien
//
//               code.setCode(strCode);
//               Image img= code.createImageWithBarcode(pdf.getDirectContent(), BaseColor.BLACK, BaseColor.BLACK);
//               
//               doc.add(img);
//               doc.close();
//               
//                } catch (FileNotFoundException ex) {
//                    Logger.getLogger(ControllerActivosListado.class.getName()).log(Level.SEVERE, null, ex);
//                } catch (DocumentException ex) {
//                    Logger.getLogger(ControllerActivosListado.class.getName()).log(Level.SEVERE, null, ex);
//                }
//               }
//          }
//    
       public void CodigoB() {

        List<Activo> listaAct = new ArrayList<>();
        listaAct = model.activosTable.getRows();

        for (Activo activo : listaAct) {

            Barcode barcode = null;
            String strCode = activo.getCodigoId();///   se toma el valor del bien

            try { 
                barcode = BarcodeFactory.createCode128(strCode);
            } catch (BarcodeException e) {
            }
            barcode.setDrawingText(true);
            barcode.setBarWidth(2);
            barcode.setBarHeight(60);

            try {
                String strFileName = "C:\\Users\\CarlosAndrés\\Documents\\NetBeansProjects\\ProyectoProgra3_2do\\SistemaActivos\\codigos"+strCode +".PNG";
                File file = new File(strFileName);
                FileOutputStream fos = new FileOutputStream(file);
                BarcodeImageHandler.writePNG(barcode, fos);
                System.out.println("Archivo creado: " + strFileName);
            } catch (Exception ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
    }
}


    


