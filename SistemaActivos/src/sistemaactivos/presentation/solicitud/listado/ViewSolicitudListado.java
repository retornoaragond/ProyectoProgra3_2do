/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaactivos.presentation.solicitud.listado;

import javax.swing.JOptionPane;
import sistemaactivos.SistemaActivos;
import sistemaactivos.logic.Solicitud;

/**
 *
 * @author ExtremeTech
 */
public class ViewSolicitudListado extends javax.swing.JInternalFrame implements java.util.Observer {

    ControllerSolicitudListado controller;
    ModelSolicitudListado model;

    public void setController(ControllerSolicitudListado controller) {
        this.controller = controller;
    }

    public ControllerSolicitudListado getController() {
        return controller;
    }

    public void setModel(ModelSolicitudListado model) {
        this.model = model;
        model.addObserver(this);
    }

    public ModelSolicitudListado getModel() {
        return model;
    }

    public ViewSolicitudListado() {
        super("", false, true);
        initComponents();
    }

    public void limpiarErrores() {
        this.etiquetaNumerodeSolicitud.setForeground(SistemaActivos.COLOR_OK);
    }

    boolean validar() {
        boolean error = false;

        this.etiquetaNumerodeSolicitud.setForeground(SistemaActivos.COLOR_OK);
        if (this.etiquetaNumerodeSolicitud.getText().isEmpty()) {
            this.etiquetaNumerodeSolicitud.setForeground(SistemaActivos.COLOR_ERROR);
            error = true;
        }
        return !error;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiquetaNumerodeSolicitud = new javax.swing.JLabel();
        textFieldNumSolicitud = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        Agregar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        solicitudesFld = new javax.swing.JTable();

        setTitle("Solicitudes");

        etiquetaNumerodeSolicitud.setText("Numero de Solicitud ");

        textFieldNumSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNumSolicitudActionPerformed(evt);
            }
        });

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        solicitudesFld.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(solicitudesFld);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaNumerodeSolicitud)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldNumSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                        .addComponent(Agregar)
                        .addGap(18, 18, 18)
                        .addComponent(Eliminar)
                        .addGap(36, 36, 36))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaNumerodeSolicitud)
                    .addComponent(textFieldNumSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar)
                    .addComponent(Agregar)
                    .addComponent(Eliminar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EliminarActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        try {
            //   controller.preAgregar(this.agregarFld.getLocationOnScreen());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_AgregarActionPerformed

    private void textFieldNumSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNumSolicitudActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNumSolicitudActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        if (this.validar()) {
            try {
                controller.buscar(this.toSolicitud());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe indicar algún dato", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buscarActionPerformed

    public void fromSolicitud(Solicitud s) {
        textFieldNumSolicitud.setText(s.getNumSolicitud().toString());
    }

    Solicitud toSolicitud() {
        Solicitud result = new Solicitud();
        result.setNumSolicitud(Integer.getInteger(textFieldNumSolicitud.getText()));
        return result;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton buscar;
    private javax.swing.JLabel etiquetaNumerodeSolicitud;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable solicitudesFld;
    private javax.swing.JTextField textFieldNumSolicitud;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(java.util.Observable updatedModel, Object parametros) {
        this.limpiarErrores();
        Solicitud soli = model.getSolicitud();
        this.fromSolicitud(soli);
        solicitudesFld.setModel(model.getSolicitudes());
    }
}
