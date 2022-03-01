import java.util.Scanner;

public class Task1aSecondSolution {
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);
        int answer;
        int a,b;
        int result;
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
                    System.out.println("Enter first number:");
                    a=object.nextInt();
                    System.out.println("Enter second number:");
                    b=object.nextInt();
                    result=Add(a,b);
                    System.out.println("Result:"+result);
                    break;
                case 2:
                    System.out.println("Enter first number:");
                    a=object.nextInt();
                    System.out.println("Enter second number:");
                    b=object.nextInt();
                    result=Subtract(a,b);
                    System.out.println("Result:"+result);
                    break;
                case 3:
                    System.out.println("Enter first number:");
                    a=object.nextInt();
                    System.out.println("Enter second number:");
                    b=object.nextInt();
                    result=Multiply(a,b);
                    System.out.println("Result:"+result);
                    break;
                case 4:
                    System.out.print("Enter first number:");
                    a = object.nextInt();
                    System.out.print("Enter second number:");
                    b = object.nextInt();
                    if ((a != 0) && (b == 0)) {
                        System.out.println("Cannot divide by 0");
                    }
                    else {
                        result=Divide(a,b);
                        System.out.println("Result:"+result);
                    }
                    break;
                default:
                    System.out.println("ERROR");
            }
            System.out.println("Would you like to start again? (y-Yes)(n-No)");
            System.out.print("Answer:");
            decision=object.next().charAt(0);
        }while((decision!='N')&&(decision!='n'));
    }

    public static int Add(int a,int b)
    {
        return a+b;
    }
    public static int Subtract(int a,int b)
    {
        return a-b;
    }
    public static int Multiply(int a,int b)
    {
        return a*b;
    }
    public static int Divide(int a,int b) {
        return a/b;
    }
}
