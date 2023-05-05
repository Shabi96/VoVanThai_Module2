package case_study.service.booking_service;

import case_study.model.booking.Booking;
import case_study.model.customer.Customer;
import case_study.model.facility.Facility;
import case_study.repository.booking_repository.BookingRepository;
import case_study.repository.customer_repository.CustomerRepository;
import case_study.repository.facility_repository.FacilityRepository;
import case_study.utils.validate.Validate;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class BookingService implements IBookingService {
    private BookingRepository bookingRepository = new BookingRepository();
    Scanner sc = new Scanner(System.in);
    private CustomerRepository customerRepository = new CustomerRepository();
    private FacilityRepository facilityRepository = new FacilityRepository();

    @Override
    public void displayBookingList() {
        TreeSet<Booking> bookings = bookingRepository.getBookingList();
        for (Booking b : bookings) {
            System.out.println(b);
        }
    }

    @Override
    public void addNewBooking() {
        String idBooking;
        do {
            System.out.println("Nhập mã booking: ");
            idBooking = sc.nextLine();
            if (Validate.validateBookingId(idBooking)) {
                System.out.println("Thêm thành công");
            } else {
                System.out.println("Nhập sai định dạng BK-YYYY");
            }
        } while (!Validate.validateBookingId(idBooking));

        String dayBooking;
        do {
            System.out.println("Nhập ngày booking: ");
            dayBooking = sc.nextLine();
            if (Validate.validateDayOfBirth(dayBooking)) {
                System.out.println("Thêm thành công");
            } else {
                System.err.println("Nhập sai định dạng YYYY-MM-DD\n" +
                        "Vui lòng nhập lại!!!");
            }
        } while (!Validate.validateDayOfBirth(dayBooking));

        String dayStart;
        do {
            System.out.println("Nhập ngày bắt đầu: ");
            dayStart = sc.nextLine();
            if (Validate.validateDayOfBirth(dayStart)) {
                System.out.println("Thêm thành công");
            } else {
                System.err.println("Nhập sai định dạng YYYY-MM-DD\n" +
                        "Vui lòng nhập lại!!!");
            }
        } while (!Validate.validateDayOfBirth(dayStart));

        String dayEnd;
        do {
            System.out.println("Nhập ngày kết thúc: ");
            dayEnd = sc.nextLine();
            if (Validate.validateDayOfBirth(dayEnd)) {
                System.out.println("Thêm thành công");
            } else {
                System.err.println("Nhập sai định dạng YYYY-MM-DD\n" +
                        "Vui lòng nhập lại!!!");
            }
        } while (!Validate.validateDayOfBirth(dayEnd));

        boolean check = true;
        String idCustomer;
        do {
            List<Customer> customerList = customerRepository.getCustomerList();
            for (Customer c : customerList) {
                System.out.println(c);
            }
            System.out.println("Nhập mã khách hàng: ");
            idCustomer = sc.nextLine();
            int index = customerRepository.checkById(idCustomer);
            if (index >= 0) {
                System.out.println("Thêm thành công!!");
                check = false;
            } else {
                System.out.println("Mã không tồn tại\n" +
                        "Vui lòng nhập lại!!!");
            }
        } while (check);

        boolean checkIdService = true;
        String idService;
        do {
            LinkedHashMap<Facility, Integer> facilityIntegerLinkedHashMap = facilityRepository.displayFacilityList();
            for (Facility f : facilityIntegerLinkedHashMap.keySet()) {
                System.out.println(f);
            }
            System.out.println("Nhập mã dịch vụ: ");
            idService = sc.nextLine();
            boolean checkById = facilityRepository.checkById(idService);
            if (checkById) {
                System.out.println("Thêm thành công!!");
                checkIdService = false;
            } else {
                System.out.println("Mã không tồn tại!!\n" +
                        "Vui lòng nhập lại!!!");
            }
        } while (checkIdService);

        Booking booking = new Booking(idBooking, dayBooking, dayStart, dayEnd, idCustomer, idService);
        bookingRepository.addNewBooking(booking);
        facilityRepository.updateBooking(idService);
    }
}
