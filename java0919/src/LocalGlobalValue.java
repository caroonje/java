public class LocalGlobalValue {
    public static int value1 = 100; //전역변수
    public static void method1(){
//        변수 value1이 전역 변수이기 떄문에 사용가능
        System.out.println("method 안에서 value1 :" + value1);
    }
    public static void method2(){
//        method2에서 선언한 변수 value2
        int value2 = 2000;
//        method2에서만 사용가능
        System.out.println("method 안에서 value2 :" + value2);
    }
    public static void method3(){
//        method3 안에서 선언한 변수 value1, value2
        int value1 = 1000;//지역변수 value1
//        method2 안에서 선언한 value2 와 method3 안에서 선언한 value2는 이름이 같아도 서로 메소드(지역)이 다르기 떄문에 동일한
//        이름을 사용하는데 문제가 없음
        int value2 = 2000;//지역변수 value2
        //전역 변수 value1과 이름이 같지만 지역변수가 우선순위가 더 높기 때문에 지역변수 value1이 사용됨
        System.out.println("method 안에서 value1 :" + value1);

        System.out.println("method 안에서 value2 :" + value2);
    }

    public static void main(String[] args) {
        System.out.println("----- 지역변수 / 전역변수-----");

//        전역변수 : 프로그램 전체에서 언제든지 접근할 수 있는 변수 -main메소드에서 선언된 변수
//        지역변수 : 특정 코드블럭 안에서 선언되고 사용되고 삭제되는 변수

//        지역변수와 전역변수의 이름이 같을 경우
//        지역변수와 전역변수의 이름이 같을 경우 지역 변수의 우선 순위가 더 높음 -- 지역변수>전역변수
        System.out.println("전역 변수 value1 : " + value1);

        method1();//메소드 1싱행

        System.out.println();

        method2();//메소드 2실행

        System.out.println();

        method3();//메소드 3실행



    }
}
