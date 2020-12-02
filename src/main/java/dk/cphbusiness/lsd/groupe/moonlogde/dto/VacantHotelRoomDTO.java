package dk.cphbusiness.lsd.groupe.moonlogde.dto;


import dk.cphbusiness.lsd.groupe.moonlogde.entitys.Hotel;
import dk.cphbusiness.lsd.groupe.moonlogde.entitys.RoomType;

import java.util.List;

public class VacantHotelRoomDTO {

    private long id;
    private RoomType roomType;
    private int maxCapacity;
    private double price;
    private Hotel hotel;

    public VacantHotelRoomDTO(long id, RoomType roomType, int maxCapacity, double price, Hotel hotel) {
        this.id = id;
        this.roomType = roomType;
        this.maxCapacity = maxCapacity;
        this.price = price;
        this.hotel = hotel;
    }

    public VacantHotelRoomDTO() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    @Override
    public String toString() {
        return "VacantHotelRoomDTO{" +
                "id=" + id +
                ", roomType=" + roomType +
                ", maxCapacity=" + maxCapacity +
                ", price=" + price +
                ", hotel=" + hotel +
                '}';
    }
}
