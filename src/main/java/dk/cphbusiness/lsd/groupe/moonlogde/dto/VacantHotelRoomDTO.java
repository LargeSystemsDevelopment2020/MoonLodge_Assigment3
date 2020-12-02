package dk.cphbusiness.lsd.groupe.moonlogde.dto;


import dk.cphbusiness.lsd.groupe.moonlogde.entitys.Hotel;

import java.util.List;

public class VacantHotelRoomDTO {

    private RoomDTO room;
    private Hotel hotel;


    public VacantHotelRoomDTO(RoomDTO room, Hotel hotel) {
        this.room = room;
        this.hotel = hotel;
    }

    public VacantHotelRoomDTO() {
    }

    public RoomDTO getRoom() {
        return room;
    }

    public void setRoom(RoomDTO room) {
        this.room = room;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
}
