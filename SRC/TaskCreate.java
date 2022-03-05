import java.time.LocalDate;
import java.util.UUID;

public class TaskCreate {

    private UUID id;
    private String subject;
    private LocalDate day;


    public String getSubject() {
        return subject;
    }

    public LocalDate getDay() {
        return day;
    }


    public UUID getId() {
        return id;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    //Extra stuff we could use

    //private int priorityLevel;

   // public int getPriorityLevel() { return priorityLevel;}
    //public void setPriorityLevel(int priorityLevel) {
        //this.priorityLevel = priorityLevel;
    //}


}
