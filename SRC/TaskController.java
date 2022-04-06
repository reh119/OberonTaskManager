import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.Vector;

public class TaskController extends Controller {

    Model M;
    View V;
    TaskInterface selectedTask;
    Vector<TaskInterface> visibleTasks;
    // Used to parse tasks into strings.
    TaskParser taskParser;
    
    public TaskController()
    {
    	taskParser = new TaskParser();
    }

    //GUIVector should always be given in the order title, date, priority, and then additional
    //Values according to task type
    void addTask(TaskType type, Vector<String> GUIVector) {
        M.TaskService.addTask(M.TaskCreator.createTask(type, GUIVector));
    }
    
    //This should change selectedTask to be the current task at index i from visibleTasks
    void selectTask(int i) {
    	selectedTask = visibleTasks.get(i);
    }


    //This finds a list of tasks to move to the controller
    //The input should be the enum of the task's attribute
    //Which can be found in TaskAttributes, followed by
    //A string of the actual query to search for.
    //This should be done through the model, the controllers job
    //Is to format the search to be correct for the model to search
    //E.G changing a date string to the date format.
    //These found tasks are put into the visibleTasks
    void findTasks(TaskAttribute attribute, String searchQuery) {
        if (attribute.equals(TaskAttribute.ID)) {

            TaskInterface taskinterface = M.TaskService.searchTaskBasedOnID(UUID.fromString(searchQuery));
            visibleTasks = new Vector<TaskInterface>();
            visibleTasks.add(taskinterface);
        } else if (attribute.equals(TaskAttribute.PRIORITY)) {
            visibleTasks = M.TaskService.searchTaskBasedOnPriority(Integer.parseInt(searchQuery));
        } else if (attribute.equals(TaskAttribute.TITLE)) {
            visibleTasks = M.TaskService.searchTaskBasedOnTitle(searchQuery);
        } else if (attribute.equals(TaskAttribute.DATE)) {
            visibleTasks = M.TaskService.searchTaskBasedOnDate(searchQuery);
        }

    }
    
    
    //sorts taks in visibile tasks
    void sortTasks(TaskAttribute attribute) {
        if (attribute.equals(TaskAttribute.ID)) {
            visibleTasks = M.TaskService.sortBasedOnID(visibleTasks);
        } else if (attribute.equals(TaskAttribute.PRIORITY)) {
            visibleTasks = M.TaskService.sortBasedOnPriority(visibleTasks);
        } else if (attribute.equals(TaskAttribute.TITLE)) {
            visibleTasks = M.TaskService.sortBasedOnTitle(visibleTasks);
        } else if (attribute.equals(TaskAttribute.DATE)) {
            visibleTasks = M.TaskService.sortBasedOnDate(visibleTasks);
        }
    }

    //This should remove the tasks from visibleTasks without destroying them, simply
    //Making them not longer within the vector. this should be called whenever findTasks
    //Is being called to ensure the vector is at no point cluttered with irrelevant
    //Tasks for display.
    void hideTasks() {

    }


    void removeTask() {
        M.TaskService.removeTask(selectedTask.getTaskId());
    }

    public void setModel(Model Model) {
        M = Model;
    }

    public void setView(View View) {
        V = View;
    }
	public DayOfWeek getDay(TaskInterface iTask)
	{
		DayOfWeek day = iTask.getDate().getDayOfWeek();
		return day;
	}
	
	public Vector<String> getCurrentTaskStrings()
	{
		return taskParser.singleTaskToStringVector(selectedTask);
	}
	
	public Vector<Vector<String>> getGroupTaskStrings()
	{
		return taskParser.multiTaskToStringVector(visibleTasks);
	}
}