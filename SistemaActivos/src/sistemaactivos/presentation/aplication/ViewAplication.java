/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaactivos.presentation.aplication;

import java.util.Observable;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ExtremeTech
 */
public class ViewAplication extends javax.swing.JFrame implements java.util.Observer {

    ModelAplication model;
    ControllerAplication controller;

    public ModelAplication getModel() {
        return model;
    }

    public void setModel(ModelAplication model) {
        this.model = model;
    }

    public ControllerAplication getController() {
        return controller;
    }

    public void setController(ControllerAplication controller) {
        this.controller = controller;
    }

    public void addInternalFrame(JInternalFrame f) {
        this.desktopPane.add(f);
    }

    /**
     * Creates new form viewAplication
     */
    public ViewAplication() {
        initComponents();
        this.setSize(this.getMaximumSize());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        salirMenu = new javax.swing.JMenu();
        logOut = new javax.swing.JCheckBoxMenuItem();
        AdministradorJMenuItem = new javax.swing.JMenu();
        ListadoDeSolicitudesJMenu4 = new javax.swing.JMenuItem();
        AgregarSolicitudjMenuItem = new javax.swing.JMenuItem();
        SecretariaOCCBjMenu = new javax.swing.JMenu();
        ListadoDeSolicitudesJMenu3 = new javax.swing.JMenuItem();
        JefeDeOCCBJMenuItem = new javax.swing.JMenu();
        ListadoDeSolicitudeSolicitudesJMenuItem2 = new javax.swing.JMenuItem();
        ListadoDeActivosjMenuItem2 = new javax.swing.JMenuItem();
        RegistradorjMenu = new javax.swing.JMenu();
        ListadoDeSolicitudesJMenu1 = new javax.swing.JMenuItem();
        ListadoDeActivosjMenuItem = new javax.swing.JMenuItem();
        JefeDeRRHHjMenu = new javax.swing.JMenu();
        ListadoDeFuncionariosjMenuItem = new javax.swing.JMenuItem();
        ListadoDeDependendenciasjMenuItem = new javax.swing.JMenuItem();
        ayuda = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 721, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 374, Short.MAX_VALUE)
        );

        salirMenu.setText("Salir");
        salirMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirMenuActionPerformed(evt);
            }
        });

        logOut.setSelected(true);
        logOut.setText("LogOut");
        logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutActionPerformed(evt);
            }
        });
        salirMenu.add(logOut);

        jMenuBar1.add(salirMenu);

        AdministradorJMenuItem.setText("Administrador");

        ListadoDeSolicitudesJMenu4.setText("Listado de Solicitudes");
        ListadoDeSolicitudesJMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListadoDeSolicitudesJMenu4ActionPerformed(evt);
            }
        });
        AdministradorJMenuItem.add(ListadoDeSolicitudesJMenu4);

        AgregarSolicitudjMenuItem.setText("Agregar una solicitud");
        AgregarSolicitudjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarSolicitudjMenuItemActionPerformed(evt);
            }
        });
        AdministradorJMenuItem.add(AgregarSolicitudjMenuItem);

        SecretariaOCCBjMenu.setText("Secretaria OCCB");

        ListadoDeSolicitudesJMenu3.setText("Listado de solicitudes");
        ListadoDeSolicitudesJMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListadoDeSolicitudesJMenu3ActionPerformed(evt);
            }
        });
        SecretariaOCCBjMenu.add(ListadoDeSolicitudesJMenu3);

        AdministradorJMenuItem.add(SecretariaOCCBjMenu);

        jMenuBar1.add(AdministradorJMenuItem);

        JefeDeOCCBJMenuItem.setText("Jefe de OCCB");

        ListadoDeSolicitudeSolicitudesJMenuItem2.setText("Listado de Solicitudes");
        ListadoDeSolicitudeSolicitudesJMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListadoDeSolicitudeSolicitudesJMenuItem2ActionPerformed(evt);
            }
        });
        JefeDeOCCBJMenuItem.add(ListadoDeSolicitudeSolicitudesJMenuItem2);

        ListadoDeActivosjMenuItem2.setText("Listado de Activos");
        ListadoDeActivosjMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListadoDeActivosjMenuItem2ActionPerformed(evt);
            }
        });
        JefeDeOCCBJMenuItem.add(ListadoDeActivosjMenuItem2);

        jMenuBar1.add(JefeDeOCCBJMenuItem);

        RegistradorjMenu.setText("Registrador ");

        ListadoDeSolicitudesJMenu1.setText("Listado de Solicitudes");
        ListadoDeSolicitudesJMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListadoDeSolicitudesJMenu1ActionPerformed(evt);
            }
        });
        RegistradorjMenu.add(ListadoDeSolicitudesJMenu1);

        ListadoDeActivosjMenuItem.setText("Listado de Activos");
        RegistradorjMenu.add(ListadoDeActivosjMenuItem);

        jMenuBar1.add(RegistradorjMenu);

        JefeDeRRHHjMenu.setText("Jefe de RRHH");

        ListadoDeFuncionariosjMenuItem.setText("Listado de Funcionarios");
        JefeDeRRHHjMenu.add(ListadoDeFuncionariosjMenuItem);

        ListadoDeDependendenciasjMenuItem.setText("Listado de Dependencias");
        ListadoDeDependendenciasjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListadoDeDependendenciasjMenuItemActionPerformed(evt);
            }
        });
        JefeDeRRHHjMenu.add(ListadoDeDependendenciasjMenuItem);

        jMenuBar1.add(JefeDeRRHHjMenu);

        ayuda.setText("Ayuda");

        jMenuItem6.setText("Acerca de...");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        ayuda.add(jMenuItem6);

        jMenuBar1.add(ayuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirMenuActionPerformed

        controller.exit();

    }//GEN-LAST:event_salirMenuActionPerformed

    private void logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutActionPerformed

 controller.exit();
        
    }//GEN-LAST:event_logOutActionPerformed

    private void ListadoDeSolicitudesJMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListadoDeSolicitudesJMenu4ActionPerformed
   controller.dependenciasShow();
   
    }//GEN-LAST:event_ListadoDeSolicitudesJMenu4ActionPerformed

    private void ListadoDeSolicitudesJMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListadoDeSolicitudesJMenu3ActionPerformed
    
        controller.funcionariosShow();
        
    }//GEN-LAST:event_ListadoDeSolicitudesJMenu3ActionPerformed

    private void ListadoDeSolicitudeSolicitudesJMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListadoDeSolicitudeSolicitudesJMenuItem2ActionPerformed
       controller.solicitudesShow();
    }//GEN-LAST:event_ListadoDeSolicitudeSolicitudesJMenuItem2ActionPerformed

    private void ListadoDeSolicitudesJMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListadoDeSolicitudesJMenu1ActionPerformed
        controller.activosShow();
    }//GEN-LAST:event_ListadoDeSolicitudesJMenu1ActionPerformed

    private void ListadoDeActivosjMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListadoDeActivosjMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListadoDeActivosjMenuItem2ActionPerformed

    private void AgregarSolicitudjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarSolicitudjMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgregarSolicitudjMenuItemActionPerformed

    private void ListadoDeDependendenciasjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListadoDeDependendenciasjMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListadoDeDependendenciasjMenuItemActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        JOptionPane.showMessageDialog(this, "Sistema Activos\n"
                + " Elaborado por:\n "
                + "\tEsteban Espinoza Fallas\n"
                + "\tCarlos Vargas Alfaro\n"
                + "\tDiego Pinto Gómez\n"
                + " Version 1.0", "Acerca de..", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu AdministradorJMenuItem;
    private javax.swing.JMenuItem AgregarSolicitudjMenuItem;
    private javax.swing.JMenu JefeDeOCCBJMenuItem;
    private javax.swing.JMenu JefeDeRRHHjMenu;
    private javax.swing.JMenuItem ListadoDeActivosjMenuItem;
    private javax.swing.JMenuItem ListadoDeActivosjMenuItem2;
    private javax.swing.JMenuItem ListadoDeDependendenciasjMenuItem;
    private javax.swing.JMenuItem ListadoDeFuncionariosjMenuItem;
    private javax.swing.JMenuItem ListadoDeSolicitudeSolicitudesJMenuItem2;
    private javax.swing.JMenuItem ListadoDeSolicitudesJMenu1;
    private javax.swing.JMenuItem ListadoDeSolicitudesJMenu3;
    private javax.swing.JMenuItem ListadoDeSolicitudesJMenu4;
    private javax.swing.JMenu RegistradorjMenu;
    private javax.swing.JMenu SecretariaOCCBjMenu;
    private javax.swing.JMenu ayuda;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JCheckBoxMenuItem logOut;
    private javax.swing.JMenu salirMenu;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        if (model.getCurrent() != null) {
            this.setTitle("SISTEMA ACTIVOS (" + model.getCurrent().getId() + ")");
        } else {
            this.setTitle("SISTEMA ACTIVOS");
        }
    }
}
