import java.util.Scanner;

public class DeleteNumberArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int array[] = {1, 2, 3, 4, 5, 6, 8, 9, 0};
        int i;
        int index = 0;
        System.out.print("Array is: ");
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.print("Enter number to delete: ");
        int numberDel = input.nextInt();

        boolean isExist = false;
        for (i = 0; i < array.length; i++) {
            if (array[i] == numberDel) {
                System.out.print("Position of number " + numberDel + " is: " + (i+1));
                index = i+1;
                isExist = true;
                break;
            }
        }
        if (isExist == true) {
            for (i = index - 1; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            System.out.print("\n New array is: ");
            for (i = 0; i < array.length; i++) {
                System.out.print(array[i] + "\t");
            }
        }
        else System.out.print("Not found number " + numberDel + " in the array");
    }
}
