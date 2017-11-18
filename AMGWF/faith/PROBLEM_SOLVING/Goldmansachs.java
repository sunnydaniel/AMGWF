package faith.PROBLEM_SOLVING;

public class Goldmansachs {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        StringBuilder sb = new StringBuilder();
        if (matrix == null || matrix.length == 0)
            System.out.println("empty matrix");;

        int m = matrix.length;
        int n = matrix[0].length;

        int x = 0;
        int y = 0;

        while (m > 0 && n > 0) {

            if (m == 1) {
                for (int i = 0; i < n; i++) {
                    sb.append(matrix[x][y++]);
                }
                break;
            } else if (n == 1) {
                for (int i = 0; i < m; i++) {
                    sb.append(matrix[x++][y]);
                }
                break;
            }

            for (int i = 0; i < n - 1; i++) {
                sb.append(matrix[x][y++]);
            }

            for (int i = 0; i < m - 1; i++) {
                sb.append(matrix[x++][y]);
            }

            for (int i = 0; i < n - 1; i++) {
                sb.append(matrix[x][y--]);
            }

            for (int i = 0; i < m - 1; i++) {
                sb.append(matrix[x--][y]);
            }

            x++;
            y++;
            m = m - 2;
            n = n - 2;
        }

    }

}
