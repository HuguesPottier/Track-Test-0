package advanced;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class RecursiveFunctionsCodelab04Test {

    @Test
    void testingReversion() {
        int[] actual = RecursiveFunctionsCodelab04.reverse(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});

        Assertions.assertThat(actual).containsExactly(10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
    }
}
