package ojas;
class A
{
    void m1()
    {
        System.out.println("Inside A's m1 method");
    }
}
  
class B extends A
{
    // overriding m1()
    void m1()
    {
        System.out.println("Inside B's m1 method");
    }
}
  
class C extends A
{
    // overriding m1()
    void m1()
    {
        System.out.println("Inside C's m1 method");
    }
}
  
// Driver class
class Dispatch
{
    public static void main(String args[])
    {
        A a = new A();
        B b = new B();
        C c = new C();
        A ref;
        ref = a;
        ref.m1();
        ref = b;
        ref.m1();
        ref = c;
        ref.m1();
    }
}
