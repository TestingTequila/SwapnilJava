package day5;

public class _7SwitchStatementWithOR
{
    public static void main(String[] args) {
        int dayOfWeek=7;
        switch (dayOfWeek)
        {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Its weekday, i will go to office");
                break;
            case 6:
            case 7:
                System.out.println("Its weekend ...lets party");
                break;
            default:
                System.out.println("Invalid number for day provided");
                break;



        }
    }
}
