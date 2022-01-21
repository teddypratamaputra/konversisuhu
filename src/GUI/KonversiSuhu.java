/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author Asus
 */
public class KonversiSuhu extends javax.swing.JFrame {

    Double celcius;
    Double fahrenheit;
    Double kelvin;
    Double reamur;
    
    public KonversiSuhu() {
        initComponents();
    }

    private void celcius(){
        celcius = Double.parseDouble(suhuTextField.getText());
        fahrenheit = celcius * 1.8 + 32;
        kelvin = celcius + 273.15;
        reamur = celcius * 0.8;
        celciusTextField.setText(celcius + " ");
        fahrenheitTextField.setText(fahrenheit + " ");
        kelvinTextField.setText(kelvin + " ");
        reamurTextField.setText(reamur + " ");
    }
    
    private void fahrenheit(){
        fahrenheit = Double.parseDouble(suhuTextField.getText());
        celcius = (fahrenheit - 32) / 1.8;
        kelvin = (fahrenheit + 459.67) / 1.8;
        reamur = (fahrenheit - 32) / 2.25;
        celciusTextField.setText(celcius + " ");
        fahrenheitTextField.setText(fahrenheit + " ");
        kelvinTextField.setText(kelvin + " ");
        reamurTextField.setText(reamur + " ");
    }
    
    private void kelvin(){
        kelvin = Double.parseDouble(suhuTextField.getText());
        celcius = kelvin - 273.15;
        fahrenheit = kelvin * 1.8 - 459.67;
        reamur = (kelvin - 273.15) * 0.8;
        celciusTextField.setText(celcius + " ");
        fahrenheitTextField.setText(fahrenheit + " ");
        kelvinTextField.setText(kelvin + " ");
        reamurTextField.setText(reamur + " ");
    }
    
    private void reamur(){
        reamur = Double.parseDouble(suhuTextField.getText());
        kelvin = (reamur / 0.8) + 273.15;
        celcius = reamur / 0.8;
        fahrenheit = (reamur - 7.5) * 24/7 + 32;
        celciusTextField.setText(celcius + " ");
        fahrenheitTextField.setText(fahrenheit + " ");
        kelvinTextField.setText(kelvin + " ");
        reamurTextField.setText(reamur + " ");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        suhuLabel = new javax.swing.JLabel();
        suhuTextField = new javax.swing.JTextField();
        celciusRadioButton = new javax.swing.JRadioButton();
        fahrenheitRadioButton = new javax.swing.JRadioButton();
        kelvinRadioButton = new javax.swing.JRadioButton();
        reamurRadioButton = new javax.swing.JRadioButton();
        convertButton = new javax.swing.JButton();
        celciusLabel = new javax.swing.JLabel();
        celciusTextField = new javax.swing.JTextField();
        fahrenheitLabel = new javax.swing.JLabel();
        fahrenheitTextField = new javax.swing.JTextField();
        kelvinLabel = new javax.swing.JLabel();
        kelvinTextField = new javax.swing.JTextField();
        reamurLabel = new javax.swing.JLabel();
        reamurTextField = new javax.swing.JTextField();
        clearButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Konversi Suhu");

        suhuLabel.setText("Suhu Awal");

        suhuTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suhuTextFieldActionPerformed(evt);
            }
        });

        celciusRadioButton.setText("Celcius");

        fahrenheitRadioButton.setText("Fahrenheit");

        kelvinRadioButton.setText("Kelvin");

        reamurRadioButton.setText("Reamur");

        convertButton.setText("Convert");
        convertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertButtonActionPerformed(evt);
            }
        });

        celciusLabel.setText("Celcius");

        fahrenheitLabel.setText("Fahrenheit");

        kelvinLabel.setText("Kelvin");

        reamurLabel.setText("Reamur");

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(suhuLabel)
                            .addComponent(celciusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(suhuTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fahrenheitTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                    .addComponent(celciusTextField))
                                .addGap(112, 112, 112)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(kelvinLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(reamurLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(kelvinTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(reamurTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(59, 59, 59))))
                    .addComponent(fahrenheitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(convertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(celciusRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(fahrenheitRadioButton)
                        .addGap(64, 64, 64)
                        .addComponent(kelvinRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(reamurRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)))
                .addGap(64, 64, 64))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(suhuLabel)
                    .addComponent(suhuTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fahrenheitRadioButton)
                    .addComponent(kelvinRadioButton)
                    .addComponent(reamurRadioButton)
                    .addComponent(celciusRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(convertButton)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(celciusLabel)
                    .addComponent(celciusTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kelvinLabel)
                    .addComponent(kelvinTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fahrenheitLabel)
                    .addComponent(fahrenheitTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reamurLabel)
                    .addComponent(reamurTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearButton)
                    .addComponent(exitButton))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void suhuTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suhuTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_suhuTextFieldActionPerformed

    private void convertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertButtonActionPerformed
        // TODO add your handling code here:
        if (celciusRadioButton.isSelected()){
            celcius();
        } else if(fahrenheitRadioButton.isSelected()){
            fahrenheit();
        } else if(kelvinRadioButton.isSelected()){
            kelvin();
        } else if(reamurRadioButton.isSelected()){
            reamur();
        }
    }//GEN-LAST:event_convertButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        suhuTextField.setText("");
        celciusTextField.setText("");
        fahrenheitTextField.setText("");
        kelvinTextField.setText("");
        reamurTextField.setText("");
        celciusRadioButton.setSelected(false);
        fahrenheitRadioButton.setSelected(false);
        kelvinRadioButton.setSelected(false);
        reamurRadioButton.setSelected(false);
        
    }//GEN-LAST:event_clearButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_exitButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KonversiSuhu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel celciusLabel;
    private javax.swing.JRadioButton celciusRadioButton;
    private javax.swing.JTextField celciusTextField;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton convertButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel fahrenheitLabel;
    private javax.swing.JRadioButton fahrenheitRadioButton;
    private javax.swing.JTextField fahrenheitTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel kelvinLabel;
    private javax.swing.JRadioButton kelvinRadioButton;
    private javax.swing.JTextField kelvinTextField;
    private javax.swing.JLabel reamurLabel;
    private javax.swing.JRadioButton reamurRadioButton;
    private javax.swing.JTextField reamurTextField;
    private javax.swing.JLabel suhuLabel;
    private javax.swing.JTextField suhuTextField;
    // End of variables declaration//GEN-END:variables
}
