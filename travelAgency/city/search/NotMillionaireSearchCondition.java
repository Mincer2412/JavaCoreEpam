package travelAgency.city.search;

public class NotMillionaireSearchCondition extends CitySearchCondition {

    private Integer numberOfVillages;
    private String headName;
    private String districtName;

    public Integer getNumberOfVillages() {
        return numberOfVillages;
    }

    public void setNumberOfVillages(Integer numberOfVillages) {
        this.numberOfVillages = numberOfVillages;
    }

    public String getHeadName() {
        return headName;
    }

    public void setHeadName(String headName) {
        this.headName = headName;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public boolean searchByNumberOfVillages () {
        return numberOfVillages != null && numberOfVillages > 0;
    }

    public boolean searchByHeadName() {
        return headName != null && !headName.isEmpty();
    }

    public boolean searchByDistrictName() {
        return districtName != null && !districtName.isEmpty();
    }

}
