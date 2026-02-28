package MemberInnerClass;

public interface Payment {
void pay();
}
class PaymentDemo{
    static void main(String[] args) {
        //Boilerplate Code
        Payment p = new Payment() {
            public void pay() {
                System.out.println("Payment done using credit card");
            }
        };
        p.pay();
        Payment p1 = () -> System.out.println("Cash Payment");
        p1.pay();
    }
    }
    /* Points to remember
    1.One time implementation
    2.No need to create separate class
    3.It is used in events and callback functions
     */

