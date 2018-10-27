/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaactivos.presentation.activos.listado;

import java.util.HashSet;
import java.util.Observable;
import javax.swing.JOptionPane;
import sistemaactivos.SistemaActivos;
import sistemaactivos.logic.Activo;

/**
 *
 * @author ExtremeTech
 */
public class ViewActivosListado extends javax.swing.JInternalFrame implements java.util.Observer {

    ControllerActivosListado controller;
    ModelActivosListado model;

    public void setController(ControllerActivosListado controller) {
        this.controller = controller;
    }

    public ControllerActivosListado getController() {
        return controller;
    }

    public void setModel(ModelActivosListado model) {
        this.model = model;
        model.addObserver(this);
    }

    public ModelActivosListado getModel() {
        return model;
    }

    public ViewActivosListado() {
        super("", false, true);
        initComponents();
    }

    public void limpiarErrores() {
        this.codigoLabel.setForeground(SistemaActivos.COLOR_OK);
    }

    boolean validar() {
        boolean error = false;
        boolean flag = false;

        //repetitivo
        this.codigoLabel.setForeground(SistemaActivos.COLOR_OK);
        if (this.codigoLabel.getText().isEmpty() && !flag) {
            this.codigoLabel.setForeground(SistemaActivos.COLOR_ERROR);
            error = true;
        } else {
            flag = true;
        }

        this.categoriaLabel.setForeground(SistemaActivos.COLOR_OK);
        if (this.categoriaLabel.getText().isEmpty() && !flag) {
            this.categoriaLabel.setForeground(SistemaActivos.COLOR_ERROR);
            error = true;
        } else {
            flag = true;
        }

        this.DescripcionLabel.setForeground(SistemaActivos.COLOR_OK);
        if (this.DescripcionLabel.getText().isEmpty() && !flag) {
            this.DescripcionLabel.setForeground(SistemaActivos.COLOR_ERROR);
            error = true;
        } else {
            flag = true;
        }

        this.DependenciaLabel.setForeground(SistemaActivos.COLOR_OK);
        if (this.DependenciaLabel.getText().isEmpty() && !flag) {
            this.DependenciaLabel.setForeground(SistemaActivos.COLOR_ERROR);
            error = true;
        } else {
            flag = true;
        }

        this.ResponsableLabel.setForeground(SistemaActivos.COLOR_OK);
        if (this.ResponsableLabel.getText().isEmpty() && !flag) {
            this.ResponsableLabel.setForeground(SistemaActivos.COLOR_ERROR);
            error = true;
        } else {
            flag = true;
        }
        //si almenos un espacio no esta en blanco
        if (flag) {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        codigoLabel = new javax.swing.JLabel();
        CodigoTextField = new javax.swing.JTextField();
        categoriaLabel = new javax.swing.JLabel();
        categoriaTextField = new javax.swing.JTextField();
        DescripcionLabel = new javax.swing.JLabel();
        descripcionTextField = new javax.swing.JTextField();
        DependenciaLabel = new javax.swing.JLabel();
        dependenciaTextField = new javax.swing.JTextField();
        buscarjButton = new javax.swing.JButton();
        ResponsableLabel = new javax.swing.JLabel();
        ResponsableTextField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        activosTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setTitle(" Activos");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Busqueda");

        codigoLabel.setText("Codigo");

        categoriaLabel.setText("Categoria");

        DescripcionLabel.setText("Descripción");

        DependenciaLabel.setText("Dependencia");

        buscarjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemaactivos/presentation/icons/iconbuscar.png"))); // NOI18N
        buscarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarjButtonActionPerformed(evt);
            }
        });

        ResponsableLabel.setText("Responsable");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ResponsableLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ResponsableTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(codigoLabel)
                        .addGap(42, 42, 42)
                        .addComponent(CodigoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(categoriaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(categoriaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DescripcionLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descripcionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(DependenciaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dependenciaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buscarjButton)
                        .addGap(68, 68, 68))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(337, 337, 337)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoLabel)
                    .addComponent(CodigoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoriaLabel)
                    .addComponent(categoriaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DescripcionLabel)
                    .addComponent(descripcionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ResponsableLabel)
                        .addComponent(ResponsableTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DependenciaLabel)
                        .addComponent(dependenciaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(buscarjButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        activosTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(activosTable);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("ACTIVOS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(368, 368, 368))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemaactivos/presentation/icons/iconsalir.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarjButtonActionPerformed
        if (this.validar()) {
            try {
                controller.buscar(this.toActivo());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe indicar algún dato", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buscarjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CodigoTextField;
    private javax.swing.JLabel DependenciaLabel;
    private javax.swing.JLabel DescripcionLabel;
    private javax.swing.JLabel ResponsableLabel;
    private javax.swing.JTextField ResponsableTextField;
    private javax.swing.JTable activosTable;
    private javax.swing.JButton buscarjButton;
    private javax.swing.JLabel categoriaLabel;
    private javax.swing.JTextField categoriaTextField;
    private javax.swing.JLabel codigoLabel;
    private javax.swing.JTextField dependenciaTextField;
    private javax.swing.JTextField descripcionTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    public void fromActivo(Activo s) {
        CodigoTextField.setText(s.getCodigoId());
        categoriaTextField.setText(s.getBien().getCategoria().getDescripcion());
        descripcionTextField.setText(s.getBien().getDecripcion());
        dependenciaTextField.setText(s.getLabor().getDependencia().getNombre());
        ResponsableTextField.setText(s.getLabor().getFuncionario().getNombre());
    }

    Activo toActivo() {
        Activo result = new Activo();
        result.setCodigoId(codigoLabel.getText());
        // result.setBiens(new HashSet<>(model.activosTable));

        return result;
    }

    @Override
    public void update(Observable o, Object arg) {
        this.limpiarErrores();
        Activo acti = model.getFilter();
        this.fromActivo(acti);
        activosTable.setModel(model.getActivos());

    }
}
