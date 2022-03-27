/*
 * Name: Jesse Goldman
 * Date: 3/28/2022
 * Course Number:CSC-112-D01
 * Course Name: Java 2
 * Problem Number: Chapter 15
 * Email: Jgoldman2001@student.stcc.edu
 * Short Description of the Problem: Write a JavaFX application that simulates a traffic light
 */

import javafx.scene.layout.BorderPane;

public class AppGui extends BorderPane {
    public AppGui(){
        var tlp = new TrafficLightPane();
        var LightSwitch = new Controller(tlp);
        this.setCenter(tlp);
        this.setBottom(LightSwitch);

    }
}
