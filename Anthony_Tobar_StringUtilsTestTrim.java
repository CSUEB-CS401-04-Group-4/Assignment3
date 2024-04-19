import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Anthony_Tobar_StringUtilsTestTrim {

    private String input;
    private String expectedOutput;

    public Anthony_Tobar_StringUtilsTestTrim(String input, String expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {"  hello  ", "hello"},
                {"\tJava\t", "Java"},
                {"\nNew Line\n", "New Line"},
                {"NoSpaces", "NoSpaces"},
                {"", ""},
                {"    ", ""}
        });
    }

    @Test
    public void testTrim() {
        assertEquals(expectedOutput, StringUtils.trim(input));
    }
}
