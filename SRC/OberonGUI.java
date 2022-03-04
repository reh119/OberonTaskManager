import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class OberonGUI extends JFrame {


    public String name;
    public JTextArea messageArea;
    public JTextField taskInput;
    private JButton addTaskB;
    private JButton removeTaskB;


    public OberonGUI() { // constructor.


        JFrame frame = new JFrame("Oberon Gui V.01");
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Task Name");
        JButton addTask = new JButton("Add Task");
        taskInput = new JTextField(20);
        JTextArea text = new JTextArea();

        addTask.setAlignmentX(Component.LEFT_ALIGNMENT);


        taskInput.setAlignmentX(Component.BOTTOM_ALIGNMENT);
        panel.setLayout(new GridBagLayout());
        panel.add(label);
        panel.add(text);
        panel.add(taskInput);
        panel.add(addTask);
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setSize(500, 300);
        frame.setVisible(true);


    }
}

