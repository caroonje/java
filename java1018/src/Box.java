// 모든 데이터 타입을 저장하기 위한 클래스 생성
public class Box {
//    Object 클래스 : 자바의 최상위 클래스 ,다형성에 의해서 자바의 모든 데이터를 저장할 수 있음
//    저장한 데이터를 출력시 강제 타입 변환이 필수임
    private Object obj;

    public void set(Object obj){
        this.obj = obj;
    }
    public Object get(){
        return obj;
    }
}
