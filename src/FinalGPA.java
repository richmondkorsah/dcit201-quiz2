public class FinalGPA {

    public static double getFinalGPA(double numericScore) {
        char grade = calculateLetterGrade(numericScore);
        return calculateGPA(grade);
    }

    public static char calculateLetterGrade(double numericScore) {
        if (numericScore >= 80)
            return 'A';
        if (numericScore >= 70)
            return 'B';
        if (numericScore >= 60)
            return 'C';
        if (numericScore >= 50)
            return 'D';
        return 'F';
    }

    public static double calculateGPA(char letterGrade) {
        switch (letterGrade) {
            case 'A':
                return 4.0;
            case 'B':
                return 3.0;
            case 'C':
                return 2.0;
            case 'D':
                return 1.0;
            default:
                return 0.0;
        }
    }

    public static void main(String[] args) {
        System.out.println("GPA is: " + getFinalGPA(95));
        System.out.println("GPA is: " + getFinalGPA(82));
        System.out.println("GPA is: " + getFinalGPA(26));
        System.out.println("GPA is: " + getFinalGPA(52));
        System.out.println("GPA is: " + getFinalGPA(78));
        System.out.println("GPA is: " + getFinalGPA(61));

    }
}