import java.util.Scanner;

public class ArrayNumber {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt(); //first take size of array
        int number[] = new int[size]; // define array

        //....input....

        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }

        int x = sc.nextInt();
        for (int i = 0; i< number.length ; i++) {
            if(number[i] == x)
            {
                System.out.println("x found at index :" + i);
            }
        }
    }
}
