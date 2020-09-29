package dk.cphbusiness.lsd.groupe.moonlogde.dto;

import java.util.List;

public class VacantRoomListDTO {

private List<RoomDTO> vacantRooms;

    public VacantRoomListDTO(List<RoomDTO> vacantRooms) {
        this.vacantRooms = vacantRooms;
    }

    public List<RoomDTO> getVacantRooms() {
        return vacantRooms;
    }

    public void setVacantRooms(List<RoomDTO> vacantRooms) {
        this.vacantRooms = vacantRooms;
    }
}
