package org.logging;

public class FileLogger implements Logger{
    @Override
    public void log(String data) {
        System.out.println("Filea loglandı :" +  data);
    }
}
