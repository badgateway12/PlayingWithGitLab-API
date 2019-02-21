import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@RunWith(value = Parameterized.class)
public class Test {
    private String input;
    private Character expected;

    public TaskTests(String input, Character expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}: test_firstRepeatingCharacter ({0}) =  {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {null, null},
                {"aa", 'a'},
                {"ab", null},
                {"aba", 'a'},
                {"abca", 'a'},
                {"abssb", 's'}
        });
    }

    @Test
    public void test_firstRepeatingCharacter() {
        assertThat(Task.firstRepeatingCharacter(input), is(expected));
    }
}
