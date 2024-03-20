package day5;

public class _6MultipleIfElseIfStatements
{
    public static void main(String[] args) {

        int score = 65;
        if(score>=90)
        {
            System.out.println(" Excellent! You got an A");
        }
        else if(score<90 && score>=80)
        {
            System.out.println(" Very Good! You got a B");
        }
        else if(score<80 && score>=70)
        {
            System.out.println(" Good! You got a C");
        }
        else if(score<70 && score>=60)
        {
            System.out.println(" Fair! You got a D");
        }
        else
        {
            System.out.println(" Sorry! You got F");
        }
    }
}
