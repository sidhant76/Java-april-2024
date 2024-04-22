class ExceptionHandle{
   public static void main (String args[])
   {
	try{
      	int no = 50/0;
	
} 
   catch( ArithmeticException e){
    System.out.println(e);  
   }
	    System.out.println("WRONG");  

  } 
}