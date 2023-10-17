public class DefaultMethodEx {
    public static void main(String[] args) {
        MyInter mi1 = new ClassA();
        mi1.method1();

        MyInter mi2 = new ClassB();
        mi2.method1();
        mi2.method3();
    }
}
