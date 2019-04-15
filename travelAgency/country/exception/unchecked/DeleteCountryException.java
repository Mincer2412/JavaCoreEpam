package travelAgency.country.exception.unchecked;

import travelAgency.common.buisness.exception.TravelAgencyUncheckedException;
import travelAgency.country.domain.Country;
import travelAgency.country.exception.CountryExceptionMeta;

public class DeleteCountryException extends TravelAgencyUncheckedException {

    public DeleteCountryException(int code, String message) {
        super(code, message);
    }

    public DeleteCountryException(CountryExceptionMeta exceptionMeta) {
        super(exceptionMeta.getCode(), exceptionMeta.getDescription());
    }
}
