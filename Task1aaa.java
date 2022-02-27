import java.util.Scanner;

public class Task1aaa {
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);
        char decision='y';
        do {
            checkNumber();
            System.out.println("Would you like to start again? (y-Yes)(n-No)");
            System.out.print("Answer:");
            decision=object.next().charAt(0);
        }while((decision!='N')&&(decision!='n'));
    }
    public static void checkNumber()
    {
        int number;
        Scanner object=new Scanner(System.in);
        do{
            System.out.print("Enter positive integer number:");
            number=object.nextInt();
        }while(number>0);
    }
}
