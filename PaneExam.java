/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author LAB_D
 */
public class PaneExam extends Application {
    
    @Override
    public void start (Stage stage){
        Text text1 = new Text("Email");
        Text text2 = new Text("Password");
        
        TextField textfield1 = new TextField();
        TextField textfield2 = new TextField();
        
        Button button1 = new Button ("Submit");
        Button button2 = new Button ("Clear");
        
        GridPane gridPane = new GridPane();
        gridPane.setMinSize(400, 300);
        gridPane.setPadding(new Insets(10,10,10,10));
        gridPane.setVgap(5);
        gridPane.setHgap(5);
        gridPane.setAlignment(Pos.CENTER);
        
        gridPane.add(text1, 0, 0);
        gridPane.add(textfield1, 1, 0);
        gridPane.add(text2, 0, 1);
        gridPane.add(textfield2, 1, 1);
        gridPane.add(button1, 0, 2);
        gridPane.add(button2, 1, 2);
        
        Scene scene = new Scene(Pane);
        
        stage.setTitle("Pane Exam");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
