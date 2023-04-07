package ss5_access_modifier_and_static.bai_tap.student;

public class Test {
    public static void main(String[] args) {
        Student test = new Student();
        test.setClasses("C0223G1");
        test.setName("TT");
        System.out.println(test.toString());
    }
}
