package com.example.alumini.supporting_classes;

/**
 * class to be used in event bus
 */
public class MenuVisibility {
    Boolean state;

    public MenuVisibility(Boolean state) {
        this.state = state;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }
}
