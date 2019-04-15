package travelAgency.city.exception.unchecked;

import travelAgency.city.exception.CityExceptionMeta;
import travelAgency.common.buisness.exception.TravelAgencyUncheckedException;

public class DeleteCityException extends TravelAgencyUncheckedException {

    public DeleteCityException(int code, String message) {
        super(code, message);
    }

    public DeleteCityException(CityExceptionMeta exceptionMeta) {
        super(exceptionMeta.getCode(), exceptionMeta.getDescription());
    }
}
