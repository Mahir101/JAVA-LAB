package equalornot;

public class equal {
    public static void main(String[] args) {
        Equalornot b1 = new Equalornot(5,5,5);
        Equalornot b2 = new Equalornot(10,10,10);
        Equalornot b3 = new Equalornot(5,5,5);
//        Equalornot b4 = new Equalornot(b3);
//        if(b4.isEqual(b3)){
//            System.out.println("b4 is equal to b3");
//        }
        if(b1.isEqual(b2)){
            System.out.println("b1 is equal to b2");
        }
        if(b2.isEqual(b3)){
            System.out.println("b2 is equal to b3");
        }
        if(b1.isEqual(b3)){
            System.out.println("b1 is equal to b3");
        }
    }
}
