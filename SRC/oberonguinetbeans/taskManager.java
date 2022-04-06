/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oberonguinetbeans;
import CoreCode.TaskController;
import CoreCode.TaskType;

import java.util.Vector;

import CoreCode.TaskAttribute;

/**
 *
 * @author rafaelhernandez
 */
public class taskManager extends javax.swing.JFrame {

    /**
     * Creates new form taskManager
     */
    public taskManager(TaskController controller) {
    	C = controller;
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

        jTable3 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        taskTableView = new javax.swing.JTable();
        javax.swing.JComboBox<String> sortBy = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        searchType = new javax.swing.JComboBox<>();
        searchB = new javax.swing.JLabel();
        searchTask = new javax.swing.JTextField();
        javax.swing.JButton searchButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        addTaskLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        taskType = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        titleField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        dateField = new javax.swing.JTextField();
        priorityType = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        javax.swing.JButton addButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        javax.swing.JButton jButton3 = new javax.swing.JButton();
        javax.swing.JButton deleteTask = new javax.swing.JButton();

        jTable3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title", "Due Date", "Type", "Priority"
            }
        ));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        taskTableView.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 10)); // NOI18N
        taskTableView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "TaskID", "Title", "Priority", "Type", "Date"
            }
        ));
        jScrollPane3.setViewportView(taskTableView);

        sortBy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Title", "Date" }));

        jLabel7.setText("Sort Tasks By");

        searchType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Title", "Priority", "Date", "Type" }));

        searchB.setFont(new java.awt.Font("Impact", 1, 24)); // NOI18N
        searchB.setText("Search Tasks");

        searchTask.setText("searchTask");

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(sortBy, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(searchB))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(searchType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchTask, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sortBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchTask, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(java.awt.Color.lightGray);
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        addTaskLabel.setFont(new java.awt.Font("Impact", 3, 24)); // NOI18N
        addTaskLabel.setText("Add Task");

        jLabel6.setText("Type");

        taskType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "School", "Work", "Social", "Basic" }));
        taskType.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                taskTypePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        taskType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taskTypeActionPerformed(evt);
            }
        });

        jLabel3.setText("Title");

        jLabel4.setText("Date/Due");

        priorityType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));

        jLabel5.setText("Priority");

        addButton.setText("Add Task");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addTaskLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(priorityType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(titleField)
                            .addComponent(jLabel4)
                            .addComponent(dateField, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE))
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)
                        .addComponent(taskType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addButton)
                .addGap(103, 103, 103))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(addTaskLabel)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(3, 3, 3)))
                .addComponent(titleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(3, 3, 3)
                .addComponent(priorityType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(taskType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(addButton)
                .addContainerGap(149, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Impact", 3, 36)); // NOI18N
        jLabel1.setText("Oberon Task Manager");

        jButton3.setText("Edit Task");

        deleteTask.setText("Delete task");
        deleteTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteTaskActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteTask, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteTask)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void taskTypePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_taskTypePopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        comboselect(); 
        
    }//GEN-LAST:event_taskTypePopupMenuWillBecomeInvisible

    private void taskTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taskTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_taskTypeActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
    	Vector<String> addTaskVec = new Vector<String>();
    	addTaskVec.add(titleField.getText());
    	addTaskVec.add(dateField.getText());
    	addTaskVec.add(priorityType.getItemAt(priorityType.getSelectedIndex()));
    	switch (taskType.getItemAt(taskType.getSelectedIndex())) {
    	case "Basic": 		C.addTask(TaskType.BASIC, addTaskVec);
    						break;
    	case "School":		addTaskVec.add(schoolF.getCourseName());
    						addTaskVec.add(schoolF.getHomeworkName());
    						addTaskVec.add(schoolF.getStudyHours());
    						C.addTask(TaskType.SCHOOL, addTaskVec);
    						break;
    	default: 	break;
    	};
    }//GEN-LAST:event_addButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
    	switch(searchType.getItemAt(searchType.getSelectedIndex())) {
    	case "Title":		C.findTasks(TaskAttribute.TITLE, searchTask.getText());
    						break;
    	case "Date":		C.findTasks(TaskAttribute.DATE, searchTask.getText());
    						break;
    	case "Type":		C.findTasks(TaskAttribute.TYPE, searchTask.getText());
    						break;
    	case "Priority":	C.findTasks(TaskAttribute.PRIORITY, searchTask.getText());
    						break;
    	}
    	updateTaskTable(C.getGroupTaskStrings());
    }//GEN-LAST:event_searchButtonActionPerformed

    private void deleteTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteTaskActionPerformed
        C.selectTask(taskTableView.getSelectedRow());
        C.removeTask();
    }//GEN-LAST:event_deleteTaskActionPerformed
    
    private void updateTaskTable(Vector<Vector<String>> stringVec) {
    	taskTableView.setModel(new javax.swing.table.DefaultTableModel(
                new Object [stringVec.size()][4],
                new String [] {
                    "TaskID", "Title", "Priority", "Type", "Date"
                }));
    	for (int i = 0; i < stringVec.size(); i++)
    	{
    		taskTableView.getModel().setValueAt(stringVec.get(i).get(0), i, 1);
    		taskTableView.getModel().setValueAt(stringVec.get(i).get(3), i, 2);
    		taskTableView.getModel().setValueAt(stringVec.get(i).get(2), i, 3);
    		taskTableView.getModel().setValueAt(stringVec.get(i).get(1), i, 4);
    	}
    }

    public void comboselect(){ // selection when user selects type of tasks 
        int test = taskType.getSelectedIndex();
        
        if (test == 0){ // school frame
            schoolF = new schoolFrame (); 
            schoolF.setVisible(true);
            schoolF.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        }
        if (test == 1){ // work frame 
            workFrame workF = new workFrame (); 
            workF.setVisible(true);
            workF.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        }
        if (test == 2){ // Social 
            socialFrame socialF = new socialFrame (); // school frame 
            socialF.setVisible(true);
            socialF.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        }
        // if the user wants basic tasks, they just fill in default fields on taskManager.java frame
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addTaskLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel searchB;
    private javax.swing.JComboBox<String> searchType;
    private javax.swing.JComboBox<String> taskType;
    private javax.swing.JTextField titleField;
    private javax.swing.JTextField dateField;
    private javax.swing.JComboBox<String> priorityType;
    private TaskController C;
    private javax.swing.JTable taskTableView;
    private javax.swing.JTextField searchTask;
    schoolFrame schoolF;
    // End of variables declaration//GEN-END:variables
}
