package mud;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class App {

    private final static Logger log = Logger.getLogger(App.class.getName());

    private void telnet() throws IOException {
        String s = "rainmaker.wunderground.com";

        List<String> telnetCommand = Arrays.asList("sh", "-c", "rainmaker.wunderground.com | tee -a -i telnet.log");
        String foo = "foo";

        ProcessBuilder pb = new ProcessBuilder(telnetCommand);
        Process p = pb.start();
    }

    public static void main(String[] args) throws IOException {
        new App().telnet();
    }

}
