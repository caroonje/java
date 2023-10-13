import java.util.Scanner;

public class Calculator2Ex {
    public static void main(String[] args) {

        Calculator2 cal = new Calculator2();

        cal.sum();
        cal.sub();
        cal.multi();
        cal.div();

//        문제 1) 계산을 하기 위한 Calculator3 클래스를 생성하고,사칙 연산을 하기 위한 메소드를 생성 후 계산을 진행하는 프로그램을 작성하세요
//        -메소드명 : sum (2번방식),sub(3번방식) , multi(4번방식), div(1번방식)
//        -출력 예시 : "두 수의 덧셈은 XX 입니다."
        Calculator3 cal3 = new Calculator3();

        int result = 0;
//        2번 매개변수 있고 반환값 없는 방식
        cal3.sum(10, 5);
//        3번 반환값은 있고, 매개변수가 없는방식
        result = cal3.sub();
        System.out.println("두 수의 뺄셈은 " + result + "입니다,");
//        4번 둘다 있는 방식
        result = cal3.multi(10, 5);
        System.out.println("두 수의 곱셈은 " + result + "입니다,");
//        1번 방식 둘다 없는 방식
        cal3.div();

//        문제2) 사용자에게서 국어,영어,수학 점수를 각각 입력받고 해당 총점과 평균을 구한다음 평균 점수에 따라서등급을 출력하는 프로그램을 작성하세요
//        -A : 90점이상 B : 80점이상 C : 70점이상 D : 60점이상 F : 60점미만
//        -출력 예제 : "당신의 총점은 xxx이고, 평균은 xx점이며,등급은 X입니다."
        System.out.println("\n----- 문제 2번 -----\n");
        Scanner sc = new Scanner(System.in);
//        int[] Score = new int[3];
//        String grade="F";
//        int total = 0;
//        double avg = 0;
//        System.out.println("국어, 영어 ,수학 점수를 입력하세요");
//        for (int i=0; i<Score.length; i++ ){
//            Score[i] = sc.nextInt();
//            total = total + Score[i];
//            }
//            avg = total/ Score.length;
//        if (avg >= 90){
//            grade ="A";
//        }else if (avg >= 80){
//            grade = "B";
//        } else if (avg >= 70) {
//            grade = "C";
//        } else if (avg >= 60) {
//            grade = "D";
//        }else{
//            grade = "F";
//        }
//        System.out.println("당신의 총점은"+ total +"이고, 평균은"+ avg +"점이며,등급은" + grade +"입니다.");

        int kor = 0;
        int eng = 0;
        int math = 0;

        System.out.println("국어 점수를 입력해 주세요");
        kor = sc.nextInt();
        System.out.println("영어 점수를 입력해 주세요");
        eng = sc.nextInt();
        System.out.println("수학 점수를 입력해 주세요");
        math = sc.nextInt();

        int total = kor + eng + math;
        double avg = total / 3.0;
        String grade = "";
        if (avg >= 90) {
            grade = "A";
        } else if (avg >= 80) {
            grade = "B";
        } else if (avg >= 70) {
            grade = "C";
        } else if (avg >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("당신의 총점은" + total + "이고, 평균은" + avg + "점이며,등급은" + grade + "입니다.");


//        문제3) 위의 문제 2번을 메소드를 사용하는 방식으로 수정하세요
//        -클래스 명 : Grade.java
//        -메소드 명 : gradeCal, (등급계산 메소드), inputScore(사용자 점수 입력받기 메소드)
        System.out.println("\n----- 문제 3번 -----\n");
//        객체 생성
        Grade Gr = new Grade();
//        1.점수 입력
//
////        2.총점 계산
//        int totalScore = Gr.inputScore();
////        3.평균 계산
//        int avgScore = totalScore/3;
////        4.등급 계산
//        String.grade = Gr.gradeCal(avgScore);
////        5.화면 출력

        Gr.gradeCal();


//        문제 4) 사용자 입력을 통해서 출력하고자 하는 구구단의 단수를 입력받고 해당 단수의 구구단을 출력하는 프로그램을 작성하세요
//                -클래스명: Gugudan
        System.out.println("\n----- 문제 4번 -----\n");
        System.out.println("출력할 구구단의 단수를 입력해 주세요 :");
        int dan = sc.nextInt();
        for (int i = 1; i < 10; i++) {
            System.out.println(dan + "X" + i + " = " + dan * i);
        }
//        문제 5) 위의 문제 4번을 활용하여 메소드를 사용하여 지정한 단수의 구구단을 출력하는 프로그램을 작성하세요
//                -클래스명: Gugudan2
//                -메소드명 :inputDansu(키보드 입력),outputGugudan(구구단 출력)
        System.out.println("\n----- 문제 5번 -----\n");
        Gugudan2 gugu2 = new Gugudan2();
        System.out.println("출력할 구구단의 단수를 입력해 주세요 :");
        gugu2.outputGugudan();


    }
}
