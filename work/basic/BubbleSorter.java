package work.basic;

public class BubbleSorter implements Sorter {
    private Container array;
    private int dst;

    @Override
    public String[] load(Container ps) {
        array = ps;
        dst = 0;
        return array.getPositions();
    }

    @Override
    public String[] sortStep() {
        int len = array.length();
        for (int i = len - 1; i > dst; --i) {
            if (array.indexOf(i).less(array.indexOf(i - 1))) {
                array.swap(i, i - 1);
            }
        }
        dst++;
        System.out.printf("\b\b\b%02d%%", (int) (((double) dst / (double) len) * 100.0));
        return array.getPositions();
    }

    @Override
    public Boolean finish() {
        return dst + 1 == array.length();
    }
}
