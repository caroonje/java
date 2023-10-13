import java.util.Scanner;

public class ForEx {
    public static void main(String[] args) {
        System.out.println("\n-----for-----\n");

//        for : 자바에서 가장많이 사용되는 반복문
//        -초기화변수, 조건식, 증감식을 for문 시작 시에 모두 설정하고 사용함
//        -초기화 변수는 최초 1번실행, 조건식, 반복코드 블록,증감식을 순서대로 계속반복 실행함
//        -코드 블록에서는 조건식의 결과가 true일 경우 반복 실행할 소스만 입력
//        -for에서 사용한 초기화 변수는 for문이 종료 시 삭제됨
//        -for에서 사용한 초기화 변수는 for 외부에서 사용가능.같은 이름의 초기화변수를 다른for문 에서 사용할 수 있음
//        사용법:
//        for(초기화변수 선언 ; 조건식 ; 증감식 ){
//        조건식의 결과가 true 일 경우 실행할 소스코드...
//    }

        for (int i = 0; i < 11; i++) {
            System.out.println("i : " + i);
        }

        System.out.println("\n----- while문 사용시 -----\n");
        int treeHit = 0;
        while (treeHit < 10) {
            treeHit++;
            System.out.println("나무를" + treeHit + "번 찍었습니다.");
            if (treeHit == 10) {
                System.out.println("나무가 넘어갑니다.");
            }
        }
        System.out.println("\n----- for문 사용시 -----\n");

        for (int i = 0; i < 11; i++) {
            System.out.println("나무를" + i + "번 찍었습니다.");
            if (i == 10) {
                System.out.println("나무가 넘어갑니다");
            }
        }
//        문제 2 ) 1~10까지의 총합을 구하는 프로그램을 for문을 사용하여 작성하세요
        System.out.println("\n-----문제2-----\n");

        int sum = 0;
        for (int i = 1; i<11; i++){
            sum = sum+i;
                }
        System.out.println("총합은 : " +sum);
//        문제 3 ) 사용자 키보드 입력을 받아서 지정한 단수의 구구단을 출력하는 프로그램을 작성하세요
        System.out.println("\n-----문제3-----\n");

        Scanner scanner= new Scanner(System.in);

        int p = scanner.nextInt();
        int total = 0;
        for (int j = 1; j<10; j++){
            total = p * j;
            System.out.println(p +" * " + j + "="+ total);

            scanner.close();
        }



//        문제 4 ) 아래의 모양과 같은 모양을 화면에 출력하세요
        System.out.println("\n-----문제4-----\n");


        for(int n = 1; n<6; n++){
            for (int m = 0; m<n; m++){
                System.out.print("*");
            }
            System.out.println();
        }

        String s ="";//빈문자열
        for (int k = 0; k <5; k++){

            s= s + "*"; //빈문자열에 별을 하나씩 추가
            System.out.println(s);
        }
//        *
//        **
//        ***
//        ****
//        *****
//        문제 5 )아래의 모양과 같은 모양을 화면에 출력하세요
        System.out.println("\n-----문제5-----\n"); //중복for문 이용
        for(int n = 5; n > 0; n--){
            for (int m = 0; m<n; m++){
                System.out.print("*");
            }
            System.out.println();
        }





//        *****
//        ****
//        ***
//        **
//        *

        System.out.println("\n-----중첩 제어문-----\n");
//        중첩 제어문 : 제어문 안에 제어문을 추가로 사용하는 제어문
//        중첩 반복문 : 반복문 안에 반복문을 사용하는 반복문,다 차원 배열을 출력할 때 많이 사용함.
//        -외부의 반복문이 한번 반복을 진행할 때 내부의 반복문은 전체 반복을 진행함

        for (int i= 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.println("i : "+i+", j :" + j);
            }
        }

        for (int i = 0; i<3; i++){
            for (int j =0; j<3; j++){
                for (int h= 0; h <3; h++){
                    System.out.println(" i : " +i+ " ,j : " +j+ " , h :" +h);
                }
            }
        }

//      문제 5) 2중 반복문을 사용하여 구구단을 2~9단까지 모두 출력하는 프로그램을 작성하세요
//        ps)for문을 사용하는 방식, while문을 사용하는 방식 둘 다 출력
        System.out.println("\n-----문제5-----\n");


        for (int i = 2; i <10 ; i++){
            System.out.println("-----" + i + "단-----");
            for (int j = 1; j < 10; j++){

                System.out.println(i +"*"+ j + "=" + (i*j));
            }
            System.out.println();
        }
//        외부 while문의 초기화 변수 선언
        int i = 2;
        while (i < 10){
            System.out.println("-----" + i + "단-----");
//            내부 while문의 초기화 변수 선언
            int j = 1;
            while (j < 10){
                System.out.println(i +"*"+ j + "=" + (i*j));
//                내부 while문의 증감식
                j++;
            }
//                외부 while문의 증감식
            i++;
            System.out.println();


        }
        }
    }

