package travelAgency.city.domain;

public class NotMillionaireCity extends City {

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

    @Override
    public String toString() {
        return "NotMillionaireCity{" +
            "numberOfVillages=" + numberOfVillages +
            ", headName='" + headName + '\'' +
            ", districtName='" + districtName + '\'' +
            '}';
    }

    @Override
    protected void initDiscriminator() {
        discriminator = CityDiscriminator.NOT_MILLIONAIRE;
    }
}
