package chap2;

public class CarExample {
    public static void main(String[] args) {

        Car car1 = new Car();

        for (int i = 0; i < 10; i++) {
            int problem = car1.run();

            switch (problem){
                case 1:
                    System.out.println("앞왼쪽 한국타어로 교체");
                    car1.frontLeftTire = new HanCookTire("앞왼쪽", 15);
                    break;
                case 2:
                    System.out.println("앞오른쪽 금호타어로 교체");
                    car1.frontLeftTire = new HanCookTire("앞오른쪽", 14);
                    break;
                case 3:
                    System.out.println("뒤왼쪽 한국타어로 교체");
                    car1.frontLeftTire = new HanCookTire("뒤왼쪽", 17);
                    break;
                case 4:
                    System.out.println("뒤오른쪽 금호타어로 교체");
                    car1.frontLeftTire = new HanCookTire("뒤오른쪽", 19);
                    break;

            }
            System.out.println("mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm");
        }
    }
}
