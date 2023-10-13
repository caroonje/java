import java.util.Scanner;

public class Gugudan2 {
//    출력하고자 하는 구구단 단수 입력
    public int inputDansu() {
        Scanner sc = new Scanner(System.in);

        int Dansu = sc.nextInt();
        return Dansu;
    }
//    입력받은 단수의 구구단을 출력
    public void outputGugudan() {
        int Dansu = inputDansu();
        for (int i = 1; i < 10; i++) {
            System.out.println(Dansu + "X" + i + " = " + Dansu * i);
        }
    }
}
