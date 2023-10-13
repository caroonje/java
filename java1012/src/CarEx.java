public class CarEx {
    public static void main(String[] args) {
//        Car 클래스 타입의 객체 생성
        Car car = new Car();

//        6번 반복 실행을 위해서 for문 사용
        for (int i =0; i <=5; i++){
//            Car 클래스 타입의 메소드 run()을 사용하여 주행시 문제가 발생한 위치를 받아옴
//            0 : 정상, 1: 앞왼쪽 타이어, 2:앞 오른쪽 타이어, 3:뒤 왼쪽 타이어, 4:뒤 오른쪽 타이어
            int problemLocation = car.run();

            switch (problemLocation){
                case 1:
                    System.out.println("앞 왼쪽 HankookTire로 교체");
//                    Car 클래스 타입의 객체 car에 HankookTire 객체를 생성하여 저장
                    car.frontLeftTire = new HankookTire("앞 왼쪽",15);
                    break;
                case 2:
                    System.out.println("앞 오른쪽 KumhoTire로 교체");
//                    Car 클래스 타입의 객체 car에 KumhoTire 객체를 생성하여 저장
                    car.frontRightTire = new KumhoTire("앞오른쪽",13);
                    break;
                case 3:
                    System.out.println("뒤 왼쪽 Hankook로 교체");
                    car.backLeftTire = new HankookTire("뒤왼쪽",14);
                    break;
                case 4:
                    System.out.println("뒤오른쪽 KumhoTire로 교체");
                    car.backRightTire = new KumhoTire("뒤오른쪽",17);
                    break;
            }
            System.out.println("------------------------------------------------------");
        }
    }
}
