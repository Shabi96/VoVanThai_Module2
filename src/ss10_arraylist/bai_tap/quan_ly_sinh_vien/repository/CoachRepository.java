package ss10_arraylist.bai_tap.quan_ly_sinh_vien.repository;

import ss10_arraylist.bai_tap.quan_ly_sinh_vien.model.Coach;

import java.util.ArrayList;
import java.util.List;

public class CoachRepository implements ICoachRepository{
    private static ArrayList<Coach> coachArrayList = new ArrayList<>();
    static {
        coachArrayList.add(new Coach(1, "TrungMini", "1990", "Nam", "Java"));
        coachArrayList.add(new Coach(2, "ChánhTV", "1990", "Nam", "Java"));
        coachArrayList.add(new Coach(3, "HảiTT", "1990", "Nam", "Java"));
        coachArrayList.add(new Coach(4, "CôngNT", "1990", "Nam", "Java"));
    }
    @Override
    public List<Coach> getCoachList() {
        return coachArrayList;
    }

    @Override
    public void addNewCoach(Coach coach) {
        coachArrayList.add(coach);
    }

    @Override
    public boolean deleteCoach(int id) {
        for (int i = 0; i < coachArrayList.size(); i++) {
            if(id == coachArrayList.get(i).getId()) {
                coachArrayList.remove(i);
                return true;
            }
        }
        return false;
    }
}
