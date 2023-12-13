/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import Modelo.Vendedor;

/**
 *
 * @author Gabriel
 */
public class CreacionEmpleadoView extends javax.swing.JPanel {

    /**
     * Creates new form CreacionClienteView
     */
    public CreacionEmpleadoView() {
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

        InputContrasena = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        InputApellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        InputNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        InputCedula = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        TituloCreacionClientes = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        InputTelf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        InPutCorreoE1 = new javax.swing.JTextField();

        InputContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputContrasenaActionPerformed(evt);
            }
        });

        jLabel5.setText("Contraseña");

        InputApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputApellidoActionPerformed(evt);
            }
        });

        jLabel3.setText("Apellido");

        InputNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputNombreActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre");

        InputCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputCedulaActionPerformed(evt);
            }
        });

        jLabel1.setText("Cedula");

        TituloCreacionClientes.setFont(new java.awt.Font("Arial", 2, 24)); // NOI18N
        TituloCreacionClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloCreacionClientes.setText("Creacion de empleado");

        jLabel6.setText("Telefono");

        InputTelf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputTelfActionPerformed(evt);
            }
        });

        jLabel4.setText("CorreoE");

        InPutCorreoE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InPutCorreoE1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(TituloCreacionClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(InputNombre)
                                .addComponent(InputApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(InputCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6)
                            .addComponent(InputTelf, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(InputContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(InPutCorreoE1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TituloCreacionClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InputCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addComponent(InputNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InputApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(InPutCorreoE1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InputTelf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InputContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void InputContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputContrasenaActionPerformed

    private void InputApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputApellidoActionPerformed

    private void InputNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputNombreActionPerformed

    private void InputCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputCedulaActionPerformed

    private void InputTelfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputTelfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputTelfActionPerformed

    private void InPutCorreoE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InPutCorreoE1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InPutCorreoE1ActionPerformed

    public Vendedor crearObjetoEmpleado() {
        String Enombre = this.InputNombre.getText();
        String Eapellido = this.InputApellido.getText();
        String Ecedula = this.InputCedula.getText();
        String EcorreoE = this.InputTelf.getText();
        String Etelefeno = this.InputTelf.getText();
        String Econtrasena = this.InputContrasena.getText();

        Vendedor nuevoEmpleado = new Vendedor(Enombre, Eapellido, Ecedula, EcorreoE, Etelefeno, Econtrasena);
        return nuevoEmpleado;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField InPutCorreoE1;
    private javax.swing.JTextField InputApellido;
    private javax.swing.JTextField InputCedula;
    private javax.swing.JPasswordField InputContrasena;
    private javax.swing.JTextField InputNombre;
    private javax.swing.JTextField InputTelf;
    private javax.swing.JLabel TituloCreacionClientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
