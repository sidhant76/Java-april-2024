import java.io.*;
import java.util.Scanner;

class ThrowException {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
         if( age<18){
            throw new ArithmeticException("vote not valid");
         }
          else{
           System.out.println(" valid");
          }
    }
}
