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
public class editBasicTaskFrame extends javax.swing.JFrame {

    /**
     * Creates new form basicTaskFrame
     */
    public editBasicTaskFrame(Vector<String> dataFields, TaskController C)
    {
        initComponents();
        editBasicTitleField.setText(dataFields.get(0));
        editBasicDateField.setText(dataFields.get(1));
        editBasicTaskPriority.setSelectedIndex(Integer.parseInt(dataFields.get(3))-1);
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

        updateBasicTaskB.setText("Update Task");
        updateBasicTaskB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBasicTaskBActionPerformed(evt);
            }
        });

        editBasicTaskLabel.setText("Edit Basic Tasks");

        titleLabel.setText("Title");

        dateLabel.setText("Date");

        editPriority.setText("Priority");

        editBasicTaskPriority.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        editBasicTaskPriority.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBasicTaskPriorityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelLayout = new javax.swing.GroupLayout(jpanel);
        jpanel.setLayout(jpanelLayout);
        jpanelLayout.setHorizontalGroup(
            jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(updateBasicTaskB)
                .addGap(34, 34, 34))
            .addGroup(jpanelLayout.createSequentialGroup()
                .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateLabel)
                            .addComponent(titleLabel)
                            .addComponent(editPriority)
                            .addComponent(editBasicTaskPriority, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editBasicTitleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editBasicDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpanelLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(editBasicTaskLabel)))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        jpanelLayout.setVerticalGroup(
            jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(editBasicTaskLabel)
                .addGap(26, 26, 26)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                .addComponent(updateBasicTaskB, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editBasicTaskPriorityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBasicTaskPriorityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editBasicTaskPriorityActionPerformed

    private void updateBasicTaskBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBasicTaskBActionPerformed
        // TODO add your handling code here:
        Vector<String> dataFields = new Vector<String>();
        dataFields.add(editBasicTitleField.getText());
        dataFields.add(editBasicDateField.getText());
        dataFields.add(String.valueOf((editBasicTaskPriority.getSelectedIndex()+1)));
        C.editTask(TaskType.BASIC, dataFields);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_updateBasicTaskBActionPerformed

    /**
     * @param args the command line arguments
     */

    TaskController C;

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
