public class Solution25c {
    public static void main(String[] args) {
        //  Integer [] fabi = new long[101];

        long previous = 0;
        long current = 1;
        long limit = 100;

        int count = 2;

        for (int i = 2; i <= 100; i++) {
            long temp = previous;
            previous = current;
            current = previous + temp;

            count += 1;
            System.out.println("F" + i + " = " + current);

            boolean compareResult = current > limit;
            if (compareResult) { //next > limit
                System.out.println(i);
                break;
            }
        }
    }
}
