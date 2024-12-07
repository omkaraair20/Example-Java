import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class App{
    public static void main(String[] args) {
        System.out.println("Hello world!");
        BasicConfigurator.configure();
        logger.info("Hello world");
        logger.info("we are in logger info mode");
        logger.debug("debug level");
        logger.warn("warning");
        logger.error("error");
        logger.fatal("fatal");

        myMethod();
        logger.info("after calling method");
    }
    private static void myMethod()
    {
        try{
            throw new Exception("My Exception");
        } catch (Exception e) {
            logger.error("This is an exception"+e);
        }
    }
}