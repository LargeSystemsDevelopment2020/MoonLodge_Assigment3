package dk.cphbusiness.lsd.groupe.moonlogde.dto;


import dk.cphbusiness.lsd.groupe.moonlogde.entitys.Hotel;

import java.util.List;

public class VacantHotelRoomDTO {

    private List<RoomDTO> rooms;
    private Hotel hotel;



    public VacantHotelRoomDTO(List<RoomDTO> rooms, Hotel hotel) {
        this.rooms = rooms;
        this.hotel = hotel;
    }

    public VacantHotelRoomDTO() {
    }

    public List<RoomDTO> getRooms() {
        return rooms;
    }

    public void setRooms(List<RoomDTO> rooms) {
        this.rooms = rooms;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
}
