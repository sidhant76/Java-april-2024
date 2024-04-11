import java.io.*;


class Vehicle{
  public void run(){
    System.out.println("Vehicle is moving");
}
}

class Car extends Vehicle{
    public void run(){
    System.out.println("Vehicle is running");
}
}



class Overriding
{
   public static void main(String args[])
{
    Car c1 = new Car();
    c1.run();
}
}