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

    public void editTask(TaskInterface editTask) {
        for (int i = 0; i < taskList.size(); i++) {
            if(taskList.get(i).getTaskId().equals(editTask.getTaskId())) {
                taskList.remove(i);
                taskList.add(i, editTask);
                break;
            }
        }
    }


    public Vector<TaskInterface> getTaskList() {
        return taskList;
    }
}
