public class main {
    public static void main(String[] args) {

         TaskModel modelM = new TaskModel();
         TaskController C = new TaskController();
         modelM.setController(C);
         C.setModel(modelM);
         TaskView viewer = new TaskView();
         viewer.setController(C);
         C.setView(viewer);
         viewer.GUIStart();
    }
}
