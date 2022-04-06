package CoreCode;

import java.time.LocalDate;
import java.util.UUID;

public interface TaskInterface {
    //Note: Should private declarations be here as well, ask team members.
    String getTitle();
    LocalDate getDate();
    UUID getTaskId();
    TaskType getTaskType();
    int getPriority();
    void setTitle(String title);
    void setDate(LocalDate date);
    void setTaskId(UUID taskId);
    void setPriority(int priority);

}
