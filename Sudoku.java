import java.util.*;
public class Sudoku
{
    public static void main(String[] args)
    {
        int[][] grid = new int[9][9];
        CompleteBoard(grid);
        printBoard(grid);
    }
    public static void ChangeNums(int[]n){
        Random r = new Random();
        for(int i = 0; i < n.length; i++){
            int j = r.nextInt(n.length);
            int temp = n[i];
            n[i] = n[j];
            n[j] = temp;
        }
    }
    public static void CompleteBoard(int[][] grid){
        int[] inital = new int[9];
        int[] initial = {1,2,3,4,5,6,7,8,9};
        ChangeNums(initial);
        for(int i = 0; i < initial.length; i++){
        int change = (i * 3 + i / 3) % 9;
        for (int j = 0; j < 9; j++) {
                grid[i][j] = initial[(j + change) % 9];
            }
        }
    }
    public static void printBoard(int[][] grid) {
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0) {
                System.out.println("+-------+-------+-------+");
            }
            for (int j = 0; j < 9; j++) {

                if (j % 3 == 0) {
                    System.out.print("| ");
                }
                System.out.print(grid[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("+-------+-------+-------+");
    }
}