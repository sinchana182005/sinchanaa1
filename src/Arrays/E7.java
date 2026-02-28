package Arrays;
class Student {
    String name;
    int USN;
}
class Intern {
    String name;
    int id;

    Intern(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
public class E7 {
    static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student();
        students[0].name = "Rahul";
        students[0].USN = 1010;
        System.out.println(students[0].name + " " + students[0].USN);
        Intern[] interns = new Intern[]{
                new Intern("Rahul",101),
                new Intern("Ram",103)
        };
        //this datatype is the class itself
for(Intern i : interns){
    System.out.println(i.name + " " +i.id);
}
    }
}
