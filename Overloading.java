import java.io.*;

class Shapes
{
    public void area()
    {
         System.out.println("Find the area");
    }

     public void area(int r)
     {
          System.out.println("Circle area = " +3.14*r*r);
     }

      public void area(double b, double h)
      {
           System.out.println("Triangle area = " +b*h*0.5);
      }
 
}

class Overloading
{
  public static void main(String args[])
{
  Shapes s1 = new Shapes();
  s1.area();
  s1.area(5);
  s1.area(3,4);
}

}