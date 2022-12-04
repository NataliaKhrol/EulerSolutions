import java.math.BigInteger;
import java.util.Arrays;

public class Solution25 {
    public static void main(String[] args) {
      //  Integer [] fabi = new long[101];

        BigInteger previous = new BigInteger("0");
        BigInteger current = new BigInteger("1");
        BigInteger next;
        BigInteger limit = new BigInteger("10");
        limit = limit.pow(1000-1);
        System.out.println("Limit equals to " + limit);

        int count = 2;

        for (int i = 2; ; i++) {
            next = previous.add(current);
            count += 1;
            System.out.println("F" + i + " = " + next);

            int compareResult = next.compareTo(limit);
            if (compareResult > 0) { //next > limit
                System.out.println(i);
                break;
            }

            previous = current;
            current = next;
        }
    }
}
