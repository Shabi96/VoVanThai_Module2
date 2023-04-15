package ss10_arraylist.bai_tap.quan_ly_sinh_vien.service;

import ss10_arraylist.bai_tap.quan_ly_sinh_vien.model.Student;
import ss10_arraylist.bai_tap.quan_ly_sinh_vien.repository.StudentRepository;

import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    Scanner sc = new Scanner(System.in);
    private StudentRepository studentRepository = new StudentRepository();

    @Override
    public void displayStudentList() {
        List<Student> studentList = studentRepository.getStudentList();
        for (Student s : studentList) {
            System.out.println(s);
        }
    }

    @Override
    public void addNewStudent() {
        System.out.println("Nhập id sinh viên");
        int studentId = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên sinh viên");
        String name = sc.nextLine();
        System.out.println("Nhập ngày tháng năm sinh sinh viên");
        String dayOfBirth = sc.nextLine();
        System.out.println("Nhập giới tính sinh viên");
        String gender = sc.nextLine();
        System.out.println("Nhập lớp sinh viên");
        String classes = sc.nextLine();
        System.out.println("Nhập điểm sinh viên");
        int point = Integer.parseInt(sc.nextLine());
        Student newStudent = new Student(studentId, name, dayOfBirth, gender, classes, point);
        studentRepository.addNewStudent(newStudent);
        System.out.println("Thêm thành công sinh viên");
    }

    @Override
    public void deleteStudentId() {
        this.displayStudentList();
        System.out.println("Nhập id sinh viên cần xóa: ");
        int idStudentDelete = Integer.parseInt(sc.nextLine());
        boolean isDeleted = studentRepository.deleteStudentById(idStudentDelete);
        if (isDeleted) {
            System.out.println("Xóa thành công sinh viên");
        } else {
            System.out.println("Không tìm thấy");
        }
    }
}
