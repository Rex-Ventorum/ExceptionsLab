package lab3;

public class MaximumLengthException extends IllegalArgumentException{
    private static final String errMsg = "Argument Provided Excided The Maximum Length Allowed";
    public MaximumLengthException() {
        super(errMsg);
    }

    public MaximumLengthException(String string) {
        super(errMsg);
    }

    public MaximumLengthException(String string, Throwable thrwbl) {
        super(errMsg, thrwbl);
    }

    public MaximumLengthException(Throwable thrwbl) {
        super(errMsg,thrwbl);
    }
    
}
