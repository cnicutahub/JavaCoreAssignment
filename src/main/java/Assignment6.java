import java.util.ArrayList;

public class Assignment6 {
    public static void main(String[] args) {
        multiplesInRange(1, 100, 3);
        multiplesInRange(1, 100, 5);
        multiplesInRange(1, 100, 3, 5);
    }

    public static ArrayList<Integer> multiplesInRange(int from, int to, int... dividedBy) {
        ArrayList<Integer> integers = new ArrayList<>();

        System.out.print("Divided dividedBy ");
        for (int i = 0; i < dividedBy.length; i++)
            System.out.print(i == dividedBy.length - 1 ? dividedBy[i] + "\n" : dividedBy[i] + " & ");

        for (int i = from; i < to; i++) {
            int count = 0;
            for (int byItem : dividedBy)
                if (i % byItem == 0) count++;
            if (count == dividedBy.length) {
                System.out.print(i + ", ");
                integers.add(i);
            }
        }
        System.out.println();
        return integers;
    }
}
