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

        System.out.print(String.join(" ", array1));
        System.out.printf("\n%s", String.join(" ", array2));
    }
}
