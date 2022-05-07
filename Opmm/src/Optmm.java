import java.util.ArrayList;

public class Optmm {

    private int[][] m;
    private ArrayList<Integer> p;
    private int[][] order;

    Optmm(ArrayList<Integer> arr) {

        p = arr;
        m = new int[p.size()][p.size()];
        order = new int[p.size()][p.size()];
    }

    public int minSize() {

        for (int i = 1; i < p.size(); i++) {
            m[i][i] = 0;
        }

        for (int i = 1; i < p.size() - 1; i++) {
            for (int j = 1; j < p.size() - i; j++) {

                int minimum = Integer.MIN_VALUE;

                for (int k = j; k < j + i; k++) {
                    int min = m[j][k] + m[k + 1][j + i] + p.get(j - 1) * p.get(k) * p.get(j + i);
                    if (min > minimum) {
                        minimum = min;
                        order[j][j + i] = k;
                    }
                }

                m[j][j + i] = minimum;
                int sum = j + i;
                System.out.println("m" + j + "," + sum + " = " + minimum + " ," + order[j][j + i]);
            }

            System.out.println("-------------------------------------------");
        }
        return m[1][p.size() - 1];
    }
}
