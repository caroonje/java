public class RemoteControlEx2 {
    public static void main(String[] args) {
//        인터페이스 RemoteControl, Searchable 를 모두 상속받아 구현한 클래스 타입의 객체 tv생성
//        두 인터페이스에서 제공하는 메소드 모두 사용 가능
        SmartTV tv = new SmartTV();
        tv.turnOn();
        tv.setVolume(10);
        tv.setMute(true);
        tv.setMute(true);
        tv.search("naver.com");
        tv.turnOff();
//      부모 인터페이스 RemoteControl 타입의 변수에 자식 클래스 SmartTV 타입의 객체를 저장
//        부모인 RemoteControl 에서 상속해 준 메소드만 사용 가능
        RemoteControl rc = tv;
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();
//        rc.search():

//      부모 인터페이스 Searchable 타입의 변수에 자식 클래스 SmartTV 타입의 객체를 저장
//        부모인 Searchable 에서 상속해 준 메소드만 사용 가능
        Searchable search = tv;
        search.search("google.co.kr");
//        search.turnOn();
    }
}
