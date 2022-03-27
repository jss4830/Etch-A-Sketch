/*
 * Name: Jesse Goldman
 * Date: 3/28/2022
 * Course Number:CSC-112-D01
 * Course Name: Java 2
 * Problem Number: Chapter 15
 * Email: Jgoldman2001@student.stcc.edu
 * Short Description of the Problem: Write a JavaFX application that simulates a traffic light
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class TrafficLightApp extends Application {
    private static final int APPWIDTH = 700;
    private static final int APPHEIGHT = 325;
    private static final String TITLE = "Traffic Light App";

    @Override
    public void start(Stage primaryStage) throws Exception {
        Scene scene = new Scene(new AppGui(), APPWIDTH, APPHEIGHT);
        primaryStage.setTitle(TITLE);
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setResizable(false);
    }

    public static void main(String[] args) {
        launch(args);
    }

}