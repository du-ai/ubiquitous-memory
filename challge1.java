import java.util.Scanner;

public class challge1 {
    public static void main(String[] args) {
        int[] residents = new int[15];


        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 15; i++) {
            System.out.print("请输入第 " + i + " 号房子的居民数量：");
            residents[i] = scanner.nextInt();
        }


        int sumOdd = 0;
        int sumEven = 0;

        for (int index = 0; index < 15; index++) {
            if (index % 2 == 1) {

                sumOdd = sumOdd + residents[index];
            } else {

                sumEven = sumEven + residents[index];
            }
        }


        if (sumOdd > sumEven) {
            System.out.println("More residents live in houses with odd numbers.");
        } else if (sumEven > sumOdd) {
            System.out.println("Houses with even numbers have more residents.");
        } else {
            System.out.println("The number of residents on both sides is the same.");
        }

        scanner.close();
    }
}
