package com.wordpress.lonelytripblog.daggerandroidspecificinjection.dummydata;

public class DummyObjectToInjectInFragment {

    private String textToShow;
    private static int counter;

    public DummyObjectToInjectInFragment() {
        counter++;
        textToShow = "Dummy object for Fragment was created " + counter + " times";
    }

    public String getTextToShow() {
        return textToShow;
    }

    public void setTextToShow(String textToShow) {
        this.textToShow = textToShow;
    }
}
