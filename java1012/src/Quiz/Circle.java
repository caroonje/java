package Quiz;

public class Circle {
//    접근 제한자가 private인 필드, 외부에서 접근 불가, Getter/Setter를 활용하여 접근해야함
    private int radius;
//    같은 멤버이기 때문에 사용가능
    public Circle(int radius) {
        this.radius = radius;
    }
//    같은 멤버이기 때문에 사용가능,외부에서 사용할 수 있도록 우회 접근을 대신 해줌
    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
