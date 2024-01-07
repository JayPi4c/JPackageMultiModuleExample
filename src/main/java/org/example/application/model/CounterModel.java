package org.example.application.model;

import javafx.beans.property.SimpleIntegerProperty;
import lombok.Getter;

@Getter
public class CounterModel {

    private final SimpleIntegerProperty count = new SimpleIntegerProperty(0);

    public void incrementCount() {
        count.set(count.get() + 1);
    }

    public void decrementCount() {
        count.set(count.get() - 1);
    }
}