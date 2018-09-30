public class Assignment1 {
    public static void main(String[] args) {
        if (args.length == 1) {
            int a = Integer.parseInt(args[0]);
            System.out.println("Sum of digits: " + sumDigits(a));
        } else
            throw new IllegalArgumentException("Arguments number is not 1.");
    }

    public static int sumDigits(int i) {
        if (i >= 0 && i <= 1000)
            return i != 0 ? i % 10 + sumDigits(i / 10) : 0;
        else throw new IllegalArgumentException(i + " is not between 0 and 1000.");
    }
}
