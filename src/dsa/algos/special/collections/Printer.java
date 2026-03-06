package dsa.algos.special.collections;

public class Printer<T>{ //T-template Or Generic  datatype//We can say anything like A,B,C in place of T
        T data;
        Printer(T data){
            this.data=data;
        }
        void printValue(){
            System.out.println("Data:"+data);
        }
        public static void main(String[] args) {
            Printer<Integer>integerPrinter=new Printer<>(1);
            Printer<String>stringPrinter=new Printer<>("Java");
            Printer<Float>floatPrinter=new Printer<>(1.2f);
            Printer<Double>doublePrinter=new Printer<>(2.345567);//can include d elsestill works
            Printer<Boolean>booleanPrinter=new Printer<>(true);
            stringPrinter.printValue();
            booleanPrinter.printValue();
            doublePrinter.printValue();
            integerPrinter.printValue();
            floatPrinter.printValue();
        }
    }




