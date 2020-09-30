package dk.cphbusiness.lsd.groupe.moonlogde.dto;

import java.util.Collection;

public class VacantRoomListDTO {

private Collection<RoomDTO> vacantRooms;

    public VacantRoomListDTO(Collection<RoomDTO> vacantRooms) {
        this.vacantRooms = vacantRooms;
    }

    public Collection<RoomDTO> getVacantRooms() {
        return vacantRooms;
    }

    public void setVacantRooms(Collection<RoomDTO> vacantRooms) {
        this.vacantRooms = vacantRooms;
    }
}
