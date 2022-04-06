import java.util.Vector;

import oberonguinetbeans.taskManager;

public class main {
    public static void main(String[] args) {

         TaskModel modelM = new TaskModel();
         TaskController C = new TaskController();
         modelM.setController(C);
         C.setModel(modelM);
         TaskView viewer = new TaskView();
         viewer.setController(C);
         C.setView(viewer);
         Vector<String> testVec = new Vector<String>();
         testVec.add("Mario");
         testVec.add("01/11/2022");
         testVec.add("5");
         C.addTask(TaskType.BASIC, testVec);
         testVec.removeAllElements();
         testVec.add("Luigi");
         testVec.add("02/11/2022");
         testVec.add("3");
         C.addTask(TaskType.BASIC, testVec);
         testVec.removeAllElements();
         testVec.add("Wario");
         testVec.add("03/11/2022");
         testVec.add("1");
         C.addTask(TaskType.BASIC, testVec);
         testVec.removeAllElements();
         BasicTask BT = new BasicTask();
         BT = (BasicTask) modelM.TaskService.taskList.get(0);
         System.out.print(BT.getTitle());
         C.selectedTask = modelM.TaskService.taskList.get(0);
         C.removeTask();
         BT = (BasicTask) modelM.TaskService.taskList.get(0);
         System.out.print(BT.getTitle());
         C.selectedTask = modelM.TaskService.taskList.get(0);
         C.removeTask();
         BT = (BasicTask) modelM.TaskService.taskList.get(0);
         System.out.print(BT.getTitle());
         C.selectedTask = modelM.TaskService.taskList.get(0);
         C.removeTask();
    }
}
