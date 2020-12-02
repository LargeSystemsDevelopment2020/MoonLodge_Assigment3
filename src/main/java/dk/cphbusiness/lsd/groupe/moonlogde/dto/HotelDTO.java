package dk.cphbusiness.lsd.groupe.moonlogde.dto;

import dk.cphbusiness.lsd.groupe.moonlogde.entitys.HeadQuarter;

public class HotelDTO {
    private String name, address, city;
    private double rating, distanceToCenter;
    private long id;
    private long headQuarterId;


    public HotelDTO(String name, String address, String city, double rating, double distanceToCenter, long id, long headQuarterId) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.rating = rating;
        this.distanceToCenter = distanceToCenter;
        this.id = id;
        this.headQuarterId = headQuarterId;
    }

    public HotelDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getDistanceToCenter() {
        return distanceToCenter;
    }

    public void setDistanceToCenter(double distanceToCenter) {
        this.distanceToCenter = distanceToCenter;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getHeadQuarterId() {
        return headQuarterId;
    }

    public void setHeadQuarterId(long headQuarterId) {
        this.headQuarterId = headQuarterId;
    }

    @Override
    public String toString() {
        return "HotelDTO{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", rating=" + rating +
                ", distanceToCenter=" + distanceToCenter +
                ", id=" + id +
                ", headQuarterId=" + headQuarterId +
                '}';
    }
}
