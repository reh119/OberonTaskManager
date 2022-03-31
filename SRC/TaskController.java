
public class TaskController extends Controller {
	
	Model M;
	View V;
	int currentTaskCount = 0;
	TaskInterface currentTask;
	
	void addTask(String taskDescription)
	{
		M.TaskService.addTask(taskDescription, "01/11/2022");
	}
	
	void nextTask()
	{
		if ((currentTaskCount % M.TaskService.getTaskList().size()) == (M.TaskService.getTaskList().size() - 1))
		{
			currentTaskCount = 0;
			currentTask = M.TaskService.getTaskList().get(currentTaskCount);
		}
		else if (M.TaskService.getTaskList().size() == 0)
		{
			currentTaskCount = 0;
		}
		else
		{
			currentTaskCount++;
			currentTask = M.TaskService.getTaskList().get(currentTaskCount);
		}
	}
	
	String getTaskTitle()
	{
		return currentTask.getTitle();
	}
	
	void removeTask()
	{	
		if (currentTaskCount != 0)
		{
			M.TaskService.removeTask(currentTask.getTaskId().toString());
			currentTaskCount--;
		}
		else
			currentTaskCount = 0;
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
