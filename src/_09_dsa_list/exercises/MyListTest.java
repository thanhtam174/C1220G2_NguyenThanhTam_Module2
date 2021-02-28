package _09_dsa_list.exercises;

import java.util.Arrays;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> arrayList = new MyList<String>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D", 2);
        System.out.println(arrayList);
        System.out.println(arrayList);
        arrayList.remove(2);
        System.out.println(arrayList);
        System.out.println(arrayList.indexOf("B"));
        System.out.println(arrayList);
    }
}
