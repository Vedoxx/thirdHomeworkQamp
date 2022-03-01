import java.util.Scanner;

public class Task1gBonus {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        int startingNumber;
        int answer;
        char decision='y';
        do{
            System.out.print("Would you like to enter starting number (y/n):");
            answer=object.next().charAt(0);
                if ((answer == 'Y') || (answer == 'y')) {
                    System.out.print("Please enter starting integer:");
                    startingNumber = object.nextInt();
                    numbersTotal(startingNumber);
                }
            else if((answer == 'N') || (answer == 'n')) {
                   startingNumber = 0;
                   int subAnswer;
                   numbersTotalNoFirstNumber(startingNumber);
                   System.out.println("Would you like to continue? (y/n)");
                   System.out.print("Answer:");
                   subAnswer=object.next().charAt(0);
                   if(subAnswer=='y') {
                       numbersTotal(startingNumber);
                   }
                   else{
                       System.exit(0);
                   }
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
            mathOperatorCheck(mathOperations);
           if(mathOperations=='=') {
                break;
            }
            object.nextLine();
            System.out.print("Please enter integer:");
            addNumbers = object.nextInt();
            total=mathOperation(mathOperations,addNumbers,total);
        }while(mathOperations!='=');
        System.out.println("Calculator Result is "+total);
    }
    public static void numbersTotalNoFirstNumber(int number)
    {
        Scanner object = new Scanner(System.in);
        int addNumbers;
        char mathOperations;
        int total=number;
        do {
            System.out.println(" Which operation would you like to use: *,/,+,-,=?");
            mathOperations=object.next().charAt(0);
           mathOperatorCheck(mathOperations);
            if(mathOperations=='=') {
                break;
            }
            object.nextLine();
            System.out.print("Please enter integer:");
            addNumbers = object.nextInt();
            total=mathOperation(mathOperations,addNumbers,total);
        }while(mathOperations!='=');
        System.out.println("Calculator Result is "+total);
    }
    public static int mathOperation(char mathoperation,int addNumbers,int total) {
        switch (mathoperation) {
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
        return total;
    }
    public static void mathOperatorCheck(char mathOperations){
        Scanner object = new Scanner(System.in);
        while((mathOperations!='*')&&(mathOperations!='/')&&(mathOperations!='+')&&(mathOperations!='-')&&(mathOperations!='=')) {
            System.out.println(" Which operation would you like to use: *,/,+,-,=?");
            mathOperations=object.next().charAt(0);
        }
    }
}
