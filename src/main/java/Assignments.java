public class Assignments {
    public static int sumDigits(int i) {
        if (i >= 0 && i <= 1000)
            return i != 0 ? i % 10 + sumDigits(i / 10) : 0;
        else throw new IllegalArgumentException(i + " is not between 0 and 1000");
    }
}
