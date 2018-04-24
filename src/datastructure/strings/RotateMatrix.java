package datastructure.strings;

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] ints = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(rotateMatrix(ints));

    }

    public static int[][] rotateMatrix(int[][] matrix)
    {
        int N = 3;
        int[][] result = new int[N][N];
        for(int i = 0; i< N; i++)
        {
            for(int j = 0; j < N; j++)
            {
                result[j][N-1-i] = matrix[i][j];
            }
        }
        return result;
    }
}
