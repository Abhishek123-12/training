import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        //ArrayList<String> student= new ArrayList<String>();
        ArrayList student= new ArrayList();

        student.add("abhi");
        student.add("15.15");
        student.add("sahu");
        student.add(true);
        student.add(8888);
        System.out.println(student);
    student.add(1,"ramu");
        System.out.println(student);
        System.out.println("number of element in arraylist = "+ student.size());
        //student.remove(1);
        //student.remove("sahu");
        //System.out.println(student);
        student.add(1,"java");
        System.out.println("after insertion = "+ student);
        //retrive the value
        System.out.println("retrieve the value = "+ student.get(1));
        student.set(1,"python");
        System.out.println("After set value in arraylist = "+ student);
        System.out.println(student.contains("sahu"));

        //...for loop ....

       // for(int i=0;i<student.size();i++)
    //    {
       //     System.out.println("size of arraylist = "+student.get(i) + i);
       // }

        //...foe each...
        System.out.println("...........for each loop.......");
        for(Object e :student)
        {
            System.out.println(e);
        }
    }
}
