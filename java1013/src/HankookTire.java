public class HankookTire extends Tire{

    public HankookTire(String position, int maxRotation){
//    자식 클래스의 생성자에서 부모 클래스의 생성자 호출
        super(position,maxRotation);
    }
    //    부모 클래스 에서 상속받은 메소드를 오버 라이딩
    @Override
    public boolean roll(){
        ++accRotation;
        if (accRotation < maxRotation){
            System.out.println(position + "HankookTier 수명 : " + (maxRotation - accRotation) + "회");
            return true;
        }else {
            System.out.println("*****" + position + "HankookTier 펑크 *****");
            return false;
        }
    }
}
