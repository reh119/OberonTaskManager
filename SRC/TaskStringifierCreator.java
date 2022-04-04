
public class TaskStringifierCreator {
	private TaskType currentType;
	
	public void setTaskType(TaskType type)
	{
		currentType = type;
	}
	
	// When adding a new TaskType, you must add a new switch here, with a new TaskStringifier
	// Which Implements ITaskStringifier
	// All task stringifiers should follow the same order for shared variables
	// to stringify as in BasicTaskStringifier.
	public ITaskStringifier createStringifier()
	{
		ITaskStringifier stringifier;
        switch (currentType) {
            case BASIC:
                stringifier = new BasicTaskStringifier();
                break;

            case SCHOOL:
                stringifier = new SchoolTaskStringifier();
                break;

            case WORK:
                stringifier = new WorkTaskStringifier();
                break;

            case SOCIAL:
                stringifier = new SocialTaskStringifier();
                break;

            default:
                stringifier = new BasicTaskStringifier();
                break;
        }
        return stringifier;
	}
}
