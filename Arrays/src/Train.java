import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int wagons = Integer.parseInt(scan.nextLine());
        int peopleInWagon[] = new int[wagons];
        int people = 0;
        for (int i = 0; i < wagons; i++) {
            peopleInWagon[i] = Integer.parseInt(scan.nextLine());
            people += peopleInWagon[i];
        }
        for (int i = 0; i < peopleInWagon.length; i++) {
            System.out.print(peopleInWagon[i] + " ");
        }
        System.out.printf(("\n%d"), people);
    }
}