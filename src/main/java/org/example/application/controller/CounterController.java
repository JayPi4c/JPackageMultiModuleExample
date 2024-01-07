package org.example.application.controller;

import javafx.scene.control.Button;
import lombok.extern.java.Log;
import org.example.application.model.CounterModel;
import org.example.application.view.CounterView;

@Log
public class CounterController {

    public CounterController(CounterModel model, CounterView view) {

        Button incrementButton = new Button("Increment");
        incrementButton.setOnAction(event -> {
            model.incrementCount();
            log.info("Count: " + model.getCount().get());
        });

        Button decrementButton = new Button("Decrement");
        decrementButton.setOnAction(event -> model.decrementCount());

        view.getChildren().addAll(incrementButton, decrementButton);
    }
}
