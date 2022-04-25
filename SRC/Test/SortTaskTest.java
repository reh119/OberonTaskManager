package Test;

import CoreCode.Model;
import CoreCode.SocialTask;
import CoreCode.SortTask;
import CoreCode.TaskInterface;
import org.junit.Assert;
import org.junit.Test;

import java.util.Vector;

public class SortTaskTest {
    @Test
    public void testSortBasedOnPriority(){
        Model model = new Model();

        SortTask sortTask = new SortTask(model);

        Vector<TaskInterface> taskList = new Vector<>();
        TaskInterface taskInterface = new SocialTask();
        taskInterface.setPriority(3);
        TaskInterface taskInterface2 = new SocialTask();
        taskInterface2.setPriority(1);
        taskList.add(taskInterface);
        taskList.add(taskInterface2);
        sortTask.taskList = taskList;

        Vector<TaskInterface> result = sortTask.sortBasedOnPriority(taskList, false);
        Assert.assertEquals(1,result.get(0).getPriority());
        Assert.assertEquals(3,result.get(1).getPriority());

    }
    @Test
    public void testSortBasedOnTitle(){
        Model model = new Model();

        SortTask sortTask = new SortTask(model);

        Vector<TaskInterface> taskList = new Vector<>();
        TaskInterface taskInterface = new SocialTask();
        taskInterface.setTitle("Title Test 4");
        TaskInterface taskInterface2 = new SocialTask();
        taskInterface2.setTitle("Title Test 3");
        taskList.add(taskInterface);
        taskList.add(taskInterface2);
        sortTask.taskList = taskList;

        Vector<TaskInterface> result = sortTask.sortBasedOnTitle(taskList, false);
        Assert.assertEquals("Title Test 3",result.get(0).getTitle());
        Assert.assertEquals("Title Test 4",result.get(1).getTitle());

    }

}
