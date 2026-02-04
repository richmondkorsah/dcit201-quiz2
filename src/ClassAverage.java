public class ClassAverage {

    public static double calculateClassAverage(int num1, int num2) {
        double result = ((num1 + num2) / 2.0);
        return result;
    }

    public static double calculateClassAverage(int num1, int num2, int num3) {
        double result = ((num1 + num2 + num3) / 3.0);
        return result;
    }

    public static double calculateClassAverage(int[] numbers) {
        double sum_numbers = 0;
        int array_length = numbers.length ;

        if (array_length == 0) {
            return 0;
        }

        for (int i = 0; i < array_length; i++){
                sum_numbers += numbers[i];
        }

        double result = (sum_numbers / array_length);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calculateClassAverage(2,4));
        System.out.println(calculateClassAverage(2,4,5));
        System.out.println(calculateClassAverage(new int[]{2, 4, 6, 7}));
    }
}