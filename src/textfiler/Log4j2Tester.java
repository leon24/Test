package textfiler;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2Tester {
    private static final Logger LOG = LogManager.getLogger(Log4j2Tester.class);

    public static void main(String[] args) {
        LOG.error("ÄNTLIGEN FREDAG!!!");
        //LOG.trace("exiting application");
    }
}
