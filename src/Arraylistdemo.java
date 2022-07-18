import java.util.ArrayList;
import java.util.Collections;

public class Arraylistdemo
{
    public static void main(String[] args)
    {
        ArrayList al= new ArrayList();
        al .add("x");
        al .add("z");
        al .add("c");
        al .add("d");
        al .add("e");
        al .add("f");

        System.out.println("....create all duplicate values......");
        ArrayList al_dup=new ArrayList();
        al_dup.addAll(al);
        System.out.println(al_dup);


        System.out.println(".....removeAll.........");

        al_dup.removeAll(al);
        System.out.println("after removing :"+al_dup);

        System.out.println(".........sorting elements..........");
        System.out.println("elements in the arraylist:"+al);
        Collections.sort(al);
        System.out.println("element in the arraylist after sorting :"+al);

        System.out.println(".......reverseorder........");

        Collections.sort(al,Collections.reverseOrder());
        System.out.println("element in the arraylist after sorting reverse order:"+al);


    }
}
