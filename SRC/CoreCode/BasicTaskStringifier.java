package CoreCode;

import java.time.format.DateTimeFormatter;
import java.util.Vector;

public class BasicTaskStringifier implements ITaskStringifier {
	
	public Vector<String> stringifyTask(TaskInterface task) {
		Vector<String> stringVec = new Vector<String>();
		BasicTask basicTask = (BasicTask) task;
		stringVec.add(basicTask.getTitle());
		stringVec.add(basicTask.getDate().format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));
		stringVec.add("Basic");
		stringVec.add(Integer.toString(basicTask.getPriority(), 10));
		return stringVec;
	}
}
