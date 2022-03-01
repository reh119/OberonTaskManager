
public final class TaskManagerCreator {
	public static Controller createTaskManager(Model M, Controller C, View V)
	{
		C.setModel(M);
		C.setView(V);
		M.setController(C);
		V.setController(C);
		return C;
	}
}
