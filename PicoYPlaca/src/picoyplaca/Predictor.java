
package picoyplaca;

import javax.swing.JOptionPane;

/**
 *
 * @author ricky
 */
public class Predictor extends javax.swing.JFrame {

    /**
     * Creates new form Predictor
     */
    public Predictor() {
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

        Tittle = new javax.swing.JLabel();
        Label1 = new javax.swing.JLabel();
        PlateTextField = new javax.swing.JTextField();
        Label2 = new javax.swing.JLabel();
        SearchBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Tittle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Tittle.setText("Pico y Placa Predictor");

        Label1.setText("Enter your license plate number:");

        PlateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlateTextFieldActionPerformed(evt);
            }
        });

        Label2.setText("The program will use the actual date/time to determinate if you can be on the road");

        SearchBTN.setText("Search");
        SearchBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Tittle)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Label1)
                                    .addGap(18, 18, 18)
                                    .addComponent(PlateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(Label2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(SearchBTN)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Tittle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label1)
                    .addComponent(PlateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Label2)
                .addGap(26, 26, 26)
                .addComponent(SearchBTN)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PlateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PlateTextFieldActionPerformed

    private void SearchBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBTNActionPerformed
        //Start the class plate
        Plate plate = new Plate();
        try {
            //Detects if the plate has the right size 6 or 7 
            if (PlateTextField.getText().length()==6||PlateTextField.getText().length()==7) {
                //Here we oftain as an it the tast number
                plate.DetectLastNumber(PlateTextField.getText());
                //Compare the last number with the day
                if (plate.CompareToActualDay()) {
                    JOptionPane.showMessageDialog(null, "You are allowed to drive the whole day");
                }
                //here we compare the hours
                else{
                    plate.CompareToActualTime();
                }
            }
            else{//this shows when the plate number has an incorrect size
                JOptionPane.showMessageDialog(null, "Incorrect Plate Number");
            }
        }
        catch(Exception e) {//shows if the last caracter is not a number
            JOptionPane.showMessageDialog(null, "Incorrect Last Number of the Plate");
        }        
    }//GEN-LAST:event_SearchBTNActionPerformed

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
            java.util.logging.Logger.getLogger(Predictor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Predictor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Predictor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Predictor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Predictor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label2;
    private javax.swing.JTextField PlateTextField;
    private javax.swing.JButton SearchBTN;
    private javax.swing.JLabel Tittle;
    // End of variables declaration//GEN-END:variables
}
