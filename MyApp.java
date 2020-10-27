/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author LAB_D
 */
public class MyApp extends Application {
    
    @Override
    public void start(Window) {
        VBox root = new VBox();
        Scene scene1 = new scene(root, 400, 400);
        window.setTitle("MyApp");
        window.setScene("Scene1");
        window.show();
        }
    public static void main (String[] args){
        launch(args);
    }
}
