package travelAgency.common.buisness.exception;

public class TravelAgencyUncheckedException extends RuntimeException {

    protected int code;

    public TravelAgencyUncheckedException(int code, String message) {
        super(message);
        this.code = code;
    }


    public TravelAgencyUncheckedException(int code, String message, Exception cause) {
        super(message);
        this.code = code;
        initCause(cause);
    }
}
