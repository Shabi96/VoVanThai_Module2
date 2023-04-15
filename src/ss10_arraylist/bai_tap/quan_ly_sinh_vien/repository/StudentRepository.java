package ss10_arraylist.bai_tap.quan_ly_sinh_vien.repository;

import ss10_arraylist.bai_tap.quan_ly_sinh_vien.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    private static ArrayList<Student> studentArrayList = new ArrayList<>();

    static {
        studentArrayList.add(new Student(1, "Hưng", "1998", "Nam", "C0223G1", 90));
        studentArrayList.add(new Student(2, "Tính", "1997", "Nam", "C0223G1", 90));
        studentArrayList.add(new Student(3, "Hoa", "2000", "Nữ", "C0223G1", 90));
        studentArrayList.add(new Student(4, "Vũ", "1999", "Nam", "C0223G1", 90));
    }

    @Override
    public List<Student> getStudentList() {
        return studentArrayList;
    }

    @Override
    public void addNewStudent(Student student) {
        studentArrayList.add(student);
    }

    @Override
    public boolean deleteStudentById(int id) {
        for (int i = 0; i < studentArrayList.size(); i++) {
            if (id == studentArrayList.get(i).getId()) {
                studentArrayList.remove(i);
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
