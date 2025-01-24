package org.example.task2_figura;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 700, 600);
        stage.setTitle("Рисование фигур!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();


    }
}

class Metrika {
    private float bound;
    private String message;
    private int category;

    public Metrika(float bound, String message, int category) {
        this.bound = bound;
        this.message = message;
        this.category = category;
    }


    public Metrika (String string){
        System.out.println(string);
        Scanner sc = new Scanner(string);
        sc.useDelimiter(" ");
        this.bound = sc.nextFloat();
        this.message = sc.nextLine();
        this.category = sc.nextInt();
        sc.close();

    }

    public boolean iscompare(float cmp){
        return true;
    }

    public int value(float cmp){

        return 0;
    }

    public String name(float cmp){

        return message;
    }

}



class Bmi {
    private float height, weight;

    public Bmi(float height, float weight) {
        this.height = height;
        this.weight = weight;
    }
    public float getBMI() {
        return weight / this.height / this.height * 10000;
    }
    public float getHeight() {
        return height;
    }
    @Override
    public String toString () {
        return "Bmi =" + String.format("%. 1f", getBMI()) + " ";
    }

}