/*
 * Name: Jesse Goldman
 * Date: 3/28/2022
 * Course Number:CSC-112-D01
 * Course Name: Java 2
 * Problem Number: Chapter 15
 * Email: Jgoldman2001@student.stcc.edu
 * Short Description of the Problem: Traffic Light Pane
 */

import javafx.geometry.Pos;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class TrafficLightPane extends VBox {
    private int color;
    protected final int RED = 0;
    protected final int YELLOW = 1;
    protected final int GREEN = 2;
    protected Circle redLight;
    protected Circle yellowLight;
    protected Circle greenLight;

    public TrafficLightPane() {
        this.paint();
        this.setAlignment(Pos.CENTER);
        this.setMaxWidth(100);
        this.setMaxHeight(250);
        this.setStyle("-fx-border-style: solid inside; -fx-border-width: 2;");
    }

    public void paint() {
        this.getChildren().clear();
        redLight = new Circle(30, Color.WHITE);
        redLight.setStroke(Color.BLACK);
        yellowLight = new Circle(30, Color.WHITE);
        yellowLight.setStroke(Color.BLACK);
        greenLight = new Circle(30, Color.WHITE);
        greenLight.setStroke(Color.BLACK);
        this.setSpacing(15);

        switch (this.color) {
            case RED -> redLight.setFill(Color.RED);
            case YELLOW -> yellowLight.setFill(Color.YELLOW);
            case GREEN -> greenLight.setFill(Color.GREEN);
        }
        this.getChildren().addAll(redLight, yellowLight, greenLight);
    }

    protected void setColor(int color) {
        this.color = color;
    }
}
