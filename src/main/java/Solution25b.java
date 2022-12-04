import java.math.BigInteger;

public class Solution25b {
    public static void main(String[] args) {
      //  Integer [] fabi = new long[101];

        long previous = 0;
        long current = 1;
        long next;
        long limit = 100;

        int count = 2;

        for (int i = 2; i <= 100; i++) {
            next = previous +current;
            count += 1;
            System.out.println("F" + i + " = " + next);

            boolean compareResult = next > limit;
            if (compareResult ) { //next > limit
                System.out.println(i);
                break;
            }

            previous = current;
            current = next;
        }
    }
}
