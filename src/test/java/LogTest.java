import org.apache.log4j.Logger;

public class LogTest {
    private static Logger logger = Logger.getLogger("com.aishang.test.TestDemo");
    public static void main(String[] args) {
        logger.debug("我在测试debug");
        logger.info("我在保存info信息");
        logger.warn("警告一次");
        logger.error("记录错误信息(测试)");
        logger.fatal("非常非常非常严重的问题（测试）");
    }

}
