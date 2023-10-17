//인터페이스 MyInter 를 구현한 클래스
public class ClassB implements MyInter{

//    상속받은 추상 메소드를 구현한 메소드
    @Override
    public void method1() {
        System.out.println("ClassB - method1() 호출");
    }

//    추가된 기능을 위한 추상 메소드 선언
//    @Override
//    public void method2() {
//        System.out.println("ClassB - method2() 호출");
//    }

    public void method3(){
        System.out.println("ClassB - method3()호출");
    }
}
