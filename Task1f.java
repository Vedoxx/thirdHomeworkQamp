import java.util.Scanner;

public class Task1f {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        int startingNumber;
        int answer;
        char decision='y';
        do{
            System.out.print("Would you like to enter starting number (y/n):");
            answer=object.next().charAt(0);
            if((answer=='Y')||(answer=='y')) {
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
    public static void numbersTotal(int number) {
        Scanner object = new Scanner(System.in);
        int addNumbers;
        char mathOperations;
        int total=number;
        do {
        System.out.println(" Which operation would you like to use: *,/,+,-,=?");
        mathOperations=object.next().charAt(0);
        while((mathOperations!='*')&&(mathOperations!='/')&&(mathOperations!='+')&&(mathOperations!='-')&&(mathOperations!='=')) {
            System.out.println(" Which operation would you like to use: *,/,+,-,=?");
            mathOperations=object.next().charAt(0);
        }
        if(mathOperations=='=') {
            break;
        }
        object.nextLine();
        System.out.print("Please enter integer:");
            addNumbers = object.nextInt();
           switch (mathOperations) {
                case '+':
                    total=(total+addNumbers);
                    break;
                case '-':
                    total=(total-addNumbers);
                    break;
                case '/':
                    total=(total/addNumbers);
                    break;
                case '*':
                   total=(total*addNumbers);
                    break;
            }
        }while(mathOperations!='=');
        System.out.println("Calculator Result is "+total);
    }
}
