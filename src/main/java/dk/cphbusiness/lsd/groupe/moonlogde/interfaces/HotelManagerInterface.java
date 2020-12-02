package dk.cphbusiness.lsd.groupe.moonlogde.interfaces;

import dk.cphbusiness.lsd.groupe.moonlogde.dto.BookingDTO;
import dk.cphbusiness.lsd.groupe.moonlogde.dto.VacantHotelRoomDTO;
import dk.cphbusiness.lsd.groupe.moonlogde.entitys.Room;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface HotelManagerInterface extends Remote {


    /**
     * Takes different criteria as params and queries database for rooms that are:
     * vacant at the given time, for given number of guests and rooms, in the given city
     *
     * @param city         the ISO-code of the city
     * @param dateFrom     The booking starts at this date
     * @param dateTo       The booking ends at this date
     * @param numberGuests Number of guest in the booking
     * @param numberRooms  Number of rooms the guests have booked
     * @return List of vacant hotel rooms for search criteria
     */
    public List<VacantHotelRoomDTO> getHotelRoomList(String city, long dateFrom, long dateTo, int numberGuests, int numberRooms) throws RemoteException;

    /**
     * Takes the empty rooms selected in the frontend, along with a passport number from the guest
     * and creates the booking in the database
     *
     * @param rooms
     * @param passportNumbers
     * @param dateFrom
     * @param dateTo
     * @param arrivalIsLate
     * @return Booking information with the purpose of confirming the booking in the frontend
     */
    public BookingDTO createBooking(List<Room> rooms, String[] passportNumbers, long dateFrom, long dateTo, boolean arrivalIsLate) throws RemoteException;


    /**
     * Queries the database for all bookings made with given passport number
     *
     * @param passportNumber
     * @return List of bookings made with the given passport number
     */
    public List<BookingDTO> findBookings(String passportNumber) throws RemoteException;

    /**
     * Deletes a booking in the database, given a booking object
     *
     * @param bookingId
     * @return boolean for whether the delete statement was successful in database
     */
    public boolean cancelBooking(long bookingId) throws RemoteException;

}