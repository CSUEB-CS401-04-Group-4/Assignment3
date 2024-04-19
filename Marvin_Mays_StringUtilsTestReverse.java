import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Marvin_Mays_StringUtilsTestReverse {

    private String input;
    private String expectedOutput;

    public Marvin_Mays_StringUtilsTestReverse(String input, String expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {"abc", "cba"},
                {"", ""},
                {"123", "321"},
                {"Hello World", "dlroW olleH"}
        });
    }

    @Test
    public void testReverse() {
        assertEquals(expectedOutput, StringUtils.reverse(input));
    }
}
