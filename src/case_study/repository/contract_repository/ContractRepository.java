package case_study.repository.contract_repository;

import case_study.model.booking.Booking;
import case_study.model.contract.Contract;
import case_study.repository.booking_repository.BookingRepository;
import case_study.utils.contract_write_and_read.ContractWriteAndRead;
import java.util.*;

public class ContractRepository implements IContractRepository {
    private static final String PATH_CONTRACT_FILE = "src/case_study/data/contract/contract.csv";
    private List<Contract> contractList = ContractWriteAndRead.read(PATH_CONTRACT_FILE);
    private TreeSet<Booking> bookings = new TreeSet<>(Comparator.comparing(Booking::getDayBooking));
    private Queue<Booking> bookingQueue = new LinkedList<>();
    private BookingRepository bookingRepository = new BookingRepository();

    @Override
    public List<Contract> getContractList() {
        return contractList;
    }

    @Override
    public void addNewContract(Contract contract) {
        contractList.add(contract);
        ContractWriteAndRead.write(contractList, PATH_CONTRACT_FILE);
    }

    @Override
    public void editContract() {
        ContractWriteAndRead.write(contractList, PATH_CONTRACT_FILE);
    }

    @Override
    public int checkById(String id) {
        for (int i = 0; i < contractList.size(); i++) {
            if(id.equals(contractList.get(i).getIdContract())) {
                return i;
            }
        }
        return -1;
    }

    public Queue<Booking> idBooking() {
        bookings = bookingRepository.getBookingList();
        bookingQueue.addAll(bookings);
        return bookingQueue;
    }

}
