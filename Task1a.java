import java.util.Scanner;

public class Task1a {

    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);
        int answer;
        char decision='y';
        do {
            System.out.println("1-Add two numbers");
            System.out.println("2-Subtract two numbers");
            System.out.println("3-Multiply two numbers");
            System.out.println("4-Divide two numbers");
            System.out.print("Answer:");
            answer=object.nextInt();
            switch (answer) {
                case 1:
                  Add();
                    break;
                case 2:
                    Subtract();
                  break;
                case 3:
                    Multiply();
                    break;
                case 4:
                    Divide();
                    break;
                default:
                    System.out.println("ERROR");
            }
            System.out.println("Would you like to start again? (y-Yes)(n-No)");
            System.out.print("Answer:");
            decision=object.next().charAt(0);
        }while((decision!='N')&&(decision!='n'));
    }

    public static void Add()
    {
        int a,b;
        Scanner object=new Scanner(System.in);
        System.out.println("Enter first number:");
        a=object.nextInt();
        System.out.println("Enter second number:");
        b=object.nextInt();
        System.out.println("Result:"+(a+b));
    }
    public static void Subtract()
    {
        int a,b;
        Scanner object=new Scanner(System.in);
        System.out.println("Enter first number:");
        a=object.nextInt();
        System.out.println("Enter second number:");
        b=object.nextInt();
        System.out.println("Result:"+(a-b));
    }
    public static void Multiply()
    {
        int a,b;
        Scanner object=new Scanner(System.in);
        System.out.println("Enter first number:");
        a=object.nextInt();
        System.out.println("Enter second number:");
        b=object.nextInt();
        System.out.println("Result:"+(a*b));
    }
    public static void Divide() {
        int a, b;
        Scanner object = new Scanner(System.in);
        System.out.print("Enter first number:");
        a = object.nextInt();
        System.out.print("Enter second number:");
        b = object.nextInt();
        if ((a != 0) && (b == 0)) {
            System.out.println("Cannot divide by 0");
        }
        else {
            System.out.println("Result:"+(a/b));
        }

    }
}
