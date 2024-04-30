
// interface finter{
//    abstract int calculate(int x);
// }

// public class FunctionalInterface {
//     public static void main(String[] args) {
//         finter f1 = (int x) ->  x * 2;
//         System.out.println(f1.calculate(5)); 
        
//     }
    
// }


// multiple parameter
interface finter{
    abstract int calculate(int x,int y);
 }
 
 public class FunctionalInterface {
     public static void main(String[] args) {
         finter f1 = (int x,int y) ->  x * y;
         System.out.println(f1.calculate(5,4)); 
         
     }
     
 }