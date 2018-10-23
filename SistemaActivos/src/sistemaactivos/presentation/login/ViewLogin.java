/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaactivos.presentation.login;

import javax.swing.JOptionPane;
import sistemaactivos.SistemaActivos;
import sistemaactivos.logic.Usuario;

/**
 *
 * @author ExtremeTech
 */
public class ViewLogin extends javax.swing.JFrame implements java.util.Observer {

    /**
     * Creates new form viewLogin
     */
    public ViewLogin() {
        initComponents();
        this.getRootPane().setDefaultButton(loginFld);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IDLabel = new javax.swing.JLabel();
        IDTXTField = new javax.swing.JTextField();
        ClaveLabel = new javax.swing.JLabel();
        JclaveField = new javax.swing.JPasswordField();
        loginFld = new javax.swing.JButton();
        salir = new javax.swing.JButton();

        IDLabel.setText("ID");
        IDLabel.setToolTipText("");

        ClaveLabel.setText("Clave");

        loginFld.setText("Login");
        loginFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginFldActionPerformed(evt);
            }
        });

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ClaveLabel)
                    .addComponent(IDLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(loginFld)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(salir))
                    .addComponent(IDTXTField)
                    .addComponent(JclaveField))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDLabel)
                    .addComponent(IDTXTField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ClaveLabel)
                    .addComponent(JclaveField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginFld)
                    .addComponent(salir))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salirActionPerformed

    private void loginFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginFldActionPerformed
        if (this.validar()) {
            try {
                this.controller.login(this.toUsuario());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Error en datos", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_loginFldActionPerformed

    public boolean validar() {
        boolean error = false;

        this.IDLabel.setForeground(SistemaActivos.COLOR_OK);
        if (this.IDTXTField.getText().isEmpty()) {
            this.IDLabel.setForeground(SistemaActivos.COLOR_ERROR);
            error = true;
        }

        this.IDLabel.setForeground(SistemaActivos.COLOR_OK);
        if ((new String(this.JclaveField.getPassword())).isEmpty()) {
            this.ClaveLabel.setForeground(SistemaActivos.COLOR_ERROR);
            error = true;
        }
        return !error;
    }

    Usuario toUsuario() {
        Usuario result = new Usuario();
        result.setId(this.IDTXTField.getText());
        result.setPass(new String(this.JclaveField.getPassword()));
        return result;
    }

    public void fromUsuario(Usuario current) {
        this.IDTXTField.setText(String.valueOf(current.getId()));
        this.JclaveField.setText(current.getPass());
    }

    public void limpiarErrores() {
        this.IDLabel.setForeground(SistemaActivos.COLOR_OK);
        this.ClaveLabel.setForeground(SistemaActivos.COLOR_OK);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ClaveLabel;
    private javax.swing.JLabel IDLabel;
    private javax.swing.JTextField IDTXTField;
    private javax.swing.JPasswordField JclaveField;
    private javax.swing.JButton loginFld;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables

    ControllerLogin controller;
    ModelLogin model;

    public void setController(ControllerLogin controller) {
        this.controller = controller;
    }

    public ControllerLogin getController() {
        return controller;
    }

    public void setModel(ModelLogin model) {
        this.model = model;
        model.addObserver(this);
    }

    public ModelLogin getModel() {
        return model;
    }

    @Override
    public void update(java.util.Observable updatedModel, Object parametros) {
        this.limpiarErrores();
        Usuario current = model.getCurrent();
        this.fromUsuario(current);
    }
}
