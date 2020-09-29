package dk.cphbusiness.lsd.groupe.moonlogde.dto;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookingDTO {

    private List<RoomDTO> rooms = new ArrayList();
    private Date dateOfArrival, dateOfDeparture;
    private String guestPassportNumber;
    private int numberOfGuest;

    private boolean arrivalIsLate;

    public BookingDTO(List<RoomDTO> rooms, Date dateOfArrival, Date dateOfDeparture, String guestPassportNumber, int numberOfGuest, boolean arrivalIsLate) {
        this.rooms = rooms;
        this.dateOfArrival = dateOfArrival;
        this.dateOfDeparture = dateOfDeparture;
        this.guestPassportNumber = guestPassportNumber;
        this.numberOfGuest = numberOfGuest;

        this.arrivalIsLate = arrivalIsLate;
    }

    public List<RoomDTO> getRooms() {
        return rooms;
    }

    public void setRooms(List<RoomDTO> rooms) {
        this.rooms = rooms;
    }

    public Date getDateOfArrival() {
        return dateOfArrival;
    }

    public void setDateOfArrival(Date dateOfArrival) {
        this.dateOfArrival = dateOfArrival;
    }

    public Date getDateOfDeparture() {
        return dateOfDeparture;
    }

    public void setDateOfDeparture(Date dateOfDeparture) {
        this.dateOfDeparture = dateOfDeparture;
    }

    public String getGuestPassportNumber() {
        return guestPassportNumber;
    }

    public void setGuestPassportNumber(String guestPassportNumber) {
        this.guestPassportNumber = guestPassportNumber;
    }

    public int getNumberOfGuest() {
        return numberOfGuest;
    }

    public void setNumberOfGuest(int numberOfGuest) {
        this.numberOfGuest = numberOfGuest;
    }

    public boolean isArrivalIsLate() {
        return arrivalIsLate;
    }

    public void setArrivalIsLate(boolean arrivalIsLate) {
        this.arrivalIsLate = arrivalIsLate;
    }
}
