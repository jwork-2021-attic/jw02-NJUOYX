package work.task3;

import work.basic.Container;
import work.basic.Position;

public class Matrix implements Container {
    private Position[][] matrix;
    private final int row;
    private final int col;

    public Matrix(int r, int c) {
        row = r;
        col = c;
        matrix = new Position[row][col];
    }

    @Override
    public void put(Position p, int idx) {
        matrix[idx / col][idx % col] = p;
    }

    @Override
    public int length() {
        return row * col;
    }

    @Override
    public Position indexOf(int idx) {
        if (idx >= 0 && idx < length()) {
            return matrix[idx / col][idx % row];
        } else {
            return null;
        }
    }

    @Override
    public String[] getPositions() {
        String[] res = new String[length()];
        int idx = 0;
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                res[idx++] = matrix[i][j].print();
            }
            res[idx - 1] += "\n";
        }
        return res;
    }

    @Override
    public void swap(int aidx, int bidx) {
        Position tmp = matrix[aidx / col][aidx % col];
        matrix[aidx / col][aidx % col] = matrix[bidx / col][bidx % col];
        matrix[bidx / col][bidx % col] = tmp;
    }
}
