import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String array1[] = new String[n];
        String array2[] = new String[n];
        for (int i = 0; i < n; i++) {
            String input[] = scan.nextLine().split(" ");
            if (i % 2 == 0) {
                array1[i] = input[0];
                array2[i] = input[1];
            } else {
                array2[i] = input[0];
                array1[i] = input[1];
            }
        }
        for (int i = 0; i < array1.length; i++) {
            System.out.printf("%s ", array1[i]);

        }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            System.out.printf("%s ", array2[i]);

        }
    }
}
