

class Polymorphism {
    public void eat()
    {
        System.out.println("grass....");

    }
}

   class Pig extends Polymorphism
   {
       public void eat()
       {
           System.out.println("non-veg");

       }

   }
class Rabit extends Polymorphism
{
    public void eat()
    {
        System.out.println("carrot");

    }

}

class Main1
{
    public static void main(String[] args)
    {
        Polymorphism p = new Polymorphism();
        Pig pg = new Pig();
        Rabit r= new Rabit();
        p.eat();
        pg.eat();
        r.eat();
    }
}


