import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TaskService {
    private List<BasicTask> taskList = new ArrayList<>();

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

    public List<BasicTask> getTaskList() {
        return taskList;
    }
}
