package work;

public abstract class Position{
    protected abstract int rank();

    public Boolean less(Position another){
        return rank()<another.rank();
    }
    public abstract String print();
}