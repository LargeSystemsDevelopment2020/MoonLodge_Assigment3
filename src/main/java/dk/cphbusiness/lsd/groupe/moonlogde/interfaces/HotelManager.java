package dk.cphbusiness.lsd.groupe.moonlogde.interfaces;

import dk.cphbusiness.lsd.groupe.moonlogde.dto.BookingDTO;
import dk.cphbusiness.lsd.groupe.moonlogde.dto.RoomDTO;
import dk.cphbusiness.lsd.groupe.moonlogde.entitys.Room;

import java.util.Collection;
import java.util.Date;
import java.util.List;

public interface HotelManager {
    /**
     * Takes different criteria as params and queries database for rooms that are:
     * vacant at the given time, for given number of guests and rooms, in the given city
     *
     * @param city
     * @param dateFrom
     * @param dateTo
     * @param numberGuests
     * @param numberRooms
     * @return List of vacant hotel rooms for search criteria
     */
    public Collection<RoomDTO> getHotelRoomList(String city, Date dateFrom, Date dateTo, int numberGuests, int numberRooms);

    /**
     * Takes the empty rooms selected in the frontend, along with a passport number from the guest
     * and creates the booking in the database
     *
     * @param rooms
     * @param passportNo
     * @param dateFrom
     * @param dateTo
     * @param arrivalIsLate
     * @return Booking information with the purpose of confirming the booking in the frontend
     */
    public BookingDTO createHotelRoomBooking(List<Room> rooms, String passportNo, Date dateFrom, Date dateTo, Boolean arrivalIsLate);

    /**
     * Queries the database for all bookings made with given passport number
     *
     * @param passportNo
     * @return List of bookings made with the given passport number
     */
    public Collection<BookingDTO> findBookings(String passportNo);

    /**
     * Deletes a booking in the database, given a booking object
     *
     * @param booking
     * @return boolean for whether the delete statement was successful in database
     */
    public boolean cancelBooking(BookingDTO booking);

}
