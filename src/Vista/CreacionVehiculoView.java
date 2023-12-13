/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import Modelo.Vehiculo;
import Modelo.Vendedor;

/**
 *
 * @author Gabriel
 */
public class CreacionVehiculoView extends javax.swing.JPanel {

    /**
     * Creates new form CreacionClienteView
     */
    public CreacionVehiculoView() {
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

        InputYear = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        InputColor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        InputPlaca = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        TituloCreacionClientes = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        InputMarca = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        InputClilindraje = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        InputModelo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        InputKilometraje = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        InputTipo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        InputCaracteristicas = new javax.swing.JTextField();

        InputYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputYearActionPerformed(evt);
            }
        });

        jLabel3.setText("Año");

        InputColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputColorActionPerformed(evt);
            }
        });

        jLabel2.setText("Color");

        InputPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputPlacaActionPerformed(evt);
            }
        });

        jLabel1.setText("Placa");

        TituloCreacionClientes.setFont(new java.awt.Font("Arial", 2, 24)); // NOI18N
        TituloCreacionClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloCreacionClientes.setText("Creacion de empleado");

        jLabel6.setText("Marca");

        InputMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputMarcaActionPerformed(evt);
            }
        });

        jLabel4.setText("Cilindraje");

        InputClilindraje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputClilindrajeActionPerformed(evt);
            }
        });

        jLabel7.setText("modelo");

        InputModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputModeloActionPerformed(evt);
            }
        });

        jLabel8.setText("Kilometraje");

        InputKilometraje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputKilometrajeActionPerformed(evt);
            }
        });

        jLabel9.setText("Tipo");

        InputTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputTipoActionPerformed(evt);
            }
        });

        jLabel10.setText("Caracteristicas");

        InputCaracteristicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputCaracteristicasActionPerformed(evt);
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
                                .addComponent(InputColor)
                                .addComponent(InputYear, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(InputPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6)
                            .addComponent(InputMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(InputClilindraje, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(InputModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(InputKilometraje, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(InputTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(InputCaracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addComponent(InputPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addComponent(InputColor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InputYear, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InputClilindraje, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InputMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InputModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InputKilometraje, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InputTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InputCaracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void InputYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputYearActionPerformed

    private void InputColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputColorActionPerformed

    private void InputPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputPlacaActionPerformed

    private void InputMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputMarcaActionPerformed

    private void InputClilindrajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputClilindrajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputClilindrajeActionPerformed

    private void InputModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputModeloActionPerformed

    private void InputKilometrajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputKilometrajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputKilometrajeActionPerformed

    private void InputTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputTipoActionPerformed

    private void InputCaracteristicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputCaracteristicasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputCaracteristicasActionPerformed

    public Vehiculo crearObjetoVehiculo() {
        String Vplaca = this.InputPlaca.getText();
        String Vcolor = this.InputColor.getText();
        String Vyear = this.InputYear.getText();
        String Vcilindraje = this.InputClilindraje.getText();
        String Vmarca = this.InputMarca.getText();
        String Vmodelo = this.InputModelo.getText();
        String Vkilometraje = this.InputKilometraje.getText();
        String Vtipo = this.InputTipo.getText();
        String Vcaracteristicas = this.InputCaracteristicas.getText();

        Vehiculo nuevoVehiculo = new Vehiculo(Vplaca, Vcolor, Vyear, Vcilindraje, Vmarca, Vmodelo, Vkilometraje, Vtipo, Vcaracteristicas);
        return nuevoVehiculo;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField InputCaracteristicas;
    private javax.swing.JTextField InputClilindraje;
    private javax.swing.JTextField InputColor;
    private javax.swing.JTextField InputKilometraje;
    private javax.swing.JTextField InputMarca;
    private javax.swing.JTextField InputModelo;
    private javax.swing.JTextField InputPlaca;
    private javax.swing.JTextField InputTipo;
    private javax.swing.JTextField InputYear;
    private javax.swing.JLabel TituloCreacionClientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
