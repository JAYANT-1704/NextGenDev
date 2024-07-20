import java.util.*;

public class grade{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the total number of subjects: ");
        int tSubj = sc.nextInt();

        int[] marks = new int[tSubj];
        for (int i = 0; i < tSubj; i++) {
            System.out.print("Enter the marks of subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        int tMarks = 0;
        for (int i = 0; i < tSubj; i++) {
            tMarks += marks[i];
        }

        int ptg = tMarks / tSubj;
        char[] grades = {'A', 'B', 'C', 'D', 'E', 'F'};

        if (ptg >= 90) {
            System.out.println("Grade: " + grades[0]);
        } else if (ptg >= 80) {
            System.out.println("Grade: " + grades[1]);
        } else if (ptg >= 70) {
            System.out.println("Grade: " + grades[2]);
        } else if (ptg >= 60) {
            System.out.println("Grade: " + grades[3]);
        } else if (ptg >= 50) {
            System.out.println("Grade: " + grades[4]);
        } else {
            System.out.println("Grade: " + grades[5]);
        }

    }

    @Override
    public String toString() {
        return "Main []";
    }
}