public class Main {
    public static void main(String[] args) {
        int age = 10;
        System.out.println(age);

////        변수를 선언만함. 초기화X
//        int value;
//        System.out.println(value);
        //선언만 하고 초기화 하지 않았기 때문에 오류가뜸

        int value1 = 100;
        System.out.println(value1);
//  리터럴:데이터 그 자체를 의미
        int iVal1 = 10;
        int iVal2 = 20;
        double dVal1 = 3.14;
        double dVal2 = 10.5;
        char c1 = 'A';
        char c2 = 'B';
        boolean bVal1 = true;
        boolean bVal2 = false;
        String sVal1 = "문자열";
        String sVal2 = "두번째문자열";
        //변수타입 변수 = 리터럴

        System.out.println(iVal1 + iVal2);
        System.out.println(10 + 20);
    }
}