package logback_learning;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogBackTest01 {

    private static Logger logger = LoggerFactory.getLogger("LogBackTest01:");

    public static void main(String[] args) {
        logger.info("进入到main程序");

        logger.debug("调用show()方法");
        show();
    }

    public static void show(){
//        System.out.println("show方法执行！");
        logger.trace("show方法执行！");
    }
}
