package Transport;

public class TransportTypeException extends RuntimeException {
    public TransportTypeException(){
    }
    public TransportTypeException(String message){
        super(message);
    }
}
