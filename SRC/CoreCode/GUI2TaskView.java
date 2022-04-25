package CoreCode;

import my.gui2.GUI2;

public class GUI2TaskView extends View {

    TaskController C;

    public void setController(TaskController Controller)
    {
        this.C = Controller;
    }

    public void GUIStart()
    {

    }

    public void resetForGUIChange()
    {
        C.resetTasks();
    }
}
