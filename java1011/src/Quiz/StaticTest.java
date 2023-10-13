package Quiz;



    public class StaticTest {
    public static void main(String[] args) {
        Circle pizza = new Circle(5);
        Circle waffle = new Circle(1);

        boolean res = Circle.equals(pizza,waffle);
        if (res == true){
            System.out.println("pizza와 waffle 크기 같음");
        }else {
            System.out.println("pizza와 waffle 크기 다름");
        }

        Circle.CircleManager.copy(pizza,waffle);
        res = Circle.equals(pizza,waffle);
        if (res == true){
            System.out.println("pizza와 waffle 크기 같음");
        }else{
            System.out.println("pizza와 waffle 크기 다름");
        }


    }
}
