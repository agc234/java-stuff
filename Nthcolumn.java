/**
 * Nthcolumn
 */
public class Nthcolumn {

    public static int[] selectNthColumn (int[][] r, int n) {

        //int rows = r.length;
        int rows = r.length;
        int[] coln = new int[rows]; // [0,0,0,0] -> n = 0

        for (int i = 0; i < rows; i++) {
            if ( i == n ) {
                coln[i] = r[i][n]; // [2,4,3,2]
            }
        }

        return coln;
    }

    public static void print(int[] r) {
        for(int i = 0; i < r.length; i++) {
            System.out.print(r[i] + ",");
        }
    }

    public static void main(String[] args) {
        int[][] input = new int[3][4]; // [[2,4,3,2] , [0,0,0,0] , [0,0,0,0]]
        input[0][1] = 2;
        input[1][1] = 4;
        input[2][1] = 3;

        //System.out.print(args[0]);

        int[] output = selectNthColumn(input, 1);
        print(output);
        
    }
}