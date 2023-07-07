package chap2;

public class KumHoTire extends Tire {

    public KumHoTire(String location, int maxRotation) {
        super(location, maxRotation);
    }

    public boolean roll() {

        ++accumulatedRotation;
        if (accumulatedRotation<maxRotation) {
            System.out.println(location + " 금호 타이어수명" + (maxRotation - accumulatedRotation) + "회");
            return  true;
        } else System.out.println("****" + location + "금호 타이어 펑크" + "*****");
        return  false;

    }
}
