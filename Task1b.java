import java.util.Scanner;

public class Task1b {
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);
        char decision='y';
        do{
        numberOutput();
        System.out.println("Would you like to start again? (y-Yes)(n-No)");
        System.out.print("Answer:");
        decision=object.next().charAt(0);
    }while((decision!='N')&&(decision!='n'));

    }
    public static void numberOutput()
    {
        Scanner object=new Scanner(System.in);
        int number;
        do{
        System.out.print("Please enter any integer:");
        number=object.nextInt();
    }while (number!=-1000);
        System.out.println("Number"+number+" =EXIT");
    }
}
