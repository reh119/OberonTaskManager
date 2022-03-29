import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.UUID;
import java.util.Vector;

public class BasicFactory implements ITaskFactory {
	public TaskInterface createTask(Vector<String> taskFields) {
		BasicTask task = new BasicTask();
		ITaskFactory.universalTaskFormat(task, taskFields);
		return task;
	}
}
