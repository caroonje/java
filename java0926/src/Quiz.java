
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
//        사용자 키보드 입력을 위한 Scanner 객체 선언
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n----- 문제 1 -----\n");


//        문제1)크기가 10인  배열 scores를 선언하고 각각의 정수를 사용자 키보드 입력을 통해서 입력받은 후 scores에 저장하고 해당 배열의 총합 및 평균을 구하는 프로그램을 작성하세요.


        int[] scores = new int[10];
//        사용자 입력 수 확인용 변수 ,배열의 index로 사용할 변수

        double avg = 0;
            int total = 0;
            System.out.println("점수를 입력하세요");
            for (int i = 0; i < scores.length; i++) {

                scores[i] = scanner.nextInt();
                total += scores[i];
            }
            avg = total / scores.length;

            System.out.println("정수의 총합은 : " + total + "이고, 평균은 : " + avg + "입니다");


//        문제2)해당 총합 및 평균을 저장한 배열을 활용하여 각 등급을 출력하는 프로그램을 작성하세요  A : 90이상,B: 80이상,C : 70이상,D : 60이상, F= 60점 미만

            if (avg >= 90) {
                System.out.println("등급은 A 입니다");
            } else if (avg >= 80) {
                System.out.println("등급은 B 입니다");

            } else if (avg >= 70) {
                System.out.println("등급은 C 입니다");

            } else if (avg >= 60) {
                System.out.println("등급은 D 입니다");

            } else if (avg < 60) {
                System.out.println("등급은 F 입니다");
            }


//        문제3) 배열 scores의 내용을 반복문을 사용하여 모두 출력하는 프로그램을 작성하세요
//        ps)등급이 C이상인 학생의 점수 및 등급을 출력하세요.

        String grade = "F";

            for (int i =0; i< scores.length; i++){
                if (scores[i] >= 90){
                    grade = "A";
                } else if (scores[i] >=80 ) {
                    grade = "B";

                } else if (scores[i] >=70 ) {
                    grade = "C";
                } else if (scores[i] >=60 ) {
                    grade = "D";
                }else {
                    grade = "F";
                }
                System.out.println(scores[i] >= 70);


        }

}}
