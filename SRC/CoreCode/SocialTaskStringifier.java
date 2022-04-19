package CoreCode;

import java.time.format.DateTimeFormatter;
import java.util.Vector;

public class SocialTaskStringifier implements ITaskStringifier {
	
	public Vector<String> stringifyTask(TaskInterface task) {
		Vector<String> stringVec = new Vector<String>();
		SocialTask socialTask = (SocialTask) task;
		stringVec.add(socialTask.getTitle());
		stringVec.add(socialTask.getDate().format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));
		stringVec.add("Social");
		stringVec.add(Integer.toString(socialTask.getPriority(), 10));
		stringVec.add(socialTask.getMeetingLocation());
		stringVec.add(socialTask.getSpecialOccasion());
		stringVec.add(Double.toString(socialTask.getAttendingHours()));
		return stringVec;
	}
}
