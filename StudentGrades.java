import java.util.ArrayList;
import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> grades = new ArrayList<>();

        System.out.println("Welcome to the Student Grades Program");
        System.out.println("Enter student grades (type -1 to stop):");
        while (true) {
            System.out.print("Enter grade: ");
            double grade = scanner.nextDouble();

            if (grade == -1) {
                break;
            }

            if (grade >= 0 && grade <= 100) {
                grades.add(grade);
            } else {
                System.out.println("Invalid grade! Please enter a value between 0 and 100.");
            }
        }
        if (grades.isEmpty()) {
            System.out.println("No grades were entered. Exiting program.");
        } else {
            double average = calculateAverage(grades);
            double highest = findHighest(grades);
            double lowest = findLowest(grades);

            System.out.println("\nGrade Summary:");
            System.out.println("Average Grade: " + average);
            System.out.println("Highest Grade: " + highest);
            System.out.println("Lowest Grade: " + lowest);
        }

        scanner.close();
    }
     private static double calculateAverage(ArrayList<Double> grades) {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
    private static double findHighest(ArrayList<Double> grades) {
        double highest = grades.get(0);
        for (double grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }
    private static double findLowest(ArrayList<Double> grades) {
        double lowest = grades.get(0);
        for (double grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }
}
