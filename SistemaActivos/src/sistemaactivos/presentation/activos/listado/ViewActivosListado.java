/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaactivos.presentation.activos.listado;

import java.util.Observable;
import javax.swing.JOptionPane;
import sistemaactivos.SistemaActivos;

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
        this.busquedaLabel.setForeground(SistemaActivos.COLOR_OK);
    }

    boolean validar() {
        boolean error = false;
        this.busquedaLabel.setForeground(SistemaActivos.COLOR_OK);
        if (this.busquedaTextField.getText().isEmpty()) {
            busquedaLabel.setForeground(SistemaActivos.COLOR_ERROR);
            error = true;
        }
        this.TipoFiltrojLabel3.setForeground(SistemaActivos.COLOR_OK);
        if (this.opcionesBusqueda.getSelection() == null) {
            this.TipoFiltrojLabel3.setForeground(SistemaActivos.COLOR_ERROR);
            error = true;
        }
        return !error;
    }

    public void fromActivo(String s, int i) {
        this.busquedaTextField.setText(model.getFilter());
        switch (i) {
            case 0:
                this.CodigojRadioButton.setSelected(true);
                break;
            case 1:
                this.DescripcionjRadioButton.setSelected(true);
                break;
            case 2:
                this.CategoriajRadioButton1.setSelected(true);
                break;
            case 3:
                this.DependenciajRadioButton.setSelected(true);
                break;
            case 4:
                this.ResponsablejRadioButton.setSelected(true);
                break;
            default:
                this.opcionesBusqueda.clearSelection();
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        this.limpiarErrores();
        this.fromActivo(model.getFilter(), model.rbselect);
        activosTable.setModel(model.getActivos());

    }

    public int toSelecion() {
        if (this.CodigojRadioButton.isSelected()) {
            return 0;
        }
        if (this.DescripcionjRadioButton.isSelected()) {
            return 1;
        }
        if (this.CategoriajRadioButton1.isSelected()) {
            return 2;
        }
        if (this.DependenciajRadioButton.isSelected()) {
            return 3;
        }
        if (this.ResponsablejRadioButton.isSelected()) {
            return 4;
        }
        return -1;
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
        opcionesBusqueda = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        busquedaLabel = new javax.swing.JLabel();
        busquedaTextField = new javax.swing.JTextField();
        buscarjButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        CategoriajRadioButton1 = new javax.swing.JRadioButton();
        DescripcionjRadioButton = new javax.swing.JRadioButton();
        ResponsablejRadioButton = new javax.swing.JRadioButton();
        DependenciajRadioButton = new javax.swing.JRadioButton();
        CodigojRadioButton = new javax.swing.JRadioButton();
        TipoFiltrojLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        activosTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        Atras = new javax.swing.JButton();

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

        busquedaLabel.setText("Busqueda ");

        buscarjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemaactivos/presentation/icons/iconbuscar.png"))); // NOI18N
        buscarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarjButtonActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        opcionesBusqueda.add(CategoriajRadioButton1);
        CategoriajRadioButton1.setText("Categoria");

        opcionesBusqueda.add(DescripcionjRadioButton);
        DescripcionjRadioButton.setText("Descripcion");

        opcionesBusqueda.add(ResponsablejRadioButton);
        ResponsablejRadioButton.setText("Responsable");

        opcionesBusqueda.add(DependenciajRadioButton);
        DependenciajRadioButton.setText("Dependencia");

        opcionesBusqueda.add(CodigojRadioButton);
        CodigojRadioButton.setText("Codigo");

        TipoFiltrojLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TipoFiltrojLabel3.setText("Tipo Filtro");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TipoFiltrojLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CategoriajRadioButton1)
                    .addComponent(DependenciajRadioButton))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(DescripcionjRadioButton)
                        .addGap(18, 18, 18)
                        .addComponent(ResponsablejRadioButton))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(CodigojRadioButton)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ResponsablejRadioButton)
                    .addComponent(DescripcionjRadioButton)
                    .addComponent(CategoriajRadioButton1)
                    .addComponent(TipoFiltrojLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DependenciajRadioButton)
                    .addComponent(CodigojRadioButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(buscarjButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(busquedaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(busquedaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(237, 237, 237))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(busquedaLabel)
                            .addComponent(busquedaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buscarjButton)
                        .addGap(9, 9, 9)))
                .addGap(12, 12, 12))
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
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(471, 471, 471)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                .addContainerGap())
        );

        Atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemaactivos/presentation/icons/iconsalir.png"))); // NOI18N
        Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Atras)
                .addGap(70, 70, 70))
            .addGroup(layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(240, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Atras)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarjButtonActionPerformed
        if (this.validar()) {
            try {
                controller.buscar(this.busquedaTextField.getText(), this.toSelecion());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe indicar algún dato", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buscarjButtonActionPerformed

    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
        controller.hide();
    }//GEN-LAST:event_AtrasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atras;
    private javax.swing.JRadioButton CategoriajRadioButton1;
    private javax.swing.JRadioButton CodigojRadioButton;
    private javax.swing.JRadioButton DependenciajRadioButton;
    private javax.swing.JRadioButton DescripcionjRadioButton;
    private javax.swing.JRadioButton ResponsablejRadioButton;
    private javax.swing.JLabel TipoFiltrojLabel3;
    private javax.swing.JTable activosTable;
    private javax.swing.JButton buscarjButton;
    private javax.swing.JLabel busquedaLabel;
    private javax.swing.JTextField busquedaTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.ButtonGroup opcionesBusqueda;
    // End of variables declaration//GEN-END:variables

}
