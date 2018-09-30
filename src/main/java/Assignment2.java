public class Assignment2 {
    public static void main(String[] args) {
        if (args.length == 2) {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            printData(a,b);
        } else
            throw new IllegalArgumentException("Arguments number is not 2.");
    }

    public static void printData(int a, int b) {
        System.out.println("Sum of two integers:" + (a + b));
        System.out.println("Difference of two integers:" + (a - b));
        System.out.println("Product of two integers:" + (a * b));
        System.out.println("Average of two integers:" + (a + b) / 2);
        System.out.println("Distance of two integers:" + Math.abs(a - b));
        System.out.println("Max integer:" + Math.max(a, b));
        System.out.println("Min integer:" + Math.min(a, b));
    }
}
