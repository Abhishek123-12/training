import java.util.*;

public class TwoArrayQues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of rows");
        int row = sc.nextInt();
        System.out.println("enter no of cols");
        int cols = sc.nextInt();

        int[][] number = new int[row][cols];

        //..input...
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                number[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter no to search");
        int x = sc.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                if (number[i][j] == x) {
                    System.out.println("found x index(" + i + "," + j + ")");
                }
            }
        }
    }}