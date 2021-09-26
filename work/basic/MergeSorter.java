package work.basic;

public class MergeSorter implements Sorter {
    private Container array;
    private int len;

    @Override
    public String[] load(Container ps) {
        array = ps;
        len = 1;
        return array.getPositions();
    }

    @Override
    public String[] sortStep() {
        int n = array.length();
        for (int i = 0; i < n; i += 2 * len) {
            if (i + len > n) {
                break;
            } else {
                int n1 = i;
                int n2 = i + len;
                Position[] tmp = new Position[2 * len];
                int j = 0;
                while (n1 < i + len && n2 < n && n2 < i + 2 * len) {
                    if (array.indexOf(n1).less(array.indexOf(n2))) {
                        tmp[j++] = array.indexOf(n1++);
                    } else {
                        tmp[j++] = array.indexOf(n2++);
                    }
                }
                while (n1 < i + len) {
                    tmp[j++] = array.indexOf(n1++);
                }
                while (n2 < n && n2 < i + 2 * len) {
                    tmp[j++] = array.indexOf(n2++);
                }
                for (int k = 0; k < j; ++k) {
                    array.put(tmp[k], k + i);
                }
            }
        }
        len *= 2;
        return array.getPositions();
    }

    @Override
    public Boolean finish() {
        return len >= array.length();
    }
}
