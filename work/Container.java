package work;

public interface Container {
    public void put(Position p,int idx);
    public int length();
    public Position indexOf(int idx);
    public String[] getPositions();
    public void swap(int aidx, int bidx);
}
