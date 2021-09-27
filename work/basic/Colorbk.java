package work.basic;

public class Colorbk extends Position {
    private final int r;
    private final int g;
    private final int b;
    private final int index;
    private final static int[][] ctb = new int[256][3];

    public Colorbk(int idx) {
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                ctb[i * 16 + j][0] = 16 * i;
                ctb[i * 16 + j][1] = 16 * j;
                ctb[i * 16 + j][2] = 128;
            }
        }
        r = ctb[idx][0];
        g = ctb[idx][1];
        b = ctb[idx][2];
        index = idx;
    }

    @Override
    protected int rank() {
        return index;
    }

    @Override
    public String print() {
        // return String.format("\033[48;2;%d;%d;%d;38;2;0;0;0m %03d \003[0m",
        // r,g,b,index);
        return "\033[48;2;" + r + ";" + g + ";" + b + ";38;2;0;0;0m " + String.format("%03d", index) + " \033[0m";
    }
}
