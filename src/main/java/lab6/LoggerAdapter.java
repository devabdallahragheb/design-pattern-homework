package lab6;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerAdapter implements MyLogger {
    private static final Logger logger = LogManager.getLogger();
    @Override
    public void log(LogLevel logLevel, String message) {
        switch (logLevel) {
            case INFO:
                logger.info(message);
                break;
            case DEBUG:
                logger.debug(message);
                break;
            case ERROR:
                logger.error(message);
                break;
            case FATAL:
                logger.fatal(message);
                break;
            case TRACE:
                logger.trace(message);
                break;
            case WARNING:
                logger.warn(message);
                break;


        }

    }
}
