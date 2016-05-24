package arrays;

/**
 * Insert annotation here
 *
 * @author Sam Jansen
 */
public class JaggedArray {

    static int[][] p = {
            {2,4,6,8},
            {1,7},
            {9,0,3,6,7}
    };

    public static void transpose(int[][] array){
        int longestRowLength = findLongestRowLength(array);
        for (int i = 0; i < longestRowLength; i++) {
            for (int j = 0; j < array.length; j++) {
                try {
                    System.out.print(array[j][i] + "\t");
                } catch (ArrayIndexOutOfBoundsException ex){
                    System.out.print("\t");
                }
            }
            System.out.println("");
        }
    }

    public static void print(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("");
        }
    }

    public static int findLongestRowLength(int[][] array) {
        int maxSoFar = 0;
        for (int i = 0; i < array.length; i++) {
            maxSoFar = Math.max(maxSoFar, array[i].length);
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        print(p);
        System.out.println("\n");
        transpose(p);
    }
}
