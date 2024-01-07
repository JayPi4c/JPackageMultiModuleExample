package org.example.application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import lombok.extern.java.Log;
import org.example.application.controller.CounterController;
import org.example.application.model.CounterModel;
import org.example.application.view.CounterView;

@Log
public class App extends Application {
    public static void main(String[] args) {
        for (String arg : args)
            log.info(arg);

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        CounterModel model = new CounterModel();
        CounterView view = new CounterView(model);
        new CounterController(model, view);

        VBox root = new VBox(view);
        Scene scene = new Scene(root);

        primaryStage.setTitle("Counter");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
