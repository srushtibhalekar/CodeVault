import java.util.Scanner;

public class StudentMarks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        int[] marks = new int[n];
        int total = 0;
        int highest = 0;
        int lowest = 100;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();

            total += marks[i];

            if (marks[i] > highest) {
                highest = marks[i];
            }

            if (marks[i] < lowest) {
                lowest = marks[i];
            }
        }

        double average = (double) total / n;

        System.out.println("\n===== RESULT =====");
        System.out.println("Total Marks : " + total);
        System.out.println("Average     : " + average);
        System.out.println("Highest     : " + highest);
        System.out.println("Lowest      : " + lowest);

        if (average >= 75) {
            System.out.println("Grade       : A");
        } else if (average >= 60) {
            System.out.println("Grade       : B");
        } else if (average >= 50) {
            System.out.println("Grade       : C");
        } else if (average >= 35) {
            System.out.println("Grade       : D");
        } else {
            System.out.println("Result      : FAIL");
        }

        sc.close();
    }
}