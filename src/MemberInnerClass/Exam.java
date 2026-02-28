package MemberInnerClass;

import java.time.LocalDate;

public class Exam {
    void evaluate(int marks){
        class GradeCalculator {
            String calculate() {
                if (marks >= 75) return "Distinction";
                else if (marks >= 60) return "First Class";
                else return "Pass";
            }
        }
            GradeCalculator gc = new GradeCalculator();
            System.out.println(gc.calculate());
    }
     void displayExamDate(){
        LocalDate date = LocalDate.now().plusDays(5);
         System.out.println("The exam date is :" +date);
}

    static void main(String[] args) {
        Exam exam = new Exam();
        exam.evaluate(67);
        exam.evaluate(89);
        exam.displayExamDate();

    }

}
/* Points to remember
1.Grade logic is scoped to "evaluate" method
2.It avoids polluting the class with helper methods
3.It helps in designing the codebase in the cleaner way
 */

