package CoreCode;

import java.util.Comparator;
import java.util.Vector;

public class SortTask {

    public Vector<TaskInterface> taskList;

    public SortTask(Model M) {
        taskList = M.TaskService.taskList;
    }

    public Vector<TaskInterface> sortBasedOnPriority(Vector<TaskInterface> taskList){
        Comparator<TaskInterface> taskComparator = Comparator.comparingInt(TaskInterface::getPriority);
        taskList.sort(taskComparator);
        return taskList;
    }

    public Vector<TaskInterface> sortBasedOnTitle(Vector<TaskInterface> taskList){
        Comparator<TaskInterface> taskComparator = Comparator.comparing(TaskInterface::getTitle);
        taskList.sort(taskComparator);
        return taskList;
    }

    public Vector<TaskInterface> sortBasedOnID(Vector<TaskInterface> taskList){
        Comparator<TaskInterface> taskComparator = Comparator.comparing(TaskInterface::getTaskId);
        taskList.sort(taskComparator);
        return taskList;
    }

    public Vector<TaskInterface> sortBasedOnDate(Vector<TaskInterface> taskList){
        Comparator<TaskInterface> taskComparator = Comparator.comparing(TaskInterface::getDate);
        taskList.sort(taskComparator);
        return taskList;
    }

    public Vector<TaskInterface> sortBasedOnType(Vector<TaskInterface> taskList){
        Comparator<TaskInterface> taskComparator = Comparator.comparing(TaskInterface::getTaskType);
        taskList.sort(taskComparator);
        return taskList;
    }
}
