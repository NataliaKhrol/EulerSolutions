public class Solution2 {
    public static void main(String[] args) {

        long previous = 0;
        long current = 1;
        long next = 0;
        int sum = 0;

             while (next < 4000000) {
                next = previous + current;
               // System.out.println(next);
                previous = current;
                current = next;
                if (next % 2 ==0){
                    sum+=next;
                }
            }
                 System.out.println("Sum equals to " + sum);
        }
    }
