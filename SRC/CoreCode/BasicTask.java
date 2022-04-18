package CoreCode;

import java.time.LocalDate;
import java.util.UUID;


public class BasicTask implements TaskInterface {
	private TaskType type = TaskType.BASIC;
    private UUID taskId;
    private String title;
    private LocalDate date;
    private int priority;

    public TaskType getTaskType() {
    	return type;
    }
    
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
    
    public int getPriority() {
    	return priority;
    }
    
    public void setPriority(int p) {
    	priority = p;
    }

}


