package CoreCode;

//creating SocialTask that will implement Basictask to include the basic task variables
public class SocialTask extends BasicTask{
    private TaskType type = TaskType.SOCIAL;

    //additional variables to be added when a social task is selected
    private String meetingLocation;
    private String specialOccasion;
    private double attendingHours;

    //creating getters and setters for the social task variables
    public TaskType getTaskType() {
        return TaskType.SOCIAL;
    }

    public void setType(TaskType type) {
        this.type = type;
    }

    public String getMeetingLocation() {
        return meetingLocation;
    }

    public void setMeetingLocation(String meetingLocation) {
        this.meetingLocation = meetingLocation;
    }

    public String getSpecialOccasion() {
        return specialOccasion;
    }

    public void setSpecialOccasion(String specialOccasion) {
        this.specialOccasion = specialOccasion;
    }

    public double getAttendingHours() {
        return attendingHours;
    }

    public void setAttendingHours(double attendingHours) {
        this.attendingHours = attendingHours;
    }
}
