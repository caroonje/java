//부모 클래스로 사용되는 클래스
public class Tire {
    public int maxRotation;//회전 가능한 수
    public int accumulatedRotation;//누적 회전 수
    public String location;//고장 지점 저장 변수

    public Tire(String location, int maxRotation){
        this.location = location;
        this.maxRotation = maxRotation;
    }

    public boolean roll(){
        ++accumulatedRotation; // 누적 회전 수를 1 증가

//        누적 회전 수가 최대 회전 수보다 작은지 확인
        if (accumulatedRotation < maxRotation){
            System.out.println(location + "Tier 수명 : " + (maxRotation - accumulatedRotation) + " 회");
            return true;
        }else {
            System.out.println("*****" + location + " Tier 펑크 *****");
            return false;
        }
    }
}
