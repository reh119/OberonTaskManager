
public class TaskController extends Controller {
	
	Model M;
	View V;
	int currentTaskCount = 0;
	BasicTask currentTask;
	
	void addTask(String taskDescription)
	{
		M.TaskService.addTask(taskDescription,("01/11/1999"));
	}
	
	void nextTask()
	{
		if ((currentTaskCount % M.TaskService.getTaskList().size()) == (M.TaskService.getTaskList().size() - 1))
		{
			currentTaskCount = 0;
			currentTask = M.TaskService.getTaskList().get(currentTaskCount);
		}
		else
		{
			currentTask = M.TaskService.getTaskList().get(currentTaskCount);
		}
	}
	
	String getTaskTitle()
	{
		return currentTask.getTitle();
	}
	
	public void setModel(Model Model)
	{
		M = Model;
	}
	
	public void setView(View View)
	{
		V = View;
	}

}
