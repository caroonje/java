import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
//        문제6) 책 184페이지 1번 문제 풀기
        System.out.println("\n----- 문제 1번 -----\n");
        Song mySong = new Song("Nessun Dorma");
        Song yourSong = new Song("공주는 잠 못 이루고");

        System.out.println("내 노래는 " + mySong.getTitle());
        System.out.println("너 노래는 " + yourSong.getTitle());


//        문제7) 책 184페이지 2번 문제 풀기
//        System.out.println("\n----- 문제 2번 -----\n");
//        Scanner sc = new Scanner(System.in);
//        System.out.print("이름과 전화번호 입력 >>");
//        String name1 = sc.next();
//        String tel1 = sc.next();
//        System.out.print("이름과 전화번호 입력 >>");
//        String name2 = sc.next();
//        String tel2 = sc.next();
//        Phone Pho1 = new Phone(name1, tel1);
//        Phone Pho2 = new Phone(name2, tel2);
//
//        System.out.println(Pho1.getName() + "의 번호" + Pho1.getTel());
//        System.out.println(Pho2.getName() + "의 번호" + Pho2.getTel());
//
        System.out.println("\n----- 문제 2번 -----\n");
        Scanner sc2 = new Scanner(System.in);
        String name = ""; //이름을 입력받을 변수
        String tel = ""; // 전화번호를 입력받을 변수
        System.out.print("이름과 전화번호 입력 >>");
        name = sc2.next();
        tel = sc2.next();
        Phone P1 = new Phone(name, tel);
        System.out.print("이름과 전화번호 입력 >>");
        name = sc2.next();
        tel = sc2.next();
        Phone P2 = new Phone(name, tel);

        System.out.println(P1.getName() + "의 번호 >>" + P1.getTel());
        System.out.println(P2.getName() + "의 번호 >>" + P2.getTel());
    }
}
