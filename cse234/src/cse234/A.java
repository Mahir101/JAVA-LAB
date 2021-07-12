package cse234;

import sun.net.www.content.audio.x_aiff;

public class A {
    int x;
    class B{
        int y;
        void f2(){
            y=x+2;
        }
    }
    void f1(){
        x=y+2;
    }
    
    public static void main(String[] args){
        A oba=new A();
        A.B obb=oba.new B();
        //A.B ob3=new A().new B();
        oba.x=5;
        oba.y=6;
        obb.y=6;
    }
        
}
