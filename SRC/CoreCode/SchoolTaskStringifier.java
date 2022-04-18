package CoreCode;

import java.time.format.DateTimeFormatter;
import java.util.Vector;

public class SchoolTaskStringifier implements ITaskStringifier {
	
	public Vector<String> stringifyTask(TaskInterface task) {
		Vector<String> stringVec = new Vector<String>();
		SchoolTask schoolTask = (SchoolTask) task;
		stringVec.add(schoolTask.getTitle());
		stringVec.add(schoolTask.getDate().format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));
		stringVec.add("School");
		stringVec.add(Integer.toString(schoolTask.getPriority(), 10));
		stringVec.add(schoolTask.getCourseName());
		stringVec.add(schoolTask.getHomeworkName());
		stringVec.add(Double.toString(schoolTask.getStudyHours()));
		return stringVec;
	}
}
