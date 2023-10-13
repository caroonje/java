public class SuperEx {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        parent.method1();
        parent.method2();

        System.out.println();

        child.method1();//Child 클래스에 method1번은 존재하지 않지만 Parent클래스에서 상속받은 method1번은 존재하기 때문에 method1번이 실행됨
        child.method2();
        child.method3();

        System.out.println();

        child.method4();//this.method2를 호출하여 실행
        child.method5();//super.method2를 호출하여 실행 super는 부모의 메소드를 호출
    }
}
