package travelAgency.city.domain;

import travelAgency.common.buisness.domain.BaseDomain;

public abstract class City extends BaseDomain<Long> {

    protected String name;
    protected String description;
    protected int yearOfFoundation;
    public long population;
    protected boolean isCapital;
    protected CityDiscriminator discriminator;


    public City() {
    }

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

    protected abstract void initDiscriminator();

    public CityDiscriminator getDiscriminator() {
        return discriminator;
    }

    @Override
    public String toString() {
        return "City{" +
            "name='" + name + '\'' +
            ", description='" + description + '\'' +
            ", yearOfFoundation=" + yearOfFoundation +
            ", isCapital=" + isCapital +
            '}';
    }
}
