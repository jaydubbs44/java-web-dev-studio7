package org.launchcode.studio7;

import java.util.ArrayList;

public class CD implements Disc{

    private static final int storageCap = 750;
    private ArrayList<String> fileTypes = new ArrayList<>(){
        {
            add(".aif");
            add(".wav");
        }
    };
    ArrayList<String> discContents = null;
    private static final double writeSpeedPerSecond = 0.15;
    private static final double readSpeedPerSecond = 0.3;

    @Override
    public void read() {

    }

    @Override
    public void write() {

    }

    @Override
    public void reportContents() {

    }
}
