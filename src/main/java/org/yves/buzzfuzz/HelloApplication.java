package org.yves.buzzfuzz;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public class FuzzBuzzExercise extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(FuzzBuzzExercise.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number=");
        int number = scanner.nextInt();
        if (number % 5 == 0){
            if (number % 3 == 0)
                System.out. println("FIZZBUZZ");
            else
                System.out.println("FIZZ");
        }
        else if(number % 3 == 0)
            System.out.print("BUZZ");
        else
            System.out.print(number);
    }
}
