interface p1 {
    String name();
}

interface p2{
   public int age();

}

class  p3 implements p1,p2{
  public String name() {return "sidhant";}
  public int age() {return 22;}


}
 
class Multiple{
  public static void main (String args[])
{
   p1 p = new p3();
   System.out.println("Name :"+p.name());
    p2 m = new p3();
   System.out.println("Age :"+m.age());

}
}

