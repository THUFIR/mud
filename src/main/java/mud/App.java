/*
 * This Java source file was generated by the Gradle 'init' task.

sh -c telnet rainmaker.wunderground.com 3000 | tee weather.txt


telnet rainmaker.wunderground.com | tee -a -i telnet.log



 */
package mud;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {



    private final static Logger log = Logger.getLogger(App.class.getName());


    private void telnet() throws IOException {

String s = "telnet rainmaker.wunderground.com | tee -a -i telnet.log";
String t = "cmd /c telnet localhost 4445";
String u = "telnet localhost 4445 | tee -a -i telnet.log";
log.info(s);
log.info(t);


ProcessBuilder processBuilder = new ProcessBuilder(t);
        Process process = processBuilder.start();


//Process    process = Runtime.getRuntime();
      //.exec(String.format("cmd.exe /c dir %s", homeDirectory));


    }

    public static void main(String[] args) {
try{	new App().telnet();}
catch IOException ioe {log(ioe.toString();}
    }
}
