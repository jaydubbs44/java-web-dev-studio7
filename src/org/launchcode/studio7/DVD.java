package org.launchcode.studio7;

import java.util.ArrayList;

public class DVD implements Disc{

    private static final int storageCap = 4700;
    private String fileTypes = ".vob";

    ArrayList<String> discContents = null;
    private static final double writeSpeedPerSecond = 1.4;
    private static final double readSpeedPerSecond = 5.2;

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
