import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
public class LinkedLists {
    public static void main(String[] args) {
        LinkedList <Integer>ls= new LinkedList();
        ls.add(12);
        ls.add(12);
        ls.add(1);
        ls.add(14);
        ls.add(11);
        System.out.println("linkedlist= "+ls);
        System.out.println(ls.size());

        System.out.println("............iterator........");
        Iterator it= ls.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
        //.....isEmpty
        System.out.println(".....isEmpty......");
        System.out.println(ls.isEmpty());

        LinkedList new_1= new LinkedList();

        new_1.addAll(ls);
        System.out.println(new_1);

        System.out.println("........removeAll.....");
        new_1.removeAll(ls);
        System.out.println(new_1);

        System.out.println(".......reverse order.....");
    Collections.sort(ls,Collections.reverseOrder());
        System.out.println("reverse user ="+ls);


        System.out.println(".....suffle......");

        Collections.shuffle(ls);
        System.out.println("After shuffling :"+ls);
    }
}
