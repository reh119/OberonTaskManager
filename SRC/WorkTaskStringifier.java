import java.time.format.DateTimeFormatter;
import java.util.Vector;

public class WorkTaskStringifier implements ITaskStringifier {
	
	public Vector<String> stringifyTask(TaskInterface task) {
		Vector<String> stringVec = new Vector<String>();
		WorkTask workTask = (WorkTask) task;
		stringVec.add(workTask.getTitle());
		stringVec.add(workTask.getDate().format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));
		stringVec.add("Work");
		stringVec.add(Integer.toString(workTask.getPriority(), 10));
		stringVec.add(workTask.getMeetingWith());
		stringVec.add(workTask.getProjectName());
		stringVec.add(Double.toString(workTask.getHoursWorking()));
		return stringVec;
	}
}
