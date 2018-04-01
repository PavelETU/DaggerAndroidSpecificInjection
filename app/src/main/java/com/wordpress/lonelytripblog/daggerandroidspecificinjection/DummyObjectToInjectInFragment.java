package com.wordpress.lonelytripblog.daggerandroidspecificinjection;

public class DummyObjectToInjectInFragment {

    private String textToShow = "Dummy object in Fragment is alive!";

    public String getTextToShow() {
        return textToShow;
    }

    public void setTextToShow(String textToShow) {
        this.textToShow = textToShow;
    }
}
