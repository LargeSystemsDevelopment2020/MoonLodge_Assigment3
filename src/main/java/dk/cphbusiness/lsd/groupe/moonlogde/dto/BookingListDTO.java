package dk.cphbusiness.lsd.groupe.moonlogde.dto;

import java.util.List;

public class BookingListDTO {
    private List<BookingListDTO> bookingList;

    public BookingListDTO(List<BookingListDTO> bookingList) {
        this.bookingList = bookingList;
    }

    public List<BookingListDTO> getBookingList() {
        return bookingList;
    }

    public void setBookingList(List<BookingListDTO> bookingList) {
        this.bookingList = bookingList;
    }
}
