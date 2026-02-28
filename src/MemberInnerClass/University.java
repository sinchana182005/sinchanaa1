package MemberInnerClass;

public class University {
    static class Admission {
        static boolean isEligible(int marks){
            return marks >= 60;
        }
    }
    public static void main(String[] args){
        boolean result = University.Admission.isEligible(45);
        System.out.println(result);
        boolean result2 = University.Admission.isEligible(63);
        System.out.println(result2);
    }
}
/*
Points to remember.
1.No university object needed
2.Logical grouping of the data ->improves readability
3.Similar to creating utility helper classes

 */
