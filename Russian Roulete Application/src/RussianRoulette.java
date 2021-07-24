import java.util.Random;
public class RussianRoulette extends javax.swing.JFrame {

    public RussianRoulette() {
        this.random = new Random(2);
        initComponents();
    }
    Random random;
    int submit;
    String names [] = new String [submit];
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        Main = new javax.swing.JPanel();
        numberOfPlayersLabel = new javax.swing.JLabel();
        russianRoulleteLabel = new javax.swing.JLabel();
        numberOfPlayersTextField = new javax.swing.JTextField();
        nameOfPlayersLabel = new javax.swing.JLabel();
        nameOfPlayersTextField = new javax.swing.JTextField();
        nextPlayerButton = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();
        shootButton = new javax.swing.JButton();
        result = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Main.setBackground(new java.awt.Color(153, 153, 255));
        Main.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(102, 102, 255), null, null));
        Main.setForeground(new java.awt.Color(51, 153, 255));

        numberOfPlayersLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        numberOfPlayersLabel.setText("Enter Number of Players Playing");

        russianRoulleteLabel.setBackground(new java.awt.Color(0, 255, 0));
        russianRoulleteLabel.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        russianRoulleteLabel.setForeground(new java.awt.Color(0, 51, 255));
        russianRoulleteLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        russianRoulleteLabel.setText("Russian Roullete");

        numberOfPlayersTextField.setBackground(new java.awt.Color(102, 102, 255));
        numberOfPlayersTextField.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        numberOfPlayersTextField.setForeground(new java.awt.Color(255, 255, 255));
        numberOfPlayersTextField.setText(" ");
        numberOfPlayersTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(204, 204, 255), new java.awt.Color(51, 102, 255), null, null));
        numberOfPlayersTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberOfPlayersTextFieldActionPerformed(evt);
            }
        });

        nameOfPlayersLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nameOfPlayersLabel.setText("Enter the Names of The Players");

        nameOfPlayersTextField.setBackground(new java.awt.Color(102, 102, 255));
        nameOfPlayersTextField.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nameOfPlayersTextField.setForeground(new java.awt.Color(255, 255, 255));
        nameOfPlayersTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameOfPlayersTextFieldActionPerformed(evt);
            }
        });

        nextPlayerButton.setBackground(new java.awt.Color(102, 51, 255));
        nextPlayerButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nextPlayerButton.setForeground(new java.awt.Color(255, 255, 255));
        nextPlayerButton.setText("Next Player");
        nextPlayerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextPlayerButtonActionPerformed(evt);
            }
        });

        submitButton.setBackground(new java.awt.Color(102, 51, 255));
        submitButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        submitButton.setForeground(new java.awt.Color(255, 255, 255));
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        shootButton.setBackground(new java.awt.Color(102, 51, 255));
        shootButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        shootButton.setForeground(new java.awt.Color(255, 255, 255));
        shootButton.setText("Shoot");

        result.setEditable(false);
        result.setBackground(new java.awt.Color(204, 204, 255));
        result.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        result.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout MainLayout = new javax.swing.GroupLayout(Main);
        Main.setLayout(MainLayout);
        MainLayout.setHorizontalGroup(
            MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(russianRoulleteLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(result)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainLayout.createSequentialGroup()
                        .addComponent(numberOfPlayersLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                        .addComponent(numberOfPlayersTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainLayout.createSequentialGroup()
                        .addComponent(nameOfPlayersLabel)
                        .addGap(18, 18, 18)
                        .addComponent(nameOfPlayersTextField))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainLayout.createSequentialGroup()
                        .addComponent(nextPlayerButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(shootButton)))
                .addContainerGap())
        );
        MainLayout.setVerticalGroup(
            MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainLayout.createSequentialGroup()
                .addComponent(russianRoulleteLabel)
                .addGap(34, 34, 34)
                .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numberOfPlayersLabel)
                    .addComponent(numberOfPlayersTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(submitButton)
                .addGap(20, 20, 20)
                .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameOfPlayersTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameOfPlayersLabel))
                .addGap(18, 18, 18)
                .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(shootButton)
                    .addComponent(nextPlayerButton))
                .addGap(18, 18, 18)
                .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameOfPlayersTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameOfPlayersTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameOfPlayersTextFieldActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        submit = Integer.parseInt(numberOfPlayersTextField.getText());
//        numberOfPlayersTextField.setText("");
    }//GEN-LAST:event_submitButtonActionPerformed

    private void nextPlayerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextPlayerButtonActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i <submit ; i++) {
            names [i] = nameOfPlayersTextField.getText();
            nameOfPlayersTextField.setText("");
            break;
        }
    }//GEN-LAST:event_nextPlayerButtonActionPerformed

    private void numberOfPlayersTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberOfPlayersTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numberOfPlayersTextFieldActionPerformed

    
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
            java.util.logging.Logger.getLogger(RussianRoulette.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RussianRoulette.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RussianRoulette.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RussianRoulette.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RussianRoulette().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Main;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel nameOfPlayersLabel;
    private javax.swing.JTextField nameOfPlayersTextField;
    private javax.swing.JButton nextPlayerButton;
    private javax.swing.JLabel numberOfPlayersLabel;
    private javax.swing.JTextField numberOfPlayersTextField;
    private javax.swing.JTextField result;
    private javax.swing.JLabel russianRoulleteLabel;
    private javax.swing.JButton shootButton;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
