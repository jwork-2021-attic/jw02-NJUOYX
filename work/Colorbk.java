package work;

public class Colorbk extends Position{
    private final int r;
    private final int g;
    private final int b;

    public Colorbk(int idx){
        r = idx%256;
        g = idx%256;
        b = idx%256;
    }
    @Override
    protected int rank(){
        return r;
    }

    @Override
    public String print(){
        return "\033[48;2;" + r + ";" + g + ";" + b + ";38;2;0;0;0m    " + r + "  \033[0m";
    }
}
