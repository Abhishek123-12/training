abstract class AbstractAnimal {

public abstract void animalsound();

public void sleep()
{
    System.out.println("............");
}
}

class Dog1 extends AbstractAnimal
{
public void animalsound()
    {
        System.out.println("bhuuu");
    }
}

class Main12
{
    public static void main(String[] args)
    {
        Dog1 d= new Dog1();
        d.animalsound();
        d.sleep();
    }
}