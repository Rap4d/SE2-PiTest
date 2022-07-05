package twr.example3;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * @author Artem Khvastunov
 * Tests use stored compiled binaries of this class. Source here for reference only.
 */
public class TryCatchFinallyExample {

    public static void main(String[] args) {
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            baos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finally!");
        }
    }
}
