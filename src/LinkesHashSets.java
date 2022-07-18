import java.util.HashSet;

public class LinkesHashSets {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<Integer>();
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(5);
        System.out.println("HashSet = "+hs);

        System.out.println("........addAll.........");
        HashSet <Integer>hs1 = new HashSet<Integer>();
        hs1.addAll(hs);
        hs1.add(10);

        System.out.println("new Hashset ="+hs1);

        System.out.println("..........removeAll.........");
        hs1.removeAll(hs);
        System.out.println(hs1);

    }
}
