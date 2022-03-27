/*
 * Name: Jesse Goldman
 * Date: 3/28/2022
 * Course Number:CSC-112-D01
 * Course Name: Java 2
 * Problem Number: Chapter 15
 * Email: Jgoldman2001@student.stcc.edu
 * Short Description of the Problem: Controller for the traffic light
 */

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class Controller extends HBox {
    Button redButton, yellowButton, greenButton;

    public Controller(TrafficLightPane tlp) {
        this.redButton = new Button("Red");
        this.yellowButton = new Button("Yellow");
        this.greenButton = new Button("Green");
        this.setSpacing(10);
        this.setPadding(new Insets(20));
        this.getChildren().addAll(redButton, yellowButton, greenButton);
        this.setAlignment(Pos.CENTER);

        this.greenButton.setOnAction(e -> {
            tlp.setColor((tlp.GREEN));
            tlp.paint();
        });

        this.yellowButton.setOnAction(e -> {
            tlp.setColor((tlp.YELLOW));
            tlp.paint();
        });

        this.redButton.setOnAction(e -> {
            tlp.setColor((tlp.RED));
            tlp.paint();
        });
    }
}
