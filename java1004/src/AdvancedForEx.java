import java.util.Arrays;

public class AdvancedForEx {
    public static void main(String[] args) {
        System.out.println("\n----- 향상된 for 문 -----\n");
//        ㄴ

        int[] scores = {96, 71, 84, 93, 87};
        int total = 0;

        for (int score : scores) {
            total = total + score;
        }

        System.out.println("점수 총합 : " + total);
        System.out.println("점수 평균 : " + (total / scores.length));

        System.out.println("\n----- 일반 for 문 -----\n");
        total = 0; // total값 초기화
        for (int i = 0; i < scores.length; i++) {
            total = total + scores[i];
        }

        System.out.println("점수 총합 : " + total);
        System.out.println("점수 평균 : " + (total / scores.length));

        System.out.println("\n----- 일반 for 문 -----\n");

//        문제 1) 배열 iArr1에 10,20,30,40,50,60,70,80,90,100을 입력하고 향상된 for문을 사용하여 배열의 모든 데이터의 합을 구하는 프로그램을 작성하세요

        int[] iArr1 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        total = 0;
        for (int iArr : iArr1) {
            total = total + iArr;
        }
        System.out.println("점수 총합은 : " + total);


        //        문제2) 배열 lotto에 6개의 임의의 숫자를 입력하고, 입력된 데이터를 향상된 for문을 통해서 출력하는 프로그램을 작성하세요
        //        -중복 제거는 할 수 있는 사람만 진행 (중복 제거 시 2중 for문 필요)
        //        -임의의 숫자는 1~ 45 까지임
        //        1~10까지 임의의 숫자 출력 방법 : int rnd = (int) (Math.random() * 10)+1;
        //        일반 2중 for 문을 사용하여 데이터를 입력하고,if문으로 중복을 확인해야함.
        //        -출력 부분만 향상된 for 문을 사용하여 데이터 출력

//        로또 번호를 저장할 크기가 6인 배열 선언
        int[] lotto = new int[6];
//        6번 반복해서 임의의 숫자를 6번 받아줌
        for (int i = 0; i < lotto.length; i++) {
//            1~45까지의 임의의 숫자를 받아옴
            int rnd = (int) (Math.random() * 45) + 1;
//            임의의 숫자를 받아온것을 배열에 저장
            lotto[i] = rnd;

//            중복제거
//            반복 조건이 j가 i보다 작도록 설정해서 i번째 index의 값에 접근하지 못함
//            i번째 index값과 j번째 index의 값을 모두 비교
            for (int j = 0; j < i; j++) {
//             현재 i값의 index와 j값의 index에 저장된 데이터가 같은지 확인
                if (lotto[i] == lotto[j]) {
//              i값을 1감소 시켜서 현재 루프를 다시 한번 실행하여 임의의 숫자를 새로 받아올 수 있도록 설정함
                    i--;
//              값이 확인 되었으므로 더이상의 추가 비교는 필요없음
                    break;
                }
            }
        }
//       오름차순  정렬메소드
        Arrays.sort(lotto);
//        배열에 저장된 데이터 출력
        for (int rndNumber : lotto) {
            System.out.print(rndNumber + ", ");

        }
//        System.out.println(lotto[j]);
    }

}

