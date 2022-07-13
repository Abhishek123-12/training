interface A {
    void printable();



}
class B implements A
{
    public void printable()
    {
        System.out.println("........interface program.....");
    }
}
class main {
    public static void main(String[] args) {
        B c = new B();
        c.printable();
    }
}