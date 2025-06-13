package autowiring;

public class Address {
    private String laneNo;
    private String city;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLaneNo() {
        return laneNo;
    }

    public void setLaneNo(String laneNo) {
        this.laneNo = laneNo;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", laneNo='" + laneNo + '\'' +
                '}';
    }
}
