package com.cozytheDEV;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        FXMLLoader loader = new FXMLLoader(getClass().getResource("ExtractMedia.fxml"));
        Parent root = loader.load();


        //Title
        primaryStage.setTitle("Media Player");

        //Add scene to primaryStage
        primaryStage.setScene(new Scene(root));

        //Hide maximize window
        primaryStage.setResizable(false);

        primaryStage.show();


    }

    public static void main(String[] args) {
        launch(args);
    }

}
