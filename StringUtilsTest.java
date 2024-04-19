import org.junit.Test;
import static org.junit.Assert.*;

public class StringUtilsTest {

    @Test
    public void testConcatenate() {
        assertEquals("HelloWorld", StringUtils.concatenate("Hello", "World"));
    }

    @Test
    public void testReverse() {
        assertEquals("cba", StringUtils.reverse("abc"));
    }

    @Test
    public void testToUpperCase() {
        assertEquals("HELLO", StringUtils.toUpperCase("hello"));
    }

    @Test
    public void testTrim() {
        assertEquals("Hello World", StringUtils.trim("   Hello World   "));
    }
}
