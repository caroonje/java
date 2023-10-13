package Quiz;

import java.util.Scanner;

public class RectArray {

    public static void main(String[] args) {
//        1. 사용자 키보드 입력을 위한 Scanner 객체 생성



        Scanner sc =new  Scanner(System.in);
//        2. 너비와 높이를 입력 받기 X4 (Rect 타입의 배열 생성)
        Rect[] rects = new Rect[4];


//        배열의 크기만큼 객체를 반복 생성하기 위한 반복문
        for (int i=0; i< rects.length; i++){
            System.out.println((i+1) + "." + "너비와 높이");
            int width = sc.nextInt();//너비를 입력받는 변수
            int height = sc.nextInt();//높이를 입력받는 변수
            rects[i] = new Rect(width,height);
        }
        System.out.println("저장하였습니다");
//        3. 각각의 사각형의 넓이를 모두 합하여 넓이의 총합 구하기
        int total= 0;
        for (int i=0; i< rects.length; i++){
            total=total+rects[i].getArea();
        }
//        4. 넓이의 총합 출력하기
        System.out.println("사각형의 합은 "+ total);


    }
}
