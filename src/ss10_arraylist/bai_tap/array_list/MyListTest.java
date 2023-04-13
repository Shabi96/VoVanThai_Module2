package ss10_arraylist.bai_tap.array_list;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();
        myList.add("Yasuo");
        myList.add("Zed");
        myList.add("LeeSin");
        myList.add("Sett");
        myList.add("JarVan");
        System.out.println(myList);
        myList.remove("Zed");
        System.out.println(myList);
        myList.get(1);
        System.out.println(myList.get(0));
    }
}
