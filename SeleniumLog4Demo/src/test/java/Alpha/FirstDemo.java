package Alpha;
import org.apache.logging.log4j.*;
import sun.rmi.runtime.Log;


public class FirstDemo {

   private static Logger log =  LogManager.getLogger(FirstDemo.class);
    public static void main(String[] args){

        log.debug("debug message");
    if(7>6){
            log.info("Info message");
            log.error("Error message");
            log.fatal("fatal message");

        }
    }
}
