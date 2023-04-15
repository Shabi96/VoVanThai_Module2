package ss10_arraylist.bai_tap.quan_ly_sinh_vien.service;

import ss10_arraylist.bai_tap.quan_ly_sinh_vien.model.Coach;
import ss10_arraylist.bai_tap.quan_ly_sinh_vien.repository.CoachRepository;

import java.util.List;
import java.util.Scanner;

public class CoachService implements ICoachService {
    private CoachRepository coachRepository = new CoachRepository();
    Scanner sc = new Scanner(System.in);

    @Override
    public void displayCoachList() {
        List<Coach> coachList = coachRepository.getCoachList();
        for (Coach s : coachList) {
            System.out.println(s);
        }
    }

    @Override
    public void addNewCoach() {

        System.out.println("Nhập id giáo viên");
        int coachId = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên giáo viên");
        String coachName = sc.nextLine();
        System.out.println("Nhập ngày tháng năm sinh giáo viên");
        String coachDayOfBirth = sc.nextLine();
        System.out.println("Nhập giới tính giáo viên");
        String coachGender = sc.nextLine();
        System.out.println("Nhập chuyên môn giáo viên");
        String specialize = sc.nextLine();
        Coach newCoach = new Coach(coachId, coachName, coachGender, coachDayOfBirth, specialize);
        coachRepository.addNewCoach(newCoach);
        System.out.println("Thêm thành công giáo viên!");
    }

    @Override
    public void deleteCoachById() {
        this.displayCoachList();
        System.out.print("Nhập id giáo viên muốn xóa: ");
        int coachId = Integer.parseInt(sc.nextLine());
        ;
        boolean isDelete = coachRepository.deleteCoach(coachId);
        if (isDelete) {
            System.out.println("Xóa thành công giáo viên");
        } else {
            System.out.println("Không tìm thấy");
        }
    }
}
