//Calculator 클래스를 상속받은 자식 클래스 Computer
public class Computer extends Calculator{

//    부모 클래스에서 상속받은 메소드 areaCircle
//    오버라이딩을 통해서 자식 클래스 전용의 메소드로 변경
//    접근제한자,반환타입,메소드명,매개변수타입,순서,개수 모두 부모클래스 상속받은 그대로 사용해야함
//    코드 블럭의 내용을 원하는대로 변경하여 사용함
//    자식 클래스 에서 오버라이딩 시 @Override 어노테이션을 반드시 사용할 필요는 없음
//    어노테이션 : 자바의 컴파일러에게 특정 기능이 있으니 확인하라는 의미
//    @Override : 아래의 메소드가 오버라이딩 기능이 사용된 메소드
    @Override
    double areaCircle(double l){ //선언부는 부모클래스의 메소드와 동일해야한다, 타입도 동일해야한다
        System.out.println("Computer 객체의 areaCircle() 실행");
        return Math.PI * l * l;
    }
//    @Override 어노테이션이 없어도 부모 클래스에서 상속 받은 메소드와 동일한 메소드가 있을 경우 오버라이딩이 됨
//    @Overrrid 어노테이션이 있으면 컴파일러가 해당 메소드를 오버라이딩 된 메소드로 인식 하기때문에 규칠을 한번 더 확인함
    int multi(int x, int y){
        System.out.println("Computer 객체의 multi() 실행");
        return x * y;
    }
}
