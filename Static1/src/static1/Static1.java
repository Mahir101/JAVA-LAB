package static1;

public class Static1 {

    public static void main(String[] args) {
        int ans =  StaticM.sum(2, 3);
        System.out.println(""+ans);
        int x1 = StaticM.a;
        int y1 = StaticM.b;
         System.out.println("Values are = "+x1+" "+y1);
    }
    
}
