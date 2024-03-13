package day3;

public class StringConcatenation {
    public static void main(String[] args) {
        String x = "Hello";
        String y = "World";

        int a = 100;
        int b = 200;

        System.out.println(x + y);//HelloWorld
        System.out.println(a + b); //300
        System.out.println(x + a);//Hello100
        System.out.println(a + b + x); //300Hello
        System.out.println(a + x + b + y);//100Hello200World
        System.out.println(a + b + x + y + a + b);//300HelloWorld100200
        System.out.println(a + b + x + y + (a + b));//300HelloWorld300

        double d1 = 12.33;
        double d2 = 23.44;
        System.out.println(d1+d2+a+b+x+y+(d1+d2)+d1+d2);//335.77HelloWorld35.7712.3323.44


    }
}
