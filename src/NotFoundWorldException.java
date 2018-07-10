import java.io.IOException;

public class NotFoundWorldException extends IOException {

    public NotFoundWorldException(String message) {
        super(message);
    }
}