import java.util.Vector;

public class SchoolFactory implements ITaskFactory{

    //creating a task of SchoolTask in order to include get all variables needed and return the task
    @Override
    public TaskInterface createTask(Vector<String> taskFields) {
        SchoolTask task = new SchoolTask();
        ITaskFactory.universalTaskFormat(task, taskFields);
        task.setCourseName(taskFields.get(3));
        task.setHomeworkName(taskFields.get(4));
        task.setStudyHours(Double.parseDouble(taskFields.get(5)));
        return task;
    }
}
