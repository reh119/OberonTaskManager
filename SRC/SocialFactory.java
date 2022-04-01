import java.util.Vector;

public class SocialFactory implements ITaskFactory{

    @Override
    public TaskInterface createTask(Vector<String> taskFields) {
        SocialTask task = new SocialTask();
        ITaskFactory.universalTaskFormat(task, taskFields);
        task.setMeetingLocation(taskFields.get(3));
        task.setSpecialOccasion(taskFields.get(4));
        task.setAttendingHours(Double.parseDouble(taskFields.get(5)));
        return task;
    }
}
