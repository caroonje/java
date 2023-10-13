import java.util.Scanner;

//문제 3번 풀이용 클래스
public class Grade {
    public int inputScore() {
//        점수 입력
        Scanner sc = new Scanner(System.in);
        System.out.println("국어 점수를 입력하세요");
        int kor = sc.nextInt();
        System.out.println("영어 점수를 입력하세요");
        int eng = sc.nextInt();
        System.out.println("수학 점수를 입력하세요");
        int math = sc.nextInt();
//        총점 계산
        return kor + eng + math;
    }

    public void gradeCal() {
        int total = inputScore();
//        평균 계산
        double avg = total / 3.0;
        String grade = "";
//        등급 계산
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
//        화면 출력
        System.out.println("당신의 총점은" + total + "이고, 평균은" + avg + "점이며,등급은" + grade + "입니다.");

    }

}
