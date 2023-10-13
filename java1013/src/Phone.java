//추상 클래스로 선언한 Phone클래스
//클래스 abstract 키워드 사용시 추상클래스가 된다
public abstract class Phone {

    public String owner;
    public Phone(String owner){
        this.owner =owner;
    }
    public void turnOn(){
        System.out.println("휴대폰 전원을 켭니다.");
    }
    public void turnOff(){
        System.out.println("휴대폰 전원을 끕니다.");
    }
}
