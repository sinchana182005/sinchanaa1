package dsa.algos.special.collections.lambdaExpressions;

import java.util.ArrayList;
import java.util.Collections;

class Student {
    int id;
    String name;
    public Student(int id,String name){
        this.id = id;
        this.name = name;
    }
}
public class StudentSort {
    static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(101,"Rahul"));
        list.add(new Student(102,"Skysa"));
        list.add(new Student(103,"skyndya"));
        for(Student s : list){
            System.out.println(s.id + " ," +s.name);
        }
        Collections.sort(list,(s1,s2) -> s1.id - s2.id);
        for(Student s : list){
            System.out.println(s.id + ", " +s.name);
        }


    }

}
