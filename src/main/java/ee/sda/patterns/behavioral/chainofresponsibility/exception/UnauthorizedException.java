package ee.sda.patterns.behavioral.chainofresponsibility.exception;

public class UnauthorizedException extends RuntimeException {

    public UnauthorizedException (String message) {
        super(message);
    }
}
