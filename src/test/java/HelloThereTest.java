
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloThereTest {

    @Test
    void main() {
        String userInput = String.format("Great!%sTotally", System.lineSeparator());
        ByteArrayInputStream bais = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(bais);

        String expected = "Hello there! How are you doing today?";
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        System.setOut(printStream);

        HelloThere.main(null);

        String[]  lines= baos.toString().split(System.lineSeparator());
        String actual = lines[lines.length-3];

        assertEquals(expected, actual);

    }
}