package base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void output_string_includes_length_width_f2_and_m2() {
        App myApp = new App();
        int length = 15;
        int width = 20;
        int f2 = 300;
        double m2 = 27.871;

        String expectedOutput = """
                You entered dimensions of 15 feet by 20 feet.
                The area is
                300 square feet
                27.871 square meters""";
        String actualOutput = myApp.generateOutputString(length, width, f2, m2);

        assertEquals(expectedOutput, actualOutput);
    }
}