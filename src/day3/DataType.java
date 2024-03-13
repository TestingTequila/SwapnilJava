package day3;

public class DataType {

    public static void main(String[] args) {
        //char [a-z, A-Z, 0-9, !-+][2 Byte=16 bits]
        char c1 = 'a'; //97
        char c11 ='b'; //98
        char c2='1'; // 49
        char c22 ='9';//57

        char c3 ='$';
        char c33= '*';

        System.out.println(c1+c11);//195
        System.out.println(c2+c22); //49+57
        System.out.println(c3+c33); //36+42

        System.out.println(c1+c11); //97+98=195
        System.out.println((int)c1+ c11); //97+98 =195
        System.out.println(c1+ (int)c11);//97+98 =195
        System.out.println((int)c1+ (int)c11);//97+98 =195
        System.out.println(c1+0);//97
        System.out.println(c1+'0');//97+48=145
        System.out.println(c1+""+c11);//ab


    }
}
