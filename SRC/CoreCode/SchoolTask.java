package CoreCode;

//creating SchoolTask that will implement Basictask to include the basic task variables
public class SchoolTask extends BasicTask{
    private TaskType type = TaskType.SCHOOL;

    //additional variables to be added when a school task is selected
    private String courseName;
    private String homeworkName;
    private double studyHours;

    //creating getters and setters for the school task variables
    public TaskType getTaskType() {
        return type;
    }

    public void setType(TaskType type) {
        this.type = type;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getHomeworkName() {
        return homeworkName;
    }

    public void setHomeworkName(String homeworkName) {
        this.homeworkName = homeworkName;
    }

    public double getStudyHours() {
        return studyHours;
    }

    public void setStudyHours(double studyHours) {
        this.studyHours = studyHours;
    }
}
