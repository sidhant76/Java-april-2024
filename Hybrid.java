
class Shape {
    void details(){
        System.out.println("Print the employee details");
    }
}

class Triangle extends Shape {
    String name ="sidhant";
    int salary = 50000;
    int age = 22;   

}

class Circle  extends Triangle {
    String address = " nashik ";
    String no = "8007367772";
} 

class round extends Shape{
    void info(){
        System.out.println("print the employee information");
    }
}

public class Hybrid {
    public static void main(String[] args) {   
        Circle C1 = new Circle();
        C1.details();
        System.out.println("Name : "+C1.name);
        System.out.println("Salary : " +C1.salary);
        System.out.println("Age : " +C1.age);
        System.out.println("Address : " +C1.address);

        round s1 = new round();
        s1.info();

    }
}
