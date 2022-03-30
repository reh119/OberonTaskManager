import java.time.LocalDate;
import java.util.UUID;


public class BasicTask implements TaskInterface {
    private UUID taskId;
    private String title;
    private LocalDate date;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public UUID getTaskId() {
        return taskId;
    }

    public void setTaskId(UUID taskId) {
        this.taskId = taskId;
    }

    @Override
    public String toString() {
        return "Task: " + title + " Date: " + date + " Task ID: " + taskId;
    }
}


