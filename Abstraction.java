 






 abstract class Animal {
  public abstract void sound();
  
  public void sleep(){
    System.out.println("sleeppppp");

  }
  }
 class Dog extends Animal{
      public  void sound(){ 
         System.out.println("this is dog sound");
  
      }

    
  } 

class Abstraction {
   public static void main(String args[])
{
   Dog d1 = new Dog();
   d1.sound();
   d1.sleep();

 }
}
         
   
