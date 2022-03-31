import java.util.Vector;

public class TaskCreator {
	//Returns a task of the type specified by the factory associated with it.
	public TaskInterface createTask(TaskType type, Vector<String> stringVec) {
		return createFactory(type).createTask(stringVec);
	}
	
	//Creates a factory of the type given, to ass more factory types make a factory class
	//Similar to BasicFactory, that implements ITaskFactory, and then sets all the relevant
	//Variables, as they should be formatted. ITaskFactory gives an example of proper formatting
	//For given stringVec.
	private ITaskFactory createFactory(TaskType type) {
		ITaskFactory factory;
		switch(type) {
		case BASIC:		factory = new BasicFactory();
						break;

		case SCHOOL:    factory = new SchoolFactory();
                		break;
						
		default:		factory = new BasicFactory();
						break;
		}
		return factory;
	}
		
}
