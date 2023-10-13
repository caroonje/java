import java.util.Scanner;

public class Quiz {

//    public static void quiz5() {
//
////        next():공백기호가 있는 위치까지 모든 데이터를 입력받음,문자열로 입력받음
////        nextBoolean() : 공백 기호가 있는 위치까지 데이터를 boolean타입으로 입력받음
//        System.out.println("\n-----문제 5번-----\n");
//        System.out.println("논리 연산을 입력하세요");
//        Scanner scanner = new Scanner(System.in);
//
//        boolean a = scanner.nextBoolean(); //boolean 타입으로 데이터 입력
//        String op = scanner.next();//String 타입으로 데이터 입렵
//        boolean b = scanner.nextBoolean();
//
////        입력받은 연산자를 swich ~ case 문으로 비교
//        switch (op) {
//            case "AND":
//                System.out.println(a && b);
//                break;
//            case "OR":
//                System.out.println(a || b);
//                break;
//            default:
//                System.out.println("잘못된 입력입니다.");
//        }
//    }
//
//    //
//    public static void quiz6() {
////
//        System.out.println("\n-----문제 6번-----\n");
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("금액을 입력하세요: ");
////            nextInt() : 사용자의 키보드 입력을 받을 때 정수로 입력받음
//        int money = scanner.nextInt();
////              5만원권
//        int mo50000 = money / 50000; //현재금액에서 5만으로 나눔,5만원권 수를 얻음
//        money %= 50000; //5만원을 모두 제외하고 난 나머지 값 , 1만원권 및 다른 돈의 액수단위를 얻을 수 있음
////              만원권
//        int mo10000 = money / 10000; //현재금액에서 1만으로 나눔,만원권 수를 얻음
//        money %= 10000;//10000원권을 제외한 나머지 금액을 저장
////              천원권
//        int mo1000 = money / 1000;//현재금액에서 1천원으로 나눔,천원권 수를 얻음
//        money %= 1000;//1000원권을 제외한 나머지 금액을 저장
////              500원 동전
//        int mo500 = money / 500;//현재금액에서 500원으로 나눔,500원 동전의 수를 얻음
//        money %= 500;//500원 동전을 제외한 나머지 금액을 저장
////              100원 동전
//        int mo100 = money / 100;//현재금액에서 100원으로 나눔,100원 동전의 수를 얻음
//        money %= 100;//100원 동전을 제외한 나머지 금액을 저장
////              10원 동전
//        int mo10 = money / 10;//현재금액에서 10원으로 나눔,10원 동전의 수를 얻음
//        money %= 10;//10원 동전을 제외한 나머지 금액을 저장
////              1원 동전
//        int mo1 = money;
//
//        System.out.println("오만원: " + mo50000 + "개");
//        System.out.println("만원: " + mo10000 + "개");
//        System.out.println("천원: " + mo1000 + "개");
//        System.out.println("500원: " + mo500 + "개");
//        System.out.println("100원: " + mo100 + "개");
//        System.out.println("10원: " + mo10 + "개");
//        System.out.println("1원: " + mo1 + "개");
//    }
//
//
//        public static void quiz7 () {
//            System.out.println("\n-----문제 7번-----\n");
//            System.out.println("학점을 입력하세요");
//            Scanner scanner = new Scanner(System.in);
////      학점을 저장할 변수 선언,사용자 입력값을 저장
//            String level = scanner.next();
//            switch (level) {
//                case "A":
//                case "B":
//                    System.out.println("Excellent");
//                    break;
//                case "C":
//                case "D":
//                    System.out.println("Good");
//                    break;
//                case "F":
//                    System.out.println("Bye");
//                    break;
//                default:
//                    System.out.println("잘못된 입력입니다.");
//                    break;
//
//
//            }
//        }
//
//        public static void quiz8 () {
//            System.out.println("\n-----문제 8번-----\n");
//
//            Scanner scanner = new Scanner(System.in);
//            //화면 출력
//            System.out.println("커피 주문하세요");
//            //사용자 키보드 입력
//            String coffee = scanner.next();
//            int n = scanner.nextInt();
//            int price1 = 2000;
//            int price2 = 2500;
//            int price3 = 3000;
//            int price4 = 3500;
//
//            switch (coffee) {
//                case "에스프레소":
//                    System.out.println(n * price1 + "원 입니다.");
//                    break;
//                case "아메리카노":
//                    System.out.println(n * price2 + "원 입니다.");
//                    break;
//                case "카푸치노":
//                    System.out.println(n * price3 + "원 입니다.");
//                    break;
//                case "카페라떼":
//                    System.out.println(n * price4 + "원 입니다.");
//                    break;
//            }
//        }
//        public static void quiz9 () {
//            System.out.println("\n-----문제 9번-----\n");
//            //화면 출력
//            System.out.println("1~99 사이의 정수를 입력하세요");
//            Scanner scanner = new Scanner(System.in);
//            //사용자의 키보드 입력값을 정수로 가져오기
//            int num = scanner.nextInt();
//            int firstNum = num / 10;
//            int secondNum = num % 10;
//
//            boolean first = false;
//            boolean second = false;
//
//            if (firstNum % 3 == 0) {
//                first = true;
//            }
//            if (secondNum % 3 == 0) {
//                second = true;
//            }
//            if (first && second) {
//                System.out.println("박수짝짝");
//            } else if (first || second) {
//                System.out.println("박수짝");
//            } else {
//                System.out.println("박수없음");
//            }
//        }
//    public static void quiz10() {
//        System.out.println("\n ----- 문제 10 ----- \n ");
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("커피 주문하세요 >> ");
//
////    사용자 입력
//        String coffee = sc.next();
//        int count = sc.nextInt();
//
////    주문 잔의 수에 따라 커피를 선택하는 것이 다름
//        if (count >= 10) {
//            if (coffee.equals("에스프레소")) {
//                System.out.println((int) (2000 * count) * 0.95 + "원 입니다.");
//            } else if (coffee.equals("아메리카노")) {
//                System.out.println(2500 * count + "원 입니다.");
//            } else if (coffee.equals("카푸치노")) {
//                System.out.println(3000 * count + "원 입니다.");
//            } else if (coffee.equals("카페라떼")) {
//                System.out.println(3500 * count + "원 입니다.");
//            } else {
//                System.out.println("잘못 입력했습니다.");
//            }
//        }
//    }
//        else {
//            if (coffee.equals("에스프레소")) {
//                System.out.println(2000 * count + "원 입니다.");
//            }
//            else if (coffee.equals("아메리카노")) {
//                System.out.println(2500 * count + "원 입니다.");
//            }
//            else if (coffee.equals("카푸치노")) {
//                System.out.println(3000 * count + "원 입니다.");
//            }
//            else if (coffee.equals("카페라떼")) {
//                System.out.println(3500 * count + "원 입니다.");
//            }
//            else {
//                System.out.println("잘못 입력했습니다.");
//            }
        public static void quiz11() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("1~99사이의 정수를 입력하세요");
            int num = scanner.nextInt();
            int i = num/10;
            int j = num%10;


            if ((i ==3 || i ==6 || i == 9) && (j ==3 || j ==6 || j == 9))
            {
                System.out.println("박수 짝짝");
            }else if((i ==3 || i ==6 || i == 9) || (j ==3 || j ==6 || j == 9))
            {
                System.out.println("박수 짝");

            }else {
                System.out.println("박수 없음");
            }
        }








        public static void main (String[]args){
//            quiz5();
//            quiz6();
//            quiz7();
//            quiz8();
//            quiz9();
//            quiz10();
            quiz11();
        }
    }







