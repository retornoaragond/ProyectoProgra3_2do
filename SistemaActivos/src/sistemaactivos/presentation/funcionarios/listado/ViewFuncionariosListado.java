/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaactivos.presentation.funcionarios.listado;

import java.util.Observable;
import javax.swing.JOptionPane;
import sistemaactivos.SistemaActivos;
import sistemaactivos.logic.Funcionario;

/**
 *
 * @author ExtremeTech
 */
public class ViewFuncionariosListado extends javax.swing.JInternalFrame implements java.util.Observer {

    /**
     * Creates new form viewFuncionarios
     */
    ControllerFuncionariosListado controller;
    ModelFuncionariosListado model;
    
public void setController(ControllerFuncionariosListado controller) {
        this.controller = controller;
    }

    public ControllerFuncionariosListado getController() {
        return controller;
    }

    public void setModel(ModelFuncionariosListado model) {
        this.model = model;
        model.addObserver(this);
    }

    public ModelFuncionariosListado getModel() {
        return model;
    }
    
    public ViewFuncionariosListado() {
        super("", false, true);
        initComponents();
    }

    public void limpiarErrores() {
        this.IdentificacionLabel.setForeground(SistemaActivos.COLOR_OK);
    }

    boolean validar() {
        boolean error = false;

        this.IdentificacionLabel.setForeground(SistemaActivos.COLOR_OK);
        if (this.IdentificacionText.getText().isEmpty()) {
            this.IdentificacionLabel.setForeground(SistemaActivos.COLOR_ERROR);
            error = true;
        }
        return !error;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        FuncionarioTable = new javax.swing.JTable();
        IdentificacionLabel = new javax.swing.JLabel();
        IdentificacionText = new javax.swing.JTextField();
        Buscar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Agregar = new javax.swing.JButton();

        FuncionarioTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(FuncionarioTable);

        IdentificacionLabel.setText("Identificacion");

        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        Eliminar.setText("Eliminar");

        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(IdentificacionLabel)
                        .addGap(18, 18, 18)
                        .addComponent(IdentificacionText)
                        .addGap(18, 18, 18)
                        .addComponent(Buscar)
                        .addGap(80, 80, 80)
                        .addComponent(Agregar)
                        .addGap(18, 18, 18)
                        .addComponent(Eliminar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IdentificacionLabel)
                    .addComponent(IdentificacionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Buscar)
                    .addComponent(Eliminar)
                    .addComponent(Agregar))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        try {
            //controller.preAgregar(this.Agregar.getLocationOnScreen());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_AgregarActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        if (this.validar()) {
            try {
                controller.buscar(this.toFuncionario());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe indicar algún dato", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BuscarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JTable FuncionarioTable;
    private javax.swing.JLabel IdentificacionLabel;
    private javax.swing.JTextField IdentificacionText;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
 
    public void fromFuncionarios(Funcionario funcionario) {
        this.IdentificacionText.setText(funcionario.getId().toString());
    }

    Funcionario toFuncionario() {
        Funcionario result = new Funcionario();
        result.setId(this.IdentificacionText.getText());
        return result;
    }

    @Override
    public void update(Observable o, Object arg) {
        this.limpiarErrores();
        Funcionario funcionario = model.getFuncionario();
        this.fromFuncionarios(funcionario);
        this.FuncionarioTable.setModel(model.getFuncionarios());
    }
}
