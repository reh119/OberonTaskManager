import java.util.Vector;

public class TaskController extends Controller {
	
	Model M;
	View V;
	TaskInterface selectedTask;
	Vector<TaskInterface> visibleTasks;
	
	//GUIVector should always be given in the order title, date, priority, and then additional
	//Values according to task type
	void addTask(TaskType type, Vector<String> GUIVector)
	{
		M.TaskService.addTask(M.TaskCreator.createTask(type, GUIVector));
	}
	
	//This should change selectedTask to be the current task at index i
	void selectTask(int i)
	{
		
	}
	
	//This finds a list of tasks to move to the controller
	//The input should be the enum of the task's attribute
	//Which can be found in TaskAttributes, followed by
	//A string of the actual query to search for.
	//This should be done through the model, the controllers job
	//Is to format the search to be correct for the model to search
	//E.G changing a date string to the date format.
	//These found tasks are put into the visibleTasks
	void findTasks(TaskAttribute attribute, String searchQuery)
	{
		
	}
	
	//This should remove the tasks from visibleTasks without destroying them, simply
	//Making them not longer within the vector. this should be called whenever findTasks
	//Is being called to ensure the vector is at no point cluttered with irrelevant
	//Tasks for display.
	void hideTasks()
	{
		
	}
	
	
	void removeTask()
	{	
		M.TaskService.removeTask(selectedTask.getTaskId());
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
