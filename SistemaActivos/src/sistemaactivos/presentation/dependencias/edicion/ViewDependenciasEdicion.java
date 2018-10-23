/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaactivos.presentation.dependencias.edicion;

import sistemaactivos.SistemaActivos;
import sistemaactivos.logic.Dependencia;

/**
 *
 * @author ExtremeTech
 */
public class ViewDependenciasEdicion extends javax.swing.JInternalFrame {

    /**
     * Creates new form viewDependencias
     */
    public ViewDependenciasEdicion() {
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
        Solicitudes = new javax.swing.JLabel();
        CodigoField = new javax.swing.JTextField();
        NombreTextField = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        LaborLabel = new javax.swing.JLabel();
        LaborCombobox = new javax.swing.JComboBox<>();
        Guardar = new javax.swing.JButton();
        Salir = new javax.swing.JButton();

        Codigo.setText("Codigo");

        NombreLabel.setText("Nombre");

        Solicitudes.setText("Solicitudes");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        LaborLabel.setText("Labor");

        LaborCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        Salir.setText("Salir");
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
                    .addComponent(NombreLabel)
                    .addComponent(Solicitudes)
                    .addComponent(LaborLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Guardar)
                        .addGap(18, 18, 18)
                        .addComponent(Salir))
                    .addComponent(LaborCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(CodigoField, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                        .addComponent(NombreTextField))
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Solicitudes)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LaborLabel)
                    .addComponent(LaborCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Guardar)
                    .addComponent(Salir))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        if(this.validar()){
            try {
                //this.controller.guardar(this.toPersona());
                //JOptionPane.showMessageDialog(this, "Datos registrados", "OK", JOptionPane.INFORMATION_MESSAGE); 
            } catch (Exception ex) {
                //JOptionPane.showMessageDialog(this, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE); 
            }
        }
        else{
            //JOptionPane.showMessageDialog(this, "Error en datos", "ERROR", JOptionPane.ERROR_MESSAGE);
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
        result.setCodigo(Integer.parseInt(this.CodigoField.getText()));
        result.setNombre(this.NombreTextField.getText());
        //result.setLabors(new set(this.LaborsComboBox));
        //result.setSolicituds ());
        return result;
    }
        
        public void limpiarErrores(){
        this.Codigo.setForeground(SistemaActivos.COLOR_OK);
        this.NombreLabel.setForeground(SistemaActivos.COLOR_OK);
        } 
        
        ControllerDependenciasEdicion controller;
        ModelDependenciasEdicion model;
        
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
       
       //this.CodigoField.setEnabled(model.getModo()==SistemaActivos.MODO_AGREGAR);       
       this.CodigoField.setText(String.valueOf(actual.getCodigo()));
       //Boolean editable = Arrays.asList(SistemaActivos.MODO_AGREGAR, SistemaActivos.MODO_EDITAR).contains(model.getModo());
        
        //this.NombreTextField.setEnabled(editable);
        this.NombreTextField.setText(actual.getNombre());
    } 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Codigo;
    private javax.swing.JTextField CodigoField;
    private javax.swing.JButton Guardar;
    private javax.swing.JComboBox<String> LaborCombobox;
    private javax.swing.JLabel LaborLabel;
    private javax.swing.JLabel NombreLabel;
    private javax.swing.JTextField NombreTextField;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel Solicitudes;
    private javax.swing.JComboBox<String> jComboBox1;
    // End of variables declaration//GEN-END:variables
}
