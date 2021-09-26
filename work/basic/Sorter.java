package work.basic;

public interface Sorter {
    public String[] load(Container ps);

    public String[] sortStep();

    public Boolean finish();
}
