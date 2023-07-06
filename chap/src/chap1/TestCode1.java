package chap1;

public class TestCode1 {
    public static void main(String[] args) {
        int[][] a = {{2, 3}, {5}, {7}};
        int sum = 0;
        int[] p = a[0];
        for (int i = 0; i < p.length; i++) {
            sum += p[i];
            System.out.println(sum);
        }
    }
}
