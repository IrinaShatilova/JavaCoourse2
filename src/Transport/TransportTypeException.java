package Transport;

import java.io.IOException;

public class TransportTypeException extends IOException {

    public TransportTypeException() {
        super();
    }
    public TransportTypeException(String message) {
        super(message);
    }

}
