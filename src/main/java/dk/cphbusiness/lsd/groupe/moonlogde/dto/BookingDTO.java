package dk.cphbusiness.lsd.groupe.moonlogde.dto;

import java.util.Collection;
import java.util.Date;

public class BookingDTO {

    private Collection<RoomDTO> rooms;
    private Date dateOfArrival, dateOfDeparture;
    private String guestPassportNumber;
    private int numberOfGuest;

    private boolean arrivalIsLate;

    public BookingDTO(Collection<RoomDTO> rooms, Date dateOfArrival, Date dateOfDeparture, String guestPassportNumber, int numberOfGuest, boolean arrivalIsLate) {
        this.rooms = rooms;
        this.dateOfArrival = dateOfArrival;
        this.dateOfDeparture = dateOfDeparture;
        this.guestPassportNumber = guestPassportNumber;
        this.numberOfGuest = numberOfGuest;

        this.arrivalIsLate = arrivalIsLate;
    }

    public Collection<RoomDTO> getRooms() {
        return rooms;
    }

    public void setRooms(Collection<RoomDTO> rooms) {
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
