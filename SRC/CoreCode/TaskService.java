package CoreCode;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class TaskService {
	
    public Vector<TaskInterface> taskList;
    
    TaskService() {
    	 taskList = new Vector<TaskInterface>();
    }

    public void addTask(TaskInterface task){
        taskList.add(task);
    }

    public void removeTask(UUID id){
        for (TaskInterface task:taskList) {
            if (task.getTaskId().equals(id)){
                taskList.remove(task);
                break;
            }
        }
    }

    public TaskInterface searchTaskBasedOnID(UUID id){
        for (TaskInterface task:taskList) {
            if (task.getTaskId().equals(id)){
                return task;
            }
        }
        return null;
    }

    public Vector<TaskInterface> searchTaskBasedOnPriority(int priority){
    	Vector<TaskInterface> list = new Vector<TaskInterface>();
        for (TaskInterface task:taskList) {
            if (task.getPriority() == priority){
                list.add(task);
            }
        }
        return list;
    }

    public Vector<TaskInterface> searchTaskBasedOnTitle(String title){
    	Vector<TaskInterface> list = new Vector<TaskInterface>();
        for (TaskInterface task:taskList) {
            if (task.getTitle().equals(title)){
                list.add(task);
            }
        }
        return list;
    }

    public Vector<TaskInterface> searchTaskBasedOnDate(String date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate localDate = LocalDate.parse(date, formatter);
        Vector<TaskInterface> list = new Vector<TaskInterface>();
        for (TaskInterface task:taskList) {
            if (task.getDate().isEqual(localDate)){
                list.add(task);
            }
        }
        return list;
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

    public Vector<TaskInterface> getTaskList() {
        return taskList;
    }
}
