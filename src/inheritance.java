public class inheritance {

    String type;
    public void eat()
    {
        System.out.println("eating ....");
    }
}

class Dog extends inheritance {

    public void display() {
        System.out.println("type..." + type);
    }
}
class Main
{
    public static void main(String[] args)
    {
        Dog d= new Dog();
        d.type= "rohit";
        d.display();
        d.eat();
    }
}