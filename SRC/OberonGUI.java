import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class OberonGUI extends JFrame {


    public String name;
    public JTextArea taskArea; //where task that are added are displayed
    public JTextField taskInput; // user input for tasks
    private JButton addTaskB;
    private JButton removeTaskB;
    public TaskController test = new TaskController();


    public OberonGUI(TaskController Controller1) { // constructor, pass stuff from main here


            TaskController C = Controller1;
        // input and a button for sending message
        taskArea = new JTextArea();


        taskArea.setBorder(BorderFactory.createEmptyBorder(10, 14, 14, 14));
        taskArea.setEditable(false);
        taskArea.setText("This is where tasks will display");
        JLabel label = new JLabel("Enter your Task: ");
        taskInput = new JTextField(20);
        // adding action listener to the button

        JButton addTaskB = new JButton("Add Task");
        JButton viewNTask = new JButton("Next Task");


        addTaskB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // logic for add task
                C.addTask(taskInput.getText());
                taskInput.setText("");
                System.out.print(taskInput.getText());
                C.nextTask();
                taskArea.setText(C.getTaskTitle());




            }
        });
        
        viewNTask.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	C.nextTask();
            	taskArea.setText(C.getTaskTitle());
            }
        });
        JButton removeTaskB = new JButton("Remove Task");
        addTaskB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                C.removeTask();

            }
        });
        // adding label, textfield and button to a panel

        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(taskInput);
        panel.add(addTaskB);
        panel.add(viewNTask);
        panel.add(removeTaskB);

        // using BorderLayout, adding text area to center and panel to the end

        setLayout(new BorderLayout());
        add(new JScrollPane(taskArea), BorderLayout.CENTER);
        add(panel, BorderLayout.PAGE_END);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(700, 600);
        setTitle("Oberon Task Manager v0.2");

        setVisible(true);





    }
}

// JFrame frame = new JFrame("Oberon Gui V.01");
//        JPanel panel = new JPanel();
//        taskArea = new JTextArea(); // where tasks will display after adding.
//        taskArea.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
//        taskArea.setEditable(false);
//        JLabel label = new JLabel("Task Name");
//
//
//        JButton addTaskB = new JButton("Add Task"); // Add Button
//
//        addTaskB.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//               // logic for add button
//
//            }
//        });
//
//
//
//        JButton removeTaskB = new JButton("Remove Task"); // Remove Task Button
//        removeTaskB.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                // logic for remove task button
//
//            }
//        });
//
//        taskInput = new JTextField(20);
//        JTextArea text = new JTextArea();
//
//        addTaskB.setAlignmentX(Component.RIGHT_ALIGNMENT);
//
//
//
//        panel.setLayout(new GridBagLayout());
//        panel.add(label);
//        panel.add(text);
//        panel.add(taskInput);
//        panel.add(addTaskB);
//        addTaskB.setBounds(4,3,3,2);
//        panel.add(removeTaskB);
//        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
//        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        frame.add(panel);
//        frame.setSize(500, 300);
//        frame.setVisible(true);