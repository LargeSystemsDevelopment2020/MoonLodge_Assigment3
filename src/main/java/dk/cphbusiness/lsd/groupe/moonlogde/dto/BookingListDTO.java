package dk.cphbusiness.lsd.groupe.moonlogde.dto;

import java.util.Collection;

public class BookingListDTO {
    private Collection<BookingListDTO> bookingList;

    public BookingListDTO(Collection<BookingListDTO> bookingList) {
        this.bookingList = bookingList;
    }

    public Collection<BookingListDTO> getBookingList() {
        return bookingList;
    }

    public void setBookingList(Collection<BookingListDTO> bookingList) {
        this.bookingList = bookingList;
    }
}
