package CoreCode;

import java.util.Comparator;
import java.util.Vector;

public class SortTask {

    public Vector<TaskInterface> taskList;

    public SortTask(Model M) {
        taskList = M.TaskService.taskList;
    }

    public Vector<TaskInterface> sortBasedOnPriority(Vector<TaskInterface> taskList, boolean reverseSort){
        Comparator<TaskInterface> taskComparator = Comparator.comparingInt(TaskInterface::getPriority);
        taskList.sort(taskComparator);
        if(reverseSort) {
            Collections.reverse(taskList);
        }
        return taskList;
    }

    public Vector<TaskInterface> sortBasedOnTitle(Vector<TaskInterface> taskList, boolean reverseSort){
        Comparator<TaskInterface> taskComparator = Comparator.comparing(TaskInterface::getTitle);
        taskList.sort(taskComparator);
        if(reverseSort) {
            Collections.reverse(taskList);
        }
        return taskList;
    }

    public Vector<TaskInterface> sortBasedOnID(Vector<TaskInterface> taskList, boolean reverseSort){
        Comparator<TaskInterface> taskComparator = Comparator.comparing(TaskInterface::getTaskId);
        taskList.sort(taskComparator);
        if(reverseSort) {
            Collections.reverse(taskList);
        }
        return taskList;
    }

    public Vector<TaskInterface> sortBasedOnDate(Vector<TaskInterface> taskList, boolean reverseSort){
        Comparator<TaskInterface> taskComparator = Comparator.comparing(TaskInterface::getDate);
        taskList.sort(taskComparator);
        if(reverseSort) {
            Collections.reverse(taskList);
        }
        return taskList;
    }

    public Vector<TaskInterface> sortBasedType(Vector<TaskInterface> taskList, boolean reverseSort){
        Comparator<TaskInterface> taskComparator = Comparator.comparing(TaskInterface::getTaskType);
        taskList.sort(taskComparator);
        if(reverseSort) {
            Collections.reverse(taskList);
        }
        return taskList;
    }
}