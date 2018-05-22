import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTests {

    public App app;

    @Test
    public void return2_returns_2() {
        App app = new App();
        assertEquals(app.returntwo(),2);
    }

    @Test
    public void asksforname() {
        App app = new App();
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        app.sayname();
        assertEquals("hi\n", outContent.toString());
    }

    @Test
    public void callThemByTheirNamesTest() {
        App app = new App();
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        app.callThemByTheirNames("Kota");
        assertEquals("hi Kota\n", outContent.toString());
    }

    @Test
    public void asksAndPrintsAge() throws IOException {
        App app = new App();
        String input = "20";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals("hehehe", app.askForAge());
    }
}
