public class Solution25d {
    public static void main(String[] args) {
        //  Integer [] fabi = new long[101];

        long previous = 0;
        long current = 1;
        long limit = 100;

        int count = 2;

        while (current <= limit) {
            long temp = previous;
            previous = current;
            current = previous + temp;
            System.out.println("F" + count + " = " + current);

            count += 1;
        }
    }
}
