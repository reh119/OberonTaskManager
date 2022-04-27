/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oberonguinetbeans;

/**
 *
 * @author rafaelhernandez
 */
public class editBasicTaskFrame extends javax.swing.JFrame {

    /**
     * Creates new form basicTaskFrame
     */
    public editBasicTaskFrame() {
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

        jpanel = new javax.swing.JPanel();
        updateBasicTaskB = new javax.swing.JButton();
        editBasicTaskLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        editPriority = new javax.swing.JLabel();
        editBasicTaskPriority = new javax.swing.JComboBox<>();
        editBasicTitleField = new javax.swing.JTextField();
        editBasicDateField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpanel.setBackground(new java.awt.Color(204, 204, 204));

        updateBasicTaskB.setText("Update Task");
        updateBasicTaskB.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        updateBasicTaskB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBasicTaskBActionPerformed(evt);
            }
        });

        editBasicTaskLabel.setFont(new java.awt.Font("Papyrus", 1, 24)); // NOI18N
        editBasicTaskLabel.setForeground(new java.awt.Color(153, 0, 51));
        editBasicTaskLabel.setText("Edit Basic Tasks");

        titleLabel.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 14)); // NOI18N
        titleLabel.setText("Title");

        dateLabel.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 14)); // NOI18N
        dateLabel.setText("Date");

        editPriority.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 14)); // NOI18N
        editPriority.setText("Priority");

        editBasicTaskPriority.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        editBasicTaskPriority.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        editBasicTaskPriority.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBasicTaskPriorityActionPerformed(evt);
            }
        });

        editBasicTitleField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        editBasicDateField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        javax.swing.GroupLayout jpanelLayout = new javax.swing.GroupLayout(jpanel);
        jpanel.setLayout(jpanelLayout);
        jpanelLayout.setHorizontalGroup(
            jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(updateBasicTaskB)
                .addGap(85, 85, 85))
            .addGroup(jpanelLayout.createSequentialGroup()
                .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dateLabel)
                            .addComponent(titleLabel)
                            .addComponent(editPriority)
                            .addComponent(editBasicTaskPriority, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editBasicTitleField, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(editBasicDateField)))
                    .addGroup(jpanelLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(editBasicTaskLabel)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jpanelLayout.setVerticalGroup(
            jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(editBasicTaskLabel)
                .addGap(18, 18, 18)
                .addComponent(titleLabel)
                .addGap(4, 4, 4)
                .addComponent(editBasicTitleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dateLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editBasicDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editPriority)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editBasicTaskPriority, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateBasicTaskB, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editBasicTaskPriorityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBasicTaskPriorityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editBasicTaskPriorityActionPerformed

    private void updateBasicTaskBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBasicTaskBActionPerformed
        // TODO add your handling code here:
        // When update is pressed on edit basic  task frame, task should be updated, and the edit basic task window should close without ending the program. 
        // recommended to use xxxxx.setDefaultCloseOperation(DISPOSE_ON_CLOSE); command on update button. or something else similar. .
    }//GEN-LAST:event_updateBasicTaskBActionPerformed

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
            java.util.logging.Logger.getLogger(editBasicTaskFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editBasicTaskFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editBasicTaskFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editBasicTaskFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editBasicTaskFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dateLabel;
    private javax.swing.JTextField editBasicDateField;
    private javax.swing.JLabel editBasicTaskLabel;
    private javax.swing.JComboBox<String> editBasicTaskPriority;
    private javax.swing.JTextField editBasicTitleField;
    private javax.swing.JLabel editPriority;
    private javax.swing.JPanel jpanel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton updateBasicTaskB;
    // End of variables declaration//GEN-END:variables
}
