package org.logging;

public class DataBaselogger implements Logger {

    @Override
    public void log(String data) {
        System.out.println("Database e loglandı :" +  data);
    }
}
