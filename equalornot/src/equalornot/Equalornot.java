package equalornot;

public class Equalornot {
    private int height;
    private int width;
    private int depth;
    public Equalornot(int height,int width,int depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
    }
    public Equalornot(Equalornot ob){
        this.height = ob.height;
        this.width = ob.width;
        this.depth = ob.depth;
    }
    public boolean isEqual(Equalornot ob){
        if(this.height==ob.height&&this.width==ob.width&&this.depth==ob.depth){
            return true;
        }
        else{
            return false;
        }
    }
}
