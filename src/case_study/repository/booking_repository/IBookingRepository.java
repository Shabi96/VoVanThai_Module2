package case_study.repository.booking_repository;

import case_study.model.booking.Booking;

import java.util.List;

public interface IBookingRepository {
    List<Booking> getBookingList();
    void addNewBooking(Booking booking);
}
