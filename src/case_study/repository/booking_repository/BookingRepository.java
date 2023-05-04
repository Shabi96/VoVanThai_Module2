package case_study.repository.booking_repository;

import case_study.model.booking.Booking;
import case_study.utils.booking_write_and_read.BookingWriteAndRead;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class BookingRepository implements IBookingRepository {
    private static final String PATH_BOOKING_FILE = "src/case_study/data/booking/booking.csv";
    private static TreeSet<Booking> bookingList = new TreeSet<>(Comparator.comparing(Booking::getDayStart).thenComparing(Booking::getDayEnd));

    static {
        bookingList.add(new Booking("BK-0001", "3", "04", "10", "KH-0001", "SVHO-0001"));
        bookingList.add(new Booking("BK-0002", "4", "04", "05", "KH-0002", "SVHO-0002"));
        bookingList.add(new Booking("BK-0003", "5", "06", "08", "KH-0003", "SVHO-0003"));
        bookingList.add(new Booking("BK-0004", "6", "08", "10", "KH-0004", "SVHO-0004"));
        bookingList.add(new Booking("BK-0005", "3", "05", "10", "KH-0005", "SVHO-0005"));
    }

    @Override
    public TreeSet<Booking> getBookingList() {
        return bookingList;
    }

    @Override
    public void addNewBooking(Booking booking) {
        bookingList.add(booking);
    }
}
