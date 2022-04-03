import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class TaskService {
	
    public List<TaskInterface> taskList;
    
    TaskService() {
    	 taskList = new ArrayList<>();
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

    public List<TaskInterface> searchTaskBasedOnPriority(int priority){
        List<TaskInterface> list = new ArrayList<>();
        for (TaskInterface task:taskList) {
            if (task.getPriority() == priority){
                list.add(task);
            }
        }
        return list;
    }

    public List<TaskInterface> searchTaskBasedOnTitle(String title){
        List<TaskInterface> list = new ArrayList<>();
        for (TaskInterface task:taskList) {
            if (task.getTitle().equals(title)){
                list.add(task);
            }
        }
        return list;
    }

    public List<TaskInterface> searchTaskBasedOnDate(String date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate localDate = LocalDate.parse(date, formatter);
        List<TaskInterface> list = new ArrayList<>();
        for (TaskInterface task:taskList) {
            if (task.getDate().isEqual(localDate)){
                list.add(task);
            }
        }
        return list;
    }

    public List<TaskInterface> getTaskList() {
        return taskList;
    }
}
