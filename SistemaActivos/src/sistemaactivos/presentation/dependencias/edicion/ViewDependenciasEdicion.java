/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaactivos.presentation.dependencias.edicion;

import java.util.Arrays;
import javax.swing.JOptionPane;
import sistemaactivos.SistemaActivos;
import sistemaactivos.logic.Dependencia;

/**
 *
 * @author ExtremeTech
 */
 public class ViewDependenciasEdicion extends javax.swing.JDialog implements java.util.Observer {
    ControllerDependenciasEdicion controller;
    ModelDependenciasEdicion model;
    
    
    
    /**
     * Creates new form viewDependencias
     */
    public ViewDependenciasEdicion() {
        initComponents();
    }

    
    public ViewDependenciasEdicion(java.awt.Frame parent, boolean modal) {
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

        Codigo = new javax.swing.JLabel();
        NombreLabel = new javax.swing.JLabel();
        CodigoField = new javax.swing.JTextField();
        NombreTextField = new javax.swing.JTextField();
        Guardar = new javax.swing.JButton();
        Salir = new javax.swing.JButton();

        setTitle("DEPENDENCIA");

        Codigo.setText("Codigo");

        NombreLabel.setText("Nombre");

        Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemaactivos/presentation/icons/iconguardar.png"))); // NOI18N
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Codigo)
                    .addComponent(NombreLabel))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NombreTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(CodigoField))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(Guardar)
                .addGap(37, 37, 37)
                .addComponent(Salir)
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Codigo)
                    .addComponent(CodigoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreLabel)
                    .addComponent(NombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        if(this.validar()){
            try {
                this.controller.guardar(this.toDependencia());
                JOptionPane.showMessageDialog(this, "Datos registrados", "OK", JOptionPane.INFORMATION_MESSAGE); 
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE); 
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Error en datos", "ERROR", JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_GuardarActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
 this.setVisible(false);
    }//GEN-LAST:event_SalirActionPerformed

    boolean validar(){
        boolean error=false;
        
        this.Codigo.setForeground(SistemaActivos.COLOR_OK); 
        if (this.Codigo.getText().isEmpty()){
            this.Codigo.setForeground(SistemaActivos.COLOR_ERROR);
             error=true;
        }
        
        this.NombreLabel.setForeground(SistemaActivos.COLOR_OK);        
        if (this.NombreTextField.getText().isEmpty()){
            this.NombreTextField.setForeground(SistemaActivos.COLOR_ERROR);
            error=true;
        }
        
        
        return !error; 
    }
    
        Dependencia toDependencia(){
        Dependencia result = new Dependencia();
        result.setCodigo(this.CodigoField.getText());
        result.setNombre(this.NombreTextField.getText());
        //result.setLabors(new set(this.LaborsComboBox));
        //result.setSolicituds ());
        return result;
    }
        
        public void limpiarErrores(){
        this.Codigo.setForeground(SistemaActivos.COLOR_OK);
        this.NombreLabel.setForeground(SistemaActivos.COLOR_OK);
        } 
        
        
        public void setController(
                sistemaactivos.presentation.dependencias.edicion.ControllerDependenciasEdicion controller){
        this.controller=controller;
    }

    public ControllerDependenciasEdicion getController() {
        return controller;
    }
    
    
    public void setModel(sistemaactivos.presentation.dependencias.edicion.ModelDependenciasEdicion model){
        this.model=model;
        //model.addObserver(this);
    }

    public ModelDependenciasEdicion getModel() {
        return model;
    }
    
    public void update(java.util.Observable updatedModel,Object parametros){
       this.limpiarErrores();
       //Funcionario actual = model.getCurrent();
       //this.fromPersona(actual);
   }
   public void fromDependencia(Dependencia actual){
       Boolean editable = Arrays.asList(SistemaActivos.MODO_AGREGAR, SistemaActivos.MODO_EDITAR).contains(model.getModo());
       this.CodigoField.setEnabled(model.getModo()==SistemaActivos.MODO_AGREGAR);       
       this.CodigoField.setText(String.valueOf(actual.getCodigo()));
       this.NombreTextField.setEnabled(editable);
       this.NombreTextField.setText(actual.getNombre());
       Guardar.setVisible(editable);
       this.validate();
    } 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Codigo;
    private javax.swing.JTextField CodigoField;
    private javax.swing.JButton Guardar;
    private javax.swing.JLabel NombreLabel;
    private javax.swing.JTextField NombreTextField;
    private javax.swing.JButton Salir;
    // End of variables declaration//GEN-END:variables
}
