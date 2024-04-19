import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Yuchen_Jiang_StringUtilsTestConcatenate {

    private String input1;
    private String input2;
    private String expectedOutput;

    public Yuchen_Jiang_StringUtilsTestConcatenate(String input1, String input2, String expectedOutput) {
        this.input1 = input1;
        this.input2 = input2;
        this.expectedOutput = expectedOutput;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {"Hello", "World", "HelloWorld"},
                {"", "", ""},
                {"Java", "Script", "JavaScript"},

        });
    }

    @Test
    public void testConcatenate() {
        assertEquals(expectedOutput, StringUtils.concatenate(input1, input2));
    }
}
