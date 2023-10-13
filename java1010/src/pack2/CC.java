package pack2;

import pack1.AA;

public class CC {
    public void execute(){
//        pack1 패키지의 AA 클래스 사용
//        생성자 호출
//      AA 클래스 타입의 변수 a1 선언 및 객체 생성
//      생성자의 접근제한자가 public, 다른 패키지에서 사용시 제한 없음
        AA a1 = new AA();
//        생성자의 접근제한자가 default,다른 패키지에서 사용불가
//        AA a2 = new AA("pack2에서 AA클래스 사용");
//        생성자의 접근 제한자가 private,외부 에서 사용 불가
//        AA a3 = new AA(100);
        AA a4; // 해당 클래스 타입으로 변수 생성은 가능


//        필드 사용
//        필드의 접근제한자가 public, 외부(다른 패키지)에서 사용시 제한 없음
        System.out.println(a1.publicField);
//        필드의 접근제한자가 default, 다른 패키지에서 사용 불가
//        System.out.println(a1.defaultField);
//        필드의 접근제한자가 private, 외부에서 사용 불가
//        System.out.println(a1.privateField);

//        메소드 사용
//        메소드의 접근제한자가 public, 다른 패키지 에서 사용가능
        a1.publicMethod();
//        필드의 접근제한자가 default, 다른 패키지 에서 사용 불가
//        a1.defaultMethod();
//        필드의 접근제한자가 private,외부에서 사용불가
//        a1.privateMethod();
//        메소드의 접근제한자가 public, public인 멤버를 통해서 일반적으로 접근이 불가능한 필드,메소드를 우회해서 사용함
        a1.print();
    }


}


