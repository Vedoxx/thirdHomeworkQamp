
import java.util.ArrayList;
import java.util.Scanner;


public class Task3 {
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);
        char decision='y';
        do {
        System.out.println("1.Is string a palindrom");
        System.out.println("2.Filter an Array");
        System.out.println("3.Number is divisible by X");
        System.out.print("Answer:");
        int answer=object.nextInt();
            switch (answer) {
                case 1:
                    object.nextLine();
                    System.out.print("Enter your string:");
                    String word = object.nextLine();
                    String lowerWord = word.toLowerCase();
                    boolean stringPalindrom = IsStringPalindrom(lowerWord);
                    if (stringPalindrom) {
                        System.out.println("Word is a palindrom");
                    } else {
                        System.out.println("Word is not a palindrom");
                    }
                    break;
                case 2:
                    ArrayList<Integer>arrayInteger=new ArrayList<>();
                    arrayInputOutput(arrayInteger);
                    arrayEraseElement(arrayInteger);

                    break;
                case 3:
                    System.out.print("Enter number(dividend):");
                    int divident = object.nextInt();
                    System.out.print("Enter number(divisor)");
                    int divisor = object.nextInt();
                    if (isDivisible(divident, divisor)) {
                        System.out.println("Number " + divident + " is divisible by " + divisor);
                    } else {
                        System.out.println("Number " + divident + " is not divisible by " + divisor);
                    }

            }

            System.out.println("Would you like to start again? (y-Yes)(n-No)");
            System.out.print("Answer:");
            decision = object.next().charAt(0);
        }while((decision!='N')||(decision!='n'));
        }

  public static boolean IsStringPalindrom(String word){
      int startString=0;
      int endString=word.length()-1;

      while(startString<endString)
      {
          if(word.charAt(startString)!=word.charAt(endString))
          {
              return false;
          }
          startString++;
          endString--;
      }
      return true;
  }
   public static void arrayInputOutput(ArrayList<Integer>array) {
        Scanner object = new Scanner(System.in);
        System.out.print("Enter integer numbers (type n to stop):");
        while(object.hasNextInt())
        {
            array.add(object.nextInt());
        }
       System.out.println("Numbers are:");
       System.out.println(array);
    }
   public static void arrayEraseElement(ArrayList<Integer>array){
        Scanner object=new Scanner(System.in);
        System.out.println("Enter integer number to erase:");
        int numberValue=object.nextInt();
       array.remove(new Integer(numberValue));
       System.out.println(array);
    }
  public  static boolean isDivisible(int a,int b)
    {
     return a % b == 0;
    }
    }

