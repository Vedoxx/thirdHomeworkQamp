import java.util.Scanner;

public class Task1aa {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        char decision='Y';
        do {

            int total;
            System.out.print("Enter total (must be different from 0):");
            total = object.nextInt();
            if (checkTotal(total)) {
                positiveNumberLoop(total);
            } else {
                System.out.println("Total is equal to zero (Loop will not execute)");
            }
            System.out.println("Would you like to start again? (y-Yes)(n-No)");
            System.out.print("Answer:");
            decision = object.next().charAt(0);
        }while((decision!='N')&&(decision!='n'));
        }


    public static void positiveNumberLoop(int total)
    {
        Scanner object = new Scanner(System.in);
        int positiveNumber;
        do
        {
            System.out.println("Enter a positive integer number:");
            positiveNumber=object.nextInt();
        }while(positiveNumber>0);

    }
    public static boolean checkTotal(int total)
    {
        return total>0;
    }
}
