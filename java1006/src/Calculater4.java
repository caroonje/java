public class Calculater4 {

//    생성자 오버로딩 : 객체 생성시 필요한 생성자를 클래스 내부에 여러개 선언하는 것을 말함
//    조건 : 매개변수의 수 ,순서,타입에 따라서 생성자 오버로딩이 가능함


    double num1;
    double num2;
    double result;

    public Calculater4() {

    }

    //    매개변수의 수에 따른 생성자 오버로딩
    public Calculater4(double n1) {
        num1 = n1;
    }

    public Calculater4(double n1, double n2) {
        num1 = n1;
        num2 = n2;
    }

    public Calculater4(double n1, double n2, double r) {
        num1 = n1;
        num2 = n2;
        result = r;
    }

    //    매개 변수의 타입에 따른 생성자 오버로딩
    public Calculater4(double n1, double n2, int r) {
        num1 = n1;
        num2 = n2;
        result = r;
    }
    public Calculater4(double n1, int n2, int r) {
        num1 = n1;
        num2 = n2;
        result = r;
    }

    public Calculater4(int n1, int n2, int r) {
        num1 = n1;
        num2 = n2;
        result = r;
    }
//    매개 변수의 순서에 따른 생성사 오버로딩
public Calculater4(int r, double n1, double n2) {
    num1 = n1;
    num2 = n2;
    result = r;
}
    public Calculater4(int n2, int r, double n1) {
        num1 = n1;
        num2 = n2;
        result = r;
    }
//    순서에 따른 생성자 오버로딩 사용시 매개변수의 데이터 타입의 순서를 기준으로 한다
//    public Calculater4(int n1, int n2, double r) {
//        num1 = n1;
//        num2 = n2;
//        result = r;
//    }
}
