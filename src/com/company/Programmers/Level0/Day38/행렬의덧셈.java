import java.util.Arrays;

class Solution {

    public static void main(String[] args) {

        int arr1[][] = { { 1 }, { 2 } };
        int arr2[][] = { { 3 }, { 5 } };

        solution(arr1, arr2);

    }

    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] array = {};
        array= arr1;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                array[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        String deepToString = Arrays.deepToString(array);
        return array;

    }
}