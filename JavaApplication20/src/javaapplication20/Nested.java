package javaapplication20;
public class Nested{
    int x = 10;
    public class Inner{
        //x=3;
        int y=15;
        void fun2(){
            y=x*10;
            System.out.println("x ar y er value "+ x + " "+ y);
        }
    }
    void fun1(){
        Inner in = new Inner();
        x = in.y+15;
        //x= y+2; //ekhane error dei
        System.out.println("x ar y er value "+ x + " "+ in.y);
    }
    //karon inner class ta ke ami access korte pari na
    //maybe static declare korle thik hobe
}