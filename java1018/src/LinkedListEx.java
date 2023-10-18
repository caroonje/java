import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
    public static void main(String[] args) {
//        ArrayList 객체와 LinkedList 객체 생성
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new LinkedList<String>();

//        작업 시작 시간 ,작업 종료 시간을 저장할 변수 선언
        long startTime;
        long endTime;

//        작업 시작 시간 설정,
//        System.nanotime() : JVM이 사용하는 정밀 시간 소스의 한계값을 long 타입으로 반환
        startTime = System.nanoTime();//nanotime 10억분의 1초
        for (int i =0;i<50000;i++){
//            index가 0인 위치에서 데이터를 추가하여 기존 데이터를 뒤로 밀어냄,데이터 추가시간이 추가로 걸림
            list1.add(0,String.valueOf(i));
        }
//        작업 종료 시간 설정
        endTime = System.nanoTime();

//        작업 종료 시간 - 작업 시작 시간 으로 총 걸린 작업시간 계산
        System.out.println("ArrayList 걸린시간 : " + (endTime - startTime)+ " ns ");

        startTime = System.nanoTime();
        for (int i =0; i<50000; i++){
            list2.add(0,String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList 걸린시간 : " + (endTime - startTime)+ " ns ");
    }
}
