import java.util.*;

public class D2Array {

    public static void main(String[] args) {

        int[][] int2DArr = {

                { 1 },

                { 2, 3 },

                { 4, 5, 6 },

                { 7, 8, 9, 10 }
        };

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int j = 0;

        for (int[] a : int2DArr) {

            for (int val : a) {

                if (j < n)
                    System.out.print(val + " ");

                j += 1;
            }
            System.out.println();
            // System.out.println(Arrays.deepToString(int2DArr));// good method [[1], [2, 3], [4, 5, 6], [7, 8, 9, 10]]

        }
    }
}