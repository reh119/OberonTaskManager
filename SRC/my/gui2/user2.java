package my.gui2;
import CoreCode.TaskAttribute;
import CoreCode.TaskType;
import CoreCode.TaskController;

import java.util.Vector;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


/** 

 *
 * @author oscarramirez
 */
public class user2 extends javax.swing.JFrame {

    /**
     * Creates new form user2
     */
    public user2(TaskController C) {
        initComponents();
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        titleText = new javax.swing.JTextField();
        dateText = new javax.swing.JTextField();
        priorityText = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        schoolCheckbox = new javax.swing.JCheckBox();
        workCheckbox = new javax.swing.JCheckBox();
        socialCheckbox = new javax.swing.JCheckBox();
        clearButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taskTableView = new javax.swing.JTable();
        viewTaskButton = new javax.swing.JButton();
        sortTitleBut = new javax.swing.JButton();
        switchGUIBut = new javax.swing.JButton();
        sortTypeBut = new javax.swing.JButton();
        sortDateBut = new javax.swing.JButton();
        sortPriorityBut = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        searchText = new javax.swing.JTextField();
        titleCheckBox = new javax.swing.JCheckBox();
        priorityCheckBox = new javax.swing.JCheckBox();
        dateCheckBox = new javax.swing.JCheckBox();
        typeCheckBox = new javax.swing.JCheckBox();
        searchButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Oberon Task Manager"));

        jLabel1.setText("Task Title:");

        jLabel2.setText("Date:");

        jLabel3.setText("Priority:");

        titleText.setText("jTextField1");

        dateText.setText("jTextField2");

        priorityText.setText("jTextField3");

        addButton.setText("Add Task");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        schoolCheckbox.setText("School");
        schoolCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schoolCheckboxActionPerformed(evt);
            }
        });

        workCheckbox.setText("Work");
        workCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workCheckboxActionPerformed(evt);
            }
        });

        socialCheckbox.setText("Social");
        socialCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                socialCheckboxActionPerformed(evt);
            }
        });

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titleText, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                            .addComponent(dateText, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(priorityText))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(schoolCheckbox)
                            .addComponent(workCheckbox)
                            .addComponent(socialCheckbox)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exitButton)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(titleText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(schoolCheckbox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(workCheckbox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(priorityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(socialCheckbox))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(clearButton)
                    .addComponent(exitButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Display"));

        taskTableView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Task Title", "Priority", "Type", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        taskTableView.setToolTipText("");
        taskTableView.setColumnSelectionAllowed(false);
        taskTableView.setShowGrid(true);
        jScrollPane1.setViewportView(taskTableView);
        taskTableView.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        viewTaskButton.setText("View Task");
        viewTaskButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTaskButtonActionPerformed(evt);
            }
        });

        sortTitleBut.setText("Sort By Title");
        sortTitleBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortTitleButActionPerformed(evt);
            }
        });

        switchGUIBut.setText("Switch GUI");
        switchGUIBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switchGUIButActionPerformed(evt);
            }
        });

        sortTypeBut.setText("Sort By Type");
        sortTypeBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortTypeButActionPerformed(evt);
            }
        });

        sortDateBut.setText("Sort By Date");
        sortDateBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortDateButActionPerformed(evt);
            }
        });

        sortPriorityBut.setText("Sort By Priority");
        sortPriorityBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortPriorityButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(sortPriorityBut)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(switchGUIBut, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(viewTaskButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sortTitleBut)
                                .addGap(12, 12, 12)
                                .addComponent(sortTypeBut)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sortDateBut)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewTaskButton)
                    .addComponent(sortTitleBut)
                    .addComponent(sortTypeBut)
                    .addComponent(sortDateBut))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sortPriorityBut)
                    .addComponent(switchGUIBut, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        searchText.setText("jTextField1");

        titleCheckBox.setText("Task Title");
        titleCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleCheckBoxActionPerformed(evt);
            }
        });

        priorityCheckBox.setText("Priority");
        priorityCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priorityCheckBoxActionPerformed(evt);
            }
        });

        dateCheckBox.setText("Date ");
        dateCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateCheckBoxActionPerformed(evt);
            }
        });

        typeCheckBox.setText("Task Type");
        typeCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeCheckBoxActionPerformed(evt);
            }
        });

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(typeCheckBox)
                    .addComponent(titleCheckBox)
                    .addComponent(priorityCheckBox)
                    .addComponent(dateCheckBox))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titleCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priorityCheckBox)
                    .addComponent(searchButton))
                .addGap(7, 7, 7)
                .addComponent(dateCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(typeCheckBox)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int check =0;

    int searchCheck = 1;
    String taskType = "";
    workFrame2 wf;
    schoolFrame2 sf;
    socialFrame2 scf;

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        Vector<String> dataValues = new Vector<String>();
        if(workCheckbox.getModel().isSelected() && socialCheckbox.getModel().isSelected()
                && schoolCheckbox.getModel().isSelected()) {
            check = 0;
        }
        dataValues.add(titleText.getText());
        dataValues.add(dateText.getText());
        dataValues.add(priorityText.getText());
        if(check == 1){
            dataValues.addAll(sf.getFields());
            C.addTask(TaskType.SCHOOL, dataValues);
            sf.dispose();
        }else if(check == 2) {
            dataValues.addAll(wf.getFields());
            C.addTask(TaskType.WORK, dataValues);
            wf.dispose();
        } else if(check == 3){
            dataValues.addAll(scf.getFields());
            C.addTask(TaskType.SOCIAL, dataValues);
            scf.dispose();
        } else {
            C.addTask(TaskType.BASIC, dataValues);
        }


    }//GEN-LAST:event_addButtonActionPerformed


    private void schoolCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schoolCheckboxActionPerformed
        // TODO add your handling code here:
        workCheckbox.setSelected(false);
        socialCheckbox.setSelected(false);
        sf = new schoolFrame2();
        sf.setVisible(true);
        sf.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        taskType = "School";
        check = 1;

    }//GEN-LAST:event_schoolCheckboxActionPerformed

    private void workCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workCheckboxActionPerformed
        // TODO add your handling code here:
        schoolCheckbox.setSelected(false);
        socialCheckbox.setSelected(false);
        wf = new workFrame2();
        wf.setVisible(true);
        wf.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        taskType = "Work";
        check = 2;
    }//GEN-LAST:event_workCheckboxActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        titleText.setText("");
        dateText.setText("");
        priorityText.setText("");
    }//GEN-LAST:event_clearButtonActionPerformed

    private void socialCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_socialCheckboxActionPerformed
        // TODO add your handling code here:
        schoolCheckbox.setSelected(false);
        workCheckbox.setSelected(false);
        scf = new socialFrame2();
        scf.setVisible(true);
        scf.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        taskType = "Social";
        check = 3;
    }//GEN-LAST:event_socialCheckboxActionPerformed

    private void viewTaskButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewTaskButtonActionPerformed
        // TODO add your handling code here:
        switch((String)taskTableView.getModel().getValueAt(taskTableView.getSelectedRow(), 2)){

            case "Basic":
                basicTaskInfo bt = new basicTaskInfo(C);
                bt.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                bt.setVisible(true);
                break;

            case "School":
                schoolTaskInfo st = new schoolTaskInfo(C);
                st.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                st.setVisible(true);
                break;

            case "Work":
                workTaskInfo wt = new workTaskInfo(C);
                wt.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                wt.setVisible(true);
                break;

            case "Social":
                socialTaskInfo sct = new socialTaskInfo(C);
                sct.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                sct.setVisible(true);
                break;

            default:
                break;

        }





    }//GEN-LAST:event_viewTaskButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        switch(searchCheck)
        {
            case 1:     C.findTasks(TaskAttribute.TITLE, searchText.getText());
                break;
            case 2:     C.findTasks(TaskAttribute.PRIORITY, searchText.getText());
                break;
            case 3:     C.findTasks(TaskAttribute.DATE, searchText.getText());
                break;
            case 4:     C.findTasks(TaskAttribute.TYPE, searchText.getText());
                break;
            default:
                break;
        }
        updateTaskTable(C.getGroupTaskStrings());

    }//GEN-LAST:event_searchButtonActionPerformed

    private void titleCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleCheckBoxActionPerformed
        // TODO add your handling code here:
        priorityCheckBox.setSelected(false);
        dateCheckBox.setSelected(false);
        typeCheckBox.setSelected(false);
        searchCheck = 1;
    }//GEN-LAST:event_titleCheckBoxActionPerformed

    private void priorityCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priorityCheckBoxActionPerformed
        // TODO add your handling code here:
        titleCheckBox.setSelected(false);
        dateCheckBox.setSelected(false);
        typeCheckBox.setSelected(false);
        searchCheck = 2;
    }//GEN-LAST:event_priorityCheckBoxActionPerformed

    private void dateCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateCheckBoxActionPerformed
        // TODO add your handling code here:
        titleCheckBox.setSelected(false);
        priorityCheckBox.setSelected(false);
        typeCheckBox.setSelected(false);
        searchCheck = 3;
    }//GEN-LAST:event_dateCheckBoxActionPerformed

    private void typeCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeCheckBoxActionPerformed
        // TODO add your handling code here:
        titleCheckBox.setSelected(false);
        priorityCheckBox.setSelected(false);
        dateCheckBox.setSelected(false);
        searchCheck = 4;
    }//GEN-LAST:event_typeCheckBoxActionPerformed

    private void sortTitleButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortTitleButActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sortTitleButActionPerformed

    private void sortTypeButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortTypeButActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sortTypeButActionPerformed

    private void sortDateButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortDateButActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sortDateButActionPerformed

    private void sortPriorityButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortPriorityButActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sortPriorityButActionPerformed

    private void switchGUIButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switchGUIButActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_switchGUIButActionPerformed

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

    TaskController C;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clearButton;
    private javax.swing.JCheckBox dateCheckBox;
    private javax.swing.JTextField dateText;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox priorityCheckBox;
    private javax.swing.JTextField priorityText;
    private javax.swing.JCheckBox schoolCheckbox;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchText;
    private javax.swing.JCheckBox socialCheckbox;
    private javax.swing.JButton sortDateBut;
    private javax.swing.JButton sortPriorityBut;
    private javax.swing.JButton sortTitleBut;
    private javax.swing.JButton sortTypeBut;
    private javax.swing.JButton switchGUIBut;
    private javax.swing.JTable taskTableView;
    private javax.swing.JCheckBox titleCheckBox;
    private javax.swing.JTextField titleText;
    private javax.swing.JCheckBox typeCheckBox;
    private javax.swing.JButton viewTaskButton;
    private javax.swing.JCheckBox workCheckbox;
    // End of variables declaration//GEN-END:variables
}
