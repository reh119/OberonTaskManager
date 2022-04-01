import java.util.Vector;

public class WorkFactory implements ITaskFactory{
    @Override
    public TaskInterface createTask(Vector<String> taskFields) {
        WorkTask task = new WorkTask();
        ITaskFactory.universalTaskFormat(task, taskFields);
        task.setProjectName(taskFields.get(3));
        task.setMeetingWith(taskFields.get(4));
        task.setHoursWorking(Double.parseDouble(taskFields.get(5)));
        return task;
    }
}
