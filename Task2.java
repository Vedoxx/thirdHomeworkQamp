import java.util.Scanner;
import java.util.ArrayList;
public class Task2 {
    public static void main(String[] args) {
       arrayLoop();
    }
    public static void arrayLoop() {
        char answer = 'Y';
        Scanner object = new Scanner(System.in);
        ArrayList<Integer> arrayInteger = new ArrayList<Integer>();
        InputElements(arrayInteger);
        do {
            System.out.println("Do you want to extend the array? (y/n)");
            System.out.print("Answer:");
            answer = object.next().charAt(0);
            if ((answer == 'y') || (answer == 'Y')) {
                InputElements(arrayInteger);
            } else if ((answer == 'N') || (answer == 'n')) {
                System.exit(0);
            }
        } while ((answer != 'n')||(answer!='N'));
    }
    public static void InputElements(ArrayList<Integer>arrayInteger)
    {
        Scanner object=new Scanner(System.in);
        int number;
        do{
            System.out.print("Enter integer numbers:");
            number=object.nextInt();
            arrayInteger.add(number);
        }while(number!=-10);
        System.out.println("Numbers:");
        arrayInteger.remove(arrayInteger.size()-1);
        System.out.println((arrayInteger));
    }
}
