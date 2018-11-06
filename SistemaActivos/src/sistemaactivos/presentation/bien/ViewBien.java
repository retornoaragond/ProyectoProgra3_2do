/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaactivos.presentation.bien;

import java.util.Observable;
import sistemaactivos.SistemaActivos;
import sistemaactivos.logic.Bien;
import sistemaactivos.logic.Categoria;
import sistemaactivos.logic.Usuario;

/**
 *
 * @author CarlosAndrés
 */
public class ViewBien extends javax.swing.JDialog implements java.util.Observer {

    ControllerBien controller;
    ModelBien model;

    /**
     * Creates new form ViewBien
     */
    public ViewBien(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public ModelBien getModel() {
        return model;
    }

    public void setModel(ModelBien model) {
        this.model = model;
        model.addObserver(this);
    }

    public ControllerBien getController() {
        return controller;
    }

    public void setController(ControllerBien controller) {
        this.controller = controller;
    }

    Bien toBien() {
        Bien result = new Bien();
        result.setSerial(this.serialjTextField.getText());
        result.setMarca(this.MarcajTextField.getText());
        result.setDescripcion(this.descripcionjTextField.getText());
        result.setModelo(this.ModelojTextField.getText());
        result.setPrecioU(Integer.getInteger(this.PrecioUnitariojTextField.getText()));
        result.setCantidad(Integer.getInteger(this.CantidadjTextField.getText()));
        return result;

    }

    public void limpiarErrores() {
        this.SerialjLabel.setForeground(SistemaActivos.COLOR_OK);
        this.DescripciónjLabel.setForeground(SistemaActivos.COLOR_OK);
        this.MarcajLabel.setForeground(SistemaActivos.COLOR_OK);
        this.ModelojLabel.setForeground(SistemaActivos.COLOR_OK);
        this.PrecioUnitariojLabel.setForeground(SistemaActivos.COLOR_OK);
        this.CantidadjLabel1.setForeground(SistemaActivos.COLOR_OK);
        this.CantidadjLabel1.setForeground(SistemaActivos.COLOR_OK);
    }

    boolean validar() {
        boolean error = false;
        this.CategoriajLabel.setForeground(SistemaActivos.COLOR_OK);
        if (this.categoriajComboBox1.getSelectedIndex() == -1) {
            this.CategoriajLabel.setForeground(SistemaActivos.COLOR_ERROR);
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

        procesarjButton = new javax.swing.JButton();
        SerialjLabel = new javax.swing.JLabel();
        serialjTextField = new javax.swing.JTextField();
        CategoriajLabel = new javax.swing.JLabel();
        DescripciónjLabel = new javax.swing.JLabel();
        descripcionjTextField = new javax.swing.JTextField();
        MarcajLabel = new javax.swing.JLabel();
        MarcajTextField = new javax.swing.JTextField();
        ModelojLabel = new javax.swing.JLabel();
        ModelojTextField = new javax.swing.JTextField();
        PrecioUnitariojLabel = new javax.swing.JLabel();
        PrecioUnitariojTextField = new javax.swing.JTextField();
        CantidadjLabel1 = new javax.swing.JLabel();
        CantidadjTextField = new javax.swing.JTextField();
        categoriajComboBox1 = new javax.swing.JComboBox();
        salirjButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Bien");

        procesarjButton.setText("Procesar");
        procesarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procesarjButtonActionPerformed(evt);
            }
        });

        SerialjLabel.setText("Serial");

        CategoriajLabel.setText("Categoria");

        DescripciónjLabel.setText("Descripción");

        MarcajLabel.setText("Marca");

        ModelojLabel.setText("Modelo");

        PrecioUnitariojLabel.setText("Precio Unitario");

        CantidadjLabel1.setText("Cantidad");

        salirjButton.setText("salir");
        salirjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirjButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Información del Bien");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(procesarjButton)
                        .addGap(34, 34, 34)
                        .addComponent(salirjButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MarcajLabel)
                                    .addComponent(DescripciónjLabel)
                                    .addComponent(SerialjLabel))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(descripcionjTextField)
                                    .addComponent(serialjTextField)
                                    .addComponent(MarcajTextField)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ModelojLabel)
                                .addGap(56, 56, 56)
                                .addComponent(ModelojTextField))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PrecioUnitariojLabel)
                                .addGap(21, 21, 21)
                                .addComponent(PrecioUnitariojTextField))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CantidadjLabel1)
                                .addGap(48, 48, 48)
                                .addComponent(CantidadjTextField))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CategoriajLabel)
                                .addGap(44, 44, 44)
                                .addComponent(categoriajComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel1)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SerialjLabel)
                    .addComponent(serialjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DescripciónjLabel)
                    .addComponent(descripcionjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MarcajLabel)
                    .addComponent(MarcajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ModelojLabel)
                    .addComponent(ModelojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PrecioUnitariojLabel)
                    .addComponent(PrecioUnitariojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CantidadjLabel1)
                    .addComponent(CantidadjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CategoriajLabel)
                    .addComponent(categoriajComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(salirjButton)
                    .addComponent(procesarjButton))
                .addGap(0, 21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void procesarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procesarjButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_procesarjButtonActionPerformed

    private void salirjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirjButtonActionPerformed
        controller.hide();
        controller.reset();
    }//GEN-LAST:event_salirjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CantidadjLabel1;
    private javax.swing.JTextField CantidadjTextField;
    private javax.swing.JLabel CategoriajLabel;
    private javax.swing.JLabel DescripciónjLabel;
    private javax.swing.JLabel MarcajLabel;
    private javax.swing.JTextField MarcajTextField;
    private javax.swing.JLabel ModelojLabel;
    private javax.swing.JTextField ModelojTextField;
    private javax.swing.JLabel PrecioUnitariojLabel;
    private javax.swing.JTextField PrecioUnitariojTextField;
    private javax.swing.JLabel SerialjLabel;
    private javax.swing.JComboBox categoriajComboBox1;
    private javax.swing.JTextField descripcionjTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton procesarjButton;
    private javax.swing.JButton salirjButton;
    private javax.swing.JTextField serialjTextField;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        this.limpiarErrores();
        Bien actual = model.getCurrent();
        this.categoriajComboBox1.setModel(model.getCategoria());
        this.fromBien(actual);
        this.categoriajComboBox1.setSelectedIndex(0);
    }

    public void fromBien(Bien actual) {

        Usuario user = (Usuario) controller.session.getAttribute(SistemaActivos.USER_ATTRIBUTE);

        this.serialjTextField.setText(actual.getSerial());
        this.serialjTextField.setEditable(false);
        Boolean modify = model.getModo() == SistemaActivos.MODO_EDITAR;

        this.descripcionjTextField.setEditable(!modify);
        descripcionjTextField.setText(actual.getDescripcion());

        this.MarcajTextField.setEditable(!modify);
        MarcajTextField.setText(actual.getMarca());

        this.ModelojTextField.setEditable(!modify);
        ModelojTextField.setText(actual.getModelo());

        this.PrecioUnitariojTextField.setEditable(!modify);
        PrecioUnitariojTextField.setText(Double.toString(actual.getPrecioU()));

        this.CantidadjTextField.setEditable(!modify);
        CantidadjTextField.setText(Integer.toString(actual.getCantidad()));

        this.categoriajComboBox1.setEnabled(modify && "Registrador".equals(user.getLabor().getPuesto().getPuesto()));
        if (!"".equals(actual.getCategoria().getDescripcion())) {
            categoriajComboBox1.setSelectedIndex(combospace(actual.getCategoria()));
        } else {
            categoriajComboBox1.setSelectedIndex(0);
        }
        procesarjButton.setVisible(modify && "Registrador".equals(user.getLabor().getPuesto().getPuesto()));
        this.validate();
    }

    public int combospace(Categoria cat) {
        int num = categoriajComboBox1.getItemCount();
        for (int i = 0; i < num; i++) {
            Categoria item = (Categoria) categoriajComboBox1.getItemAt(i);
            if (item.getDescripcion().equals(cat.getDescripcion())) {
                return i;
            }
        }
        return 0;
    }

}
