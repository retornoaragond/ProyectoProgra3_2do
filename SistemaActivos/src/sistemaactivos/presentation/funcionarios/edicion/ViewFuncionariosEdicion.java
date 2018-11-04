/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaactivos.presentation.funcionarios.edicion;

import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
import sistemaactivos.SistemaActivos;
import sistemaactivos.logic.Dependencia;
import sistemaactivos.logic.Funcionario;
import sistemaactivos.logic.Labor;
import sistemaactivos.logic.Puesto;
import sistemaactivos.logic.Usuario;

/**
 *
 * @author ExtremeTech
 */
public class ViewFuncionariosEdicion extends javax.swing.JDialog implements java.util.Observer {

    ControllerFuncionariosEdicion controller;
    ModelFuncionariosEdicion model;

    /**
     * Creates new form viewFuncionarios
     */
    public ViewFuncionariosEdicion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        guardarFld = new javax.swing.JButton();
        Guadarbtn = new javax.swing.JButton();
        Atras = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        NombreLabel = new javax.swing.JLabel();
        IDTextField = new javax.swing.JTextField();
        IDLabel = new javax.swing.JLabel();
        NombreTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        panelUser = new javax.swing.JPanel();
        UsuarioLabel = new javax.swing.JLabel();
        OperadorText = new javax.swing.JTextField();
        Contraseñatext = new javax.swing.JTextField();
        contraseñaLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panelLabores = new javax.swing.JPanel();
        Laborlabel = new javax.swing.JLabel();
        Dependencia = new javax.swing.JLabel();
        DependenciaCombo = new javax.swing.JComboBox();
        PuestoLabel = new javax.swing.JLabel();
        puestoCombo = new javax.swing.JComboBox();
        AgregarLabor = new javax.swing.JButton();
        EliminarButon = new javax.swing.JToggleButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        LaborTable = new javax.swing.JTable();
        panelSolicitudes = new javax.swing.JPanel();
        SolicitudLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        SolicitudTable = new javax.swing.JTable();

        guardarFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarFldActionPerformed(evt);
            }
        });

        setTitle("Funcionarios");

        Guadarbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemaactivos/presentation/icons/iconguardar.png"))); // NOI18N
        Guadarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuadarbtnActionPerformed(evt);
            }
        });

        Atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemaactivos/presentation/icons/iconsatras.png"))); // NOI18N
        Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        NombreLabel.setText("Nombre");

        IDLabel.setText("Identificacion");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Información Funcionario");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(IDLabel)
                    .addComponent(NombreLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IDTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addComponent(NombreTextField))
                .addGap(19, 19, 19))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDLabel)
                    .addComponent(IDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreLabel)
                    .addComponent(NombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelUser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        UsuarioLabel.setText("Operador");

        contraseñaLabel.setText("Contraseña");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Usuario");

        javax.swing.GroupLayout panelUserLayout = new javax.swing.GroupLayout(panelUser);
        panelUser.setLayout(panelUserLayout);
        panelUserLayout.setHorizontalGroup(
            panelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(contraseñaLabel)
                    .addComponent(UsuarioLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Contraseñatext)
                    .addComponent(OperadorText))
                .addContainerGap())
            .addGroup(panelUserLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelUserLayout.setVerticalGroup(
            panelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUserLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UsuarioLabel)
                    .addComponent(OperadorText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Contraseñatext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contraseñaLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelLabores.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Laborlabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Laborlabel.setText("Labor(es) que desempeña");
        Laborlabel.setToolTipText("");

        Dependencia.setText("Dependencia");

        PuestoLabel.setText("Puesto");

        puestoCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puestoComboActionPerformed(evt);
            }
        });

        AgregarLabor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemaactivos/presentation/icons/iconagragarFuncionario.png"))); // NOI18N
        AgregarLabor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarLaborActionPerformed(evt);
            }
        });

        EliminarButon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemaactivos/presentation/icons/iconeliminar.png"))); // NOI18N
        EliminarButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarButonActionPerformed(evt);
            }
        });

        LaborTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(LaborTable);

        javax.swing.GroupLayout panelLaboresLayout = new javax.swing.GroupLayout(panelLabores);
        panelLabores.setLayout(panelLaboresLayout);
        panelLaboresLayout.setHorizontalGroup(
            panelLaboresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLaboresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLaboresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
                    .addGroup(panelLaboresLayout.createSequentialGroup()
                        .addGroup(panelLaboresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Dependencia)
                            .addComponent(PuestoLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLaboresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DependenciaCombo, 0, 284, Short.MAX_VALUE)
                            .addComponent(puestoCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AgregarLabor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EliminarButon)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(panelLaboresLayout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(Laborlabel)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelLaboresLayout.setVerticalGroup(
            panelLaboresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLaboresLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(Laborlabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLaboresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLaboresLayout.createSequentialGroup()
                        .addGroup(panelLaboresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Dependencia)
                            .addComponent(DependenciaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLaboresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(puestoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PuestoLabel)))
                    .addComponent(AgregarLabor)
                    .addComponent(EliminarButon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelSolicitudes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        SolicitudLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SolicitudLabel.setText("Solicitudes");

        SolicitudTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(SolicitudTable);

        javax.swing.GroupLayout panelSolicitudesLayout = new javax.swing.GroupLayout(panelSolicitudes);
        panelSolicitudes.setLayout(panelSolicitudesLayout);
        panelSolicitudesLayout.setHorizontalGroup(
            panelSolicitudesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSolicitudesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelSolicitudesLayout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addComponent(SolicitudLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelSolicitudesLayout.setVerticalGroup(
            panelSolicitudesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSolicitudesLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(SolicitudLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Guadarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(Atras)
                .addGap(206, 206, 206))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(panelLabores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelSolicitudes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelLabores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelSolicitudes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Atras, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Guadarbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarFldActionPerformed
        if (this.validar()) {
            try {
                this.controller.guardar(this.toFuncionario());
                JOptionPane.showMessageDialog(this, "Datos registrados", "OK", JOptionPane.INFORMATION_MESSAGE);
                this.setVisible(false);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Error en datos", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_guardarFldActionPerformed

    private void GuadarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuadarbtnActionPerformed
        if (this.validar()) {
            try {
                this.controller.guardar(this.toFuncionario());
                JOptionPane.showMessageDialog(this, "Datos registrados", "OK", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Error en datos", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_GuadarbtnActionPerformed

    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
        controller.reset();
        this.setVisible(false);
    }//GEN-LAST:event_AtrasActionPerformed

    private void AgregarLaborActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarLaborActionPerformed
        if (this.validarLabor()) {
            try {
                Labor lab = new Labor();
                lab.setFuncionario(model.getCurrent());
                lab.setDependencia((Dependencia) this.DependenciaCombo.getSelectedItem());
                lab.setPuesto((Puesto) this.puestoCombo.getSelectedItem());
                controller.agregarLabor(lab);
                Usuario us = new Usuario();
                us.setId(this.OperadorText.getText());
                us.setPass(this.Contraseñatext.getText());
                us.setLabor(controller.getLabor(controller.getAutoIncremento()));
                controller.agregarUsuario(us);
                controller.reset(SistemaActivos.MODO_EDITAR, model.getCurrent());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Faltan Datos", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_AgregarLaborActionPerformed

    private void EliminarButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarButonActionPerformed
        int row = this.LaborTable.getSelectedRow();
        controller.borrar(row);
    }//GEN-LAST:event_EliminarButonActionPerformed

    private void puestoComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puestoComboActionPerformed
        Puesto p = (Puesto) this.puestoCombo.getSelectedItem();
        if (p.getPuesto().equals("Registrador")) {
            this.panelSolicitudes.setVisible(true);
        } else {
            this.panelSolicitudes.setVisible(false);
        }
        if (Arrays.asList("Administrador", "Secretariado", "Registrador", "Jefe OCCB", "Jefe RRHH").contains(p.getPuesto())) {
            this.panelUser.setVisible(true);
        } else {
            this.panelUser.setVisible(false);
        }
    }//GEN-LAST:event_puestoComboActionPerformed

    boolean validar() {
        boolean error = false;
        this.IDLabel.setForeground(SistemaActivos.COLOR_OK);
        if (this.IDTextField.getText().isEmpty()) {
            this.IDLabel.setForeground(SistemaActivos.COLOR_ERROR);
            error = true;
        }

        this.NombreLabel.setForeground(SistemaActivos.COLOR_OK);
        if (this.NombreTextField.getText().isEmpty()) {
            this.NombreLabel.setForeground(SistemaActivos.COLOR_ERROR);
            error = true;
        }
        return !error;
    }

    boolean isUser(String id) throws Exception {
        boolean error = false;
        List<Usuario> users = controller.getUsuarios();
        for (Usuario u : users) {
            if (id.equals(u.getId())) {
                return true;
            }
        }
        return false;
    }

    boolean validarLabor()  {
        boolean error = false;
        this.UsuarioLabel.setForeground(SistemaActivos.COLOR_OK);
        if (this.OperadorText.getText().isEmpty()) {
            this.UsuarioLabel.setForeground(SistemaActivos.COLOR_ERROR);
            error = true;
        } else {
            try {
                if (isUser(this.OperadorText.getText())) {
                    error = true;
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Ya existe un usario con ese Id", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        this.contraseñaLabel.setForeground(SistemaActivos.COLOR_OK);
        if (this.Contraseñatext.getText().isEmpty()) {
            this.contraseñaLabel.setForeground(SistemaActivos.COLOR_ERROR);
            error = true;
        }

        this.Dependencia.setForeground(SistemaActivos.COLOR_OK);
        if (this.DependenciaCombo.getSelectedIndex() == 0) {
            this.Dependencia.setForeground(SistemaActivos.COLOR_ERROR);
            error = true;
        }

        this.PuestoLabel.setForeground(SistemaActivos.COLOR_OK);
        if (this.puestoCombo.getSelectedIndex() == 0) {
            this.PuestoLabel.setForeground(SistemaActivos.COLOR_ERROR);
            error = true;
        }

        return !error;
    }

    Funcionario toFuncionario() {
        Funcionario result = new Funcionario();
        result.setId(this.IDTextField.getText());
        result.setNombre(this.NombreTextField.getText());
        return result;
    }

    Labor toLabor() {
        Labor result = new Labor();
        result.setDependencia((Dependencia) this.DependenciaCombo.getSelectedItem());
        result.setPuesto((Puesto) this.puestoCombo.getSelectedItem());
        result.setFuncionario(model.getCurrent());
        return result;
    }

    Usuario toUsuario() {
        Usuario result = new Usuario();
        result.setId(this.OperadorText.getText());
        result.setPass(this.Contraseñatext.getText());
        return result;
    }

    public void limpiarErrores() {
        this.IDLabel.setForeground(SistemaActivos.COLOR_OK);
        this.NombreLabel.setForeground(SistemaActivos.COLOR_OK);
        this.UsuarioLabel.setForeground(SistemaActivos.COLOR_OK);
        this.contraseñaLabel.setForeground(SistemaActivos.COLOR_OK);
    }

    public void setController(sistemaactivos.presentation.funcionarios.edicion.ControllerFuncionariosEdicion controller) {
        this.controller = controller;
    }

    public ControllerFuncionariosEdicion getController() {
        return controller;
    }

    public void setModel(sistemaactivos.presentation.funcionarios.edicion.ModelFuncionariosEdicion model) {
        this.model = model;
        model.addObserver(this);
    }

    public ModelFuncionariosEdicion getModel() {
        return model;
    }

    @Override
    public void update(java.util.Observable updatedModel, Object parametros) {
        this.limpiarErrores();
        Funcionario actual = model.getCurrent();
        this.DependenciaCombo.setModel(model.getDependencia());
        this.puestoCombo.setModel(model.getPuestos());
        this.DependenciaCombo.setSelectedIndex(0);
        this.puestoCombo.setSelectedIndex(0);
        this.fromFuncionario(actual);
        this.LaborTable.setModel(model.getLabores());
        this.SolicitudTable.setModel(model.getSoliTable());
        
    }

    public void fromFuncionario(Funcionario actual) {
        this.IDTextField.setEnabled(model.getModo() == SistemaActivos.MODO_AGREGAR);
        this.IDTextField.setText(actual.getId());

        Boolean editable = Arrays.asList(SistemaActivos.MODO_AGREGAR, SistemaActivos.MODO_EDITAR).contains(model.getModo());
        this.panelUser.setVisible(false);
        this.panelSolicitudes.setVisible(!(model.getModo() == SistemaActivos.MODO_AGREGAR) && isRegistrador(model.laborModel.rows));
        this.panelLabores.setVisible(!(model.getModo() == SistemaActivos.MODO_AGREGAR));

        this.LaborTable.setModel(model.getLabores());
        this.SolicitudTable.setModel(model.getSoliTable());

        this.NombreTextField.setEnabled(editable);
        this.NombreTextField.setText(actual.getNombre());
    }

    public boolean isRegistrador(List<Labor> l) {
        for(Labor la : l){
            if("Registrador".equals(la.getPuesto().getPuesto())){
                return true;
            }
        }
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarLabor;
    private javax.swing.JButton Atras;
    private javax.swing.JTextField Contraseñatext;
    private javax.swing.JLabel Dependencia;
    private javax.swing.JComboBox DependenciaCombo;
    private javax.swing.JToggleButton EliminarButon;
    private javax.swing.JButton Guadarbtn;
    private javax.swing.JLabel IDLabel;
    private javax.swing.JTextField IDTextField;
    private javax.swing.JTable LaborTable;
    private javax.swing.JLabel Laborlabel;
    private javax.swing.JLabel NombreLabel;
    private javax.swing.JTextField NombreTextField;
    private javax.swing.JTextField OperadorText;
    private javax.swing.JLabel PuestoLabel;
    private javax.swing.JLabel SolicitudLabel;
    private javax.swing.JTable SolicitudTable;
    private javax.swing.JLabel UsuarioLabel;
    private javax.swing.JLabel contraseñaLabel;
    public javax.swing.JButton guardarFld;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel panelLabores;
    private javax.swing.JPanel panelSolicitudes;
    private javax.swing.JPanel panelUser;
    private javax.swing.JComboBox puestoCombo;
    // End of variables declaration//GEN-END:variables

}
