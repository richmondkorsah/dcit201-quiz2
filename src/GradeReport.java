public class GradeReport {

    public static void executeGradeReport(double score) {
        if (!validateScore(score)) {
            System.out.println("Invalid score!");
            return;
        }

        String grade = calculateLetterGrade(score);
        displayPerformanceGrade(grade);
    }

    private static boolean validateScore(double score) {
        return score >= 0 && score <= 100;
    }

    public static String calculateLetterGrade(double score) {
        if (score >= 80)
            return "A";
        if (score >= 75)
            return "B+";
        if (score >= 70)
            return "B";
        if (score >= 65)
            return "C+";
        if (score >= 60)
            return "C";
        if (score >= 55)
            return "D+";
        if (score >= 50)
            return "D";
        if (score >= 45)
            return "E";
        return "F";
    }

    public static void displayPerformanceGrade(String grade) {
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        executeGradeReport(90);
        executeGradeReport(80);
        executeGradeReport(40);
        executeGradeReport(66);

    }
}
