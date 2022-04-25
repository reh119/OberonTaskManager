/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oberonguinetbeans;

import CoreCode.*;

import java.util.*;

/**
 *
 * @author rafaelhernandez
 */
public class taskManager extends javax.swing.JFrame {

    /**
     * Creates new form taskManager
     */
    public taskManager(TaskController C) {
        initComponents();
       this.C =C;
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
        sortBy = new javax.swing.JComboBox<>();
        sortTasks = new javax.swing.JLabel();
        searchType = new javax.swing.JComboBox<>();
        searchLabel = new javax.swing.JLabel();
        searchTask = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        descendToggle = new javax.swing.JToggleButton();
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
        addButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        OTMlabel = new javax.swing.JLabel();
        editTask = new javax.swing.JButton();
        deleteTask = new javax.swing.JButton();
        viewTaskB = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        taskTableView = new javax.swing.JTable();

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

        sortBy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Title", "Date", "Priority", "by type" }));
        sortBy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortByActionPerformed(evt);
            }
        });

        sortTasks.setText("Sort Tasks By");

        searchType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Title", "Priority", "Date", "Type" }));
        searchType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTypeActionPerformed(evt);
            }
        });

        searchLabel.setFont(new java.awt.Font("Impact", 1, 24)); // NOI18N
        searchLabel.setText("Search Tasks");

        searchTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTaskActionPerformed(evt);
            }
        });

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        descendToggle.setText("Descending");
        descendToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descendToggleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(sortTasks))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(searchLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(searchType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchTask, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(descendToggle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sortBy, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(sortTasks)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sortBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descendToggle))
                .addGap(18, 18, 18)
                .addComponent(searchLabel)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchTask, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel2.setBackground(java.awt.Color.lightGray);
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        addTaskLabel.setFont(new java.awt.Font("Impact", 3, 24)); // NOI18N
        addTaskLabel.setText("Add Task");

        jLabel6.setText("Type");

        taskType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "School", "Work", "Social", "Basic", "N/A" }));
        taskType.setSelectedIndex(3);
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
                .addContainerGap(210, Short.MAX_VALUE)
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
                .addContainerGap(39, Short.MAX_VALUE))
        );

        OTMlabel.setFont(new java.awt.Font("Impact", 3, 36)); // NOI18N
        OTMlabel.setText("Oberon Task Manager");

        editTask.setText("Edit Task");
        editTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editTaskActionPerformed(evt);
            }
        });

        deleteTask.setText("Delete Task");
        deleteTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteTaskActionPerformed(evt);
            }
        });

        viewTaskB.setText("View Task");
        viewTaskB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTaskBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(OTMlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editTask)
                            .addComponent(deleteTask, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(viewTaskB, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editTask)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(OTMlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(deleteTask)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewTaskB)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        taskTableView.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 10)); // NOI18N
        taskTableView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title", "Priority", "Type", "Date"
            }
        ));
        jScrollPane3.setViewportView(taskTableView);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 86, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void taskTypePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_taskTypePopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        comboselect(); //
        
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
                schoolF.dispose();
                break;
            case "Work":		addTaskVec.add(workF.getProjectName());
                addTaskVec.add(workF.getWorkingWith());
                addTaskVec.add(workF.getHoursWorked());
                C.addTask(TaskType.WORK, addTaskVec);
                workF.dispose();
                break;
            case "Social":		addTaskVec.add(socialF.getMeetingLocation());
                addTaskVec.add(socialF.getOccasion());
                addTaskVec.add(socialF.getAttendingHours());
                C.addTask(TaskType.SOCIAL, addTaskVec);
                socialF.dispose();
                break;
            default: 			break;
        };
    }//GEN-LAST:event_addButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
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

    private void searchTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTypeActionPerformed

    private void searchTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTaskActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTaskActionPerformed

    private void sortByActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortByActionPerformed
        int dropdownSelection = sortBy.getSelectedIndex();
        if (dropdownSelection == 0){ // ID
            C.sortTasks(TaskAttribute.ID, descendOrAscend);
        }
        if (dropdownSelection == 1){ // Title
            C.sortTasks(TaskAttribute.TITLE, descendOrAscend);
        }
        if (dropdownSelection == 2){ // Date
            C.sortTasks(TaskAttribute.DATE, descendOrAscend);
        }
        if (dropdownSelection == 3){ // Priority
            C.sortTasks(TaskAttribute.PRIORITY, descendOrAscend);
        }
        if (dropdownSelection == 4){ // Type
            C.sortTasks(TaskAttribute.TYPE, descendOrAscend);
        }
        updateTaskTable(C.getGroupTaskStrings());
    }//GEN-LAST:event_sortByActionPerformed

    private void descendToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descendToggleActionPerformed
        if (descendOrAscend == false)
        {
            descendOrAscend = true;
            descendToggle.setText(" Ascend");
        }
        else {
            descendOrAscend = false;
            descendToggle.setText("Descend");
        }
        // toggle if you wanted sorted in descending order
        // if toggled, sorts in decending order. 
        // if not toggled, then default is ascend 
        
    }//GEN-LAST:event_descendToggleActionPerformed

    private void editTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editTaskActionPerformed
        // TODO add your handling code here://
        C.selectTask(taskTableView.getSelectedRow());
        Vector<String> stringVec = new Vector<String>();
        stringVec = C.getCurrentTaskStrings();
        switch (C.getSelectedTaskType()) {
            case BASIC:     editBasicTaskFrame VBT = new editBasicTaskFrame(stringVec, C);
                            VBT.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                            VBT.setVisible(true);
                            break;
            case SCHOOL:	editSchoolTaskFrame VST = new editSchoolTaskFrame(stringVec, C);
                            VST.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                            VST.setVisible(true);
                            break;
            case WORK:		editWorkTaskFrame VWT = new editWorkTaskFrame(stringVec, C);
                            VWT.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                            VWT.setVisible(true);
                            break;
            case SOCIAL:	editSocialTaskFrame VSoCT = new editSocialTaskFrame(stringVec, C);
                            VSoCT.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                            VSoCT.setVisible(true);
                            break;
            default: 		break;
        };
        // will open new windows based on task that was selected. 
        // eg.) if work task is selected from table, and edit is clicked, then an "edit work window"  will pop up. 
        // pop up window type, depends on the task that they select from table. 
        
        // I wasnt able to test since I have no tasks to select from - rafael 
        
        
        
        
        
        
    }//GEN-LAST:event_editTaskActionPerformed

    private void viewTaskBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewTaskBActionPerformed
        // TODO add your handling code here view task will be similar to logic from edit task
        C.selectTask(taskTableView.getSelectedRow());
        Vector<String> stringVec = new Vector<String>();
        stringVec = C.getCurrentTaskStrings();
        switch (C.getSelectedTaskType()) {
            case BASIC:     viewBasicTask VBT = new viewBasicTask(stringVec);
                            VBT.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                            VBT.setVisible(true);
                break;
            case SCHOOL:	viewSchoolTask VST = new viewSchoolTask(stringVec);
                            VST.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                            VST.setVisible(true);
                break;
            case WORK:		viewWorkTask VWT = new viewWorkTask(stringVec);
                            VWT.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                            VWT.setVisible(true);
                break;
            case SOCIAL:	viewSocialTask VSoCT = new viewSocialTask(stringVec);
                            VSoCT.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                            VSoCT.setVisible(true);
                break;
            default: 			break;
        };
        
    }//GEN-LAST:event_viewTaskBActionPerformed

    //
    
    private void updateTaskTable(Vector<Vector<String>> stringVec) {
    	taskTableView.setModel(new javax.swing.table.DefaultTableModel(
                new Object [stringVec.size()][3],
                new String [] {
                     "Title", "Priority", "Type", "Date"
                }));
    	for (int i = 0; i < stringVec.size(); i++)
    	{
    		taskTableView.getModel().setValueAt(stringVec.get(i).get(0), i, 0);
    		taskTableView.getModel().setValueAt(stringVec.get(i).get(3), i, 1);
    		taskTableView.getModel().setValueAt(stringVec.get(i).get(2), i, 2);
    		taskTableView.getModel().setValueAt(stringVec.get(i).get(1), i, 3);
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
            workF = new workFrame ();
            workF.setVisible(true);
            workF.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        }
        if (test == 2){ // Social 
            socialF = new socialFrame (); // school frame
            socialF.setVisible(true);
            socialF.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        }
        // if the user wants basic tasks, they just fill in default fields on taskManager.java fram
        
    }
    

    /**
     * @param args the command line arguments
     */

    TaskController C ;
    schoolFrame schoolF;
    socialFrame socialF;
    workFrame   workF;
    boolean descendOrAscend = false;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel OTMlabel;
    private javax.swing.JButton addButton;
    private javax.swing.JLabel addTaskLabel;
    private javax.swing.JTextField dateField;
    private javax.swing.JButton deleteTask;
    private javax.swing.JToggleButton descendToggle;
    private javax.swing.JButton editTask;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable3;
    private javax.swing.JComboBox<String> priorityType;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JTextField searchTask;
    private javax.swing.JComboBox<String> searchType;
    private javax.swing.JComboBox<String> sortBy;
    private javax.swing.JLabel sortTasks;
    private javax.swing.JTable taskTableView;
    private javax.swing.JComboBox<String> taskType;
    private javax.swing.JTextField titleField;
    private javax.swing.JButton viewTaskB;
    // End of variables declaration//GEN-END:variables
}
