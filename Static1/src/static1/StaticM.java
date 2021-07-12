package static1;

public class StaticM {
    static int a = 2;
    static int b;
    int l = 4;
    static{
        b*=4;
    }    
    int add(int x,int y){
        return x+y;
    }
    static int sum(int x,int y){
//        static int d = add(2,3);
        return x+y;
       
    }

}
