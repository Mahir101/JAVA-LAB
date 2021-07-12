package java20180214;

public class Task {
        public static void main(String[] args) {
        Box b1 = new Box(1,2,3);
        System.out.println("height = "+b1.height + ", width = "+ b1.width + ", depth = " + b1.depth);
        b1.changevalue(b1.height,b1.width,b1.depth);
        System.out.println("height = "+b1.height + ", width = "+ b1.width + ", depth = " + b1.depth);
        b1.changevalue(b1);
        System.out.println("height = "+b1.height + ", width = "+ b1.width + ", depth = " + b1.depth);
    }
}
