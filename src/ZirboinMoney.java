
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nilei4218
 */
public class ZirboinMoney extends javax.swing.JFrame {

    /**
     * Creates new form ZirboinMoney
     */
    public ZirboinMoney() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        totalInput = new javax.swing.JTextField();
        Drobzit$ = new javax.swing.JLabel();
        Clickwick$ = new javax.swing.JLabel();
        Gazoontight$ = new javax.swing.JLabel();
        Frazoint$ = new javax.swing.JLabel();
        Blointoint$ = new javax.swing.JLabel();
        Vrobits$ = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Swis721 BdCnOul BT", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 255));
        jLabel1.setText("Zirboin Coin Manage");

        jLabel2.setFont(new java.awt.Font("Zurich Blk Win95BT", 0, 12)); // NOI18N
        jLabel2.setText("Enter amount of vrobits:");

        totalInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalInputActionPerformed(evt);
            }
        });

        Drobzit$.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Drobzit$.setForeground(new java.awt.Color(255, 0, 0));
        Drobzit$.setText("Drobzit");

        Clickwick$.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Clickwick$.setForeground(new java.awt.Color(255, 102, 0));
        Clickwick$.setText("Clickwick ");

        Gazoontight$.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Gazoontight$.setForeground(new java.awt.Color(51, 255, 255));
        Gazoontight$.setText("Gazoontight ");

        Frazoint$.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Frazoint$.setForeground(new java.awt.Color(0, 153, 51));
        Frazoint$.setText("Frazoint ");

        Blointoint$.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Blointoint$.setForeground(new java.awt.Color(0, 0, 255));
        Blointoint$.setText("Blointoint ");

        Vrobits$.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Vrobits$.setForeground(new java.awt.Color(204, 0, 204));
        Vrobits$.setText("Vrobits");

        jButton1.setText("Manage");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(99, 99, 99)
                            .addComponent(jLabel1))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(totalInput, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Clickwick$, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Drobzit$, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Vrobits$)
                        .addComponent(Frazoint$, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Blointoint$, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Gazoontight$, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(totalInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(Drobzit$, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Clickwick$)
                .addGap(18, 18, 18)
                .addComponent(Gazoontight$)
                .addGap(18, 18, 18)
                .addComponent(Frazoint$)
                .addGap(18, 18, 18)
                .addComponent(Blointoint$)
                .addGap(18, 18, 18)
                .addComponent(Vrobits$)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void totalInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalInputActionPerformed
        
    }//GEN-LAST:event_totalInputActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Scanner keyedInput = new Scanner(System.in);
        int total;
        int drobzit,clickwick,gazoontight,frazoint,blointoint,vrobits;
        drobzit = 0;
        clickwick = 0;
        gazoontight = 0;
        frazoint = 0;
        blointoint = 0;
        vrobits = 0;
        
        total = Integer.parseInt(totalInput.getText());
        
        while(total >= 100000){
        drobzit++;
        total = total - 100000;
    }
        while(total >= 50000){
        clickwick++;
        total = total - 50000;
    }
         while(total >= 10000){
        gazoontight++;
        total = total - 10000;
    }
         while(total >= 1000){
        frazoint++;
        total = total - 1000;
    }
         while(total >= 500){
        blointoint++;
        total = total - 500;
    }
         while(total >= 500){
        vrobits++;
        total = total - 500;
    }
        
        Drobzit$.setText("You have " + drobzit + " Drobzits");
        Clickwick$.setText("You have " + clickwick + " Clickwicks");
        Gazoontight$.setText("You have " + gazoontight +  "Gazoontight");
        Frazoint$.setText("You have " + frazoint + " Frazoints");
        Blointoint$.setText("You have " + blointoint + " Blointoints");
        Vrobits$.setText("You have " + vrobits + " Vrobits");
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ZirboinMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ZirboinMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ZirboinMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ZirboinMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ZirboinMoney().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Blointoint$;
    private javax.swing.JLabel Clickwick$;
    private javax.swing.JLabel Drobzit$;
    private javax.swing.JLabel Frazoint$;
    private javax.swing.JLabel Gazoontight$;
    private javax.swing.JLabel Vrobits$;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField totalInput;
    // End of variables declaration//GEN-END:variables
}
