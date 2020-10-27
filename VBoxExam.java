/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author LAB_D
 */
public class VBoxExam extends Application {
    @Override
    public void start(Stage stage){
        TextField textField = new TextField();
        Button playButton = new Button("Play");
        Button stopButton = new Button("Stop");
        VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setMargin(textField, new Insets(15, 15, 15, 15));
        vbox.setMargin(playButton, new Insets(15, 15, 15, 15));
        vbox.setMargin(stopButton, new Insets(15, 15, 15, 15));
        ObservableList list = vbox.getChildren();
        list.addAll(textField, playButton, stopButton);
        Scene scene = new Scene(vbox);
        stage.setTitle("VBox Exam");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
