/**
 *
 * @author Jacob
 */
public class TaskModel extends Model {
    Controller C;
    TaskModel() {
    	TaskService TaskService = new TaskService();
    	TaskCreator TaskCreator = new TaskCreator();
    }
    
    public void setController(Controller Controller)
    {
        C = Controller;
    }
}
