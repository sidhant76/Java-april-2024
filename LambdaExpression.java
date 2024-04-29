
interface sayable{
    public String say();
}

public class LambdaExpression {
     public static void main(String[] args) {
        sayable s = () -> {
            return "Hello World!";
        };
        System.out.println(s.say());
     }
}


// one parameter


interface sayable{
    public String say(String name);
}

public class LambdaExpression {
     public static void main(String[] args) {
        sayable s = (name) -> {
            return "Hello " + name;
        };
        System.out.println(s.say("sidhant"));
     }
}



// multiple parameter



interface Addable{
    int add(int a , int b);
}

public class LambdaExpression {
     public static void main(String[] args) {
        Addable a1 =(a,b) -> (a+b);
        System.out.println(a1.add(3,3));

        Addable a2 =(a,b) -> (a+b);
        System.out.println(a2.add(45,3));
     }
}