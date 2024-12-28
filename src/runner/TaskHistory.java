/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package runner;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Esther Mun
 */
public class TaskHistory extends javax.swing.JFrame {

   private DefaultTableModel model= new DefaultTableModel();
   private String[] columnName= {"TaskID","Date","CustomerName","Status"};
           
    public TaskHistory() {
        initComponents();
        model.setColumnIdentifiers(columnName);
        jTable2.setModel(model);
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
        jPanel2 = new javax.swing.JPanel();
        thehungryhub = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        usericon = new javax.swing.JButton();
        order6 = new javax.swing.JButton();
        order8 = new javax.swing.JButton();
        order9 = new javax.swing.JButton();
        order10 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        jLabel1.setText("Task History");

        jLabel2.setText("jLabel2");

        jPanel2.setBackground(new java.awt.Color(255, 204, 102));

        thehungryhub.setFont(new java.awt.Font("Perpetua", 3, 36)); // NOI18N
        thehungryhub.setForeground(new java.awt.Color(255, 255, 255));
        thehungryhub.setText("The Hungry Hub.");

        login.setBackground(new java.awt.Color(255, 204, 102));
        login.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("log in");
        login.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        login.setBorderPainted(false);
        login.setHideActionText(true);
        login.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        login.setPreferredSize(new java.awt.Dimension(20, 10));
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        usericon.setBackground(new java.awt.Color(255, 204, 102));
        usericon.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        usericon.setForeground(new java.awt.Color(255, 255, 255));
        usericon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user (2).png"))); // NOI18N
        usericon.setBorderPainted(false);
        usericon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usericonActionPerformed(evt);
            }
        });

        order6.setBackground(new java.awt.Color(255, 204, 102));
        order6.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        order6.setForeground(new java.awt.Color(255, 255, 255));
        order6.setText("Task History");
        order6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        order6.setBorderPainted(false);
        order6.setHideActionText(true);
        order6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        order6.setPreferredSize(new java.awt.Dimension(20, 10));
        order6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                order6ActionPerformed(evt);
            }
        });

        order8.setBackground(new java.awt.Color(255, 204, 102));
        order8.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        order8.setForeground(new java.awt.Color(255, 255, 255));
        order8.setText("Revenue");
        order8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        order8.setBorderPainted(false);
        order8.setHideActionText(true);
        order8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        order8.setPreferredSize(new java.awt.Dimension(20, 10));
        order8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                order8ActionPerformed(evt);
            }
        });

        order9.setBackground(new java.awt.Color(255, 204, 102));
        order9.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        order9.setForeground(new java.awt.Color(255, 255, 255));
        order9.setText("TASK");
        order9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        order9.setBorderPainted(false);
        order9.setHideActionText(true);
        order9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        order9.setPreferredSize(new java.awt.Dimension(20, 10));
        order9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                order9ActionPerformed(evt);
            }
        });

        order10.setBackground(new java.awt.Color(255, 204, 102));
        order10.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        order10.setForeground(new java.awt.Color(255, 255, 255));
        order10.setText("STATUS");
        order10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        order10.setBorderPainted(false);
        order10.setHideActionText(true);
        order10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        order10.setPreferredSize(new java.awt.Dimension(20, 10));
        order10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                order10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(thehungryhub, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(order9, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(order10, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addComponent(order6, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(order8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usericon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usericon)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(thehungryhub)
                        .addComponent(order6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(order8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(order9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(order10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTable2.setModel(model);
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(120, 120, 120)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(242, 242, 242))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
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

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginActionPerformed

    private void usericonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usericonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usericonActionPerformed

    private void order6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_order6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_order6ActionPerformed

    private void order8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_order8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_order8ActionPerformed

    private void order9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_order9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_order9ActionPerformed

    private void order10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_order10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_order10ActionPerformed

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
            java.util.logging.Logger.getLogger(TaskHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaskHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaskHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaskHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaskHistory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton login;
    private javax.swing.JButton order10;
    private javax.swing.JButton order6;
    private javax.swing.JButton order8;
    private javax.swing.JButton order9;
    private javax.swing.JLabel thehungryhub;
    private javax.swing.JButton usericon;
    // End of variables declaration//GEN-END:variables
}
