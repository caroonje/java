public class SmartPhoneEx {
    public static void main(String[] args) {
//        Phone 클래스 는 추상 클래스 이므로 객체 생성이 불가능
//        Phone phone =new Phone("유재석");
//        phone.turnOn();
//        phone.turnOff();
//        추상 클래스는 객체 생성이 불가능 하므로 자식 클래스를 통해서 상속 하여 클래스의 멤버를 사용할 수 있음
        SmartPhone sp =new SmartPhone("아이유");
        sp.turnOn();
        sp.internetSearch();
        sp.turnOff();

    }
}
