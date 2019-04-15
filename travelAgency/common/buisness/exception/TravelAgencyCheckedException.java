package travelAgency.common.buisness.exception;

public class TravelAgencyCheckedException extends Exception {

    protected int code;

    public TravelAgencyCheckedException(int code, String message) {
        super(message);
        this.code = code;
    }

    public TravelAgencyCheckedException(int code, String message, Exception cause) {
        super(message);
        this.code = code;
        initCause(cause);
    }
}
