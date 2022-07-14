import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
       // int[] marks= new int[3];
Scanner sc= new Scanner(System.in);
int size = sc.nextInt();
        int marks[]= new int[size];
    // int marks[]={98,94,97};

        //........input...........
        for(int i=0;i<size;i++)
         marks[i]= sc.nextInt();



        //marks[0]=98;
        //marks[1]=94;
        //marks[2]=97;
       // System.out.println(marks[0]);
        //System.out.println(marks[1]);
        //System.out.println(marks[2]);
        //........output..........
        for (int i =0; i<size;i++)
            System.out.println(marks[i]);
    }
}
