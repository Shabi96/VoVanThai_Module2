package ss10_arraylist.bai_tap.quan_ly_sinh_vien.repository;

import ss10_arraylist.bai_tap.quan_ly_sinh_vien.model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> getStudentList();
    void addNewStudent(Student student);
    boolean deleteStudentById(int id);
}
