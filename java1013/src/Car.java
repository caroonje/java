public class Car {
    Tire[] tires = {
            new Tire("앞왼쪽", 6),
            new Tire("앞오른쪽", 2),
            new Tire("뒤왼쪽", 3),
            new Tire("뒤오른쪽", 4)
    };

    int run() {
        System.out.println("자동차가 달립니다.");
//        Tire 클래스 타입의 배열 요소를 모두 출력
        for (int i = 0; i < tires.length; i++) {
//            Tire 클래스 객체의 멤버 중 roll() 메소드를 한번씩 실행
            if (tires[i].roll() == false) {
                stop();
//                배열의 크기가 4이므로 index는 0~3까지 존재하기 때문에 1~4까지 값을 출력하기 위해서 현재 index값에 +1 해줌
//                0 : 펄크 안남, 1 : 앞 왼쪽, 2: 앞오른쪽, 3 : 뒤왼쪽, 4 : 뒤오른쪽
                return (i + 1);
            }
        }
        return 0;
    }

    void stop() {
        System.out.println("자동차가 멈춥니다.");
    }
}
