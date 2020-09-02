package p0109;

public class Spirall {

    private static void print(int m, int n) {
        int[][] arr = new int[m][n];
        int m1 = m;
        int n1 = n;
        int a = 1;
        int index = 0;
        boolean sikl = true;
        while (sikl) {
            for (int i = index; i < n; i++) {
                arr[index][i] = a;
                a++;
            }
            for (int i = index + 1; i < m; i++) {
                arr[i][n - 1] = a;
                a++;
            }
            for (int i = 0; i < m1; i++) {
                for (int j = 0; j < n1; j++) {
                    if (arr[i][j] != 0) {
                        sikl = false;
                    }
                }
            }
            for (int i = 0; i < m1; i++) {
                for (int j = 0; j < n1; j++) {
                    if (arr[i][j] == 0) {
                        sikl = true;
                    }
                }
            }
            if (!sikl) break;
            for (int i = n - 2; i >= index; i--) {
                arr[m - 1][i] = a;
                a++;
            }
            for (int i = m - 2; i >= index + 1; i--) {
                arr[i][index] = a;
                a++;
            }
            m--;
            n--;
            index++;
            for (int i = 0; i < m1; i++) {
                for (int j = 0; j < n1; j++) {
                    if (arr[i][j] != 0) {
                        sikl = false;
                    }
                }
            }
            for (int i = 0; i < m1; i++) {
                for (int j = 0; j < n1; j++) {
                    if (arr[i][j] == 0) {
                        sikl = true;
                    }
                }
            }
        }
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                System.out.print(arr[i][j] + "  ");

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        print(7, 10);
    }
}
