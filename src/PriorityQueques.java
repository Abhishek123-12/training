
import java.util.PriorityQueue;
public class PriorityQueques {
    public static void main(String[] args) {
        PriorityQueue q= new PriorityQueue();
        q.add("a");
        q.add("b");
        q.add("c");
        q.add("b");
        q.add("e");

        System.out.println(q);
        //System.out.println("......get head element..........");
       // System.out.println (q.element());
        //System.out.println(q.peek());

        System.out.println(".........return and remove element.....");
        System.out.println(q.remove());
        //System.out.println(q);
        //System.out.println(".......poll......");
        //System.out.println(q.poll());


    }
}
