import java.awt.*;

public class Board {
    int unsolved[][];
    int current[][];

    public Board() {
        unsolved = new int[9][9];
        current = new int[9][9];
    }

    public boolean initialVerify() {
        int i, j, k;
        for (i = 0; i < 9; i++) {
            for (j = 0; j < 9; j++) {
                if (unsolved[i][j] != 0) {
                    k = unsolved[i][j];
                    unsolved[i][j] = 0;
                    if (!verifyByLine(i, j, k, unsolved) || !verifyByBox(i, j, k, unsolved)) {
                        GUI.cell.get(9 * i + j).setBackground(Color.RED);
                        return false;
                    }
                    unsolved[i][j] = k;
                }
            }
        }
        return true;
    }

    private boolean verifyByBox(int i, int j, int k, int arr[][]) {
        int xc = (int) (j / 3);
        int yc = (int) (i / 3);
        for (i = yc * 3; i < (yc + 1) * 3; i++)
            for (j = xc * 3; j < (xc + 1) * 3; j++)
                if (arr[i][j] == k) {
                    return false;
                }
        return true;
    }

    private boolean verifyByLine(int i, int j, int k, int arr[][]) {
        int row, col;
        row = i;
        for (col = 0; col < 9; col++)
            if (arr[row][col] == k) {
                return false;
            }
        col = j;
        for (row = 0; row < 9; row++)
            if (arr[row][col] == k) {
                return false;
            }
        return true;
    }

    public boolean solve() {
        int i, j, k;
        boolean extndsol;
        for (i = 0; i < 9; i++) {
            for (j = 0; j < 9; j++) {
                if (unsolved[i][j] != 0 || current[i][j] != 0) {
                    if (i == 8 && j == 8)
                        return true;
                    continue;
                }
                for (k = 1; k <= 9; k++) {
                    if (verifyByLine(i, j, k, current) && verifyByBox(i, j, k, current)) {
                        current[i][j] = k;
                        if (i == 8 && j == 8) {
                            return true;
                        } else {
                            extndsol = solve();
                        }
                        if (extndsol) {
                            return true;
                        } else {
                            current[i][j] = 0;
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }
}
