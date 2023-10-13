public class Operrator {
    public static void main(String[] args) {
        System.out.println("\n -----문자열 연결 연산자 -----\n");

//        문자열 : 문자의 배열을 뜻함, 문자를 나열해 놓은 것
//        -자바의 문자열은 String 클래스 타입으로 레퍼런스 타입임
//        -자바의 기본 데이터 타입이 아니지만 워낙 많이 사용되는 데이터 타입이기 떄문에 기본 데이터 타입처럼 사용할 수있음
//        -자바에서 문자열은 ""로 감싸여져 있는 모든 데이터를 문자열이라함

//        문자열 연결 연산자 : 산술 연산자의 + 기호를 사용
//        -2개 이상의 문자열을 연결하여 하나의 문자열로 만드는 연산자
//        -다른 데이터 타입과 문자열을 문자열 연결 연산자로 연산 시 모든 데이터 타입의 문자열 타입으로 변환후 연결함

        String str1 = "JDK" + "17";
        String str2 = str1 + "의 특징";
        System.out.println(str2);
//      연산자의 연산 순서에 따라서 왼쪽에서 오른쪽으로 이동하며 연산
//      "JDK"+10이 먼저 연산되어 "JDK 10"으로 연결되고
//        "JDK10" +7 이 나중에 연산되어 "JDK107"이 됨
        String str3 = "JDK" + 10 + 7;
        System.out.println(str3);
//      연산자의 연산 순서에 따라서 왼쪽에서 오른쪽으로 이동하며 연산
//      10+7이 먼저 연산되어 17이 되고, 17+"JDK"가 나중에 연산되어 "17JDK"가 됨.
        String str4 = 10 + 7 + "JDK";
        System.out.println(str4);
//        논리연산자
        System.out.println("\n----- 논리 연산 -----\n");

//        int타입의 변수 선언,데이터를 char타입의 문자'A'(65)를 입력
        int charCode = 'A';

        if ((charCode >= 65) && (charCode <= 90)) {
            System.out.println("논리연산자 &&로 대문자입니다.");
        }
        if ((charCode >= 97) && (charCode <= 122)) {
            System.out.println("소문자 입니다.");
        }
        if ((charCode >=65) || (charCode <= 90)){
            System.out.println("대문자입니다.");
        }
        if ((charCode >=97) || (charCode <= 122)){
            System.out.println("소문자입니다.");
        }
        System.out.println("\n-----대입 연산자-----\n");

//        단순 대입 연산자 사용
        int iVal1 = 100;
        System.out.println(iVal1);//100
        iVal1 = iVal1 +1;
        System.out.println(iVal1);//101
//        처음에는 기본형태인 iVal1 = iVal1 +1;을 사용하는 것이 좋음
        iVal1 += 1;
        System.out.println(iVal1);//102


//        복합 대입 연산자의 +=은 문자열 연결 연산자로 많이 사용
    }
}