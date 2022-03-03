import java.util.Scanner;

public class Task2SecondSolution {
    public static void main(String[] args) {
        numberArray();
    }
    public static void numberArray() {
        Scanner object = new Scanner(System.in);
        int[] array = new int[50];
        int number;
        System.out.println("Enter numbers of the array:");
        for(int i=0;i<array.length;i++) {
            array[i] = number = object.nextInt();
            if (number == -10) {
                break;
            }
        }
        int index = LinearSearch(array);
        System.out.println("Your numbers:");
        for(int i=0;i<index;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("Would you like to add numbers: (y/n)");
        System.out.print("Answer:");
         char answer=object.next().charAt(0);
        if(answer=='y') {
            int[] secondArray = new int[array.length];

            System.out.println("Enter numbers of the array:");
            for (int i = 0; i < secondArray.length; i++) {
                secondArray[i] = number = object.nextInt();
                if (number == -10) {
                    break;
                }
            }
            int indexSecond = LinearSearch(secondArray);
            System.out.println("Your numbers :");
            for (int i = 0; i < indexSecond; i++) {
                System.out.print(secondArray[i]+" ");
            }
            System.out.println();
            System.out.println("All numbers combined:");
            for (int i = 0; i < index; i++) {
                System.out.print(array[i]+" ");
            }
                for (int j = 0; j < indexSecond; j++) {
                    System.out.print(secondArray[j]+" ");
                }
        }
        else if(answer=='n'){
            System.exit(0);
        }
        }
    public static int LinearSearch(int[] array) {
        for(int i=0;i<array.length;i++) {
            if(array[i]==-10)  return i;
        }
        return -1;
    }
}
