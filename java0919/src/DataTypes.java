public class DataTypes {
    public static void main(String[] args) {
//        기본 타입
//        자바에서 사용되는 기본 데이터 타입 8가지를 뜻함
//        byte    : 1byte 크기, -128~127 까지의 정수 거의 사용 X
//        short   : 2byte 크기, 현재 거의 사용안함
//        char    : 2byte 크기, 문자 타입이면서 정수타입, ascii 코드를 사용
//        int     : 4byte 크기, 자바의 기본 정수 타입
//        long    : 8byte 크기, int보다 큰 정수를 사용시 사용, 접미사로 L을 붙여야함
//        float   : 4byte 크기, 실수 타입,많이 사용 안함, 접미사로 F를 붙여야함
//        double  : 8byte 크기, 자바의 기본 실수 타입, 집미사 사용 X
//        -float 과 double 은 차이가 없어보이나 정확도의 차이가 발생함
//        boolean : 1byte 크기, true, flase만 표현

        byte bValue1 = 10;
        byte bValue2 = 20;
        System.out.println(bValue1);
        System.out.println(bValue2);
//        자바에서 정수 타입의 기본 타입은 int타입임
//        정수 연산시 int 타입으로 자동 변환됨
//        타입이 틀리면 저장이 되지않음
//        byte bValue3 = bValue1 + bValue2;
        char cValue1 = 'A';
        char cValue2 = 'B';
        System.out.println(cValue1);
        System.out.println(cValue2);
//        char 타입은 문자 타입이면서 정수 타입이기 때문에 char 타입의 변수 cValue1에 정수 70을 입력하면 아스키 코드표에 있는 문자'F'가         저장됨
        cValue1 = 70;
        System.out.println(cValue1);
        cValue2 = 102;
        System.out.println(cValue2);
        cValue2 = 'C' + 10;
//        문자 'C'(아스키 코드값 67)와 정수 10을 더하여 char타입의 변수 cValue2에 저장시 아스키코드표의 정수 77에 해당하는 문자 'M'이 저장됨
        System.out.println(cValue2);


        short sValue1 = 100;
        short sValue2 = 200;
        System.out.println(sValue1);
        System.out.println(sValue2);
//        byte 타입과 동일한 형태
//        short sValue3 = sValue1 + sValue2;

//      자바의 정수 기본 타입
        int iValue1 = 1000;
        int iValue2 = 2000;
        System.out.println(iValue1);
        System.out.println(iValue2);
        int iValue3 = iValue1 + iValue2;
        System.out.println(iValue3);

        long lValue1 = 100000L;
        long lValue2 = 200000L;
        System.out.println(lValue1);
        System.out.println(lValue2);

        long lvalue3 = lValue1 + lValue2;
        System.out.println(lvalue3);
        lValue1 = 100000;
        lValue2 = 200000;
        System.out.println(lValue1);
        System.out.println(lValue2);
//        작은 데이터 타입에서 큰 데이터 타입으로 데이터 저장시 자동 타입 변환
        lvalue3 = lValue1+lValue2;
        System.out.println(lvalue3);


        float fValue1 = 10.5F;
        float fValue2 = 20.5F;
        System.out.println(fValue1);
        System.out.println(fValue2);

        double dValue1 = 100.5;
        double dValue2 = 200.5;
        System.out.println(dValue1);
        System.out.println(dValue2);

        boolean boolValue = true;
        System.out.println(boolValue);


    }
}
