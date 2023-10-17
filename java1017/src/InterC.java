//부모 인터페이스 InterA,InterB를 상속받는 자식 인터페이스 InterC 선언
//인터페이스 다중 상속을 지원함
public interface InterC extends InterA,InterB{

//    InterA,InterB 에서 상속 받은 추상 메소드 methodA(),methodB()가 존재함

//    인터페이스 InterC의 전용 멤버인 추상 메소드 선언
    public abstract void methodC();


}
