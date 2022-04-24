package CoreCode;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.UUID;
import java.util.Vector;

public class SearchTask {
    public Vector<TaskInterface> taskList;

    public SearchTask(Model M) {
        taskList = M.TaskService.taskList;
    }

    public TaskInterface searchTaskBasedOnID(UUID id){
        for (TaskInterface task:taskList) {
            if (task.getTaskId().equals(id)){
                return task;
            }
        }
        return null;
    }

    public Vector<TaskInterface> searchTaskBasedOnPriority(int priority){
        Vector<TaskInterface> list = new Vector<TaskInterface>();
        for (TaskInterface task:taskList) {
            if (task.getPriority() == priority){
                list.add(task);
            }
        }
        return list;
    }

    public Vector<TaskInterface> searchTaskBasedOnTitle(String title){
        Vector<TaskInterface> list = new Vector<TaskInterface>();
        for (TaskInterface task:taskList) {
            if (task.getTitle().equals(title)){
                list.add(task);
            }
        }
        return list;
    }

    public Vector<TaskInterface> searchTaskBasedOnDate(String date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate localDate = LocalDate.parse(date, formatter);
        Vector<TaskInterface> list = new Vector<TaskInterface>();
        for (TaskInterface task:taskList) {
            if (task.getDate().isEqual(localDate)){
                list.add(task);
            }
        }
        return list;
    }

    //Search Based on Date Range method works the same as the single date method above
    //with two strong parameters to have the date range.
    public Vector<TaskInterface> searchTaskBasedOnDateRange(String fromDate, String toDate){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate fromLocalDate = LocalDate.parse(fromDate, formatter);
        LocalDate toLocalDate = LocalDate.parse(toDate, formatter);
        Vector<TaskInterface> list = new Vector<TaskInterface>();
        for (TaskInterface task:taskList) {
            if ((task.getDate().isAfter(fromLocalDate) && task.getDate().isBefore(toLocalDate))
                    || task.getDate().isEqual(fromLocalDate) || task.getDate().isEqual(toLocalDate) ){
                list.add(task);
            }
        }
        return list;
    }
}
