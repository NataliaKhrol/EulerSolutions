import java.util.ArrayList;

public class Solution1 {
    public static void main(String[] args) {
        ArrayList<Integer> pum = new ArrayList<>();
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                pum.add(i);
                sum += i;
            } else {
                continue;
            }
        }
        System.out.println(pum);
        System.out.println("The sum equals to " + sum);
    }
}

