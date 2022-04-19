package CoreCode;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.UUID;
import java.util.Vector;

public interface ITaskFactory {
	//Vactor should follow order of elements detailed in TaskInterface
	TaskInterface createTask(Vector<String> stringVec);
	
	// Universally available method to easily set all fields associated with
	// the TaskInterface Format.
	static public void universalTaskFormat(TaskInterface task,Vector<String> taskFields) {
		task.setTitle(taskFields.get(0));
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate localDate = LocalDate.parse(taskFields.get(1), formatter);
        task.setDate(localDate);
        task.setTaskId(UUID.randomUUID());
        task.setPriority(Integer.parseInt(taskFields.get(2)));
	}
}
