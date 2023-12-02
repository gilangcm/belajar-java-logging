package programmerzamannow.logging;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LevelTest {

    private static final Logger log = LoggerFactory.getLogger(LevelTest.class);

    @Test
    void testLevel() {
        log.trace("trace");
        log.debug("debug");
        log.info("Info");
        log.warn("warn");
        log.error("error");
    }
}
