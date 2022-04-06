package CoreCode;

public class WorkTask extends BasicTask{
    private TaskType type = TaskType.WORK;

    private String projectName;
    private String meetingWith;
    private double hoursWorking;

    public TaskType getType() {
        return type;
    }

    public void setType(TaskType type) {
        this.type = type;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getMeetingWith() {
        return meetingWith;
    }

    public void setMeetingWith(String meetingWith) {
        this.meetingWith = meetingWith;
    }

    public double getHoursWorking() {
        return hoursWorking;
    }

    public void setHoursWorking(double hoursWorking) {
        this.hoursWorking = hoursWorking;
    }
}
