package simple;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
@Tag("simple")
public class SkippedTests {
    @Test
    @Disabled
    void testSkipped1() {
        assertTrue(true);
    }
    @Test
    @Disabled("Disable reason")
    void testSkipped2() {
        assertTrue(true);
    }
}
