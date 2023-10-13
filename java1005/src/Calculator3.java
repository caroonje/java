public class Calculator3 {

    public void div() {
        int a = 10;
        int b = 3;
        double div = a /(double) b;
        System.out.println("두 수의 나눗셈은 " + div + "입니다.");
    }


    public void sum(int a, int b) {
        int total = a + b;
        System.out.println("두 수의 덧셈은 " + total + "입니다.");
    }

    public int sub() {
        int x = 10;
        int y = 3;
        return x - y;
    }

    public int multi(int x, int y) {
        return x * y;
    }
}

