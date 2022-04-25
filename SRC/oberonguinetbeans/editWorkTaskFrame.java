/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oberonguinetbeans;

import CoreCode.TaskController;
import CoreCode.TaskType;

import java.util.Vector;

/**
 *
 * @author rafaelhernandez
 */
public class editWorkTaskFrame extends javax.swing.JFrame {

    /**
     * Creates new form editWorkTask
     */
    public editWorkTaskFrame(Vector<String> dataFields, TaskController C)
    {
        initComponents();
        editworkTitleField.setText(dataFields.get(0));
        editWorkDateField.setText(dataFields.get(1));
        editWorkPriority.setSelectedIndex(Integer.parseInt(dataFields.get(3))-1);
        workEditProjNField.setText(dataFields.get(4));
        workEditMeetWField.setText(dataFields.get(5));
        workEditHoursLabel.setText(dataFields.get(6));
        this.C = C;
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
        editWorkTasksLabel = new javax.swing.JLabel();
        workEditTitleLabel = new javax.swing.JLabel();
        workEditDateLabel = new javax.swing.JLabel();
        workEditPriorityLabel = new javax.swing.JLabel();
        workEditProjNameLabel = new javax.swing.JLabel();
        workEditMeetWLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        editworkTitleField = new javax.swing.JTextField();
        editWorkDateField = new javax.swing.JTextField();
        workEditProjNField = new javax.swing.JTextField();
        workEditMeetWField = new javax.swing.JTextField();
        workEditHoursLabel = new javax.swing.JTextField();
        updateWorkTaskB = new javax.swing.JButton();
        editWorkPriority = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        editWorkTasksLabel.setText("Edit Work Tasks");

        workEditTitleLabel.setText("Title ");

        workEditDateLabel.setText("Date/Due:");

        workEditPriorityLabel.setText("Priority");

        workEditProjNameLabel.setText("Project Name");

        workEditMeetWLabel.setText("Meeting With");

        jLabel7.setText("Hours Worked");

        editworkTitleField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editworkTitleFieldActionPerformed(evt);
            }
        });

        editWorkDateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editWorkDateFieldActionPerformed(evt);
            }
        });

        updateWorkTaskB.setText("Update Task");
        updateWorkTaskB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateWorkTaskBActionPerformed(evt);
            }
        });

        editWorkPriority.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(workEditMeetWField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(workEditProjNField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editWorkDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(workEditDateLabel)
                                .addComponent(workEditTitleLabel)
                                .addComponent(workEditPriorityLabel)
                                .addComponent(workEditProjNameLabel)
                                .addComponent(workEditMeetWLabel)
                                .addComponent(jLabel7)
                                .addComponent(editworkTitleField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(workEditHoursLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(editWorkPriority, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(updateWorkTaskB))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(editWorkTasksLabel)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(editWorkTasksLabel)
                .addGap(18, 18, 18)
                .addComponent(workEditTitleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editworkTitleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(workEditDateLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editWorkDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(workEditPriorityLabel)
                .addGap(2, 2, 2)
                .addComponent(editWorkPriority, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(workEditProjNameLabel)
                .addGap(1, 1, 1)
                .addComponent(workEditProjNField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(workEditMeetWLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(workEditMeetWField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(workEditHoursLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(updateWorkTaskB)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editworkTitleFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editworkTitleFieldActionPerformed
        // TODO add your handling code here:
        // leave alone unless needed, or erase
    }//GEN-LAST:event_editworkTitleFieldActionPerformed

    private void editWorkDateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editWorkDateFieldActionPerformed
        // TODO add your handling code here:
        // leave alone unless needed, or erase  
    }//GEN-LAST:event_editWorkDateFieldActionPerformed

    private void updateWorkTaskBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateWorkTaskBActionPerformed
        // TODO add your handling code here:
        Vector<String> dataFields = new Vector<String>();
        dataFields.add(editworkTitleField.getText());
        dataFields.add(editWorkDateField.getText());
        dataFields.add(String.valueOf(editWorkPriority.getSelectedIndex()+1));
        dataFields.add(workEditProjNField.getText());
        dataFields.add(workEditMeetWField.getText());
        dataFields.add(workEditHoursLabel.getText());
        C.editTask(TaskType.WORK, dataFields);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.dispose();
        // When update is pressed on edit work task frame, task should be updated, and the edit work task window should close without ending the program. 
        // recommended to use xxxxx.setDefaultCloseOperation(DISPOSE_ON_CLOSE); command on update button. or something similar
        
    }//GEN-LAST:event_updateWorkTaskBActionPerformed

    /**
     * @param args the command line arguments
     */


    TaskController C;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField editWorkDateField;
    private javax.swing.JComboBox<String> editWorkPriority;
    private javax.swing.JLabel editWorkTasksLabel;
    private javax.swing.JTextField editworkTitleField;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton updateWorkTaskB;
    private javax.swing.JLabel workEditDateLabel;
    private javax.swing.JTextField workEditHoursLabel;
    private javax.swing.JTextField workEditMeetWField;
    private javax.swing.JLabel workEditMeetWLabel;
    private javax.swing.JLabel workEditPriorityLabel;
    private javax.swing.JTextField workEditProjNField;
    private javax.swing.JLabel workEditProjNameLabel;
    private javax.swing.JLabel workEditTitleLabel;
    // End of variables declaration//GEN-END:variables
}
