/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaactivos.presentation.solicitud.listado;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumnModel;
import sistemaactivos.SistemaActivos;
import sistemaactivos.logic.Solicitud;
import sistemaactivos.logic.Usuario;

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

    @Override
    public void update(java.util.Observable updatedModel, Object parametros) {
        this.limpiarErrores();
        Solicitud soli = model.getFilter();
        this.fromSolicitud(soli);
        solicitudesFld.setModel(model.getSolicitudes());
        this.tablasegunuser();
    }

    public void tablasegunuser() {
        Usuario user = (Usuario) controller.session.getAttribute(SistemaActivos.USER_ATTRIBUTE);
        if (user != null) {
            switch (user.getLabor().getPuesto().getPuesto()) {
                case "Administrador":
                    TableColumnModel tcm = solicitudesFld.getColumnModel();
                    tcm.getColumn(SolicitudTableModel.DEPENDENCIA).setMinWidth(0);
                    tcm.getColumn(SolicitudTableModel.DEPENDENCIA).setMaxWidth(0);
                    tcm.getColumn(SolicitudTableModel.DEPENDENCIA).setWidth(0);
                    tcm.getColumn(SolicitudTableModel.FUNCIONARIO).setMinWidth(0);
                    tcm.getColumn(SolicitudTableModel.FUNCIONARIO).setMaxWidth(0);
                    tcm.getColumn(SolicitudTableModel.FUNCIONARIO).setWidth(0);
                    break;
                case "Secretariado":
                    TableColumnModel tcm1 = solicitudesFld.getColumnModel();

                    tcm1.getColumn(SolicitudTableModel.FUNCIONARIO).setMinWidth(0);
                    tcm1.getColumn(SolicitudTableModel.FUNCIONARIO).setMaxWidth(0);
                    tcm1.getColumn(SolicitudTableModel.FUNCIONARIO).setWidth(0);

                    tcm1.getColumn(SolicitudTableModel.FECHA).setMinWidth(0);
                    tcm1.getColumn(SolicitudTableModel.FECHA).setMaxWidth(0);
                    tcm1.getColumn(SolicitudTableModel.FECHA).setWidth(0);

                    tcm1.getColumn(SolicitudTableModel.CANTIDADBIENES).setMinWidth(0);
                    tcm1.getColumn(SolicitudTableModel.CANTIDADBIENES).setMaxWidth(0);
                    tcm1.getColumn(SolicitudTableModel.CANTIDADBIENES).setWidth(0);

                    tcm1.getColumn(SolicitudTableModel.MONTOTOTAL).setMinWidth(0);
                    tcm1.getColumn(SolicitudTableModel.MONTOTOTAL).setMaxWidth(0);
                    tcm1.getColumn(SolicitudTableModel.MONTOTOTAL).setWidth(0);
                    break;

                case "Registrador":
                    TableColumnModel tcm2 = solicitudesFld.getColumnModel();
                    tcm2.getColumn(SolicitudTableModel.FUNCIONARIO).setMinWidth(0);
                    tcm2.getColumn(SolicitudTableModel.FUNCIONARIO).setMaxWidth(0);
                    tcm2.getColumn(SolicitudTableModel.FUNCIONARIO).setWidth(0);

                    tcm2.getColumn(SolicitudTableModel.FECHA).setMinWidth(0);
                    tcm2.getColumn(SolicitudTableModel.FECHA).setMaxWidth(0);
                    tcm2.getColumn(SolicitudTableModel.FECHA).setWidth(0);

                    tcm2.getColumn(SolicitudTableModel.TIPOADQUISICION).setMinWidth(0);
                    tcm2.getColumn(SolicitudTableModel.TIPOADQUISICION).setMaxWidth(0);
                    tcm2.getColumn(SolicitudTableModel.TIPOADQUISICION).setWidth(0);

                    tcm2.getColumn(SolicitudTableModel.MONTOTOTAL).setMinWidth(0);
                    tcm2.getColumn(SolicitudTableModel.MONTOTOTAL).setMaxWidth(0);
                    tcm2.getColumn(SolicitudTableModel.MONTOTOTAL).setWidth(0);
                    break;
                default:
                    break;
            }
        }
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

        jPanel1 = new javax.swing.JPanel();
        etiquetaNumerodeSolicitud = new javax.swing.JLabel();
        textFieldNumSolicitud = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        PorVerificarCB = new javax.swing.JCheckBox();
        RechazadaCB = new javax.swing.JCheckBox();
        RecibidaCB = new javax.swing.JCheckBox();
        ProcesadaCB = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Agregar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        solicitudesFld = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        Salir = new javax.swing.JButton();

        setTitle("SOLICITUDES");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        etiquetaNumerodeSolicitud.setText("Numero de Solicitud ");

        textFieldNumSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNumSolicitudActionPerformed(evt);
            }
        });

        buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemaactivos/presentation/icons/iconbuscar.png"))); // NOI18N
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        PorVerificarCB.setText("PorVerificar");

        RechazadaCB.setText("Rechazadas");

        RecibidaCB.setText("Recibidas");
        RecibidaCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecibidaCBActionPerformed(evt);
            }
        });

        ProcesadaCB.setText("Procesada");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Busqueda");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(etiquetaNumerodeSolicitud)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldNumSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 58, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RecibidaCB)
                            .addComponent(PorVerificarCB))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ProcesadaCB)
                            .addComponent(RechazadaCB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaNumerodeSolicitud)
                    .addComponent(textFieldNumSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RecibidaCB)
                            .addComponent(RechazadaCB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PorVerificarCB)
                            .addComponent(ProcesadaCB, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemaactivos/presentation/icons/iconagregararchivo.png"))); // NOI18N
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemaactivos/presentation/icons/iconeliminar.png"))); // NOI18N
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

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Solicitudes");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(508, 508, 508)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(Agregar)
                        .addGap(58, 58, 58)
                        .addComponent(Eliminar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemaactivos/presentation/icons/iconsalir.png"))); // NOI18N
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(379, 379, 379)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(407, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Salir)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Salir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EliminarActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        /*  try {
            //   controller.preAgregar(this.agregarFld.getLocationOnScreen());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }*/

        /// controller.
        controller.SolicitudEdicionShow();
    }//GEN-LAST:event_AgregarActionPerformed

    private void textFieldNumSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNumSolicitudActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNumSolicitudActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        if (this.validar()) {
            try {
                controller.buscar(this.toSolicitud(), this.filtrosSeleccionados());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe indicar algún dato", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void RecibidaCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecibidaCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RecibidaCBActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        controller.hide();
    }//GEN-LAST:event_SalirActionPerformed

    public void fromSolicitud(Solicitud s) {
        if (s.getNumsol() != 0) {
            textFieldNumSolicitud.setText(Integer.toString(s.getNumsol()));
        } else {
            textFieldNumSolicitud.setText("");
        }
        Usuario user = (Usuario) controller.session.getAttribute(SistemaActivos.USER_ATTRIBUTE);
        if (user != null) {
            if (!"Administrador".equals(user.getLabor().getPuesto().getPuesto())) {
                this.Agregar.setVisible(false);
                this.Eliminar.setVisible(false);
            } else {
                this.Agregar.setVisible(true);
                this.Eliminar.setVisible(true);
            }
        }

    }

    Solicitud toSolicitud() {
        Solicitud result = new Solicitud();
        if (!textFieldNumSolicitud.getText().isEmpty()) {
            result.setNumsol(Integer.parseInt(textFieldNumSolicitud.getText()));
        }
        return result;
    }

    public List<String> filtrosSeleccionados() {
        List<String> l = new ArrayList<>();
        if (this.PorVerificarCB.isSelected()) {
            l.add("PorVerificar");
        }
        if (this.ProcesadaCB.isSelected()) {
            l.add("Procesada");
        }
        if (this.RechazadaCB.isSelected()) {
            l.add("Rechazada");
        }
        if (this.RecibidaCB.isSelected()) {
            l.add("Recibida");
        }
        return l;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JCheckBox PorVerificarCB;
    private javax.swing.JCheckBox ProcesadaCB;
    private javax.swing.JCheckBox RechazadaCB;
    private javax.swing.JCheckBox RecibidaCB;
    private javax.swing.JButton Salir;
    private javax.swing.JButton buscar;
    private javax.swing.JLabel etiquetaNumerodeSolicitud;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable solicitudesFld;
    private javax.swing.JTextField textFieldNumSolicitud;
    // End of variables declaration//GEN-END:variables
}
