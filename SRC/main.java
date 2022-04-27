import java.util.Scanner;
import java.util.Vector;
import oberonguinetbeans.taskManager;
import CoreCode.*;


public class main {
    public static void main(String[] args) {
         // initializing
         TaskModel modelM = new TaskModel();
         TaskController C = new TaskController();
         modelM.setController(C);
         C.setModel(modelM);
         GUI2TaskView viewer = new GUI2TaskView();
         viewer.setController(C);
         C.setView(viewer);
         viewer.GUIStart();
    }
}
