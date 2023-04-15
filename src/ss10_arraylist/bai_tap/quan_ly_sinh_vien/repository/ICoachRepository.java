package ss10_arraylist.bai_tap.quan_ly_sinh_vien.repository;

import ss10_arraylist.bai_tap.quan_ly_sinh_vien.model.Coach;

import java.util.List;

public interface ICoachRepository {
    List<Coach> getCoachList();

    void addNewCoach(Coach coach);

    boolean deleteCoach(int id);
}
