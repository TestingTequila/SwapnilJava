package day3;

public class MathOperations
{
    public static void main(String[] args) {
        //1. I/I = I
        System.out.println(10/2);//5
        System.out.println(9/2); //4

        //2. If double is either in N/D =Double
        System.out.println(9.0/2); //4.5
        System.out.println(9/2.0); //4.5
        System.out.println(9.0/2.0); //4.5

        //3. I/0 = AE
        //System.out.println(9/0);

        //4. Double divided by 0/0.0 = Infinity
        System.out.println(9/0.0);
        System.out.println(9.0/0.0);
        System.out.println(9.0/0);

        //5. if N/D both have 0 only and any one is in double = NaN
        System.out.println(0/0.0); //NaN
        System.out.println(0.0/0.0); //NaN
        System.out.println(0.0/0); //NaN
        //System.out.println(0/0);//AE

        //Modulo Operator [%]
        System.out.println(10%2);//0
        System.out.println(10/3);//1

    }
}
