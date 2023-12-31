public class MethodType {
//    1번 형태
//    매개변수 반환값 없음
    public void func01() {
        int a = 10;
        int b = 3;
        int result = a + b;
        System.out.println("두 수의 덧셈은 " + result + "입니다.");
    }

//    2번형태
//    매개변수는 있고, 반환값은 없음
    public void func02(int a, int b) {
        int result = a + b;
        System.out.println("두 수의 덧셈은 " + result + "입니다.");
    }

//    3번형태
//    매개변수는 없고, 반환값은 있음
    public int func03() {
        int a = 10;
        int b = 3;
        return a + b;
    }

//    4번형태
//    반환값과 매개변수가 둘다 있음
    public int func04(int a, int b) {
        return a + b;
    }
}
