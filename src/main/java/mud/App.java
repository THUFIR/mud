/*
 * This Java source file was generated by the Gradle 'init' task.

sh -c telnet rainmaker.wunderground.com 3000 | tee weather.txt


telnet rainmaker.wunderground.com | tee -a -i telnet.log



 */
package mud;

import java.io.IOException;
import java.util.logging.Logger;

public class App {

    private final static Logger log = Logger.getLogger(App.class.getName());

    private void telnet() throws IOException {
        String s = "telnet rainmaker.wunderground.com | tee -a -i telnet.log";
        String t = "cmd /c telnet localhost 4445";
        String u = "telnet localhost 4445 | tee -a -i /home/thufir/telnet.log";
        String v = "telnet localhost";
        log.fine(s);

        ProcessBuilder processBuilder = new ProcessBuilder(v);
        Process process = processBuilder.start();
    }

    public static void main(String[] args) throws IOException {
        new App().telnet();
    }

}
