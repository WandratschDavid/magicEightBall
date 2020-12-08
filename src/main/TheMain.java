package main;

import controllerview.first.FirstC;
import javafx.application.Application;
import javafx.stage.Stage;

public class TheMain extends Application
{
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        FirstC.show(primaryStage);
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}