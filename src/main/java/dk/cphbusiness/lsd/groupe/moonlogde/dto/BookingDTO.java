package dk.cphbusiness.lsd.groupe.moonlogde.dto;

import dk.cphbusiness.lsd.groupe.moonlogde.entitys.Hotel;

import java.util.Arrays;
import java.util.List;

public class BookingDTO {
    private long bookingID;
    private List<RoomDTO> rooms;
    private String[] passportNumbers;
    private Hotel hotel;

    public BookingDTO() {
    }

    public BookingDTO(long id, List<RoomDTO> rooms, String[] passportNumbers, Hotel hotel) {
        this.bookingID = id;
        this.rooms = rooms;
        this.passportNumbers = passportNumbers;
        this.hotel = hotel;
    }

    public List<RoomDTO> getRooms() {
        return rooms;
    }

    public void setRooms(List<RoomDTO> rooms) {
        this.rooms = rooms;
    }

    public long getId() {
        return bookingID;
    }

    public void setId(long id) {
        this.bookingID = id;
    }

    public String[] getPassportNumbers() {
        return passportNumbers;
    }

    public void setPassportNumbers(String[] passportNumbers) {
        this.passportNumbers = passportNumbers;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    @Override
    public String toString() {
        return "BookingDTO{" +
                "bookingID=" + bookingID +
                ", rooms=" + rooms +
                ", passportNumbers=" + Arrays.toString(passportNumbers) +
                ", hotel=" + hotel +
                '}';
    }
}
