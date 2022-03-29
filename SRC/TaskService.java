import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.Vector;

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

    public List<TaskInterface> getTaskList() {
        return taskList;
    }
}
