import java.util.Scanner;

public class AddElementIntoArr {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số nguyên x: ");
        int x = input.nextInt();
        int index;
        do {
            System.out.println("Nhập vị trí index muốn chèn vào mảng: ");
            index = input.nextInt();
            if (index <= 1 || index >= numbers.length - 1) {
                System.out.println("Không chèn được phần tử vào mảng.");
            }
        } while (index <= 1 || index >= numbers.length - 1);
        for (int i = numbers.length - 1; i > index; i--) {

            numbers[i] = numbers[i - 1];

        }
        numbers[index] = x;
        for (int a : numbers
        ) {
            System.out.println(a);

        }
    }

}
