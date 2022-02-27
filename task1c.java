import java.util.Scanner;

public class task1c {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        int startingNumber;
        int answer;
        char decision='y';
        do{
        System.out.print("Would you like to enter starting number (y/n):");
        answer=object.next().charAt(0);
        if((answer=='Y')||(answer=='y'))
        {
            System.out.print("Enter starting number:");
            startingNumber=object.nextInt();
            numbersTotal(startingNumber);
        }
        else{
            startingNumber=0;
            numbersTotal(startingNumber);
        }
        System.out.println("Would you like to start again? (y-Yes)(n-No)");
        System.out.print("Answer:");
        decision=object.next().charAt(0);
    }while((decision!='N')&&(decision!='n'));
    }
    public static void numbersTotal(int number)
    {
        Scanner object = new Scanner(System.in);
        int addNumbers;
            System.out.print("Please enter integer:");
            addNumbers=object.nextInt();
            System.out.println("Total of "+number+ " and "+addNumbers+" is "+(addNumbers+number));
    }
}