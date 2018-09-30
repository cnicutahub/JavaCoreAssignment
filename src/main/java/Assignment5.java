public class Assignment5 {
    public static void main(String[] args) {
        if (args.length != 0) {
            int[] returns = process(stringsToString(args));
            printData(returns[0], returns[1], returns[2], returns[3]);
        }
    }

    public static String stringsToString(String[] strings) {
        String fullString = "";
        for (int i = 0; i < strings.length; i++) {
            if (i == strings.length - 1) {
                fullString += strings[i];
            } else {
                fullString += strings[i] + " ";
            }
        }
        return fullString;
    }

    public static void printData(int letters, int spaces, int numbers, int other) {
        System.out.println("letter: " + letters);
        System.out.println("space: " + spaces);
        System.out.println("number: " + numbers);
        System.out.println("other: " + other);
    }

    public static int[] process(String str) {
        int letters = 0;
        int spaces = 0;
        int numbers = 0;
        int other = 0;
        char[] c = str.toCharArray();
        for (char aC : c) {
            if (Character.isLetter(aC)) letters++;
            else if (Character.isSpaceChar(aC)) spaces++;
            else if (Character.isDigit(aC)) numbers++;
            else other++;
        }
        return new int[]{letters, spaces, numbers, other};
    }
}
