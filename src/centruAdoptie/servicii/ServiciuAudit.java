package centruAdoptie.servicii;

import java.io.*;
import java.util.Date;

public class ServiciuAudit {
    private static PrintWriter printWriter;
    private static final String LOG_LOCATION = "./audit.csv";

    private static ServiciuAudit ourInstance = new ServiciuAudit();

    public static ServiciuAudit getInstance() {
        return ourInstance;
    }

    private ServiciuAudit() {

        try {
            printWriter = new PrintWriter(new File(LOG_LOCATION));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                closeWriter();
            }
        });
    }

    public void writeLogLine(String message) {

        Date d = new Date();
        printWriter.println(message + "," + d + "," + Thread.currentThread());

    }

    private boolean closeWriter () {
        boolean result = true;
        printWriter.flush();
        printWriter.close();
        return result;
    }

}