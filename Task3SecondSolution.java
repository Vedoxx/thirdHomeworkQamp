import java.util.Scanner;


public class Task3SecondSolution {
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
                    object.nextLine();
                    System.out.print("Enter the size of your array:");
                    int size= object.nextInt();
                    int[] array=new int[size];
                    System.out.println("Enter your array:");
                    arrayInput(array);
                    System.out.println("Which number you want to remove:");
                    System.out.print("Number:");
                    int numberToRemove= object.nextInt();
                    int index=linearSearch(array,numberToRemove);
                    System.out.println("Your array after removing element:");
                    arrayOutput(array,index);
                    System.out.println();
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
    public static void arrayInput(int []array) {
        Scanner object = new Scanner(System.in);
        for(int i=0;i<array.length;i++){
            array[i]=object.nextInt();
        }
    }
    public static void arrayOutput(int []array,int index){
        Scanner object=new Scanner(System.in);
        for(int i=0;i<index;i++){
            System.out.print(array[i]+" ");
        }
        for(int i=index+1;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    public  static boolean isDivisible(int a,int b)
    {
        return a % b == 0;
    }

    public static int linearSearch(int[] array,int number) {
        for(int i=0;i<array.length;i++) {
            if(array[i]==number)  return i;
        }
        return -1;
    }
}

