package travelAgency.city.dto;

import travelAgency.city.domain.CityDiscriminator;
import travelAgency.common.buisness.dto.BaseDTO;

public class CityDto extends BaseDTO<Long> {

    protected String name;
    protected String description;
    protected int yearOfFoundation;
    public long population;
    protected boolean isCapital;
    protected CityDiscriminator discriminator;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getYearOfFoundation() {
        return yearOfFoundation;
    }

    public void setYearOfFoundation(int yearOfFoundation) {
        this.yearOfFoundation = yearOfFoundation;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public boolean isCapital() {
        return isCapital;
    }

    public void setCapital(boolean capital) {
        isCapital = capital;
    }

    public CityDiscriminator getDiscriminator() {
        return discriminator;
    }

    public void setDiscriminator(CityDiscriminator discriminator) {
        this.discriminator = discriminator;
    }
}
