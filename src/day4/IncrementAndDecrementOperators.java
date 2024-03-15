package day4;

public class IncrementAndDecrementOperators
{
    public static void main(String[] args) {
        //1. --pre decrement
        int a = 1;
        int b = --a;
        System.out.println(a); // 0
        System.out.println(b); // 0

        int c =- 99;
        int d = --c;
        System.out.println(c); // -100
        System.out.println(d); // -100

        int x =10;
        int y = --x;
        System.out.println(x);//9
        System.out.println(y);//9

        int num =10;
        System.out.println(--num);// println= --num  --> 9
        System.out.println(num);  // 9

        float f =2.5f;
        float j =f++;
        System.out.println(f);//3.5
        System.out.println(j);//2.5

        char ch = 'a';
        //System.out.println(++ch);//
        //System.out.println(ch); //

        int m = 200; // 199
        int n = m++; // 200
        System.out.println(--m); // 200
        System.out.println(m);   // 200
        System.out.println(m++); // 200
        System.out.println(m--); // 201
        System.out.println(--m); // 199
        System.out.println(m);   // 199
    }

}
