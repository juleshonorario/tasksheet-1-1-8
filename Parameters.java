public class Parameters {
    public static void main(String[] args) {
        int[] numbers = {4, 5, 10};
        calculateCumulativeSum(numbers);
    }

    public static void calculateCumulativeSum(int... nums) {
        int totalSum = 0;
        System.out.println("Results:");

        for (int i = 0; i < nums.length; i++) {
            int paramSum = 0;
            for (int j = 1; j <= nums [i]; j++) {
                paramSum += j;
            }
            totalSum += paramSum;
            System.out.printf("Parameters %d: %d = (%s)%n" , i + 1, paramSum, getCumulativeExpression(nums[1]));
        }
        System.out.println("\nTotal Sum: " + totalSum);
    }
    
    private static String getCumulativeExpression(int num) {
        StringBuilder expression = new StringBuilder();

        for (int i = 1; i <= num; i++) {
            expression.append(i);
            if (i < num) {
                expression.append("+");
            }
        }
        return expression.toString();
    }
}