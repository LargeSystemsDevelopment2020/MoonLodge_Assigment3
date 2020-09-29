package dk.cphbusiness.lsd.groupe.moonlogde.entitys;

public class Room {
    private String id;
    private Hotel hotel;
    private RoomType roomtype;
    private double price;
    private int capacity;

    public Room(String id, Hotel hotel, RoomType roomtype, double price, int capacity) {
        this.id = id;
        this.hotel = hotel;
        this.roomtype = roomtype;
        this.price = price;
        this.capacity = capacity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
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
