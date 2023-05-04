package case_study.repository.booking_repository;

import case_study.model.booking.Booking;

import java.util.List;
import java.util.TreeSet;

public interface IBookingRepository {
    TreeSet<Booking> getBookingList();
    void addNewBooking(Booking booking);
}
