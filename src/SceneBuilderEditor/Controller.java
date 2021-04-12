package SceneBuilderEditor;


import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class Controller {

    public TextField textField1;
    public DatePicker datePicker;
    public Button saveButton;
    public ListView toDoSaveList;
    public void initialize() {
        ToDoStuff.setSceneBuilderController(this);

    }

    public void updateUI() {
        toDoSaveList.getItems().clear();
        ArrayList toDoList = ToDoStuff.getAllData();
        for (Object ToDoStuff : toDoList) {
            toDoSaveList.getItems().add(ToDoStuff);
        }
    }


    public void userSavedText() {
       String textToSave =textField1 .getText();
       LocalDate dateSave = datePicker.getValue();
       ToDoStuff.addToDoStuff(textToSave, dateSave);

    }

}
