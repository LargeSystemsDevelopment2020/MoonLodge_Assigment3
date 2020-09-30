package dk.cphbusiness.lsd.groupe.moonlogde.entitys;

import java.util.Collection;

public class Hotel {
    private Collection<Room> Rooms;
    private String name, address, city;
    private Double rating, distanceToCenter;
    private String id;

    public Hotel(Collection<Room> rooms, String name, String address, String city, Double rating, Double distanceToCenter, String id) {
        Rooms = rooms;
        this.name = name;
        this.address = address;
        this.city = city;
        this.rating = rating;
        this.distanceToCenter = distanceToCenter;
        this.id = id;
    }

    public Collection<Room> getRooms() {
        return Rooms;
    }

    public void setRooms(Collection<Room> rooms) {
        Rooms = rooms;
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

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Double getDistanceToCenter() {
        return distanceToCenter;
    }

    public void setDistanceToCenter(Double distanceToCenter) {
        this.distanceToCenter = distanceToCenter;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
