package duke;

import javafx.application.Application;

/**
 * Solution below adapted from https://se-education.org/guides/tutorials/javaFxPart1.html
 * A launcher class to workaround classpath issues.
 */
public class Launcher {
    public static void main(String[] args) {
        Application.launch(Main.class, args);
    }
}
