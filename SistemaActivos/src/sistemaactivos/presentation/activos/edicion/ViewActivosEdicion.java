/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaactivos.presentation.activos.edicion;

import java.util.Observable;
import javax.swing.JOptionPane;
import sistemaactivos.SistemaActivos;
import sistemaactivos.logic.Activo;

/**
 *
 * @author ExtremeTechxz
 */
public class ViewActivosEdicion extends javax.swing.JDialog implements java.util.Observer{

    ControllerActivosEdicion controller;
    ModelActivosEdicion model;
    
    
    
    public ViewActivosEdicion() {
        initComponents();
    }

     public ViewActivosEdicion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
     
     public ModelActivosEdicion getModel() {
        return model;
    }

    public void setModel(ModelActivosEdicion model) {
        this.model = model;
        model.addObserver(this);
    }

    public ControllerActivosEdicion getController() {
        return controller;
    }

    public void setController(ControllerActivosEdicion controller) {
        this.controller = controller;
    }
    
   public void limpiarErrores(){
     this.DependenciaLabel.setForeground(SistemaActivos.COLOR_OK);
     this.responsableLabel.setForeground(SistemaActivos.COLOR_OK);
   
   }
    
   boolean validar(){
     boolean error= false;
      this.identificacionLabel.setForeground(SistemaActivos.COLOR_OK);
        if (this.identificacionTextField.getText().isEmpty()) {
            this.identificacionTextField.setForeground(SistemaActivos.COLOR_ERROR);
            error = true;
        }

        this.CategoriaLabel.setForeground(SistemaActivos.COLOR_OK);
        if (this.categoriaTextField.getText().isEmpty()) {
            this.categoriaTextField.setForeground(SistemaActivos.COLOR_ERROR);
            error = true;
        }

        this.DescripcionLabel.setForeground(SistemaActivos.COLOR_OK);
        if (this.DescripcionTextField.getText().isEmpty()) {
            this.DescripcionTextField.setForeground(SistemaActivos.COLOR_ERROR);
            error = true;
        }

        this.CategoriaLabel.setForeground(SistemaActivos.COLOR_OK);
        if (this.categoriaTextField.getText().isEmpty()) {
            this.categoriaTextField.setForeground(SistemaActivos.COLOR_ERROR);
            error = true;
        }

        this.DependenciaLabel.setForeground(SistemaActivos.COLOR_OK);
        if (this.dependenciaComboBox.getSelectedIndex() == -1) {
            return !error;
        }

        this.responsableLabel.setForeground(SistemaActivos.COLOR_OK);
        if (this.responsableComboBox.getSelectedIndex() == -1) {
            return !error;
        }
   
        return !error;
   }
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        CategoriaLabel = new javax.swing.JLabel();
        DescripcionLabel = new javax.swing.JLabel();
        DependenciaLabel = new javax.swing.JLabel();
        responsableLabel = new javax.swing.JLabel();
        dependenciaComboBox = new javax.swing.JComboBox<>();
        responsableComboBox = new javax.swing.JComboBox<>();
        identificacionTextField = new javax.swing.JTextField();
        categoriaTextField = new javax.swing.JTextField();
        DescripcionTextField = new javax.swing.JTextField();
        identificacionLabel = new javax.swing.JLabel();
        GuardarButton = new javax.swing.JButton();
        SalirButton = new javax.swing.JButton();

        setTitle("ACTIVO");

        CategoriaLabel.setText("Categoria");

        DescripcionLabel.setText("Descripcion");

        DependenciaLabel.setText("Dependencia");

        responsableLabel.setText("Responsable");

        dependenciaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        dependenciaComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dependenciaComboBoxActionPerformed(evt);
            }
        });

        responsableComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        responsableComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                responsableComboBoxActionPerformed(evt);
            }
        });

        identificacionTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                identificacionTextFieldActionPerformed(evt);
            }
        });

        identificacionLabel.setText("Identificacion");

        GuardarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemaactivos/presentation/icons/iconguardar.png"))); // NOI18N
        GuardarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarButtonActionPerformed(evt);
            }
        });

        SalirButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemaactivos/presentation/icons/iconsalir.png"))); // NOI18N
        SalirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(GuardarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(SalirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(responsableLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(responsableComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(DependenciaLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(categoriaTextField)
                                        .addComponent(DescripcionTextField)
                                        .addComponent(dependenciaComboBox, 0, 243, Short.MAX_VALUE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(identificacionLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(identificacionTextField)))
                            .addComponent(CategoriaLabel)
                            .addComponent(DescripcionLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(37, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(identificacionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(identificacionLabel))
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CategoriaLabel)
                    .addComponent(categoriaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DescripcionLabel)
                    .addComponent(DescripcionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DependenciaLabel)
                    .addComponent(dependenciaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(responsableLabel)
                    .addComponent(responsableComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GuardarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SalirButton))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void identificacionTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_identificacionTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_identificacionTextFieldActionPerformed

    private void GuardarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarButtonActionPerformed
        if (this.validar()) {
            try {
                this.controller.guardar(this.toActivo());
                JOptionPane.showMessageDialog(this, "Datos registrados", "OK", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Error en datos", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
          
    }//GEN-LAST:event_GuardarButtonActionPerformed

    private void dependenciaComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dependenciaComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dependenciaComboBoxActionPerformed

    private void responsableComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_responsableComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_responsableComboBoxActionPerformed

    private void SalirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirButtonActionPerformed
       this.setVisible(false);
    }//GEN-LAST:event_SalirButtonActionPerformed

    @Override
    public void update(Observable o, Object arg) {
       this.limpiarErrores();
       Activo actual = model.getCurrent();
       this.fromActivo(actual);
       
     }
    
    
     public void fromActivo(Activo actual){
     this.identificacionTextField.setEnabled(false);
     this.categoriaTextField.setEnabled(false);
     this.DescripcionTextField.setEnabled(false);
     Boolean add = model.getModo() == SistemaActivos.MODO_AGREGAR;
     Boolean modify = model.getModo() == SistemaActivos.MODO_EDITAR;
     //agregar  dependencia  y responsable desde la base de datos 
   }

     
     
    Activo toActivo() {
         Activo result = new Activo();
//         result.setCodigoId(this.identificacionTextField.getText());
//         result
//         
//         
//         
//         result.setCodigo(this.CodigoField.getText());
//         result.setNombre(this.NombreTextField.getText());
         return result;
     }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CategoriaLabel;
    private javax.swing.JLabel DependenciaLabel;
    private javax.swing.JLabel DescripcionLabel;
    private javax.swing.JTextField DescripcionTextField;
    private javax.swing.JButton GuardarButton;
    private javax.swing.JButton SalirButton;
    private javax.swing.JTextField categoriaTextField;
    private javax.swing.JComboBox<String> dependenciaComboBox;
    private javax.swing.JLabel identificacionLabel;
    private javax.swing.JTextField identificacionTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<String> responsableComboBox;
    private javax.swing.JLabel responsableLabel;
    // End of variables declaration//GEN-END:variables
}
