public class Tire {
    public int maxRotation;
    public int accRotation;
    public String position;

    public Tire(String position, int maxRotation) {
        this.position = position;
        this.maxRotation = maxRotation;
    }

    public boolean roll() {
        ++accRotation; // 누적 회전 수를 1 증가

//        누적 회전 수가 최대 회전 수보다 작은지 확인
        if (accRotation < maxRotation) {
            System.out.println(position + "Tier 수명 : " + (maxRotation - accRotation) + " 회");
            return true;
        } else {
            System.out.println("*****" + position + " Tier 펑크 *****");
            return false;
        }
    }
}
