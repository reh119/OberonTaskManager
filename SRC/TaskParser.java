import java.util.Vector;

public class TaskParser {
	
	TaskStringifierCreator TSC;
	
	public TaskParser()
	{
		TSC = new TaskStringifierCreator();
	}
	
	// Call this method to put a single task into string vector form
	public Vector<String> singleTaskToStringVector(TaskInterface task)
	{
		TSC.setTaskType(task.getTaskType());
		return taskToStringVector(task);
	}
	
	// Call this method to put a vector of tasks into String vector form
	public Vector<Vector<String>> multiTaskToStringVector(Vector<TaskInterface> taskVec)
	{
		Vector<Vector<String>> doubleStringVec = new Vector<Vector<String>>();
		int size = taskVec.size();
		for(int i = 0; i<size; i++)
		{
		TSC.setTaskType(taskVec.get(i).getTaskType());
		doubleStringVec.add(TSC.createStringifier().stringifyTask(taskVec.get(i)));
		}
		return doubleStringVec;
	}
	
	private Vector<String> taskToStringVector(TaskInterface task)
	{
		return TSC.createStringifier().stringifyTask(task);
	}
	
	
}
