public class Calculator2 {
    int num1;
    int num2;
    int result;


    //    기본 생성자
    public Calculator2() {
//    생성자를 사용한 기본값 설정
//        num1 = 0;
//        num2 = 0;
//        result = 0;
        defaultSetup();



    }
    public void defaultSetup(){

    }

    //    메소드 선언
    public void outputResult() {
        System.out.println("결과 : " + result);
    }

    public void sum() {
        result = num1 + num2;
        System.out.println("num1 + num2");
    }
}
