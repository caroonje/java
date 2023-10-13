import java.util.Scanner;

public class BreakContinueEx {
    public static void main(String[] args) {
//        break : 제어문 내부에서 동작하며 프로그램의 실행 흐름을 종료하는 명령어
//        continue : 반복문  내부에서 동작하며 현재 루프를 종료하고 다음 루프를 실행하는 명령어
//        사용법 :
//        반복문{
//        break;
//        }
//        반복문 {
//        continue;
//        }
        System.out.println("\n-----break-----\n");
        int dan = 5;
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
//                break를 만나서 for(반복문)문이 즉시 종료
                break;
            }
            System.out.println(dan + " * " + i + " = " + (dan * i));
        }


        System.out.println("\n-----continue-----\n");

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
//                continue를 만나서 현재 루프만 종료,다음루프로 이동
                continue;
            }
            System.out.println(dan + " * " + i + " = " + (dan * i));
        }

//       문제 6) 구구단을 2~9단까지 모두 출력하는 프로그램을 작성하세요
//        사용자 입력을 통해서 숫자 (2~9) 하나를 입력받고 해당 단수의 구구단 만 제외하고 모두 출력

        Scanner scanner= new Scanner(System.in);
        System.out.println("숫자를 입력해주세요");
        int h = scanner.nextInt();
        for (int i = 2; i <10 ; i++){


            if (i == h){
                continue;
            }System.out.println("-----" + i + "단-----");
            for (int j = 1; j < 10; j++){


                System.out.println(i +"*"+ j + "=" + (i*j));
            }
            System.out.println();
        }

////        while문
//        System.out.println("숫자를 입력해주세요");
//        int i = 2;
//        while(i < 10){
//            if (h == i){
//                    continue를 사용시 현재 루프를 종료하고 다음 루프로 이동하기 때문에 아래에 있는 증감식이 동작하지 않아서 초기화 변수의 값이 더이상 변경되지 않아서 무한루프에 빠질 수 있기 때문에 증감식을 추가함
//                i++;
//                continue;
//            }System.out.println("-----" + i + "단-----");
//            int j =1;
//            while (j < 10){
//                System.out.println(i +"*"+ j + "=" + (i*j));
//                j++;
//            }
//            i++;
//        }



////        문제 7) 사용자 입력을 통해서 숫자 (2~9)를 입력받고 해당 단수의 구구단에서 구구단 출력을 멈추는 프로그램을 작성하세요
        System.out.println("숫자를 입력해주세요");
        h = scanner.nextInt();

        for (int i = 2; i <10 ; i++){

            if (i == h){
                break;
            }System.out.println("-----" + i + "단-----");
            for (int j = 1; j < 10; j++){


                System.out.println(i +"*"+ j + "=" + (i*j));
            }
            System.out.println();
        }
    }
}
