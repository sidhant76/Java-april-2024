import java.io.*;

class NestedException{
  public static void main (String args[]){
    try {
   
       try{ 
     int number = 50/0;
}
   catch( ArithmeticException e){
    System.out.println(e);
 }
    try{
     int a[] = new int[5];
     //a[5] = 30/0;
      System.out.println(a[10]);
    }
    catch(  ArrayIndexOutOfBoundsException e2)
{ 
       System.out.println(e2);

}
  
}
  catch(Exception e)
{
      System.out.println(e);

}

}
}