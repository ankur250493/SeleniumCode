package Beta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class SecondDemo {

   private static Logger log =  LogManager.getLogger(SecondDemo.class);
    public static void main(String[] args){

        log.debug("debug message");
    if(7>6){
            log.info("Info message");
            log.error("Error message");
            log.fatal("fatal message");

        }
    }
}
