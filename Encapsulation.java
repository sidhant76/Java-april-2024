// encapsulation  
// data hidding 
// private access specifier used in encapsulation


class A {
  private String name = "sidhant";
  private int age = 22 ; 
  protected int salary = 20000;
 }

class B extends A {
   
}

class Encapsulation{
  public static void main (String args[])
{
   B b1 = new B ();
   System.out.println("salary : "+b1.salary);

  A a1 = new A();
  System.out.println("Name : " + a1.age);
}
}




