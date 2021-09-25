package work;

public class Vector implements Container {
    private Position[] positions;

    public Vector(int length) {
        positions = new Position[length];
    }

    @Override
    public void put(Position p, int idx) {
        positions[idx] = p;
    }

    @Override
    public int length() {
        return positions.length;
    }

    @Override
    public Position indexOf(int idx) {
        if (idx >= 0 && idx < positions.length) {
            return positions[idx];
        } else {
            return null;
        }
    }

    @Override
    public String[] getPositions() {
        String[] res = new String[positions.length];
        for (int i = 0; i < positions.length; ++i) {
            res[i] = positions[i].print();
        }
        return res;
    }

    @Override
    public void swap(int aidx, int bidx) {
        assert (aidx >= 0 && aidx < positions.length && bidx >= 0 && bidx < positions.length);
        Position a = positions[aidx];
        positions[aidx] = positions[bidx];
        positions[bidx] = a;
    }
}
