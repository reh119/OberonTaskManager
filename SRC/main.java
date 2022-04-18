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
         for(boolean j = false; j == false;)
         {
         int selectedTask;
         int selection;
         System.out.print("SELECT TASK INDEX TO VIEW" + "\n");
         Scanner obj = new Scanner(System.in);
         selectedTask = Integer.parseInt(obj.nextLine());
         C.selectTask(selectedTask);
         Vector<String> testVecString = C.getCurrentTaskStrings();
         for(int i = 0; i < testVecString.size(); i++)
         {
	         System.out.print(testVecString.get(i) + "\n");
         }
         System.out.print("ADD EXTRA GUI?" + "\n" + "YES: 1" + "\n" + "NO: 2" + "\n");
         Scanner obj2 = new Scanner(System.in);
         selection = Integer.parseInt(obj2.nextLine());
         if (selection == 1)
         {
        	 GUI1TaskView viewer2 = new GUI1TaskView();
        	 viewer2.setController(C);
        	 viewer2.resetForGUIChange();
        	 C.setView(viewer2);
        	 viewer2.GUIStart();
         }         
         }
    }
}
