public class Main {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1, 1, 1));
        System.out.println(hasEqualSum(1, 1, 2));
        System.out.println(hasEqualSum(1, -1, 0));
    }

    /**
     * Checks if the sum of first two numbers is equal to third number.
     */
    public static boolean hasEqualSum(int a, int b, int c) {
        return (a + b == c);
    }
}