public class DriverEx {

    public static void drive(Vehicle v,String name){
        v.run();
        System.out.println("운전자는 "+ name +"입니다");
    }
    public static void main(String[] args) {

        Vehicle v = new Vehicle();
        Bus bus = new Bus();
        Taxi taxi = new Taxi();


        drive(bus,"홍길동");

        drive(taxi,"아이유");

        drive(v,"유재석");


        Driver driver = new Driver();
        driver.drive(bus);
        driver.drive(taxi);

        System.out.println("-------------- 일반 객체 사용시 ------------");

//        Vehicle v =new Vehicle();
//        v.run();
//
//        Bus b= new Bus();
//        b.run();
//
//        Taxi t= new Taxi();
//        t.run();

//         다형성을 사용시
//
//        v.run();
//        v=b;
//        v.run();
//        v=t;
//        v.run();
    }
}
