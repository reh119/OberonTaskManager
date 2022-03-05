public class main {
    public static void main(String[] args) {

         Model modelM = new Model();
         TaskController C = new TaskController();
         modelM.setController(C);
         C.setModel(modelM);
         OberonGUI test = new OberonGUI( C ); //



    }
}
