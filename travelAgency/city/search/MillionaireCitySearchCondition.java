package travelAgency.city.search;

public class MillionaireCitySearchCondition extends CitySearchCondition {

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

    public boolean searchByNumberofDistricts() {
        return numberOfDistricts != null && numberOfDistricts > 0;
    }

    public boolean searchByMajorName() {
        return majorName != null && !majorName.isEmpty();
    }

    public boolean searchBySquare() {
        return square != null && square > 0;
    }
}
