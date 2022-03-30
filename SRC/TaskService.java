import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TaskService {
    private List<TaskInterface> taskList = new ArrayList<>();

    public void addTask(String title, String date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate localDate = LocalDate.parse(date, formatter);

        BasicTask taskmodel = new BasicTask();
        //to-do create unique ID.
        taskmodel.setTaskId(UUID.randomUUID());
        taskmodel.setTitle(title);
        taskmodel.setDate(localDate);

        taskList.add(taskmodel);
    }

    public void removeTask(String id){
        UUID uuid = UUID.fromString(id); //converting from string to UUID
        for (TaskInterface task:taskList) {
            if (task.getTaskId().compareTo(uuid) == 0){
                taskList.remove(task);
                break;
            }
        }
    }

    public List<TaskInterface> getTaskList() {
        return taskList;
    }
}
