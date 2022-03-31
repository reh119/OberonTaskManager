import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GUI2 extends JFrame  {


    public String title;
    public JTextArea toDoList;
    public JTextField newTask;
    private JButton add;
    private JButton delete;
    public TaskController test = new TaskController();


    public GUI2(TaskController Controller1) {

        JPanel taskPanel = new JPanel();
        taskPanel.add(taskLabel);
        taskPanel.add(newTask);
        taskPanel.add(add);
        taskPanel.add(next);
        taskPanel.add(delete);
        setLayout(new BorderLayout());
        add(new JScrollPane(taskArea), BorderLayout.CENTER);
        add(taskPanel, BorderLayout.PAGE_END);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        setTitle("Task Manager");
        setVisible(true);

        TaskController C = Controller1;
        toDoList = new JTextArea();
        toDoList.setBorder(BorderFactory.createEmptyBorder(10, 14, 14, 14));
        toDoList.setEditable(false);
        toDoList.setText("TO-DO LIST");
        JLabel taskLabel = new JLabel("New Task: ");
        newTask = new JTextField(20);
        JButton add = new JButton("Add Task");
        JButton next = new JButton("Next");


        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                C.addTask(taskInput.getText());
                taskInput.setText("");
                System.out.print(taskInput.getText());
                C.next();
                toDoList.setText(C.getTaskTitle());

            }
        });

        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                C.next();
                toDoList.setText(C.getTaskTitle());
            }
        });
        JButton delete = new JButton("Delete");
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                C.delete();

            }
        });
    }
