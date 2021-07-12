package java20180214;

public class Box {
    public int height;
    public  int width;
    public  int depth;
    public Box(int height,int width,int depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
    }
    public Box(Box ob){
        this.height = ob.height;
        this.width = ob.width;
        this.depth = ob.depth;
    }
    void changevalue(int height,int width,int depth){
        height*=2;
        width*=2;
        depth*=2;  
    }
    void changevalue(Box ob){
        ob.height*=2;
        ob.width*=2;
        ob.depth*=2;  
    }
}
