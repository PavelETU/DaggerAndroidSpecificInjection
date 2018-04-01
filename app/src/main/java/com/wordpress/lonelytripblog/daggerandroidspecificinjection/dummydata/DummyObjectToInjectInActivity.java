package com.wordpress.lonelytripblog.daggerandroidspecificinjection.dummydata;

public class DummyObjectToInjectInActivity {

    private String textToShow;
    private static int counter;

    public DummyObjectToInjectInActivity() {
        counter++;
        textToShow = "Dummy object for Activity was created " + counter + " times";
    }

    public String getTextToShow() {
        return textToShow;
    }

    public void setTextToShow(String textToShow) {
        this.textToShow = textToShow;
    }
}
