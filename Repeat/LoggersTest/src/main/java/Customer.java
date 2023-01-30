import java.util.logging.Logger;

public class Customer {
    public static Logger logger;
    public static void main(String[] args) {
        logger = Logger.getLogger(String.valueOf(Customer.class));
        logger.error("ERROR");
        logger.warn("WARNING");
        logger.fatal("FATAL");
        logger.debug("DEBUG");
        logger.info("INFO");
        System.out.println("Final Output");
        Источник: https://java-blog.ru/osnovy/logger-java
        System.out.println("Final Output");
    }
}
