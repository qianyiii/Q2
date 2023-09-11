package com.example.q2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class PasswordGenerator extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(15));
        grid.setHgap(15);
        grid.setVgap(10);

        Label lblName = new Label("Enter Words: ");
        TextField tfName = new TextField();
        grid.add(lblName,0,0,1,1);
        grid.add(tfName,1,0,1,1);

        Button btnSubmit = new Button("Generate Password");
        HBox button = new HBox(btnSubmit);
        button.setAlignment(Pos.BASELINE_RIGHT);
        grid.add(button,1,1,1,1);

        Label lblPassword = new Label("Use This Password: ");
        TextField tfPassword = new TextField();
        grid.add(lblPassword,0,2,1,1);
        grid.add(tfPassword,1,2,1,1);

        Scene scene = new Scene(grid, 300, 300);

        stage.setTitle("Password Generator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}