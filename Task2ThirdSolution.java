import java.util.Scanner;

public class Task2ThirdSolution {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        int[] array = new int[50];
        arrayInput(array);
        int index = linearSearch(array);
        arrayOutput(array,index);
        System.out.println();
        System.out.println("Would you like to add numbers: (y/n)");
        System.out.print("Answer:");
        char answer=object.next().charAt(0);
        if(answer=='y') {
            arrayInput(array,index);
            int indexSecond = linearSearch(array,index);
            System.out.println("Final array:");
            arrayOutput(array,index,indexSecond);
        }
        else if(answer=='n')  System.exit(0);
    }
    public static void arrayInput(int[] array) {
        Scanner object = new Scanner(System.in);
        int number;
        System.out.println("Enter numbers of the array:");
        for (int i=0; i < array.length; i++) {
            array[i] = number = object.nextInt();
            if (number == -10) {
                break;
            }
        }
    }
    public static void arrayInput (int[] array,int index){
        Scanner object = new Scanner(System.in);
        int number;
        System.out.println("Enter numbers of the array:");
        for (int i=index; i < array.length; i++) {
            array[i] = number = object.nextInt();
            if (number == -10) {
                break;
            }
        }
    }
    public static void arrayOutput(int[] array ,int index) {
        for(int i=0;i<index;i++){
            System.out.print(array[i]+" ");
        }
    }

    public static void arrayOutput(int[] array ,int index,int indexSecond) {
        for (int i = 0; i < index; i++) {
            System.out.print(array[i] + " ");
        }
        for(int i=index;i<indexSecond;i++){
            System.out.print(array[i]+" ");
        }
    }
    public static int linearSearch(int[] array) {
        for(int i=0;i<array.length;i++) {
            if(array[i]==-10)  return i;
        }
        return -1;
    }
    public static int linearSearch(int[] array,int index){
        for(int i=index+1;i<array.length;i++) {
            if(array[i]==-10)  return i;
        }
        return -1;
    }
}
