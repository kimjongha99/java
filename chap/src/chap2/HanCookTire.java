package chap2;

public class HanCookTire extends Tire {

    public HanCookTire(String location, int accumulatedRotation) {
        super(location, accumulatedRotation);
    }

    public boolean roll() {

        ++accumulatedRotation;
        if (accumulatedRotation<maxRotation) {
            System.out.println(location + " 한국 타이어수명" + (maxRotation - accumulatedRotation) + "회");
            return  true;
        } else System.out.println("****" + location + "한국 타이어 펑크" + "*****");
        return  false;

    }
}
