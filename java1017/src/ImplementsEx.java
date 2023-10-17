public class ImplementsEx {
    public static void main(String[] args) {
//        인터페이스 InterC를 구현한 구현 클래스 Implc의 객체 생성
        ImplC impl = new ImplC();
//        InterA,InterB,InterC 가 가지고 있던 모든 추상 메소드를 구현하여 사용할 수 있음
        impl.methodA();
        impl.methodB();
        impl.methodC();

//        다형성을 사용하여 조상 인터페이스 InterA 타입의 변수에 구현 클래스의 객체를 저장
        InterA ia = impl;
//        조상 인터페이스인 InterA의 멤버만 사용이 가능함
        ia.methodA();
//        ia.methodB();
//        ia.methodC();

//        다형성을 사용하여 조상 인터페이스 InterB 타입의 변수에 구현 클래스의 객체를 저장
        InterB ib = impl;
//        조상 인터페이스인 InterB의 멤버만 사용이 가능함
//        ib.methodA();
        ib.methodB();
//        ib.methodC();

//      다형성을 사용하여 부모 인터페이스 InterC 타입의 변수에 구현 클래스의 객체를 저장
        InterC ic = impl;
//        부모 인터페이스인 InterC의 멤버만 사용이 가능함
//        InterC는 상속받은 methodA()와 methodB()를 가지고있음
        ic.methodA();
        ic.methodB();
        ic.methodC();
    }
}
