package CoreCode;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.Vector;

public class TaskController extends Controller {

    Model M;
    View V;
    SearchTask searchTask;
    SortTask sortTask;
    public TaskInterface selectedTask;
    Vector<TaskInterface> visibleTasks;
    // Used to parse tasks into strings.
    TaskParser taskParser;
    
    public TaskController()
    {
    	taskParser = new TaskParser();
    	visibleTasks = new Vector<TaskInterface>();
    }

    //GUIVector should always be given in the order title, date, priority, and then additional
    //Values according to task type
    public void addTask(TaskType type, Vector<String> GUIVector) {
        M.TaskService.addTask(M.TaskCreator.createTask(type, GUIVector));
    }

    public void editTask(TaskInterface taskInterface) {
        M.TaskService.editTask(taskInterface);
    }
    
    //This should change selectedTask to be the current task at index i from visibleTasks
    public void selectTask(int i) {
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
    public void findTasks(TaskAttribute attribute, String searchQuery) {
        if (attribute.equals(TaskAttribute.ID)) {

            TaskInterface taskinterface = searchTask.searchTaskBasedOnID(UUID.fromString(searchQuery));
            visibleTasks = new Vector<TaskInterface>();
            visibleTasks.add(taskinterface);
        } else if (attribute.equals(TaskAttribute.PRIORITY)) {
            visibleTasks = searchTask.searchTaskBasedOnPriority(Integer.parseInt(searchQuery));
        } else if (attribute.equals(TaskAttribute.TITLE)) {
            visibleTasks = searchTask.searchTaskBasedOnTitle(searchQuery);
        } else if (attribute.equals(TaskAttribute.DATE)) {
            visibleTasks = searchTask.searchTaskBasedOnDate(searchQuery);
        }

    }
    
    
    //sorts tasks
    public void sortTasks(TaskAttribute attribute) {
        if (attribute.equals(TaskAttribute.ID)) {
            visibleTasks = sortTask.sortBasedOnID(visibleTasks);
        } else if (attribute.equals(TaskAttribute.PRIORITY)) {
            visibleTasks = sortTask.sortBasedOnPriority(visibleTasks);
        } else if (attribute.equals(TaskAttribute.TITLE)) {
            visibleTasks = sortTask.sortBasedOnTitle(visibleTasks);
        } else if (attribute.equals(TaskAttribute.DATE)) {
            visibleTasks = sortTask.sortBasedOnDate(visibleTasks);
        } else if (attribute.equals(TaskAttribute.TYPE)) {
            visibleTasks = sortTask.sortBasedOnType(visibleTasks);
        }
        
    }

    //This should remove the tasks from visibleTasks without destroying them, simply
    //Making them not longer within the vector. this should be called whenever findTasks
    //Is being called to ensure the vector is at no point cluttered with irrelevant
    //Tasks for display.
    void hideTasks() {

    }


    public void removeTask() {
        M.TaskService.removeTask(selectedTask.getTaskId());
    }

    public void setModel(Model Model) {
        M = Model;
        searchTask = new SearchTask(M);
        sortTask = new SortTask(M);
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
	
	public void resetTasks()
	{
		selectedTask = null;
		visibleTasks.clear();
	}
}