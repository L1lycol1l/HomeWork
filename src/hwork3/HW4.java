package hwork3;

import java.util.Arrays;

public class HW4 {
    public static void main(String[] args) {
        int[] m = {-24, 764, 75, -77, 55676, 8, -64, -766, -8, 0};
        Arrays.sort(m);
        int count = 0, count1 = -1;
        System.out.println(Arrays.toString(m));
        for (int i = 0; i < m.length; i++) {
            if (m[i] < 0) count++;
        }
        int[] n = new int[count];
        for (int i = 0; i < m.length; i++) {
            if (m[i] < 0) {
                count1++;
                for (int j = count1; j < n.length; j++) {
                    n[j] = m[i];
                }
            }
        }
        System.out.println(Arrays.toString(n));

    }
}
