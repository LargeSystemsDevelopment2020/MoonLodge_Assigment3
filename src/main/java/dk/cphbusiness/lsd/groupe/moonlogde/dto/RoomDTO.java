package dk.cphbusiness.lsd.groupe.moonlogde.dto;

import dk.cphbusiness.lsd.groupe.moonlogde.entitys.RoomType;

public class RoomDTO {
    private String id;
    private RoomType roomtype;
    private double price;
    private int capacity;
    private HotelDTO hotel;

    public RoomDTO(String id, RoomType roomtype, double price, int capacity, HotelDTO hotel) {
        this.id = id;
        this.roomtype = roomtype;
        this.price = price;
        this.capacity = capacity;
        this.hotel = hotel;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RoomType getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(RoomType roomtype) {
        this.roomtype = roomtype;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
