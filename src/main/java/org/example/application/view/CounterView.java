package org.example.application.view;

import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import org.example.application.model.CounterModel;

public class CounterView extends VBox {

    public CounterView(CounterModel model) {
        Label label = new Label();
        label.textProperty().bind(model.getCount().asString());
        getChildren().add(label);
    }

}
