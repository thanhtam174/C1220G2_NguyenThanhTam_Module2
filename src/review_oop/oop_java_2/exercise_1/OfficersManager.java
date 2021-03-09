package review_oop.oop_java_2.exercise_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OfficersManager {
    List<Officers> officersList =new ArrayList<>();

    public void addOfficer(Officers officers){
        officersList.add(officers);
    }

    public void search(String name){
        for (Officers officers : officersList) {
            if (officers.getName().equals(name)) {
                System.out.println(officers);
            }
        }
    }

    public void modify(String name) {
        for (Officers officers : officersList) {
            if (officers.getName().equals(name)) {
                officers.modify();
            }
        }
    }

    public void display(){
        for (Officers officers : officersList) {
            System.out.println(officers);
        }
    }

    public void sort(){
        Collections.sort(officersList);
    }
}
