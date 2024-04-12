class person {
   private String name ;
   private int age ;

    public String getName() {return name;} 

    public void setName(String name) {this.name = name;} 
 
    public int getAge() {return age;} 

    public void setAge(int age) {this.age = age;} 

}

class EncapsulationGetSet {
  public static void main (String args[])
    {
	person p1 = new person();
 	p1.setName("sidhant");
	p1.setAge(22);

 	System.out.println("Name :" + p1.getName());
 	System.out.println("Age :" + p1.getAge());


 
   }
 
}
