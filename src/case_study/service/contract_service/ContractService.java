package case_study.service.contract_service;

import case_study.model.booking.Booking;
import case_study.model.contract.Contract;
import case_study.repository.contract_repository.ContractRepository;
import case_study.utils.validate.Validate;
import java.util.*;

public class ContractService implements IContractService {
    private ContractRepository contractRepository = new ContractRepository();
    private Queue<Booking> bookingQueue = contractRepository.idBooking();
    Scanner sc = new Scanner(System.in);

    @Override
    public void displayContractList() {
        List<Contract> contractList = contractRepository.getContractList();
        for (Contract c : contractList) {
            System.out.println(c);
        }
    }

    @Override
    public void addNewContract() {
        if (!bookingQueue.isEmpty()) {
            String idContract;
            do {
                System.out.println("Nhập mã Contract: ");
                idContract = sc.nextLine();
                if (Validate.validateContractId(idContract)) {
                    System.out.println("Thêm thành công");
                } else {
                    System.out.println("Nhập sai định dạng CT-YYYY");
                }
            } while (!Validate.validateContractId(idContract));

            for (Booking b : bookingQueue) {
                System.out.println(b);
            }
            String idBooking;
            idBooking = bookingQueue.poll().getIdBooking();
            System.out.println("Nhập tiền cọc: ");
            double deposit = Double.parseDouble(sc.nextLine());
            System.out.println("Nhập tổng tiền: ");
            double sumMoney = Double.parseDouble(sc.nextLine());
            Contract contract = new Contract(idContract, idBooking, deposit, sumMoney);
            contractRepository.addNewContract(contract);
            System.out.println("Thêm thành công!!!");
        } else {
            System.out.println("Hiện tại không có Booking nào!!!");
        }
    }

    @Override
    public void editContract() {
        System.out.println("Nhập id contract muốn sửa: ");
        String idContract = sc.nextLine();
        int check = contractRepository.checkById(idContract);
        if (check >= 0) {
            boolean flag = true;
            do {
                System.out.print("Bạn muốn sửa gì??\n" +
                        "1. Tiền cọc\n" +
                        "2. Tổng tiền\n" +
                        "0. Thoát\n" +
                        "Mời chọn: ");
                String choice = sc.nextLine();
                switch (choice) {
                    case "1":
                        System.out.println("Nhập tiền cọc mới: ");
                        double newDeposit = Double.parseDouble(sc.nextLine());
                        contractRepository.getContractList().get(check).setDeposit(newDeposit);
                        break;
                    case "2":
                        System.out.println("Nhập tổng tiền mới: ");
                        double newSumMoney = Double.parseDouble(sc.nextLine());
                        contractRepository.getContractList().get(check).setSumMoney(newSumMoney);
                        break;
                    case "0":
                        contractRepository.editContract();
                        flag = false;
                        break;
                    default:
                        System.out.println("Bạn chọn sai rồi!!");
                        break;
                }
            } while (flag);
        }
    }
}
