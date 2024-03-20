package day5;

public class _3NestedIfStatements
{
    public static void main(String[] args) {
        int age = 20;
        boolean paymentToken = true;
        int drinkCount =5;

        if(age>=18)
        {
            System.out.println("You are eligible to enter the Bar");
            if(paymentToken)
            {
                System.out.println("He can get some drinks from the counter");
                if(drinkCount<=4)
                {
                    System.out.println("You can order more drinks");
                }
            }
        }
    }
}
