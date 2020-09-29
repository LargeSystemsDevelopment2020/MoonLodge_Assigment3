package dk.cphbusiness.lsd.groupe.moonlogde.entitys;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Booking {
    private List<Room> rooms = new ArrayList();
    private boolean arrivalIsLate;
    private Date dateOfArrival, dateOfDeparture;
    private String guestPassportNumber;
    private int numberOfGuest;

    public Booking(List<Room> rooms, boolean arrivalIsLate, Date dateOfArrival, Date dateOfDeparture, String guestPassportNumber, int numberOfGuest) {
        this.rooms = rooms;
        this.arrivalIsLate = arrivalIsLate;
        this.dateOfArrival = dateOfArrival;
        this.dateOfDeparture = dateOfDeparture;
        this.guestPassportNumber = guestPassportNumber;
        this.numberOfGuest = numberOfGuest;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public boolean isArrivalIsLate() {
        return arrivalIsLate;
    }

    public void setArrivalIsLate(boolean arrivalIsLate) {
        this.arrivalIsLate = arrivalIsLate;
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
}
