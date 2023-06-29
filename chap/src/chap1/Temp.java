package chap1;

public class Temp {
    public static void main(String[] args) {
        int x=3;
        int y=4;
        int temp;

        temp = x;
        x= y;
        y=temp;

        System.out.println(x+"    "+y);
        
    }
}
