
package com.yoprogramo.concesionario.gui;

import com.yoprogramo.concesionario.logic.Automovil;
import com.yoprogramo.concesionario.logic.Controladora;
import javax.swing.JDialog;
import javax.swing.JOptionPane;


public class Edicion extends javax.swing.JFrame {

    Controladora control = new Controladora();
    Automovil auto;
    Catalogo catalogo = new Catalogo();
    public Edicion(int autoId) {
        initComponents();
        
        cargarDatos(autoId);
        
    }
 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        txtMarca3 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtModelo3 = new javax.swing.JTextField();
        txtMotor3 = new javax.swing.JTextField();
        txtColor3 = new javax.swing.JTextField();
        txtPatente3 = new javax.swing.JTextField();
        txtPuertas3 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        btnGuardar3 = new javax.swing.JButton();
        btnLimpiar3 = new javax.swing.JButton();
        btnAtrasCarga = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel22.setFont(new java.awt.Font("Lato Medium", 1, 18)); // NOI18N
        jLabel22.setText("Panel de edicion");

        txtMarca3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarca3ActionPerformed(evt);
            }
        });

        jLabel23.setText("Marca:");

        jLabel24.setText("Modelo:");

        jLabel25.setText("Motor:");

        jLabel26.setText("Color:");

        jLabel27.setText("Patente:");

        jLabel28.setText("Cantidad de puertas:");

        btnGuardar3.setText("Guardar");
        btnGuardar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar3ActionPerformed(evt);
            }
        });

        btnLimpiar3.setText("Limpiar");
        btnLimpiar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiar3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(18, 18, 18)
                        .addComponent(txtMarca3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(18, 18, 18)
                        .addComponent(txtModelo3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(18, 18, 18)
                        .addComponent(txtMotor3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addGap(18, 18, 18)
                        .addComponent(txtColor3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addGap(18, 18, 18)
                        .addComponent(txtPatente3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addGap(18, 18, 18)
                        .addComponent(txtPuertas3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(btnLimpiar3)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardar3)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMarca3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModelo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMotor3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtColor3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPatente3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPuertas3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar3)
                    .addComponent(btnLimpiar3)))
        );

        btnAtrasCarga.setText("Atras");
        btnAtrasCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasCargaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAtrasCarga)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jLabel22)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtrasCarga))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMarca3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarca3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarca3ActionPerformed

    private void btnGuardar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar3ActionPerformed
        String marca = txtMarca3.getText();
        String modelo = txtModelo3.getText();
        String motor = txtMotor3.getText();
        String color = txtColor3.getText();
        String patente = txtPatente3.getText();
        String puertas = txtPuertas3.getText();

        control.modificarAuto(auto, marca, modelo, motor, color, patente, puertas);

        mostrarMsj("Modificado con exito", "Info", "Guardado");
        
        this.dispose();
        catalogo.setVisible(true);
        catalogo.setLocationRelativeTo(null);

    }//GEN-LAST:event_btnGuardar3ActionPerformed

    private void btnLimpiar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar3ActionPerformed
        Limpiar();
    }//GEN-LAST:event_btnLimpiar3ActionPerformed

    private void btnAtrasCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasCargaActionPerformed
        this.dispose();
        catalogo.setVisible(true);
        catalogo.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnAtrasCargaActionPerformed
    
    public void mostrarMsj (String mensaje, String tipo, String titulo){
    
        JOptionPane optionPane = new JOptionPane(mensaje);
        if(tipo.equals("Info")){
                optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);}
        else if(tipo.equals("Error")){
                optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
                JDialog dialog = optionPane.createDialog(titulo);
                dialog.setAlwaysOnTop(true);
                dialog.setVisible(true);
    }
    
    private void Limpiar() {
        txtMarca3.setText("");
        txtModelo3.setText("");
        txtMotor3.setText("");
        txtColor3.setText("");
        txtPatente3.setText("");
        txtPuertas3.setText("");
    }
    
    private void cargarDatos(int autoId){
        this.auto = control.traerAuto(autoId);
        
        txtMarca3.setText(auto.getMarca());
        txtModelo3.setText(auto.getModelo());
        txtMotor3.setText(auto.getMotor());
        txtColor3.setText(auto.getColor());
        txtPatente3.setText(auto.getPatente());
        txtPuertas3.setText(auto.getCantidadPuertas());        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtrasCarga;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardar1;
    private javax.swing.JButton btnGuardar2;
    private javax.swing.JButton btnGuardar3;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnLimpiar1;
    private javax.swing.JButton btnLimpiar2;
    private javax.swing.JButton btnLimpiar3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtColor1;
    private javax.swing.JTextField txtColor2;
    private javax.swing.JTextField txtColor3;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtMarca1;
    private javax.swing.JTextField txtMarca2;
    private javax.swing.JTextField txtMarca3;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtModelo1;
    private javax.swing.JTextField txtModelo2;
    private javax.swing.JTextField txtModelo3;
    private javax.swing.JTextField txtMotor;
    private javax.swing.JTextField txtMotor1;
    private javax.swing.JTextField txtMotor2;
    private javax.swing.JTextField txtMotor3;
    private javax.swing.JTextField txtPatente;
    private javax.swing.JTextField txtPatente1;
    private javax.swing.JTextField txtPatente2;
    private javax.swing.JTextField txtPatente3;
    private javax.swing.JTextField txtPuertas;
    private javax.swing.JTextField txtPuertas1;
    private javax.swing.JTextField txtPuertas2;
    private javax.swing.JTextField txtPuertas3;
    // End of variables declaration//GEN-END:variables
}
