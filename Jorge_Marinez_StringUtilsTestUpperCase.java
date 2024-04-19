import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Jorge_Marinez_StringUtilsTestUpperCase {

    private String input;
    private String expectedOutput;

    public Jorge_Marinez_StringUtilsTestUpperCase(String input, String expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {"hello", "HELLO"},
                {"Java", "JAVA"},
                {"123abc", "123ABC"},
                {"", ""}
        });
    }

    @Test
    public void testToUpperCase() {
        assertEquals(expectedOutput, StringUtils.toUpperCase(input));
    }
}
