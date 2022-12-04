import java.util.Arrays;

public class Solution25 {
    public static void main(String[] args) {
        long[] fabi = new long[101];
        long[] fabiTemp = new long[101];

        fabi[0] = 0;
        fabi[1] = 1;
        int count = 2;

        for (int i = 2; i <= 100; i++) {
            fabi[i] = fabi[i - 2] + fabi[i - 1];
            count += 1;

            if (fabi[i] > 1000) {
                // fabiTemp[i] = fabi[i];
                System.out.println(i);
                break;
            }
        }
    }
}
