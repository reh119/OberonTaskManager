/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oberonguinetbeans;

import java.util.Vector;

/**
 *
 * @author rafaelhernandez
 */
public class viewWorkTask extends javax.swing.JFrame {

    /**
     * Creates new form viewWorkTask
     */
    public viewWorkTask(Vector<String> dataFields)
    {
        initComponents();
        viewWorkTaskTitleField.setText(dataFields.get(0));
        viewWorkTaskDateField.setText(dataFields.get(1));
        viewWorkTaskTypeField.setText(dataFields.get(2));
        viewWorkTaskPriorityField.setText(dataFields.get(3));
        viewWorkTaskProjField.setText(dataFields.get(4));
        viewWorkTaskMeetField.setText(dataFields.get(5));
        viewWorkTaskHoursField.setText(dataFields.get(6));
        viewWorkTaskTitleField.setEditable(false);
        viewWorkTaskDateField.setEditable(false);
        viewWorkTaskTypeField.setEditable(false);
        viewWorkTaskPriorityField.setEditable(false);
        viewWorkTaskProjField.setEditable(false);
        viewWorkTaskMeetField.setEditable(false);
        viewWorkTaskHoursField.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        viewWorkTaskTitleField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        viewWorkTaskDateField = new javax.swing.JTextField();
        viewWorkTaskPriorityField = new javax.swing.JTextField();
        viewWorkTaskTypeField = new javax.swing.JTextField();
        viewWorkTaskProjField = new javax.swing.JTextField();
        viewWorkTaskMeetField = new javax.swing.JTextField();
        viewWorkTaskHoursField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Papyrus", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(150, 0, 51));
        jLabel1.setText("View Work Task");

        jLabel2.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 14)); // NOI18N
        jLabel2.setText("Title");

        viewWorkTaskTitleField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        viewWorkTaskTitleField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewWorkTaskTitleFieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 14)); // NOI18N
        jLabel3.setText("Date");

        jLabel4.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 14)); // NOI18N
        jLabel4.setText("Priortiy");

        jLabel5.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 14)); // NOI18N
        jLabel5.setText("Type");

        jLabel6.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 14)); // NOI18N
        jLabel6.setText("Project Name");

        jLabel7.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 14)); // NOI18N
        jLabel7.setText("Meeting With");

        jLabel8.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 14)); // NOI18N
        jLabel8.setText("Hours Worked");

        viewWorkTaskDateField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        viewWorkTaskPriorityField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        viewWorkTaskTypeField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        viewWorkTaskProjField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        viewWorkTaskMeetField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        viewWorkTaskMeetField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewWorkTaskMeetFieldActionPerformed(evt);
            }
        });

        viewWorkTaskHoursField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(viewWorkTaskTitleField)
                            .addComponent(viewWorkTaskDateField, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(viewWorkTaskPriorityField)
                            .addComponent(viewWorkTaskTypeField)
                            .addComponent(viewWorkTaskProjField)
                            .addComponent(viewWorkTaskMeetField)
                            .addComponent(viewWorkTaskHoursField))))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewWorkTaskTitleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewWorkTaskDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewWorkTaskPriorityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel5)
                .addGap(2, 2, 2)
                .addComponent(viewWorkTaskTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewWorkTaskProjField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewWorkTaskMeetField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewWorkTaskHoursField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewWorkTaskTitleFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewWorkTaskTitleFieldActionPerformed
        // TODO add your handling code here:
        viewWorkTaskTitleField.setEditable(false); // should make it so that once fields are recieved, user cannot make changes. , 
        // may or may not work. feel free to delete and make fields un editable another way.
    }//GEN-LAST:event_viewWorkTaskTitleFieldActionPerformed

    private void viewWorkTaskMeetFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewWorkTaskMeetFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewWorkTaskMeetFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField viewWorkTaskDateField;
    private javax.swing.JTextField viewWorkTaskHoursField;
    private javax.swing.JTextField viewWorkTaskMeetField;
    private javax.swing.JTextField viewWorkTaskPriorityField;
    private javax.swing.JTextField viewWorkTaskProjField;
    private javax.swing.JTextField viewWorkTaskTitleField;
    private javax.swing.JTextField viewWorkTaskTypeField;
    // End of variables declaration//GEN-END:variables
//viewWorkTaskTitle.setEditable(false); 

}

