package case_study.service.customer_service;

import case_study.model.customer.Customer;
import case_study.repository.customer_repository.CustomerRepository;
import case_study.utils.validate.Validate;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    CustomerRepository customerRepository = new CustomerRepository();
    Scanner sc = new Scanner(System.in);

    @Override
    public void displayCustomerList() {
        List<Customer> customerList = customerRepository.getCustomerList();
        for (Customer c : customerList) {
            System.out.println(c);
        }
    }

    @Override
    public void addNewCustomer() {
        String code;
        boolean checkCode = true;
        do {
            System.out.println("Nhập mã khách hàng: ");
            code = sc.nextLine();
            int indexCheck = customerRepository.checkById(code);
            if (Validate.validateCustomerCode(code)) {
                if (indexCheck < 0) {
                    System.out.println("Thêm thành công!!!");
                    checkCode = false;
                } else {
                    System.err.println("Mã đã tồn tại!!!\n" +
                            "Vui lòng nhập lại!!");
                }
            } else {
                System.err.println("Nhập chưa đúng định dạng!");
            }
        } while (checkCode);

        String name;
        do {
            System.out.println("Nhập tên: ");
            name = sc.nextLine();
            if (Validate.validateName(name)) {
                System.out.println("Thêm thành công!!!");
            } else {
                System.err.println("Nhập chưa đúng định dạng!");
            }
        } while (!Validate.validateName(name));
        String day;
        boolean checkAge = true;
        do {
            System.out.println("Nhập ngày sinh(YYYY-MM-DD): ");
            day = sc.nextLine();
            LocalDate dob = LocalDate.parse(day);
            if (Validate.validateDayOfBirth(day) && Validate.calAge(dob) >= 18) {
                System.out.println("Thêm thành công!!!");
                checkAge = false;
            } else {
                System.err.println("Nhập chưa đúng định dạng hoặc chưa đủ 18 tuổi!!!");
            }
        } while (checkAge);
        boolean flag3 = true;
        String gender = "";
        do {
            System.out.println("Chọn giới tính: \n" +
                    "1. Nam\n" +
                    "2. Nữ\n" +
                    "Mời chọn: ");
            String choice = sc.nextLine();
            if (choice.equals("1")) {
                gender = "Nam";
                flag3 = false;
            } else if (choice.equals("2")) {
                gender = "Nữ";
                flag3 = false;
            } else {
                System.out.println("Bạn chọn sai rồi!!!");
            }
        } while (flag3);

        String id;
        do {
            System.out.println("Nhập ID: ");
            id = sc.nextLine();
            if (Validate.validateId(id)) {
                System.out.println("Thêm thành công!!!");
            } else {
                System.err.println("Nhập chưa đúng định dạng! ( 9 hoặc 12 số )");
            }
        } while (!Validate.validateId(id));
        String phone;
        do {
            System.out.println("Nhập số điện thoại: ");
            phone = sc.nextLine();
            if (Validate.validatePhone(phone)) {
                System.out.println("Thêm thành công!!!");
            } else {
                System.err.println("Nhập chưa đúng định dạng!");
            }
        } while (!Validate.validatePhone(phone));
        System.out.println("Nhập email: ");
        String email = sc.nextLine();
        boolean flag = true;
        String typeOfGuess = null;
        do {
            System.out.print("Chọn loại khách: \n" +
                    "1. Diamond\n" +
                    "2. Platinum\n" +
                    "3. Gold\n" +
                    "4. Silver\n" +
                    "5. Member\n" +
                    "Mời chọn: ");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    typeOfGuess = "Diamond";
                    flag = false;
                    break;
                case "2":
                    typeOfGuess = "Platinum";
                    flag = false;
                    break;
                case "3":
                    typeOfGuess = "Gold";
                    flag = false;
                    break;
                case "4":
                    typeOfGuess = "Silver";
                    flag = false;
                    break;
                case "5":
                    typeOfGuess = "Member";
                    flag = false;
                    break;
                default:
                    System.out.println("Bạn chọn sai rồi!!");
                    break;
            }
        } while (flag);
        System.out.println("Nhập địa chỉ: ");
        String address = sc.nextLine();
        Customer customer = new Customer(code, name, day, gender, id, phone, email, typeOfGuess, address);
        customerRepository.addNewCustomer(customer);
        System.out.println("Thêm thành công!!!");
    }

    @Override
    public void editCustomer() {
        System.out.println("Nhập mã khách muốn sửa: ");
        String codeEdit = sc.nextLine();
        int isEdit = customerRepository.checkById(codeEdit);
        if (isEdit >= 0) {
            boolean checkEdit = true;
            do {
                System.out.print("Bạn muốn sửa gì???\n" +
                        "1. Mã khách hàng\n" +
                        "2. Tên\n" +
                        "3. Ngày sinh\n" +
                        "4. Giới tính\n" +
                        "5. ID\n" +
                        "6. Số điện thoại\n" +
                        "7. Email\n" +
                        "8. Loại khách\n" +
                        "9. Địa chỉ\n" +
                        "0. Thoát\n" +
                        "Mời chọn: ");
                String choice = sc.nextLine();
                switch (choice) {
                    case "1":
                        String code;
                        do {
                            System.out.println("Nhập mã khách hàng mới: ");
                            code = sc.nextLine();
                            if (Validate.validateCustomerCode(code)) {
                                System.out.println("Sửa thành công!!!");
                                customerRepository.getCustomerList().get(isEdit).setCode(code);
                            } else {
                                System.err.println("Nhập chưa đúng định dạng!");
                            }
                        } while (!Validate.validateCustomerCode(code));
                        break;
                    case "2":
                        String name;
                        do {
                            System.out.println("Nhập tên mới: ");
                            name = sc.nextLine();
                            if (Validate.validateName(name)) {
                                customerRepository.getCustomerList().get(isEdit).setName(name);
                                System.out.println("Sửa thành công!!!");
                            } else {
                                System.err.println("Nhập chưa đúng định dạng!");
                            }
                        } while (!Validate.validateName(name));

                        break;
                    case "3":
                        String day;
                        boolean checkAge = true;
                        do {
                            System.out.println("Nhập ngày sinh mới(YYYY-MM-DD): ");
                            day = sc.nextLine();
                            LocalDate dob = LocalDate.parse(day);
                            if (Validate.validateDayOfBirth(day) && Validate.calAge(dob) >= 18) {
                                customerRepository.getCustomerList().get(isEdit).setDayOfBirth(day);
                                System.out.println("Sửa thành công!!!");
                                checkAge = false;
                            } else {
                                System.err.println("Nhập chưa đúng định dạng hoặc bạn chưa đủ 18 tuổi!!!");
                            }
                        } while (checkAge);

                        break;
                    case "4":
                        boolean flag3 = true;
                        String gender = "";
                        do {
                            System.out.println("Chọn giới tính: \n" +
                                    "1. Nam\n" +
                                    "2. Nữ\n" +
                                    "Mời chọn: ");
                            String choice1 = sc.nextLine();
                            if (choice1.equals("1")) {
                                gender = "Nam";
                                customerRepository.getCustomerList().get(isEdit).setGender(gender);
                                flag3 = false;
                            } else if (choice1.equals("2")) {
                                gender = "Nữ";
                                customerRepository.getCustomerList().get(isEdit).setGender(gender);
                                flag3 = false;
                            } else {
                                System.out.println("Bạn chọn sai rồi!!!");
                            }
                        } while (flag3);

                        break;
                    case "5":
                        String id;
                        do {
                            System.out.println("Nhập ID mới: ");
                            id = sc.nextLine();
                            if (Validate.validateId(id)) {
                                customerRepository.getCustomerList().get(isEdit).setId(id);
                                System.out.println("Sửa thành công!!!");
                            } else {
                                System.out.println("Nhập chưa đúng định dạng!");
                            }
                        } while (!Validate.validateId(id));

                        break;
                    case "6":
                        String phone;
                        do {
                            System.out.println("Nhập số điện thoại: ");
                            phone = sc.nextLine();
                            if (Validate.validatePhone(phone)) {
                                customerRepository.getCustomerList().get(isEdit).setPhone(phone);
                                System.out.println("Sửa thành công!!!");
                            } else {
                                System.out.println("Nhập chưa đúng định dạng!");
                            }
                        } while (!Validate.validatePhone(phone));
                        break;
                    case "7":
                        System.out.println("Nhập email mới: ");
                        String email = sc.nextLine();
                        customerRepository.getCustomerList().get(isEdit).setEmail(email);
                        break;
                    case "8":
                        boolean flag = true;
                        String typeOfGuess;
                        do {
                            System.out.print("Chọn loại khách: \n" +
                                    "1. Diamond\n" +
                                    "2. Platinum\n" +
                                    "3. Gold\n" +
                                    "4. Silver\n" +
                                    "5. Member\n" +
                                    "Mời chọn: ");
                            String choice2 = sc.nextLine();
                            switch (choice2) {
                                case "1":
                                    typeOfGuess = "Diamond";
                                    customerRepository.getCustomerList().get(isEdit).setTypeOfGuest(typeOfGuess);
                                    flag = false;
                                    break;
                                case "2":
                                    typeOfGuess = "Platinum";
                                    customerRepository.getCustomerList().get(isEdit).setTypeOfGuest(typeOfGuess);
                                    flag = false;
                                    break;
                                case "3":
                                    typeOfGuess = "Gold";
                                    customerRepository.getCustomerList().get(isEdit).setTypeOfGuest(typeOfGuess);
                                    flag = false;
                                    break;
                                case "4":
                                    typeOfGuess = "Silver";
                                    customerRepository.getCustomerList().get(isEdit).setTypeOfGuest(typeOfGuess);
                                    flag = false;
                                    break;
                                case "5":
                                    typeOfGuess = "Member";
                                    customerRepository.getCustomerList().get(isEdit).setTypeOfGuest(typeOfGuess);
                                    flag = false;
                                    break;
                                default:
                                    System.out.println("Bạn chọn sai rồi!!");
                                    break;
                            }
                        } while (flag);
                        break;
                    case "9":
                        System.out.println("Nhập địa chỉ mới: ");
                        String address = sc.nextLine();
                        customerRepository.getCustomerList().get(isEdit).setAddress(address);
                        break;
                    case "0":
                        customerRepository.editCustomer();
                        System.out.println("Sửa thành công!!");
                        checkEdit = false;
                        break;
                    default:
                        System.out.println("Bạn chọn chưa đúng");
                        break;
                }
            } while (checkEdit);
        } else {
            System.out.println("Không tìm thấy!!");
        }
    }
}
