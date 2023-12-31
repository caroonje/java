public class ExceptionEx {
    public static void main(String[] args) {
        System.out.println("----- NullPointException -----");

//        String data = null;
//        System.out.println(data.toString());

        System.out.println("\n----- ArrayIndexOutOfBoundsException -----\n");

        if (args.length ==2){
            String data1 = args[0];
            String data2 = args[1];
            System.out.println("args[0] : " + data1);
            System.out.println("args[1] : " + data2);
        }
        else {
            System.out.println("[실행방법]");
            System.out.println("java ExceptionEx 값1 값2");
        }

        System.out.println("\n----- NumberFormatException -----\n");

        String data1 = "100";
        String data2 = "a100";

        int value1 = Integer.parseInt(data1); //Integer.parseInt 문자를 정수로 반환
        int value2 = Integer.parseInt(data2);

        int result = value1 + value2;
        System.out.println(data1 + "+" + data2 + " = " + result);

        System.out.println("\n----- ClassCastException -----\n");

        Dog dog = new Dog();
        Cat cat = new Cat();
        changeDog(dog);
        changeDog(cat);
    }

    public static void changeDog(Animal animal){
        Dog dog = (Dog) animal;
    }
}

class Animal {}
class Dog extends Animal{}
class Cat extends Animal{}
