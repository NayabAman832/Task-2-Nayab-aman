import java.util.Scanner;

public class gradecalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int subjects, marks, total = 0;

        System.out.print("Enter number of subjects: ");
        subjects = sc.nextInt();

        for(int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            marks = sc.nextInt();
            total += marks;
        }

        double percentage = (double) total / (subjects * 100) * 100;

        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage);

        if(percentage >= 90)
            System.out.println("Grade: A+");
        else if(percentage >= 80)
            System.out.println("Grade: A");
        else if(percentage >= 70)
            System.out.println("Grade: B");
        else
            System.out.println("Grade: Fail");

        sc.close();
    }
}