package SceneBuilderEditor;

import java.time.LocalDate;
import java.util.ArrayList;

public class ToDoStuff {
    static Controller sceneBuilderController;
    static ArrayList<ToDoStuff> allData;
    private String todoItem;
    private LocalDate dueDate;

    public ToDoStuff(String todoItem, LocalDate dueDate) {
        this.todoItem = todoItem;
        this.dueDate = dueDate;

        if (allData == null) {
            allData = new ArrayList<ToDoStuff>();
        }

    }

    public static Controller getSceneBuilderController() {
        return sceneBuilderController;
    }

     public static void setSceneBuilderController(Controller sceneBuilderController) {
         ToDoStuff.sceneBuilderController = sceneBuilderController;
     }

    public static ArrayList<ToDoStuff> getAllData() {
        return allData;
    }

    public String getTodoItem() {
        return todoItem;
    }

    public void setTodoItem(String todoItem) {
        this.todoItem = todoItem;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    static public void addToDoStuff(String todo, LocalDate time) {
        ToDoStuff newItem = new ToDoStuff(todo, time);
        allData.add(newItem);
        sceneBuilderController.updateUI();

    }

    public String toString() {
        String description = new String(todoItem + " " + dueDate.getDayOfWeek());
        return description;
    }

}

