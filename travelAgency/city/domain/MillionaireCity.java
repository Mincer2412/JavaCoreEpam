package travelAgency.city.domain;

public class MillionaireCity extends City {

    private Integer numberOfDistricts;
    private String majorName;
    private Double square;

    public Integer getNumberOfDistricts() {
        return numberOfDistricts;
    }

    public void setNumberOfDistricts(Integer numberOfDistricts) {
        this.numberOfDistricts = numberOfDistricts;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public Double getSquare() {
        return square;
    }

    public void setSquare(Double square) {
        this.square = square;
    }

    @Override
    public String toString() {
        return "MillionaireCity{" +
            "numberOfDistricts=" + numberOfDistricts +
            ", majorName='" + majorName + '\'' +
            ", square=" + square +
            '}';
    }

    @Override
    protected void initDiscriminator() {
        discriminator = CityDiscriminator.MILLIONAIRE;
    }
}
