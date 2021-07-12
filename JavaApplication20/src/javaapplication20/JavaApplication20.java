package javaapplication20;
public class JavaApplication20 {
    public static void main(String[] args) {
       Nested.Inner ob1 = new Nested().new Inner();
       ob1.fun2();
       Nested ob2 = new Nested();
       //Inner ob3 = new Inner();
       //evabe hocche na
       ob2.fun1();
    }
}
