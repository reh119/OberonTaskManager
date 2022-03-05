import java.time.LocalDate;
import java.util.UUID;

public interface TaskInterface {
    //Note: Should private declarations be here as well, ask team members.
    String getTitle();
    LocalDate getDate();
    UUID getTaskID();
    void setTitle();
    void setDate();
    void setTaskId();
    String toString();

}
