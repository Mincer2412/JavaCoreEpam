package travelAgency.common.buisness.dto;

import java.io.Serializable;

public abstract class BaseDTO<ID> implements Serializable {
    protected ID id;

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }
}
