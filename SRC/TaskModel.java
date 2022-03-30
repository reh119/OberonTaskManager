/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jacob
 */
public class TaskModel extends Model {
    Controller C;
    TaskService TaskService = new TaskService();
    
    public void setController(Controller Controller)
    {
        C = Controller;
    }
}
