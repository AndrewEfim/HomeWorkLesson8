import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    private static Logger LOGGER = Logger.getLogger(Main.class.getName( ));
    public static void main(String[] args) throws NotFoundWorldException {
        try {
            FileHandler fileHandler = new FileHandler("logApp");
            LOGGER.addHandler(fileHandler);
        } catch (IOException e) {
            LOGGER.log(Level.CONFIG, "Configuration fail");
            LOGGER.log(Level.INFO, "Write Log with info level");
        }
        BeginProgramm beginProgramm = new BeginProgramm();
        beginProgramm.Begin();
    }
}