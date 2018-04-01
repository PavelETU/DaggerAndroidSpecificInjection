package com.wordpress.lonelytripblog.daggerandroidspecificinjection;

public class DummyObjectToInjectInActivity {

    private String textToShow = "Dummy object is alive!";

    public String getTextToShow() {
        return textToShow;
    }

    public void setTextToShow(String textToShow) {
        this.textToShow = textToShow;
    }
}
