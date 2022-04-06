import java.util.Scanner;
import java.util.Vector;
import oberonguinetbeans.taskManager;
import CoreCode.*;


public class main {
    public static void main(String[] args) {
    	
         TaskModel modelM = new TaskModel();
         TaskController C = new TaskController();
         modelM.setController(C);
         C.setModel(modelM);
         GUI1TaskView viewer = new GUI1TaskView();
         viewer.setController(C);
         C.setView(viewer);
         viewer.GUIStart();
         String s;
         Scanner obj = new Scanner(System.in);
         s = obj.nextLine();
         C.findTasks(TaskAttribute.TITLE, "Mario");
         C.selectTask(0);
         Vector<String> testVecString = C.getCurrentTaskStrings();
         System.out.print(testVecString.get(0));
         System.out.print(testVecString.get(1));
         System.out.print(testVecString.get(3));
    }
}
