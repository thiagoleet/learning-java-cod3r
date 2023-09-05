package me.thiagoleite.app.loggin;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    public static void info(String message) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(new StringBuilder()
                .append("[INFO] ")
                .append(sdf.format(new Date()))
                .append(" - ")
                .append(message)
                .toString()
        );
    }
}
