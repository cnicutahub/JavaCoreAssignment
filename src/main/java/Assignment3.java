public class Assignment3 {
    public static void main(String[] args) {
        if (args.length != 0) {
            System.out.println(reverse(stringsToString(args)));
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

    public static String reverse(String str) {
        char[] c = str.toCharArray();
        char[] r = new char[c.length];
        int end = c.length - 1;
        for (int n = 0; n <= end; n++) {
            r[n] = c[end - n];
        }
        return new String(r);
    }
}
