package CoreCode;


public class Model {
	Controller C;
	TaskService TaskService = new TaskService();
	TaskCreator TaskCreator = new TaskCreator();
	public void setController(Controller Controller)
	{
		C = Controller;
	}
}
